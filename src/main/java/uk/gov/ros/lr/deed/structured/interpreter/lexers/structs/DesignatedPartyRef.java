package uk.gov.ros.lr.deed.structured.interpreter.lexers.structs;

import me.xdrop.fuzzywuzzy.FuzzySearch;
import uk.gov.ros.lr.deed.structured.model.DesignatedParty;
import uk.gov.ros.lr.deed.structured.model.IEntity;
import uk.gov.ros.lr.deed.structured.model.LegalEntity;
import uk.gov.ros.lr.deed.structured.model.StructuredContent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DesignatedPartyRef implements IEntity {

    //----------------------------------------------
    private DesignatedParty designatedParty;
    public DesignatedParty getDesignatedParty() { return designatedParty;  }

    //-------------------------------------
    private String name;
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    //--------------------------------------
    public void resolve(StructuredContent sc){

        List<DesignatedParty> availableDps = new ArrayList<>();
        List<LegalEntity> leList = Arrays.asList(sc.getGrantor(), sc.getConsenter());
        for(LegalEntity le : leList) {
            if(le != null) availableDps.addAll(le.getDesignatedParties());
        }

        //for case where there is only one party and the text says 'himself' or 'herself' or 'said Society'
        if(name.equals("himself") || name.equals("herself") || name.equals("Society")) {
            this.designatedParty = availableDps.get(0);
        }
        //for cases where there are multiple parties and the text says 'said Joe Bloggs'
        else {
            this.designatedParty = matchRefNameBlockToDesignatedParties(name, availableDps);
        }
    }

    //---------------------------------------------------------------------------------------------------
    private static final int FUZZY_MATCH_THRESHOLD = 80;
    private DesignatedParty matchRefNameBlockToDesignatedParties(String name, List<DesignatedParty> desigParties){
        DesignatedParty matchedDP = null;
        int ratioHigh = 0;
        for (DesignatedParty dp : desigParties) {
            int ratio = FuzzySearch.ratio(name, dp.getFullName());
            if (ratio == 100) { //If ratio gave a 100% match then look no further and break out
                matchedDP = dp;
                break;
            } else { // else continue matching all rac parties and keeping track of the one with the
                // highest score so far that is also over the match threshold
                if (ratio >= FUZZY_MATCH_THRESHOLD && ratio > ratioHigh) {
                    ratioHigh = ratio;
                    matchedDP = dp;
                }
            }
        }

        return matchedDP;
    }


}
