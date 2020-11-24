package uk.gov.ros.lr.deed.structured.interpreter.lexers;

import uk.gov.ros.lr.deed.structured.model.*;
import uk.gov.ros.lr.deed.structured.model.parserdata.PartyName;
import uk.gov.ros.lr.deed.structured.interpreter.lexers.seg1.Seg1BaseListener;
import uk.gov.ros.lr.deed.structured.interpreter.lexers.seg1.Seg1Parser;
import uk.gov.ros.lr.deed.structured.interpreter.lexers.structs.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Seg1ListenerImpl extends Seg1BaseListener implements IParser {

    private StructuredContent structContent;
    private List<PartyName> partyNames;

    //-------------------------------------------------
    private Stack<IEntity> stack = new Stack<>();
    @Override
    public Stack<IEntity> getStack() {  return stack;  }

    //---------------------------------------------------------------------------
    public Seg1ListenerImpl(StructuredContent structContent, List<PartyName> partyNames) {
        this.structContent = structContent;
        this.partyNames = partyNames;
    }

    //-----------------------------------------------
    // Grantor, Grantee, Consenter
    @Override
    public void exitGrantor(Seg1Parser.GrantorContext ctx) {
        structContent.setGrantor(stackPop(LegalEntity.class));
    }

    //....................................................
    @Override
    public void exitGrantee(Seg1Parser.GranteeContext ctx) {
        structContent.setGrantee(stackPop(LegalEntity.class));
    }

    //....................................................
    @Override
    public void exitWithConsent(Seg1Parser.WithConsentContext ctx) {
        if(stackTopIsSubClassOf(LegalEntity.class)) {
            structContent.setConsenter(stackPop(LegalEntity.class));
        }
    }

    //----------------------------------------------
    // Deed attributes
    @Override
    public void exitConsideration(Seg1Parser.ConsiderationContext ctx) {
        TextItem money = stackPop(TextItem.class);
        String amount = money.get();
        structContent.addAttribute(new DeedAttribute(DeedAttribute.NameEnum.consideration,amount));
    }

    @Override
    public void exitStdSecDate(Seg1Parser.StdSecDateContext ctx) {
        LrDate dt = stackPop(LrDate.class);
        String dtStr = dt.toDateString();
        structContent.addAttribute(new DeedAttribute(DeedAttribute.NameEnum.stdSecurityDate,dtStr));
    }

    //----------------------------------------------
    // Legal Entities

    //....................................................
    @Override
    public void exitComplexGrpPart(Seg1Parser.ComplexGrpPartContext ctx) {
        LegalEntity le = stackPop(LegalEntity.class);
        stackPeek(LegalGroup.class).addLegalEntity(le);
    }

    //....................................................
    @Override
    public void enterRepresentative(Seg1Parser.RepresentativeContext ctx) {
        stackPush(new LegalRepresentative());
    }

    //....................................................
    @Override
    public void exitAgentLE(Seg1Parser.AgentLEContext ctx) {
        LegalEntity le = stackPop(LegalEntity.class);
        stackPeek(LegalRepresentative.class).setAgent(le);
    }

    //....................................................
    public void exitLrPrincipalLE(Seg1Parser.LrPrincipalLEContext ctx) {
        LegalEntity le = stackPop(LegalEntity.class);
        stackPeek(LegalRepresentative.class).setPrincipal(le);
    }

    //....................................................
    @Override
    public void exitTrustee(Seg1Parser.TrusteeContext ctx) {
        stackPeek(LegalRepresentative.class).setType(LegalRepresentative.TypeEnum.trustee);
    }

    @Override
    public void exitExecutor(Seg1Parser.ExecutorContext ctx) {
        stackPeek(LegalRepresentative.class).setType(LegalRepresentative.TypeEnum.executor);
    }

    @Override
    public void exitTrusteeExecutor(Seg1Parser.TrusteeExecutorContext ctx) {
        stackPeek(LegalRepresentative.class).setType(LegalRepresentative.TypeEnum.trusteeExecutor);
    }

    @Override
    public void exitCuratorBonis(Seg1Parser.CuratorBonisContext ctx) {
        stackPeek(LegalRepresentative.class).setType(LegalRepresentative.TypeEnum.curatorBonis);
    }

    //....................................................
    @Override
    public void enterComplexGroup(Seg1Parser.ComplexGroupContext ctx) {

        stackPush(new LegalGroup());
    }

    //....................................................
    @Override
    public void exitJointCurrentAddress(Seg1Parser.JointCurrentAddressContext ctx) {
        Address addr = stackPop(Address.class);
        stackPeek(JDPersons.class).jointAddress = addr;
    }

    //....................................................
    @Override
    public void exitJointPrevAddress(Seg1Parser.JointPrevAddressContext ctx) {
        Address addr = stackPop(Address.class);
        if(stackTopIs(JDPersons.class)) {
            stackPeek(JDPersons.class).jointPrevAddress = addr;
        }
    }

    //....................................................
    @Override
    public void exitJdRelationship(Seg1Parser.JdRelationshipContext ctx) {

        TextItem rel = stackPop(TextItem.class);
        if(stackTopIs(JDPersons.class)) { //the general case. Else look in exitJdCouple6 and 7
            String relation = "";
            switch (rel.get()) {
                case "spouses":
                case "wife":
                case "husband":
                    relation = "spouses";
                    break;
                default:
                    relation = rel.get();
                    break;
            }
            stackPeek(JDPersons.class).relation = relation;
        }
        else {
            stackPush(rel);
        }
    }

    //....................................................
    @Override
    public void exitRelation(Seg1Parser.RelationContext ctx) {

        stackPush(new TextItem("relation", txt(ctx)));
    }

    //.....................................................
    @Override
    public void exitShare(Seg1Parser.ShareContext ctx) {
        if(stackTopIs(JDPersons.class)) {
             stackPeek(JDPersons.class).shares = new Shares(txt(ctx));
        }
    }

    //....................................................
    @Override
    public void enterJdPersons(Seg1Parser.JdPersonsContext ctx) {

        stackPush(new JDPersons());
    }
    //....................................................
    @Override
    public void exitJdPersons(Seg1Parser.JdPersonsContext ctx) {
        JDPersons jdp = stackPop(JDPersons.class);
        stackPush(jdp.createLegalGroup());
    }

    //----------------------------------------------
    // desigParty
    @Override
    public void enterDesigPerson(Seg1Parser.DesigPersonContext ctx) {

        stackPush(new DesignatedPerson());
    }

    //....................................................
    @Override
    public void exitCurrentProfession(Seg1Parser.CurrentProfessionContext ctx) {
        stackPeek(DesignatedPerson.class).setProfession(txt(ctx));
    }

    //....................................................
    @Override
    public void exitDesigPerson(Seg1Parser.DesigPersonContext ctx) {
        DesignatedPerson dp = stackPop(DesignatedPerson.class);
        //add to jdPersons
        if(stackTopIs(JDPersons.class)) {
            stackPeek(JDPersons.class).desigPersons.add(dp);
        }
        else stackPush(dp);
    }

    //..................................................................
    @Override
    public void enterDesigPartyRef(Seg1Parser.DesigPartyRefContext ctx) {
        stackPush(new DesignatedPartyRef());
    }


    @Override
    public void exitDesigPartyRef(Seg1Parser.DesigPartyRefContext ctx) {

        String fullName = "";
        if(stackTopIs(TextItem.class)) { // well known org
            TextItem name = stackPop(TextItem.class);
            fullName = name.get();
        }
        else if(stackTopIs(PersonNameSet.class)) { // person name or small firm name
            PersonNameSet nameSet = stackPop(PersonNameSet.class);
            fullName = nameSet.name.getFullName();
        }
        else if(stackTopIs(DesignatedPartyRef.class)){ // general reference viz. himself etc.
            String txt = txt(ctx);
            if(txt.equals("himself") || txt.equals("herself")) fullName = txt;
            else if(txt.equals("said Society")) fullName = "Society";
        }
        DesignatedPartyRef dpRef = stackPop(DesignatedPartyRef.class);
        dpRef.setName(fullName);
        dpRef.resolve(structContent);
        DesignatedParty dp = dpRef.getDesignatedParty();
        if(dp==null) throw new RuntimeException("DesignatedPartRef doesn't contain DesignatedParty");
        stackPush(dp);
    }

    //................................................
    @Override
    public void enterLegalGrpRef(Seg1Parser.LegalGrpRefContext ctx) {
        stackPush(new LegalGroupOrLegalRepRef());
    }

    @Override
    public void exitLegalGrpRef(Seg1Parser.LegalGrpRefContext ctx) {

        String ref = txt(ctx);
        if(ref.equals("themselves")) {
            LegalGroupOrLegalRepRef lgRef = stackPop(LegalGroupOrLegalRepRef.class);
            lgRef.resolve(structContent);
            LegalEntity le = lgRef.getLegalEntity();
            if(le==null) throw new RuntimeException("LegalGroupOrLegalRepRef doesn't contain LegalEntity");
            stackPush(le);
        }

    }

    //----------------------------------------------
    @Override
    public void exitJdCouple6(Seg1Parser.JdCouple6Context ctx) {
        List leList = new ArrayList();
        while(!stackTopIs(JDPersons.class)) {
            leList.add(stackPop(LegalEntity.class));
        }
        JDPersons jdp = stackPeek(JDPersons.class);
        for(Object o : leList) {
            if(o instanceof DesignatedPartyRef) jdp.desigPersonRefs.add((DesignatedPartyRef)o);
            else if(o instanceof DesignatedPerson) jdp.desigPersons.add((DesignatedPerson) o);
            else if(o instanceof TextItem) jdp.relation = ((TextItem)o).get();
        }
    }

    //----------------------------------------------
    //personName
    @Override
    public void enterPersonName(Seg1Parser.PersonNameContext ctx) {
        stackPush(new PersonName());
    }

    //....................................................
    @Override
    public void exitSalutation(Seg1Parser.SalutationContext ctx) {
        stackPeek(PersonName.class).setSalutation(txt(ctx));
    }

    //....................................................
    @Override
    public void exitPersonName(Seg1Parser.PersonNameContext ctx) {

        PartyName pn = getPartyNameForIdx();

        PersonName name = stackPop(PersonName.class);
        name.setForenames(pn.getForenames());
        name.setSurname(pn.getSurname());

        PersonNameSet nameSet = new PersonNameSet();
        nameSet.name = name;

        if(pn.getAltSurnames() !=null){
            for(String sn : pn.getAltSurnames()){
                PersonName alias = new PersonName();
                alias.setForenames(pn.getForenames());
                alias.setSurname(sn);
                nameSet.aliases.add(alias);
            }
        }
        //TODO alias for altForenames

        stackPush(nameSet);

    }

    //.....................................................
    @Override
    public void exitMainName(Seg1Parser.MainNameContext ctx) {
        PersonNameSet nameSet = stackPop(PersonNameSet.class);
        DesignatedPerson person = stackPeek(DesignatedPerson.class);
        person.setName(nameSet.name);
        person.setAliases(nameSet.aliases);
    }

    //.....................................................
    @Override
    public void exitPrevName(Seg1Parser.PrevNameContext ctx) {
        PersonNameSet nameSet = stackPop(PersonNameSet.class);
        stackPeek(DesignatedPerson.class).setPreviousName(nameSet.name);
    }

    //-------------------------------------------------------
    @Override
    public void exitAlias(Seg1Parser.AliasContext ctx) {
        PersonNameSet nameSet = stackPop(PersonNameSet.class);
        stackPeek(DesignatedPerson.class).addAlias(nameSet.name);
    }

    //....................................................
    @Override
    public void exitSmallFirmName(Seg1Parser.SmallFirmNameContext ctx) {

        if(stackTopIs(TextItem.class)) { //only for the case where it is a simple name
            TextItem name = stackPop(TextItem.class);
            stackPeek(DesignatedOrg.class).setName(name.get());
        }
        else if(stackTopIs(PersonNameSet.class)) {
            PersonNameSet nameSet = stackPop(PersonNameSet.class);
            stackPeek(DesignatedOrg.class).setName(nameSet.name.getFullName());
        }
    }

    //--------------------------------------------------------
    // desigOrg
    @Override
    public void enterDesigOrg(Seg1Parser.DesigOrgContext ctx) {
        stackPush(new DesignatedOrg());
    }

    //....................................................
    @Override
    public void exitOrgName(Seg1Parser.OrgNameContext ctx) {
        PartyName pn = getPartyNameForIdx();
        stackPush(new TextItem("orgName", pn.getText()));
    }

    //....................................................
    @Override
    public void exitCurrentOrgName(Seg1Parser.CurrentOrgNameContext ctx) {
        TextItem name = stackPop(TextItem.class);
        stackPeek(DesignatedOrg.class).setName(name.get());
    }

    //....................................................
    @Override
    public void exitPrevOrgName_B(Seg1Parser.PrevOrgName_BContext ctx) {
        TextItem name = stackPop(TextItem.class);
        stackPeek(DesignatedOrg.class).setPreviousName(name.get());
    }

    @Override
    public void exitTrade(Seg1Parser.TradeContext ctx) {
        stackPeek(DesignatedOrg.class).setTrade(txt(ctx));
    }

    //-----------------------------------------------------------
    // partyNum
    @Override
    public void exitPartyNum(Seg1Parser.PartyNumContext ctx) {
        stackPush(new TextItem("partyIdx", txt(ctx)));
    }

    //----------------------------------------
    // HELPERS
    private PartyName getPartyNameForIdx() {
       int ptyNum = (stackPop(TextItem.class)).getInt();
       return partyNames.get(ptyNum);
    }

    //------------------------------------------------
    //Address

    @Override
    public void exitPrevAddress(Seg1Parser.PrevAddressContext ctx) {
        Address addr = stackPop(Address.class);
        if(stackTopIs(DesignatedPerson.class)) {
            stackPeek(DesignatedPerson.class).setPreviousAddress(addr);
        }
        if(stackTopIs(DesignatedOrg.class)) {
            stackPeek(DesignatedOrg.class).setPreviousAddress(addr);
        }
    }

    @Override
    public void exitCurrentAddress(Seg1Parser.CurrentAddressContext ctx) {
        Address addr = stackPop(Address.class);
        if(stackTopIs(DesignatedPerson.class)) {
            stackPeek(DesignatedPerson.class).setAddress(addr);
        }
        if(stackTopIs(DesignatedOrg.class)) {
            stackPeek(DesignatedOrg.class).setAddress(addr);
        }
    }

    @Override
    public void enterAddress(Seg1Parser.AddressContext ctx) {
        stackPush(new Address());
    }

    @Override
    public void exitAddrLine(Seg1Parser.AddrLineContext ctx) {
        TextItem orgName = null;
        if(stackTopIs(TextItem.class)) {
            orgName = stackPop(TextItem.class);
        }
        String addrLine = orgName == null? txt(ctx) : "c/o " + orgName.get();

        stackPeek(Address.class).addLine(addrLine) ;
    }

    @Override
    public void enterDate(Seg1Parser.DateContext ctx) {
        stackPush(new LrDate());
    }

    @Override
    public void exitDay(Seg1Parser.DayContext ctx) {
        stackPeek(LrDate.class).setDay(txt(ctx));
    }

    @Override
    public void exitMonth(Seg1Parser.MonthContext ctx) {
        String mnthStr = txt(ctx).replace(".",""); //get rid of trailing '.'
        stackPeek(LrDate.class).setMonth(mnthStr);
    }

    @Override
    public void exitYear(Seg1Parser.YearContext ctx) {
        stackPeek(LrDate.class).setYear(txt(ctx));
    }

    //-------------------------------------------------
    // Money
    @Override
    public void exitMoneyValue(Seg1Parser.MoneyValueContext ctx) {
        stackPush(new TextItem("money", txt(ctx)));
    }
}
