package uk.gov.ros.lr.deed.structured.sources.rac.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A record from racAbridgement.people table belonging
 * to this abridgement entry
 */

public class RacParty {

    //------------------------------
    private String otherNames;
    public String getOtherNames() {  return otherNames;  }

    //------------------------------
    private String subOtherNames;
    public String getSubOtherNames() { return subOtherNames; }

    //------------------------------
    private String surname;
    public String getSurname() { return surname; }

    //-----------------------------
    public RacParty(String surname, String otherNames, String subOtherNames) {
        this.surname = surname;
        this.otherNames = otherNames;
        this.subOtherNames = subOtherNames;
    }

    public RacParty(){}

    //-------------------------------------------------------------
    private String name;
    private static final Pattern orRegex = Pattern.compile(", ?(?:OR|or) ");

    //Samples (othernames | surname -> output)
    //  ----- (ON+SN)
    //  John | REID -> JOHN REID
    //  Robert Porter | FARQUHARSON -> ROBERT PORTER FARQUHARSON
    //  CAROL R D | WATT -> CAROL R D WATT
    //  SECRETARY OF STATE FOR | ENVIRONMENT -> SECRETARY OF STATE FOR ENVIRONMENT
    //  SHERIFF CLERK OF | AYRSHIRE -> SHERIFF CLERK OF AYRSHIRE
    //  JAMES F | DONALD (ABERDEEN CINEMAS) LIMITED -> JAMES F DONALD (ABERDEEN CINEMAS) LIMITED
    //  | BANK OF SCOTLAND -> BANK OF SCOTLAND
    //  | BARRATT DEVELOPMENTS (ABERDEEN) LIMITED -> BARRATT DEVELOPMENTS (ABERDEEN) LIMITED
    //  | WOOLWICH EQUITABLE BUILDING SOCIETY -> WOOLWICH EQUITABLE BUILDING SOCIETY
    //  ----- FN contains last part of org name
    //  SOCIETY | BRISTOL AND WEST BUILDING -> BRISTOL AND WEST BUILDING SOCIETY
    //  L C | NATIONAL WESTMINSTER BANK P -> NATIONAL WESTMINSTER BANK P L C
    //  -----  ((FN-orTxt)+SN+orTxt)
    //  May, or Buckett | BLACKADDER -> MAY BLACKADDER OR BUCKETT
    //  -----  (FN-extraTxt) + SN
    //  Claud Hagart, Sir | ALEXANDER -> CLAUD HAGART ALEXANDER
    //  Annie, or Goodbrand, <Exrs./Exr.> of | CLEMENTS -> ANNIE CLEMENTS OR GOODBRAND
    //  ----- Generate alternatives by expanding words (Co., Ltd., & etc)
    //  Development Co. Ltd. | ABERDEEN -> ABERDEEN DEVELOPMENT <CO. LTD./COMPANY LIMITED>
    //  Andrew | COLLIE & CO. LTD. -> ANDREW COLLIE <&/AND> <CO. LTD./COMPANY LIMITED>
    //  Julian S. | HODGE & CO. LTD. -> JULIAN S. HODGE <&/AND> <CO. LTD./COMPANY LIMITED>
    //  William | BRUCE & SONS (BUILDERS) LTD. -> WILLIAM BRUCE & SONS (BUILDERS) <LTD./LIMITED>
    //  British & Mercantile Insurance Co. Ltd | NORTH -> NORTH BRITISH & MERCANTILE INSURANCE <CO. LTD./COMPANY LIMITED>
    //  ----- SN contains alt surnames
    //  James William Muir Gemmell | IZAT - IZATT -> JAMES WILLIAM MUIR GEMMEL IZAT OR IZATT

    @JsonIgnore
    public String getName(){
        StringBuilder sb = new StringBuilder();
        if(name == null) {

            if (otherNames != null) {
                String forenames = otherNames
                        .replaceAll("(FIRM)","")
                        .replaceAll(", ?Sir","")
                        .replaceAll(", ?Exrs?\\.? of ?","");


               if(looksLikeOrgName(forenames)) {
                   sb.append(surname).append(" ").append(forenames);
               }
               else{
                  preparePersonName(forenames, sb);
                }
            }
            else sb.append(surname);

            name = sb.toString().replaceAll(" +"," ").toUpperCase().trim();
        }
        return name;
    }

    //------------------------------------------------------------
    private void preparePersonName(String txt, StringBuilder sb) {
        Matcher m1 = orRegex.matcher(txt);
        if(m1.find()) {
            sb.append(txt.substring(0, m1.start())).append(" "); //real fornames
            sb.append(surname).append("||");

            String remainingTxt = txt.substring(m1.end());
            Matcher m2 = orRegex.matcher(remainingTxt);
            if(m2.find()) {
                sb.append(remainingTxt.substring(0, m2.start())).append("||").append(remainingTxt.substring(m2.end()));
            }
            else sb.append(remainingTxt);
        }
        else {
            String sn = surname.replaceAll(" ?- ?","||"); //surname with -
            sb.append(txt).append(" ").append(sn); //normal case, no altsurnames
        }
    }

    //------------------------------------------------------------
    private static final List<String> orgNameParts = Arrays.asList(
            "ASSEMBLY", "AUTHORITY", "LIMITED","LTD", "COUNCIL", "PLC", "BOARD", "TRUST", "AND CO", "AND SONS",
            "SOCIETY", "COMPANY", "BANK", "ASSOCIATION", "INSTITUTION", "CHURCH", "CORPORATION");

    //-------------------------------------
    public static boolean looksLikeOrgName(String namePart) {
        for (String onp : orgNameParts) {
            if (namePart.contains(onp)) return true;
        }
        return false;
    }


    //-------------------------------------
    @Override
    public String toString() {
        return getName();
    }


}
