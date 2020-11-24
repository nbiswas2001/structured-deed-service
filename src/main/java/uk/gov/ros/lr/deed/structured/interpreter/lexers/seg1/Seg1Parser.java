// Generated from Seg1.g4 by ANTLR 4.7
package uk.gov.ros.lr.deed.structured.interpreter.lexers.seg1;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class Seg1Parser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, WITH_CONSENT_OF=13, WITH_CONSENT=14, SECURITY_DEED=15, 
		EXECUTOR_OF=16, CURATOR_BONIS_OF=17, TRUSTEE_EXECUTOR_OF=18, TRUSTEE_OF=19, 
		TRUSTEE_UNDER_DoT=20, AND_OTHERS=21, AS_TRUSTEE_OF=22, EQUALLY=23, AND_SURVIVOR=24, 
		PREVIOUSLY=25, CURRENTLY=26, ALIAS_PREFIX=27, POST_NOM=28, PROF_WORD=29, 
		REUSED_PROF_WORD=30, JOINT_PROF_WORD=31, PROF_SUBJECT=32, WIDOW=33, RELN_NAME=34, 
		FIRM_OF=35, NAMED_PARTY=36, PERSON_TOKEN=37, ORG_TOKEN=38, TOKEN_END=39, 
		SALUTATION=40, APOS_S=41, GBP=42, STDSEC=43, DISP=44, DISCH=45, ASSIG=46, 
		LEASE=47, TIME_UNIT=48, MMM=49, DOT=50, COMMA=51, SLASH=52, DASH=53, TO=54, 
		BY=55, OR=56, FURTHER_SUMS=57, MAX_SUM_OF=58, RELN_PREFIX=59, FOR=60, 
		FROM=61, OF=62, AND=63, BOTH=64, SAID=65, ALL=66, O_BKT=67, C_BKT=68, 
		ETC=69, TIL=70, ALLCAPS_BLOCK=71, INT=72, ALPHA_BLOCK=73, WS=74;
	public static final int
		RULE_block = 0, RULE_stdSecSeg1 = 1, RULE_dispSeg1 = 2, RULE_dischSeg1 = 3, 
		RULE_consideration = 4, RULE_gorRelation = 5, RULE_leasePeriod = 6, RULE_duration = 7, 
		RULE_timeValue = 8, RULE_timeUnit = 9, RULE_dateSpan = 10, RULE_startDate = 11, 
		RULE_endDate = 12, RULE_withConsent = 13, RULE_ofSecurityBy = 14, RULE_stdSecDate = 15, 
		RULE_by = 16, RULE_to = 17, RULE_grantor = 18, RULE_grantee = 19, RULE_consenter = 20, 
		RULE_legalEntity = 21, RULE_representative = 22, RULE_trustee = 23, RULE_ownerTrustee = 24, 
		RULE_executor = 25, RULE_trusteeExecutor = 26, RULE_curatorBonis = 27, 
		RULE_lrPrincipalLE = 28, RULE_principalLE = 29, RULE_agentLE = 30, RULE_legalGroup = 31, 
		RULE_complexGroup = 32, RULE_complexGrpPart = 33, RULE_mixedGroup = 34, 
		RULE_mixedGrpPart = 35, RULE_jdPersons = 36, RULE_jdCouple1 = 37, RULE_jdCouple2 = 38, 
		RULE_jdCouple3 = 39, RULE_jdCouple4 = 40, RULE_jdCouple5 = 41, RULE_jdCouple6 = 42, 
		RULE_jdPersonGrp1 = 43, RULE_jdPersonGrp2 = 44, RULE_jdPersonGrp3 = 45, 
		RULE_jdRelationship = 46, RULE_jointCurrentAddress = 47, RULE_jointPrevAddress = 48, 
		RULE_share = 49, RULE_equalShare = 50, RULE_desigPerson = 51, RULE_dpPattern1 = 52, 
		RULE_dpPattern2 = 53, RULE_dpPattern3 = 54, RULE_dpPattern4 = 55, RULE_dpPattern5 = 56, 
		RULE_dpPattern6 = 57, RULE_dpPattern7 = 58, RULE_dpPattern8 = 59, RULE_dpPattern9 = 60, 
		RULE_dpPattern10 = 61, RULE_dpPattern11 = 62, RULE_personDetails = 63, 
		RULE_pdPattern1 = 64, RULE_pdPattern2 = 65, RULE_pdPattern3 = 66, RULE_currentName = 67, 
		RULE_alias_B = 68, RULE_prevName_B = 69, RULE_prevNameAddr_B = 70, RULE_prevNameProfAddr_B = 71, 
		RULE_mainName = 72, RULE_alias = 73, RULE_prevName = 74, RULE_currentProfession = 75, 
		RULE_prevProfession = 76, RULE_postNom = 77, RULE_profession = 78, RULE_professions = 79, 
		RULE_prof = 80, RULE_profWord = 81, RULE_profs = 82, RULE_profText = 83, 
		RULE_widow = 84, RULE_lateHusbandName = 85, RULE_relation = 86, RULE_desigOrg = 87, 
		RULE_wellKnownOrg = 88, RULE_wkOrgPattern1 = 89, RULE_wkOrgPattern2 = 90, 
		RULE_wkOrgPattern3 = 91, RULE_the = 92, RULE_prevOrgName_B = 93, RULE_prevOrgNameAddr_B = 94, 
		RULE_smallFirm = 95, RULE_trade = 96, RULE_currentOrgName = 97, RULE_prevOrgName = 98, 
		RULE_smallFirmName = 99, RULE_namedParty = 100, RULE_personName = 101, 
		RULE_orgName = 102, RULE_partyNum = 103, RULE_salutation = 104, RULE_currentAddress = 105, 
		RULE_prevAddress = 106, RULE_address = 107, RULE_addrLine = 108, RULE_addrLinePart = 109, 
		RULE_premiseNum = 110, RULE_specialAddrBlock = 111, RULE_blockStartingWithI = 112, 
		RULE_tokensInAddr = 113, RULE_desigPartyRef = 114, RULE_dpRefPattern1 = 115, 
		RULE_dpRefPattern2 = 116, RULE_dpRefPattern3 = 117, RULE_legalGrpRef = 118, 
		RULE_date = 119, RULE_dates = 120, RULE_datePart = 121, RULE_day = 122, 
		RULE_month = 123, RULE_year = 124, RULE_amount = 125, RULE_moneyValue = 126, 
		RULE_comma = 127;
	public static final String[] ruleNames = {
		"block", "stdSecSeg1", "dispSeg1", "dischSeg1", "consideration", "gorRelation", 
		"leasePeriod", "duration", "timeValue", "timeUnit", "dateSpan", "startDate", 
		"endDate", "withConsent", "ofSecurityBy", "stdSecDate", "by", "to", "grantor", 
		"grantee", "consenter", "legalEntity", "representative", "trustee", "ownerTrustee", 
		"executor", "trusteeExecutor", "curatorBonis", "lrPrincipalLE", "principalLE", 
		"agentLE", "legalGroup", "complexGroup", "complexGrpPart", "mixedGroup", 
		"mixedGrpPart", "jdPersons", "jdCouple1", "jdCouple2", "jdCouple3", "jdCouple4", 
		"jdCouple5", "jdCouple6", "jdPersonGrp1", "jdPersonGrp2", "jdPersonGrp3", 
		"jdRelationship", "jointCurrentAddress", "jointPrevAddress", "share", 
		"equalShare", "desigPerson", "dpPattern1", "dpPattern2", "dpPattern3", 
		"dpPattern4", "dpPattern5", "dpPattern6", "dpPattern7", "dpPattern8", 
		"dpPattern9", "dpPattern10", "dpPattern11", "personDetails", "pdPattern1", 
		"pdPattern2", "pdPattern3", "currentName", "alias_B", "prevName_B", "prevNameAddr_B", 
		"prevNameProfAddr_B", "mainName", "alias", "prevName", "currentProfession", 
		"prevProfession", "postNom", "profession", "professions", "prof", "profWord", 
		"profs", "profText", "widow", "lateHusbandName", "relation", "desigOrg", 
		"wellKnownOrg", "wkOrgPattern1", "wkOrgPattern2", "wkOrgPattern3", "the", 
		"prevOrgName_B", "prevOrgNameAddr_B", "smallFirm", "trade", "currentOrgName", 
		"prevOrgName", "smallFirmName", "namedParty", "personName", "orgName", 
		"partyNum", "salutation", "currentAddress", "prevAddress", "address", 
		"addrLine", "addrLinePart", "premiseNum", "specialAddrBlock", "blockStartingWithI", 
		"tokensInAddr", "desigPartyRef", "dpRefPattern1", "dpRefPattern2", "dpRefPattern3", 
		"legalGrpRef", "date", "dates", "datePart", "day", "month", "year", "amount", 
		"moneyValue", "comma"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'recorded'", "'by'", "'St.'", "'c/o'", "'B.P.'", "'U.K.'", "'himself'", 
		"'herself'", "'Society'", "'themselves'", "';'", "':'", null, null, null, 
		null, "'Curator Bonis of'", "'Trustee and Executor of'", null, null, "'and others'", 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "'SECRETARY OF STATE FOR SCOTLAND'", "'{PERSON-'", "'{ORG-'", 
		"'}'", null, null, "'$'", "'STDSEC'", null, "'DISCH'", "'ASSIG'", "'LEASE'", 
		"'years'", null, "'.'", "','", "'/'", "'-'", "'TO'", "'BY'", "'OR'", "'and further sums'", 
		"'a maximum sum of'", null, "'for'", "'from'", "'of'", "'and'", "'both'", 
		"'said'", "'all'", "'('", "')'", "'&c.'", "'~'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "WITH_CONSENT_OF", "WITH_CONSENT", "SECURITY_DEED", "EXECUTOR_OF", 
		"CURATOR_BONIS_OF", "TRUSTEE_EXECUTOR_OF", "TRUSTEE_OF", "TRUSTEE_UNDER_DoT", 
		"AND_OTHERS", "AS_TRUSTEE_OF", "EQUALLY", "AND_SURVIVOR", "PREVIOUSLY", 
		"CURRENTLY", "ALIAS_PREFIX", "POST_NOM", "PROF_WORD", "REUSED_PROF_WORD", 
		"JOINT_PROF_WORD", "PROF_SUBJECT", "WIDOW", "RELN_NAME", "FIRM_OF", "NAMED_PARTY", 
		"PERSON_TOKEN", "ORG_TOKEN", "TOKEN_END", "SALUTATION", "APOS_S", "GBP", 
		"STDSEC", "DISP", "DISCH", "ASSIG", "LEASE", "TIME_UNIT", "MMM", "DOT", 
		"COMMA", "SLASH", "DASH", "TO", "BY", "OR", "FURTHER_SUMS", "MAX_SUM_OF", 
		"RELN_PREFIX", "FOR", "FROM", "OF", "AND", "BOTH", "SAID", "ALL", "O_BKT", 
		"C_BKT", "ETC", "TIL", "ALLCAPS_BLOCK", "INT", "ALPHA_BLOCK", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Seg1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public Seg1Parser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class BlockContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(Seg1Parser.EOF, 0); }
		public StdSecSeg1Context stdSecSeg1() {
			return getRuleContext(StdSecSeg1Context.class,0);
		}
		public DispSeg1Context dispSeg1() {
			return getRuleContext(DispSeg1Context.class,0);
		}
		public DischSeg1Context dischSeg1() {
			return getRuleContext(DischSeg1Context.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitBlock(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STDSEC:
				{
				setState(256);
				stdSecSeg1();
				}
				break;
			case DISP:
				{
				setState(257);
				dispSeg1();
				}
				break;
			case DISCH:
				{
				setState(258);
				dischSeg1();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << DOT) | (1L << COMMA))) != 0)) {
				{
				setState(261);
				comma();
				}
			}

			setState(264);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StdSecSeg1Context extends ParserRuleContext {
		public TerminalNode STDSEC() { return getToken(Seg1Parser.STDSEC, 0); }
		public ByContext by() {
			return getRuleContext(ByContext.class,0);
		}
		public GrantorContext grantor() {
			return getRuleContext(GrantorContext.class,0);
		}
		public ToContext to() {
			return getRuleContext(ToContext.class,0);
		}
		public GranteeContext grantee() {
			return getRuleContext(GranteeContext.class,0);
		}
		public ConsiderationContext consideration() {
			return getRuleContext(ConsiderationContext.class,0);
		}
		public StdSecSeg1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stdSecSeg1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterStdSecSeg1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitStdSecSeg1(this);
		}
	}

	public final StdSecSeg1Context stdSecSeg1() throws RecognitionException {
		StdSecSeg1Context _localctx = new StdSecSeg1Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_stdSecSeg1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(STDSEC);
			setState(268);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FOR) {
				{
				setState(267);
				consideration();
				}
			}

			setState(270);
			by();
			setState(271);
			grantor();
			setState(272);
			to();
			setState(273);
			grantee();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DispSeg1Context extends ParserRuleContext {
		public TerminalNode DISP() { return getToken(Seg1Parser.DISP, 0); }
		public ByContext by() {
			return getRuleContext(ByContext.class,0);
		}
		public GrantorContext grantor() {
			return getRuleContext(GrantorContext.class,0);
		}
		public ToContext to() {
			return getRuleContext(ToContext.class,0);
		}
		public GranteeContext grantee() {
			return getRuleContext(GranteeContext.class,0);
		}
		public WithConsentContext withConsent() {
			return getRuleContext(WithConsentContext.class,0);
		}
		public DispSeg1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dispSeg1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterDispSeg1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitDispSeg1(this);
		}
	}

	public final DispSeg1Context dispSeg1() throws RecognitionException {
		DispSeg1Context _localctx = new DispSeg1Context(_ctx, getState());
		enterRule(_localctx, 4, RULE_dispSeg1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(DISP);
			setState(276);
			by();
			setState(277);
			grantor();
			setState(279);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << WITH_CONSENT_OF) | (1L << WITH_CONSENT) | (1L << DOT) | (1L << COMMA))) != 0)) {
				{
				setState(278);
				withConsent();
				}
			}

			setState(281);
			to();
			setState(282);
			grantee();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DischSeg1Context extends ParserRuleContext {
		public TerminalNode DISCH() { return getToken(Seg1Parser.DISCH, 0); }
		public ByContext by() {
			return getRuleContext(ByContext.class,0);
		}
		public GrantorContext grantor() {
			return getRuleContext(GrantorContext.class,0);
		}
		public OfSecurityByContext ofSecurityBy() {
			return getRuleContext(OfSecurityByContext.class,0);
		}
		public GranteeContext grantee() {
			return getRuleContext(GranteeContext.class,0);
		}
		public DischSeg1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dischSeg1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterDischSeg1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitDischSeg1(this);
		}
	}

	public final DischSeg1Context dischSeg1() throws RecognitionException {
		DischSeg1Context _localctx = new DischSeg1Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_dischSeg1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(DISCH);
			setState(285);
			by();
			setState(286);
			grantor();
			setState(287);
			ofSecurityBy();
			setState(288);
			grantee();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConsiderationContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(Seg1Parser.FOR, 0); }
		public AmountContext amount() {
			return getRuleContext(AmountContext.class,0);
		}
		public TerminalNode MAX_SUM_OF() { return getToken(Seg1Parser.MAX_SUM_OF, 0); }
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public TerminalNode FURTHER_SUMS() { return getToken(Seg1Parser.FURTHER_SUMS, 0); }
		public TerminalNode ETC() { return getToken(Seg1Parser.ETC, 0); }
		public ConsiderationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consideration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterConsideration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitConsideration(this);
		}
	}

	public final ConsiderationContext consideration() throws RecognitionException {
		ConsiderationContext _localctx = new ConsiderationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_consideration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(290);
			match(FOR);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MAX_SUM_OF) {
				{
				setState(291);
				match(MAX_SUM_OF);
				}
			}

			setState(294);
			amount();
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FURTHER_SUMS || _la==ETC) {
				{
				setState(295);
				_la = _input.LA(1);
				if ( !(_la==FURTHER_SUMS || _la==ETC) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(299);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << DOT) | (1L << COMMA))) != 0)) {
				{
				setState(298);
				comma();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GorRelationContext extends ParserRuleContext {
		public TerminalNode RELN_PREFIX() { return getToken(Seg1Parser.RELN_PREFIX, 0); }
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public GorRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_gorRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterGorRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitGorRelation(this);
		}
	}

	public final GorRelationContext gorRelation() throws RecognitionException {
		GorRelationContext _localctx = new GorRelationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_gorRelation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(301);
			match(RELN_PREFIX);
			setState(302);
			relation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeasePeriodContext extends ParserRuleContext {
		public DurationContext duration() {
			return getRuleContext(DurationContext.class,0);
		}
		public DateSpanContext dateSpan() {
			return getRuleContext(DateSpanContext.class,0);
		}
		public LeasePeriodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leasePeriod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterLeasePeriod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitLeasePeriod(this);
		}
	}

	public final LeasePeriodContext leasePeriod() throws RecognitionException {
		LeasePeriodContext _localctx = new LeasePeriodContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_leasePeriod);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(304);
			duration();
			setState(305);
			dateSpan();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DurationContext extends ParserRuleContext {
		public TimeValueContext timeValue() {
			return getRuleContext(TimeValueContext.class,0);
		}
		public TimeUnitContext timeUnit() {
			return getRuleContext(TimeUnitContext.class,0);
		}
		public DurationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_duration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterDuration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitDuration(this);
		}
	}

	public final DurationContext duration() throws RecognitionException {
		DurationContext _localctx = new DurationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_duration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			timeValue();
			setState(308);
			timeUnit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeValueContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(Seg1Parser.INT, 0); }
		public TimeValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterTimeValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitTimeValue(this);
		}
	}

	public final TimeValueContext timeValue() throws RecognitionException {
		TimeValueContext _localctx = new TimeValueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_timeValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(310);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TimeUnitContext extends ParserRuleContext {
		public TerminalNode TIME_UNIT() { return getToken(Seg1Parser.TIME_UNIT, 0); }
		public TimeUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterTimeUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitTimeUnit(this);
		}
	}

	public final TimeUnitContext timeUnit() throws RecognitionException {
		TimeUnitContext _localctx = new TimeUnitContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_timeUnit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(312);
			match(TIME_UNIT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateSpanContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(Seg1Parser.FROM, 0); }
		public StartDateContext startDate() {
			return getRuleContext(StartDateContext.class,0);
		}
		public TerminalNode TO() { return getToken(Seg1Parser.TO, 0); }
		public EndDateContext endDate() {
			return getRuleContext(EndDateContext.class,0);
		}
		public DateSpanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dateSpan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterDateSpan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitDateSpan(this);
		}
	}

	public final DateSpanContext dateSpan() throws RecognitionException {
		DateSpanContext _localctx = new DateSpanContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_dateSpan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			match(FROM);
			setState(315);
			startDate();
			setState(316);
			match(TO);
			setState(317);
			endDate();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StartDateContext extends ParserRuleContext {
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public StartDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_startDate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterStartDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitStartDate(this);
		}
	}

	public final StartDateContext startDate() throws RecognitionException {
		StartDateContext _localctx = new StartDateContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_startDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(319);
			date();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EndDateContext extends ParserRuleContext {
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public EndDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_endDate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterEndDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitEndDate(this);
		}
	}

	public final EndDateContext endDate() throws RecognitionException {
		EndDateContext _localctx = new EndDateContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_endDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			date();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithConsentContext extends ParserRuleContext {
		public TerminalNode WITH_CONSENT_OF() { return getToken(Seg1Parser.WITH_CONSENT_OF, 0); }
		public ConsenterContext consenter() {
			return getRuleContext(ConsenterContext.class,0);
		}
		public TerminalNode WITH_CONSENT() { return getToken(Seg1Parser.WITH_CONSENT, 0); }
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public WithConsentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_withConsent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterWithConsent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitWithConsent(this);
		}
	}

	public final WithConsentContext withConsent() throws RecognitionException {
		WithConsentContext _localctx = new WithConsentContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_withConsent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << DOT) | (1L << COMMA))) != 0)) {
				{
				setState(323);
				comma();
				}
			}

			setState(329);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WITH_CONSENT_OF:
				{
				setState(326);
				match(WITH_CONSENT_OF);
				setState(327);
				consenter();
				}
				break;
			case WITH_CONSENT:
				{
				setState(328);
				match(WITH_CONSENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OfSecurityByContext extends ParserRuleContext {
		public ToContext to() {
			return getRuleContext(ToContext.class,0);
		}
		public TerminalNode SECURITY_DEED() { return getToken(Seg1Parser.SECURITY_DEED, 0); }
		public TerminalNode O_BKT() { return getToken(Seg1Parser.O_BKT, 0); }
		public StdSecDateContext stdSecDate() {
			return getRuleContext(StdSecDateContext.class,0);
		}
		public TerminalNode C_BKT() { return getToken(Seg1Parser.C_BKT, 0); }
		public OfSecurityByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ofSecurityBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterOfSecurityBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitOfSecurityBy(this);
		}
	}

	public final OfSecurityByContext ofSecurityBy() throws RecognitionException {
		OfSecurityByContext _localctx = new OfSecurityByContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_ofSecurityBy);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			to();
			setState(332);
			match(SECURITY_DEED);
			setState(333);
			match(O_BKT);
			setState(334);
			match(T__0);
			setState(335);
			stdSecDate();
			setState(336);
			match(C_BKT);
			setState(337);
			match(T__1);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StdSecDateContext extends ParserRuleContext {
		public DateContext date() {
			return getRuleContext(DateContext.class,0);
		}
		public StdSecDateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stdSecDate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterStdSecDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitStdSecDate(this);
		}
	}

	public final StdSecDateContext stdSecDate() throws RecognitionException {
		StdSecDateContext _localctx = new StdSecDateContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_stdSecDate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			date();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ByContext extends ParserRuleContext {
		public TerminalNode BY() { return getToken(Seg1Parser.BY, 0); }
		public TerminalNode TIL() { return getToken(Seg1Parser.TIL, 0); }
		public ByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitBy(this);
		}
	}

	public final ByContext by() throws RecognitionException {
		ByContext _localctx = new ByContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_by);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(342);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIL) {
				{
				setState(341);
				match(TIL);
				}
			}

			setState(344);
			match(BY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ToContext extends ParserRuleContext {
		public TerminalNode TO() { return getToken(Seg1Parser.TO, 0); }
		public TerminalNode TIL() { return getToken(Seg1Parser.TIL, 0); }
		public ToContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_to; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitTo(this);
		}
	}

	public final ToContext to() throws RecognitionException {
		ToContext _localctx = new ToContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_to);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TIL) {
				{
				setState(346);
				match(TIL);
				}
			}

			setState(349);
			match(TO);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GrantorContext extends ParserRuleContext {
		public LegalEntityContext legalEntity() {
			return getRuleContext(LegalEntityContext.class,0);
		}
		public GrantorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterGrantor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitGrantor(this);
		}
	}

	public final GrantorContext grantor() throws RecognitionException {
		GrantorContext _localctx = new GrantorContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_grantor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(351);
			legalEntity();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GranteeContext extends ParserRuleContext {
		public LegalEntityContext legalEntity() {
			return getRuleContext(LegalEntityContext.class,0);
		}
		public DesigPersonContext desigPerson() {
			return getRuleContext(DesigPersonContext.class,0);
		}
		public GorRelationContext gorRelation() {
			return getRuleContext(GorRelationContext.class,0);
		}
		public GranteeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grantee; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterGrantee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitGrantee(this);
		}
	}

	public final GranteeContext grantee() throws RecognitionException {
		GranteeContext _localctx = new GranteeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_grantee);
		int _la;
		try {
			setState(358);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(353);
				legalEntity();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(355);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RELN_PREFIX) {
					{
					setState(354);
					gorRelation();
					}
				}

				setState(357);
				desigPerson();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConsenterContext extends ParserRuleContext {
		public LegalEntityContext legalEntity() {
			return getRuleContext(LegalEntityContext.class,0);
		}
		public ConsenterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_consenter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterConsenter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitConsenter(this);
		}
	}

	public final ConsenterContext consenter() throws RecognitionException {
		ConsenterContext _localctx = new ConsenterContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_consenter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			legalEntity();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LegalEntityContext extends ParserRuleContext {
		public PrincipalLEContext principalLE() {
			return getRuleContext(PrincipalLEContext.class,0);
		}
		public RepresentativeContext representative() {
			return getRuleContext(RepresentativeContext.class,0);
		}
		public MixedGroupContext mixedGroup() {
			return getRuleContext(MixedGroupContext.class,0);
		}
		public LegalEntityContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_legalEntity; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterLegalEntity(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitLegalEntity(this);
		}
	}

	public final LegalEntityContext legalEntity() throws RecognitionException {
		LegalEntityContext _localctx = new LegalEntityContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_legalEntity);
		try {
			setState(365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				principalLE();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				representative();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				mixedGroup();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepresentativeContext extends ParserRuleContext {
		public TrusteeContext trustee() {
			return getRuleContext(TrusteeContext.class,0);
		}
		public ExecutorContext executor() {
			return getRuleContext(ExecutorContext.class,0);
		}
		public TrusteeExecutorContext trusteeExecutor() {
			return getRuleContext(TrusteeExecutorContext.class,0);
		}
		public CuratorBonisContext curatorBonis() {
			return getRuleContext(CuratorBonisContext.class,0);
		}
		public RepresentativeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_representative; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterRepresentative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitRepresentative(this);
		}
	}

	public final RepresentativeContext representative() throws RecognitionException {
		RepresentativeContext _localctx = new RepresentativeContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_representative);
		try {
			setState(371);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(367);
				trustee();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(368);
				executor();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(369);
				trusteeExecutor();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(370);
				curatorBonis();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrusteeContext extends ParserRuleContext {
		public TerminalNode TRUSTEE_UNDER_DoT() { return getToken(Seg1Parser.TRUSTEE_UNDER_DoT, 0); }
		public LrPrincipalLEContext lrPrincipalLE() {
			return getRuleContext(LrPrincipalLEContext.class,0);
		}
		public TerminalNode AND_OTHERS() { return getToken(Seg1Parser.AND_OTHERS, 0); }
		public TerminalNode TRUSTEE_OF() { return getToken(Seg1Parser.TRUSTEE_OF, 0); }
		public OwnerTrusteeContext ownerTrustee() {
			return getRuleContext(OwnerTrusteeContext.class,0);
		}
		public TrusteeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trustee; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterTrustee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitTrustee(this);
		}
	}

	public final TrusteeContext trustee() throws RecognitionException {
		TrusteeContext _localctx = new TrusteeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_trustee);
		int _la;
		try {
			setState(381);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(373);
				match(TRUSTEE_UNDER_DoT);
				setState(374);
				lrPrincipalLE();
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AND_OTHERS) {
					{
					setState(375);
					match(AND_OTHERS);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(378);
				match(TRUSTEE_OF);
				setState(379);
				lrPrincipalLE();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(380);
				ownerTrustee();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OwnerTrusteeContext extends ParserRuleContext {
		public AgentLEContext agentLE() {
			return getRuleContext(AgentLEContext.class,0);
		}
		public TerminalNode AS_TRUSTEE_OF() { return getToken(Seg1Parser.AS_TRUSTEE_OF, 0); }
		public LrPrincipalLEContext lrPrincipalLE() {
			return getRuleContext(LrPrincipalLEContext.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public OwnerTrusteeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ownerTrustee; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterOwnerTrustee(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitOwnerTrustee(this);
		}
	}

	public final OwnerTrusteeContext ownerTrustee() throws RecognitionException {
		OwnerTrusteeContext _localctx = new OwnerTrusteeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_ownerTrustee);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			agentLE();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << DOT) | (1L << COMMA))) != 0)) {
				{
				setState(384);
				comma();
				}
			}

			setState(387);
			match(AS_TRUSTEE_OF);
			setState(388);
			lrPrincipalLE();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExecutorContext extends ParserRuleContext {
		public TerminalNode EXECUTOR_OF() { return getToken(Seg1Parser.EXECUTOR_OF, 0); }
		public LrPrincipalLEContext lrPrincipalLE() {
			return getRuleContext(LrPrincipalLEContext.class,0);
		}
		public ExecutorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_executor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterExecutor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitExecutor(this);
		}
	}

	public final ExecutorContext executor() throws RecognitionException {
		ExecutorContext _localctx = new ExecutorContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_executor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(390);
			match(EXECUTOR_OF);
			setState(391);
			lrPrincipalLE();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TrusteeExecutorContext extends ParserRuleContext {
		public TerminalNode TRUSTEE_EXECUTOR_OF() { return getToken(Seg1Parser.TRUSTEE_EXECUTOR_OF, 0); }
		public LrPrincipalLEContext lrPrincipalLE() {
			return getRuleContext(LrPrincipalLEContext.class,0);
		}
		public TrusteeExecutorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trusteeExecutor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterTrusteeExecutor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitTrusteeExecutor(this);
		}
	}

	public final TrusteeExecutorContext trusteeExecutor() throws RecognitionException {
		TrusteeExecutorContext _localctx = new TrusteeExecutorContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_trusteeExecutor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(393);
			match(TRUSTEE_EXECUTOR_OF);
			setState(394);
			lrPrincipalLE();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CuratorBonisContext extends ParserRuleContext {
		public TerminalNode CURATOR_BONIS_OF() { return getToken(Seg1Parser.CURATOR_BONIS_OF, 0); }
		public LrPrincipalLEContext lrPrincipalLE() {
			return getRuleContext(LrPrincipalLEContext.class,0);
		}
		public CuratorBonisContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_curatorBonis; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterCuratorBonis(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitCuratorBonis(this);
		}
	}

	public final CuratorBonisContext curatorBonis() throws RecognitionException {
		CuratorBonisContext _localctx = new CuratorBonisContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_curatorBonis);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			match(CURATOR_BONIS_OF);
			setState(397);
			lrPrincipalLE();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LrPrincipalLEContext extends ParserRuleContext {
		public PrincipalLEContext principalLE() {
			return getRuleContext(PrincipalLEContext.class,0);
		}
		public LrPrincipalLEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lrPrincipalLE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterLrPrincipalLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitLrPrincipalLE(this);
		}
	}

	public final LrPrincipalLEContext lrPrincipalLE() throws RecognitionException {
		LrPrincipalLEContext _localctx = new LrPrincipalLEContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_lrPrincipalLE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			principalLE();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrincipalLEContext extends ParserRuleContext {
		public DesigPersonContext desigPerson() {
			return getRuleContext(DesigPersonContext.class,0);
		}
		public DesigOrgContext desigOrg() {
			return getRuleContext(DesigOrgContext.class,0);
		}
		public LegalGroupContext legalGroup() {
			return getRuleContext(LegalGroupContext.class,0);
		}
		public DesigPartyRefContext desigPartyRef() {
			return getRuleContext(DesigPartyRefContext.class,0);
		}
		public LegalGrpRefContext legalGrpRef() {
			return getRuleContext(LegalGrpRefContext.class,0);
		}
		public NamedPartyContext namedParty() {
			return getRuleContext(NamedPartyContext.class,0);
		}
		public PrincipalLEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_principalLE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterPrincipalLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitPrincipalLE(this);
		}
	}

	public final PrincipalLEContext principalLE() throws RecognitionException {
		PrincipalLEContext _localctx = new PrincipalLEContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_principalLE);
		try {
			setState(407);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(401);
				desigPerson();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				desigOrg();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(403);
				legalGroup();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(404);
				desigPartyRef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(405);
				legalGrpRef();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(406);
				namedParty();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AgentLEContext extends ParserRuleContext {
		public DesigPersonContext desigPerson() {
			return getRuleContext(DesigPersonContext.class,0);
		}
		public DesigOrgContext desigOrg() {
			return getRuleContext(DesigOrgContext.class,0);
		}
		public LegalGroupContext legalGroup() {
			return getRuleContext(LegalGroupContext.class,0);
		}
		public AgentLEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_agentLE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterAgentLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitAgentLE(this);
		}
	}

	public final AgentLEContext agentLE() throws RecognitionException {
		AgentLEContext _localctx = new AgentLEContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_agentLE);
		try {
			setState(412);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				desigPerson();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				desigOrg();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(411);
				legalGroup();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LegalGroupContext extends ParserRuleContext {
		public JdPersonsContext jdPersons() {
			return getRuleContext(JdPersonsContext.class,0);
		}
		public ComplexGroupContext complexGroup() {
			return getRuleContext(ComplexGroupContext.class,0);
		}
		public LegalGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_legalGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterLegalGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitLegalGroup(this);
		}
	}

	public final LegalGroupContext legalGroup() throws RecognitionException {
		LegalGroupContext _localctx = new LegalGroupContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_legalGroup);
		try {
			setState(416);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(414);
				jdPersons();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(415);
				complexGroup();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexGroupContext extends ParserRuleContext {
		public List<ComplexGrpPartContext> complexGrpPart() {
			return getRuleContexts(ComplexGrpPartContext.class);
		}
		public ComplexGrpPartContext complexGrpPart(int i) {
			return getRuleContext(ComplexGrpPartContext.class,i);
		}
		public TerminalNode AND() { return getToken(Seg1Parser.AND, 0); }
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public ShareContext share() {
			return getRuleContext(ShareContext.class,0);
		}
		public ComplexGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterComplexGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitComplexGroup(this);
		}
	}

	public final ComplexGroupContext complexGroup() throws RecognitionException {
		ComplexGroupContext _localctx = new ComplexGroupContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_complexGroup);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			complexGrpPart();
			setState(424);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(419);
					comma();
					setState(420);
					complexGrpPart();
					}
					} 
				}
				setState(426);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(428);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << DOT) | (1L << COMMA))) != 0)) {
				{
				setState(427);
				comma();
				}
			}

			setState(430);
			match(AND);
			setState(431);
			complexGrpPart();
			setState(433);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				{
				setState(432);
				share();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexGrpPartContext extends ParserRuleContext {
		public DesigPersonContext desigPerson() {
			return getRuleContext(DesigPersonContext.class,0);
		}
		public DesigOrgContext desigOrg() {
			return getRuleContext(DesigOrgContext.class,0);
		}
		public JdPersonsContext jdPersons() {
			return getRuleContext(JdPersonsContext.class,0);
		}
		public DesigPartyRefContext desigPartyRef() {
			return getRuleContext(DesigPartyRefContext.class,0);
		}
		public ComplexGrpPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexGrpPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterComplexGrpPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitComplexGrpPart(this);
		}
	}

	public final ComplexGrpPartContext complexGrpPart() throws RecognitionException {
		ComplexGrpPartContext _localctx = new ComplexGrpPartContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_complexGrpPart);
		try {
			setState(439);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				desigPerson();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				desigOrg();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				jdPersons();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(438);
				desigPartyRef();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MixedGroupContext extends ParserRuleContext {
		public List<MixedGrpPartContext> mixedGrpPart() {
			return getRuleContexts(MixedGrpPartContext.class);
		}
		public MixedGrpPartContext mixedGrpPart(int i) {
			return getRuleContext(MixedGrpPartContext.class,i);
		}
		public TerminalNode AND() { return getToken(Seg1Parser.AND, 0); }
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public ShareContext share() {
			return getRuleContext(ShareContext.class,0);
		}
		public MixedGroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixedGroup; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterMixedGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitMixedGroup(this);
		}
	}

	public final MixedGroupContext mixedGroup() throws RecognitionException {
		MixedGroupContext _localctx = new MixedGroupContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_mixedGroup);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(441);
			mixedGrpPart();
			setState(447);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(442);
					comma();
					setState(443);
					mixedGrpPart();
					}
					} 
				}
				setState(449);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			setState(451);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << DOT) | (1L << COMMA))) != 0)) {
				{
				setState(450);
				comma();
				}
			}

			setState(453);
			match(AND);
			setState(454);
			mixedGrpPart();
			setState(456);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(455);
				share();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MixedGrpPartContext extends ParserRuleContext {
		public DesigPersonContext desigPerson() {
			return getRuleContext(DesigPersonContext.class,0);
		}
		public DesigOrgContext desigOrg() {
			return getRuleContext(DesigOrgContext.class,0);
		}
		public JdPersonsContext jdPersons() {
			return getRuleContext(JdPersonsContext.class,0);
		}
		public DesigPartyRefContext desigPartyRef() {
			return getRuleContext(DesigPartyRefContext.class,0);
		}
		public RepresentativeContext representative() {
			return getRuleContext(RepresentativeContext.class,0);
		}
		public MixedGrpPartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mixedGrpPart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterMixedGrpPart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitMixedGrpPart(this);
		}
	}

	public final MixedGrpPartContext mixedGrpPart() throws RecognitionException {
		MixedGrpPartContext _localctx = new MixedGrpPartContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_mixedGrpPart);
		try {
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(458);
				desigPerson();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(459);
				desigOrg();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(460);
				jdPersons();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(461);
				desigPartyRef();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(462);
				representative();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JdPersonsContext extends ParserRuleContext {
		public JdCouple1Context jdCouple1() {
			return getRuleContext(JdCouple1Context.class,0);
		}
		public JdCouple2Context jdCouple2() {
			return getRuleContext(JdCouple2Context.class,0);
		}
		public JdCouple3Context jdCouple3() {
			return getRuleContext(JdCouple3Context.class,0);
		}
		public JdCouple4Context jdCouple4() {
			return getRuleContext(JdCouple4Context.class,0);
		}
		public JdCouple5Context jdCouple5() {
			return getRuleContext(JdCouple5Context.class,0);
		}
		public JdCouple6Context jdCouple6() {
			return getRuleContext(JdCouple6Context.class,0);
		}
		public JdPersonGrp1Context jdPersonGrp1() {
			return getRuleContext(JdPersonGrp1Context.class,0);
		}
		public JdPersonGrp2Context jdPersonGrp2() {
			return getRuleContext(JdPersonGrp2Context.class,0);
		}
		public JdPersonGrp3Context jdPersonGrp3() {
			return getRuleContext(JdPersonGrp3Context.class,0);
		}
		public JdPersonsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jdPersons; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterJdPersons(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitJdPersons(this);
		}
	}

	public final JdPersonsContext jdPersons() throws RecognitionException {
		JdPersonsContext _localctx = new JdPersonsContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_jdPersons);
		try {
			setState(474);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				jdCouple1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				jdCouple2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				jdCouple3();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(468);
				jdCouple4();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(469);
				jdCouple5();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(470);
				jdCouple6();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(471);
				jdPersonGrp1();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(472);
				jdPersonGrp2();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(473);
				jdPersonGrp3();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JdCouple1Context extends ParserRuleContext {
		public List<DesigPersonContext> desigPerson() {
			return getRuleContexts(DesigPersonContext.class);
		}
		public DesigPersonContext desigPerson(int i) {
			return getRuleContext(DesigPersonContext.class,i);
		}
		public TerminalNode AND() { return getToken(Seg1Parser.AND, 0); }
		public JointCurrentAddressContext jointCurrentAddress() {
			return getRuleContext(JointCurrentAddressContext.class,0);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public JdRelationshipContext jdRelationship() {
			return getRuleContext(JdRelationshipContext.class,0);
		}
		public List<TerminalNode> BOTH() { return getTokens(Seg1Parser.BOTH); }
		public TerminalNode BOTH(int i) {
			return getToken(Seg1Parser.BOTH, i);
		}
		public TerminalNode PREVIOUSLY() { return getToken(Seg1Parser.PREVIOUSLY, 0); }
		public JointPrevAddressContext jointPrevAddress() {
			return getRuleContext(JointPrevAddressContext.class,0);
		}
		public TerminalNode CURRENTLY() { return getToken(Seg1Parser.CURRENTLY, 0); }
		public ShareContext share() {
			return getRuleContext(ShareContext.class,0);
		}
		public JdCouple1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jdCouple1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterJdCouple1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitJdCouple1(this);
		}
	}

	public final JdCouple1Context jdCouple1() throws RecognitionException {
		JdCouple1Context _localctx = new JdCouple1Context(_ctx, getState());
		enterRule(_localctx, 74, RULE_jdCouple1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			desigPerson();
			setState(477);
			match(AND);
			setState(478);
			desigPerson();
			setState(482);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(479);
				comma();
				setState(480);
				jdRelationship();
				}
				break;
			}
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
			case 1:
				{
				setState(484);
				comma();
				}
				break;
			}
			setState(488);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
			case 1:
				{
				setState(487);
				match(BOTH);
				}
				break;
			}
			setState(492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(490);
				match(PREVIOUSLY);
				setState(491);
				jointPrevAddress();
				}
				break;
			}
			setState(495);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(494);
				match(BOTH);
				}
				break;
			}
			setState(498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(497);
				match(CURRENTLY);
				}
				break;
			}
			setState(500);
			jointCurrentAddress();
			setState(502);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(501);
				share();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JdCouple2Context extends ParserRuleContext {
		public List<DesigPersonContext> desigPerson() {
			return getRuleContexts(DesigPersonContext.class);
		}
		public DesigPersonContext desigPerson(int i) {
			return getRuleContext(DesigPersonContext.class,i);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public JointCurrentAddressContext jointCurrentAddress() {
			return getRuleContext(JointCurrentAddressContext.class,0);
		}
		public TerminalNode AND() { return getToken(Seg1Parser.AND, 0); }
		public JdRelationshipContext jdRelationship() {
			return getRuleContext(JdRelationshipContext.class,0);
		}
		public TerminalNode PREVIOUSLY() { return getToken(Seg1Parser.PREVIOUSLY, 0); }
		public JointPrevAddressContext jointPrevAddress() {
			return getRuleContext(JointPrevAddressContext.class,0);
		}
		public TerminalNode CURRENTLY() { return getToken(Seg1Parser.CURRENTLY, 0); }
		public ShareContext share() {
			return getRuleContext(ShareContext.class,0);
		}
		public JdCouple2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jdCouple2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterJdCouple2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitJdCouple2(this);
		}
	}

	public final JdCouple2Context jdCouple2() throws RecognitionException {
		JdCouple2Context _localctx = new JdCouple2Context(_ctx, getState());
		enterRule(_localctx, 76, RULE_jdCouple2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			desigPerson();
			setState(505);
			comma();
			setState(508);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				{
				setState(506);
				match(PREVIOUSLY);
				setState(507);
				jointPrevAddress();
				}
				break;
			}
			setState(511);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				{
				setState(510);
				match(CURRENTLY);
				}
				break;
			}
			setState(513);
			jointCurrentAddress();
			setState(515);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << DOT) | (1L << COMMA))) != 0)) {
				{
				setState(514);
				comma();
				}
			}

			setState(517);
			match(AND);
			setState(518);
			jdRelationship();
			setState(519);
			desigPerson();
			setState(521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				{
				setState(520);
				share();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JdCouple3Context extends ParserRuleContext {
		public List<DesigPersonContext> desigPerson() {
			return getRuleContexts(DesigPersonContext.class);
		}
		public DesigPersonContext desigPerson(int i) {
			return getRuleContext(DesigPersonContext.class,i);
		}
		public TerminalNode AND() { return getToken(Seg1Parser.AND, 0); }
		public TerminalNode CURRENTLY() { return getToken(Seg1Parser.CURRENTLY, 0); }
		public JdRelationshipContext jdRelationship() {
			return getRuleContext(JdRelationshipContext.class,0);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public JointCurrentAddressContext jointCurrentAddress() {
			return getRuleContext(JointCurrentAddressContext.class,0);
		}
		public ShareContext share() {
			return getRuleContext(ShareContext.class,0);
		}
		public JdCouple3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jdCouple3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterJdCouple3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitJdCouple3(this);
		}
	}

	public final JdCouple3Context jdCouple3() throws RecognitionException {
		JdCouple3Context _localctx = new JdCouple3Context(_ctx, getState());
		enterRule(_localctx, 78, RULE_jdCouple3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(523);
			desigPerson();
			setState(524);
			match(AND);
			setState(525);
			desigPerson();
			setState(527);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << DOT) | (1L << COMMA))) != 0)) {
				{
				setState(526);
				comma();
				}
			}

			setState(529);
			match(CURRENTLY);
			setState(530);
			jdRelationship();
			setState(531);
			comma();
			setState(532);
			jointCurrentAddress();
			setState(534);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(533);
				share();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JdCouple4Context extends ParserRuleContext {
		public List<DesigPersonContext> desigPerson() {
			return getRuleContexts(DesigPersonContext.class);
		}
		public DesigPersonContext desigPerson(int i) {
			return getRuleContext(DesigPersonContext.class,i);
		}
		public TerminalNode AND() { return getToken(Seg1Parser.AND, 0); }
		public TerminalNode BOTH() { return getToken(Seg1Parser.BOTH, 0); }
		public ProfessionsContext professions() {
			return getRuleContext(ProfessionsContext.class,0);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public JointCurrentAddressContext jointCurrentAddress() {
			return getRuleContext(JointCurrentAddressContext.class,0);
		}
		public TerminalNode PREVIOUSLY() { return getToken(Seg1Parser.PREVIOUSLY, 0); }
		public JointPrevAddressContext jointPrevAddress() {
			return getRuleContext(JointPrevAddressContext.class,0);
		}
		public TerminalNode CURRENTLY() { return getToken(Seg1Parser.CURRENTLY, 0); }
		public ShareContext share() {
			return getRuleContext(ShareContext.class,0);
		}
		public JdCouple4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jdCouple4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterJdCouple4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitJdCouple4(this);
		}
	}

	public final JdCouple4Context jdCouple4() throws RecognitionException {
		JdCouple4Context _localctx = new JdCouple4Context(_ctx, getState());
		enterRule(_localctx, 80, RULE_jdCouple4);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(536);
			desigPerson();
			setState(537);
			match(AND);
			setState(538);
			desigPerson();
			setState(539);
			match(BOTH);
			setState(540);
			professions();
			setState(541);
			comma();
			setState(546);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				{
				setState(542);
				match(PREVIOUSLY);
				setState(543);
				jointPrevAddress();
				setState(544);
				comma();
				}
				break;
			}
			setState(549);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				{
				setState(548);
				match(CURRENTLY);
				}
				break;
			}
			setState(551);
			jointCurrentAddress();
			setState(553);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(552);
				share();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JdCouple5Context extends ParserRuleContext {
		public List<DesigPersonContext> desigPerson() {
			return getRuleContexts(DesigPersonContext.class);
		}
		public DesigPersonContext desigPerson(int i) {
			return getRuleContext(DesigPersonContext.class,i);
		}
		public TerminalNode AND() { return getToken(Seg1Parser.AND, 0); }
		public JdRelationshipContext jdRelationship() {
			return getRuleContext(JdRelationshipContext.class,0);
		}
		public ShareContext share() {
			return getRuleContext(ShareContext.class,0);
		}
		public JdCouple5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jdCouple5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterJdCouple5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitJdCouple5(this);
		}
	}

	public final JdCouple5Context jdCouple5() throws RecognitionException {
		JdCouple5Context _localctx = new JdCouple5Context(_ctx, getState());
		enterRule(_localctx, 82, RULE_jdCouple5);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(555);
			desigPerson();
			setState(556);
			match(AND);
			setState(557);
			jdRelationship();
			setState(558);
			desigPerson();
			setState(560);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
			case 1:
				{
				setState(559);
				share();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JdCouple6Context extends ParserRuleContext {
		public DesigPartyRefContext desigPartyRef() {
			return getRuleContext(DesigPartyRefContext.class,0);
		}
		public TerminalNode AND() { return getToken(Seg1Parser.AND, 0); }
		public DesigPersonContext desigPerson() {
			return getRuleContext(DesigPersonContext.class,0);
		}
		public GorRelationContext gorRelation() {
			return getRuleContext(GorRelationContext.class,0);
		}
		public JdRelationshipContext jdRelationship() {
			return getRuleContext(JdRelationshipContext.class,0);
		}
		public ShareContext share() {
			return getRuleContext(ShareContext.class,0);
		}
		public JdCouple6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jdCouple6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterJdCouple6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitJdCouple6(this);
		}
	}

	public final JdCouple6Context jdCouple6() throws RecognitionException {
		JdCouple6Context _localctx = new JdCouple6Context(_ctx, getState());
		enterRule(_localctx, 84, RULE_jdCouple6);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			desigPartyRef();
			setState(563);
			match(AND);
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RELN_PREFIX) {
				{
				setState(564);
				gorRelation();
				}
			}

			setState(567);
			desigPerson();
			setState(569);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				{
				setState(568);
				jdRelationship();
				}
				break;
			}
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				{
				setState(571);
				share();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JdPersonGrp1Context extends ParserRuleContext {
		public List<DesigPersonContext> desigPerson() {
			return getRuleContexts(DesigPersonContext.class);
		}
		public DesigPersonContext desigPerson(int i) {
			return getRuleContext(DesigPersonContext.class,i);
		}
		public TerminalNode AND() { return getToken(Seg1Parser.AND, 0); }
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public ShareContext share() {
			return getRuleContext(ShareContext.class,0);
		}
		public JdPersonGrp1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jdPersonGrp1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterJdPersonGrp1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitJdPersonGrp1(this);
		}
	}

	public final JdPersonGrp1Context jdPersonGrp1() throws RecognitionException {
		JdPersonGrp1Context _localctx = new JdPersonGrp1Context(_ctx, getState());
		enterRule(_localctx, 86, RULE_jdPersonGrp1);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(579);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(574);
					desigPerson();
					setState(575);
					comma();
					}
					} 
				}
				setState(581);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			setState(582);
			desigPerson();
			setState(583);
			match(AND);
			setState(584);
			desigPerson();
			setState(586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
			case 1:
				{
				setState(585);
				share();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JdPersonGrp2Context extends ParserRuleContext {
		public List<DesigPersonContext> desigPerson() {
			return getRuleContexts(DesigPersonContext.class);
		}
		public DesigPersonContext desigPerson(int i) {
			return getRuleContext(DesigPersonContext.class,i);
		}
		public TerminalNode AND() { return getToken(Seg1Parser.AND, 0); }
		public TerminalNode ALL() { return getToken(Seg1Parser.ALL, 0); }
		public TerminalNode PREVIOUSLY() { return getToken(Seg1Parser.PREVIOUSLY, 0); }
		public JointPrevAddressContext jointPrevAddress() {
			return getRuleContext(JointPrevAddressContext.class,0);
		}
		public TerminalNode CURRENTLY() { return getToken(Seg1Parser.CURRENTLY, 0); }
		public JointCurrentAddressContext jointCurrentAddress() {
			return getRuleContext(JointCurrentAddressContext.class,0);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public ShareContext share() {
			return getRuleContext(ShareContext.class,0);
		}
		public JdPersonGrp2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jdPersonGrp2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterJdPersonGrp2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitJdPersonGrp2(this);
		}
	}

	public final JdPersonGrp2Context jdPersonGrp2() throws RecognitionException {
		JdPersonGrp2Context _localctx = new JdPersonGrp2Context(_ctx, getState());
		enterRule(_localctx, 88, RULE_jdPersonGrp2);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(593);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(588);
					desigPerson();
					setState(589);
					comma();
					}
					} 
				}
				setState(595);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			setState(596);
			desigPerson();
			setState(597);
			match(AND);
			setState(598);
			desigPerson();
			setState(599);
			match(ALL);
			setState(600);
			match(PREVIOUSLY);
			setState(601);
			jointPrevAddress();
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << DOT) | (1L << COMMA))) != 0)) {
				{
				setState(602);
				comma();
				}
			}

			setState(605);
			match(CURRENTLY);
			setState(606);
			jointCurrentAddress();
			setState(608);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,54,_ctx) ) {
			case 1:
				{
				setState(607);
				share();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JdPersonGrp3Context extends ParserRuleContext {
		public List<DesigPersonContext> desigPerson() {
			return getRuleContexts(DesigPersonContext.class);
		}
		public DesigPersonContext desigPerson(int i) {
			return getRuleContext(DesigPersonContext.class,i);
		}
		public TerminalNode AND() { return getToken(Seg1Parser.AND, 0); }
		public ProfessionsContext professions() {
			return getRuleContext(ProfessionsContext.class,0);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public JointCurrentAddressContext jointCurrentAddress() {
			return getRuleContext(JointCurrentAddressContext.class,0);
		}
		public TerminalNode ALL() { return getToken(Seg1Parser.ALL, 0); }
		public ShareContext share() {
			return getRuleContext(ShareContext.class,0);
		}
		public JdPersonGrp3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jdPersonGrp3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterJdPersonGrp3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitJdPersonGrp3(this);
		}
	}

	public final JdPersonGrp3Context jdPersonGrp3() throws RecognitionException {
		JdPersonGrp3Context _localctx = new JdPersonGrp3Context(_ctx, getState());
		enterRule(_localctx, 90, RULE_jdPersonGrp3);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(615);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(610);
					desigPerson();
					setState(611);
					comma();
					}
					} 
				}
				setState(617);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,55,_ctx);
			}
			setState(618);
			desigPerson();
			setState(619);
			match(AND);
			setState(620);
			desigPerson();
			setState(622);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ALL) {
				{
				setState(621);
				match(ALL);
				}
			}

			setState(624);
			professions();
			setState(625);
			comma();
			setState(626);
			jointCurrentAddress();
			setState(628);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(627);
				share();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JdRelationshipContext extends ParserRuleContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public TerminalNode RELN_PREFIX() { return getToken(Seg1Parser.RELN_PREFIX, 0); }
		public JdRelationshipContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jdRelationship; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterJdRelationship(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitJdRelationship(this);
		}
	}

	public final JdRelationshipContext jdRelationship() throws RecognitionException {
		JdRelationshipContext _localctx = new JdRelationshipContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_jdRelationship);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << DOT) | (1L << COMMA))) != 0)) {
				{
				setState(630);
				comma();
				}
			}

			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RELN_PREFIX) {
				{
				setState(633);
				match(RELN_PREFIX);
				}
			}

			setState(636);
			relation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JointCurrentAddressContext extends ParserRuleContext {
		public AddressContext address() {
			return getRuleContext(AddressContext.class,0);
		}
		public JointCurrentAddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jointCurrentAddress; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterJointCurrentAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitJointCurrentAddress(this);
		}
	}

	public final JointCurrentAddressContext jointCurrentAddress() throws RecognitionException {
		JointCurrentAddressContext _localctx = new JointCurrentAddressContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_jointCurrentAddress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(638);
			address();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JointPrevAddressContext extends ParserRuleContext {
		public AddressContext address() {
			return getRuleContext(AddressContext.class,0);
		}
		public JointPrevAddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jointPrevAddress; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterJointPrevAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitJointPrevAddress(this);
		}
	}

	public final JointPrevAddressContext jointPrevAddress() throws RecognitionException {
		JointPrevAddressContext _localctx = new JointPrevAddressContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_jointPrevAddress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(640);
			address();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ShareContext extends ParserRuleContext {
		public EqualShareContext equalShare() {
			return getRuleContext(EqualShareContext.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public ShareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_share; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterShare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitShare(this);
		}
	}

	public final ShareContext share() throws RecognitionException {
		ShareContext _localctx = new ShareContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_share);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << DOT) | (1L << COMMA))) != 0)) {
				{
				setState(642);
				comma();
				}
			}

			setState(645);
			equalShare();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualShareContext extends ParserRuleContext {
		public TerminalNode EQUALLY() { return getToken(Seg1Parser.EQUALLY, 0); }
		public TerminalNode AND_SURVIVOR() { return getToken(Seg1Parser.AND_SURVIVOR, 0); }
		public EqualShareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalShare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterEqualShare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitEqualShare(this);
		}
	}

	public final EqualShareContext equalShare() throws RecognitionException {
		EqualShareContext _localctx = new EqualShareContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_equalShare);
		try {
			setState(651);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(647);
				match(EQUALLY);
				setState(648);
				match(AND_SURVIVOR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				match(EQUALLY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(650);
				match(AND_SURVIVOR);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesigPersonContext extends ParserRuleContext {
		public DpPattern1Context dpPattern1() {
			return getRuleContext(DpPattern1Context.class,0);
		}
		public DpPattern2Context dpPattern2() {
			return getRuleContext(DpPattern2Context.class,0);
		}
		public DpPattern3Context dpPattern3() {
			return getRuleContext(DpPattern3Context.class,0);
		}
		public DpPattern4Context dpPattern4() {
			return getRuleContext(DpPattern4Context.class,0);
		}
		public DpPattern5Context dpPattern5() {
			return getRuleContext(DpPattern5Context.class,0);
		}
		public DpPattern6Context dpPattern6() {
			return getRuleContext(DpPattern6Context.class,0);
		}
		public DpPattern7Context dpPattern7() {
			return getRuleContext(DpPattern7Context.class,0);
		}
		public DpPattern8Context dpPattern8() {
			return getRuleContext(DpPattern8Context.class,0);
		}
		public DpPattern9Context dpPattern9() {
			return getRuleContext(DpPattern9Context.class,0);
		}
		public DpPattern10Context dpPattern10() {
			return getRuleContext(DpPattern10Context.class,0);
		}
		public DpPattern11Context dpPattern11() {
			return getRuleContext(DpPattern11Context.class,0);
		}
		public DesigPersonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desigPerson; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterDesigPerson(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitDesigPerson(this);
		}
	}

	public final DesigPersonContext desigPerson() throws RecognitionException {
		DesigPersonContext _localctx = new DesigPersonContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_desigPerson);
		try {
			setState(665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,62,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(653);
				dpPattern1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(654);
				dpPattern2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(655);
				dpPattern3();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(656);
				dpPattern4();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(657);
				dpPattern5();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(658);
				dpPattern6();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(659);
				dpPattern6();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(660);
				dpPattern7();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(661);
				dpPattern8();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(662);
				dpPattern9();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(663);
				dpPattern10();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(664);
				dpPattern11();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DpPattern1Context extends ParserRuleContext {
		public PersonDetailsContext personDetails() {
			return getRuleContext(PersonDetailsContext.class,0);
		}
		public DpPattern1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dpPattern1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterDpPattern1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitDpPattern1(this);
		}
	}

	public final DpPattern1Context dpPattern1() throws RecognitionException {
		DpPattern1Context _localctx = new DpPattern1Context(_ctx, getState());
		enterRule(_localctx, 104, RULE_dpPattern1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			personDetails();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DpPattern2Context extends ParserRuleContext {
		public PersonDetailsContext personDetails() {
			return getRuleContext(PersonDetailsContext.class,0);
		}
		public CurrentProfessionContext currentProfession() {
			return getRuleContext(CurrentProfessionContext.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public DpPattern2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dpPattern2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterDpPattern2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitDpPattern2(this);
		}
	}

	public final DpPattern2Context dpPattern2() throws RecognitionException {
		DpPattern2Context _localctx = new DpPattern2Context(_ctx, getState());
		enterRule(_localctx, 106, RULE_dpPattern2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			personDetails();
			setState(671);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << DOT) | (1L << COMMA))) != 0)) {
				{
				setState(670);
				comma();
				}
			}

			setState(673);
			currentProfession();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DpPattern3Context extends ParserRuleContext {
		public PersonDetailsContext personDetails() {
			return getRuleContext(PersonDetailsContext.class,0);
		}
		public CurrentAddressContext currentAddress() {
			return getRuleContext(CurrentAddressContext.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public TerminalNode CURRENTLY() { return getToken(Seg1Parser.CURRENTLY, 0); }
		public DpPattern3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dpPattern3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterDpPattern3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitDpPattern3(this);
		}
	}

	public final DpPattern3Context dpPattern3() throws RecognitionException {
		DpPattern3Context _localctx = new DpPattern3Context(_ctx, getState());
		enterRule(_localctx, 108, RULE_dpPattern3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			personDetails();
			setState(677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,64,_ctx) ) {
			case 1:
				{
				setState(676);
				comma();
				}
				break;
			}
			setState(680);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,65,_ctx) ) {
			case 1:
				{
				setState(679);
				match(CURRENTLY);
				}
				break;
			}
			setState(682);
			currentAddress();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DpPattern4Context extends ParserRuleContext {
		public PersonDetailsContext personDetails() {
			return getRuleContext(PersonDetailsContext.class,0);
		}
		public CurrentProfessionContext currentProfession() {
			return getRuleContext(CurrentProfessionContext.class,0);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public CurrentAddressContext currentAddress() {
			return getRuleContext(CurrentAddressContext.class,0);
		}
		public DpPattern4Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dpPattern4; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterDpPattern4(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitDpPattern4(this);
		}
	}

	public final DpPattern4Context dpPattern4() throws RecognitionException {
		DpPattern4Context _localctx = new DpPattern4Context(_ctx, getState());
		enterRule(_localctx, 110, RULE_dpPattern4);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			personDetails();
			setState(686);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << DOT) | (1L << COMMA))) != 0)) {
				{
				setState(685);
				comma();
				}
			}

			setState(688);
			currentProfession();
			setState(689);
			comma();
			setState(690);
			currentAddress();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DpPattern5Context extends ParserRuleContext {
		public PersonDetailsContext personDetails() {
			return getRuleContext(PersonDetailsContext.class,0);
		}
		public CurrentProfessionContext currentProfession() {
			return getRuleContext(CurrentProfessionContext.class,0);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public CurrentAddressContext currentAddress() {
			return getRuleContext(CurrentAddressContext.class,0);
		}
		public TerminalNode PREVIOUSLY() { return getToken(Seg1Parser.PREVIOUSLY, 0); }
		public PrevAddressContext prevAddress() {
			return getRuleContext(PrevAddressContext.class,0);
		}
		public DpPattern5Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dpPattern5; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterDpPattern5(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitDpPattern5(this);
		}
	}

	public final DpPattern5Context dpPattern5() throws RecognitionException {
		DpPattern5Context _localctx = new DpPattern5Context(_ctx, getState());
		enterRule(_localctx, 112, RULE_dpPattern5);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(692);
			personDetails();
			setState(694);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << DOT) | (1L << COMMA))) != 0)) {
				{
				setState(693);
				comma();
				}
			}

			setState(696);
			currentProfession();
			setState(697);
			comma();
			setState(698);
			currentAddress();
			setState(699);
			match(PREVIOUSLY);
			setState(700);
			prevAddress();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DpPattern6Context extends ParserRuleContext {
		public PersonDetailsContext personDetails() {
			return getRuleContext(PersonDetailsContext.class,0);
		}
		public CurrentProfessionContext currentProfession() {
			return getRuleContext(CurrentProfessionContext.class,0);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public TerminalNode PREVIOUSLY() { return getToken(Seg1Parser.PREVIOUSLY, 0); }
		public PrevAddressContext prevAddress() {
			return getRuleContext(PrevAddressContext.class,0);
		}
		public TerminalNode CURRENTLY() { return getToken(Seg1Parser.CURRENTLY, 0); }
		public CurrentAddressContext currentAddress() {
			return getRuleContext(CurrentAddressContext.class,0);
		}
		public DpPattern6Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dpPattern6; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterDpPattern6(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitDpPattern6(this);
		}
	}

	public final DpPattern6Context dpPattern6() throws RecognitionException {
		DpPattern6Context _localctx = new DpPattern6Context(_ctx, getState());
		enterRule(_localctx, 114, RULE_dpPattern6);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			personDetails();
			setState(704);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << DOT) | (1L << COMMA))) != 0)) {
				{
				setState(703);
				comma();
				}
			}

			setState(706);
			currentProfession();
			setState(707);
			comma();
			setState(708);
			match(PREVIOUSLY);
			setState(709);
			prevAddress();
			setState(710);
			comma();
			setState(711);
			match(CURRENTLY);
			setState(712);
			currentAddress();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DpPattern7Context extends ParserRuleContext {
		public PersonDetailsContext personDetails() {
			return getRuleContext(PersonDetailsContext.class,0);
		}
		public CurrentProfessionContext currentProfession() {
			return getRuleContext(CurrentProfessionContext.class,0);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public TerminalNode PREVIOUSLY() { return getToken(Seg1Parser.PREVIOUSLY, 0); }
		public PrevAddressContext prevAddress() {
			return getRuleContext(PrevAddressContext.class,0);
		}
		public TerminalNode CURRENTLY() { return getToken(Seg1Parser.CURRENTLY, 0); }
		public CurrentAddressContext currentAddress() {
			return getRuleContext(CurrentAddressContext.class,0);
		}
		public DpPattern7Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dpPattern7; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterDpPattern7(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitDpPattern7(this);
		}
	}

	public final DpPattern7Context dpPattern7() throws RecognitionException {
		DpPattern7Context _localctx = new DpPattern7Context(_ctx, getState());
		enterRule(_localctx, 116, RULE_dpPattern7);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(714);
			personDetails();
			setState(716);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << DOT) | (1L << COMMA))) != 0)) {
				{
				setState(715);
				comma();
				}
			}

			setState(718);
			currentProfession();
			setState(719);
			comma();
			setState(720);
			match(PREVIOUSLY);
			setState(721);
			prevAddress();
			setState(722);
			comma();
			setState(723);
			match(CURRENTLY);
			setState(724);
			currentAddress();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DpPattern8Context extends ParserRuleContext {
		public PersonDetailsContext personDetails() {
			return getRuleContext(PersonDetailsContext.class,0);
		}
		public TerminalNode PREVIOUSLY() { return getToken(Seg1Parser.PREVIOUSLY, 0); }
		public PrevAddressContext prevAddress() {
			return getRuleContext(PrevAddressContext.class,0);
		}
		public TerminalNode CURRENTLY() { return getToken(Seg1Parser.CURRENTLY, 0); }
		public CurrentAddressContext currentAddress() {
			return getRuleContext(CurrentAddressContext.class,0);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public CurrentProfessionContext currentProfession() {
			return getRuleContext(CurrentProfessionContext.class,0);
		}
		public DpPattern8Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dpPattern8; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterDpPattern8(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitDpPattern8(this);
		}
	}

	public final DpPattern8Context dpPattern8() throws RecognitionException {
		DpPattern8Context _localctx = new DpPattern8Context(_ctx, getState());
		enterRule(_localctx, 118, RULE_dpPattern8);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(726);
			personDetails();
			setState(728);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
			case 1:
				{
				setState(727);
				comma();
				}
				break;
			}
			setState(731);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (PROF_WORD - 29)) | (1L << (REUSED_PROF_WORD - 29)) | (1L << (WIDOW - 29)) | (1L << (APOS_S - 29)) | (1L << (SLASH - 29)) | (1L << (DASH - 29)) | (1L << (ALPHA_BLOCK - 29)))) != 0)) {
				{
				setState(730);
				currentProfession();
				}
			}

			setState(734);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << DOT) | (1L << COMMA))) != 0)) {
				{
				setState(733);
				comma();
				}
			}

			setState(736);
			match(PREVIOUSLY);
			setState(737);
			prevAddress();
			setState(739);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << DOT) | (1L << COMMA))) != 0)) {
				{
				setState(738);
				comma();
				}
			}

			setState(741);
			match(CURRENTLY);
			setState(742);
			currentAddress();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DpPattern9Context extends ParserRuleContext {
		public PersonDetailsContext personDetails() {
			return getRuleContext(PersonDetailsContext.class,0);
		}
		public List<TerminalNode> PREVIOUSLY() { return getTokens(Seg1Parser.PREVIOUSLY); }
		public TerminalNode PREVIOUSLY(int i) {
			return getToken(Seg1Parser.PREVIOUSLY, i);
		}
		public PrevProfessionContext prevProfession() {
			return getRuleContext(PrevProfessionContext.class,0);
		}
		public List<TerminalNode> CURRENTLY() { return getTokens(Seg1Parser.CURRENTLY); }
		public TerminalNode CURRENTLY(int i) {
			return getToken(Seg1Parser.CURRENTLY, i);
		}
		public CurrentProfessionContext currentProfession() {
			return getRuleContext(CurrentProfessionContext.class,0);
		}
		public PrevAddressContext prevAddress() {
			return getRuleContext(PrevAddressContext.class,0);
		}
		public CurrentAddressContext currentAddress() {
			return getRuleContext(CurrentAddressContext.class,0);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public DpPattern9Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dpPattern9; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterDpPattern9(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitDpPattern9(this);
		}
	}

	public final DpPattern9Context dpPattern9() throws RecognitionException {
		DpPattern9Context _localctx = new DpPattern9Context(_ctx, getState());
		enterRule(_localctx, 120, RULE_dpPattern9);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(744);
			personDetails();
			setState(746);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << DOT) | (1L << COMMA))) != 0)) {
				{
				setState(745);
				comma();
				}
			}

			setState(748);
			match(PREVIOUSLY);
			setState(749);
			prevProfession();
			setState(751);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << DOT) | (1L << COMMA))) != 0)) {
				{
				setState(750);
				comma();
				}
			}

			setState(753);
			match(CURRENTLY);
			setState(754);
			currentProfession();
			setState(756);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << DOT) | (1L << COMMA))) != 0)) {
				{
				setState(755);
				comma();
				}
			}

			setState(758);
			match(PREVIOUSLY);
			setState(759);
			prevAddress();
			setState(761);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << DOT) | (1L << COMMA))) != 0)) {
				{
				setState(760);
				comma();
				}
			}

			setState(763);
			match(CURRENTLY);
			setState(764);
			currentAddress();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DpPattern10Context extends ParserRuleContext {
		public PersonDetailsContext personDetails() {
			return getRuleContext(PersonDetailsContext.class,0);
		}
		public TerminalNode PREVIOUSLY() { return getToken(Seg1Parser.PREVIOUSLY, 0); }
		public PrevAddressContext prevAddress() {
			return getRuleContext(PrevAddressContext.class,0);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public CurrentProfessionContext currentProfession() {
			return getRuleContext(CurrentProfessionContext.class,0);
		}
		public DpPattern10Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dpPattern10; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterDpPattern10(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitDpPattern10(this);
		}
	}

	public final DpPattern10Context dpPattern10() throws RecognitionException {
		DpPattern10Context _localctx = new DpPattern10Context(_ctx, getState());
		enterRule(_localctx, 122, RULE_dpPattern10);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(766);
			personDetails();
			setState(768);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
			case 1:
				{
				setState(767);
				comma();
				}
				break;
			}
			setState(771);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 29)) & ~0x3f) == 0 && ((1L << (_la - 29)) & ((1L << (PROF_WORD - 29)) | (1L << (REUSED_PROF_WORD - 29)) | (1L << (WIDOW - 29)) | (1L << (APOS_S - 29)) | (1L << (SLASH - 29)) | (1L << (DASH - 29)) | (1L << (ALPHA_BLOCK - 29)))) != 0)) {
				{
				setState(770);
				currentProfession();
				}
			}

			setState(774);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << DOT) | (1L << COMMA))) != 0)) {
				{
				setState(773);
				comma();
				}
			}

			setState(776);
			match(PREVIOUSLY);
			setState(777);
			prevAddress();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DpPattern11Context extends ParserRuleContext {
		public PersonDetailsContext personDetails() {
			return getRuleContext(PersonDetailsContext.class,0);
		}
		public CurrentAddressContext currentAddress() {
			return getRuleContext(CurrentAddressContext.class,0);
		}
		public PrevNameAddr_BContext prevNameAddr_B() {
			return getRuleContext(PrevNameAddr_BContext.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public TerminalNode CURRENTLY() { return getToken(Seg1Parser.CURRENTLY, 0); }
		public DpPattern11Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dpPattern11; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterDpPattern11(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitDpPattern11(this);
		}
	}

	public final DpPattern11Context dpPattern11() throws RecognitionException {
		DpPattern11Context _localctx = new DpPattern11Context(_ctx, getState());
		enterRule(_localctx, 124, RULE_dpPattern11);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(779);
			personDetails();
			setState(781);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
			case 1:
				{
				setState(780);
				comma();
				}
				break;
			}
			setState(784);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,82,_ctx) ) {
			case 1:
				{
				setState(783);
				match(CURRENTLY);
				}
				break;
			}
			setState(786);
			currentAddress();
			setState(787);
			prevNameAddr_B();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PersonDetailsContext extends ParserRuleContext {
		public PdPattern1Context pdPattern1() {
			return getRuleContext(PdPattern1Context.class,0);
		}
		public PdPattern2Context pdPattern2() {
			return getRuleContext(PdPattern2Context.class,0);
		}
		public PdPattern3Context pdPattern3() {
			return getRuleContext(PdPattern3Context.class,0);
		}
		public PersonDetailsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_personDetails; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterPersonDetails(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitPersonDetails(this);
		}
	}

	public final PersonDetailsContext personDetails() throws RecognitionException {
		PersonDetailsContext _localctx = new PersonDetailsContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_personDetails);
		try {
			setState(792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(789);
				pdPattern1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(790);
				pdPattern2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(791);
				pdPattern3();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PdPattern1Context extends ParserRuleContext {
		public CurrentNameContext currentName() {
			return getRuleContext(CurrentNameContext.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public PrevNameProfAddr_BContext prevNameProfAddr_B() {
			return getRuleContext(PrevNameProfAddr_BContext.class,0);
		}
		public PrevNameAddr_BContext prevNameAddr_B() {
			return getRuleContext(PrevNameAddr_BContext.class,0);
		}
		public PrevName_BContext prevName_B() {
			return getRuleContext(PrevName_BContext.class,0);
		}
		public PdPattern1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pdPattern1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterPdPattern1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitPdPattern1(this);
		}
	}

	public final PdPattern1Context pdPattern1() throws RecognitionException {
		PdPattern1Context _localctx = new PdPattern1Context(_ctx, getState());
		enterRule(_localctx, 128, RULE_pdPattern1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(794);
			currentName();
			setState(796);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(795);
				comma();
				}
				break;
			}
			setState(801);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				{
				setState(798);
				prevNameProfAddr_B();
				}
				break;
			case 2:
				{
				setState(799);
				prevNameAddr_B();
				}
				break;
			case 3:
				{
				setState(800);
				prevName_B();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PdPattern2Context extends ParserRuleContext {
		public CurrentNameContext currentName() {
			return getRuleContext(CurrentNameContext.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public CurrentProfessionContext currentProfession() {
			return getRuleContext(CurrentProfessionContext.class,0);
		}
		public PrevNameProfAddr_BContext prevNameProfAddr_B() {
			return getRuleContext(PrevNameProfAddr_BContext.class,0);
		}
		public PrevNameAddr_BContext prevNameAddr_B() {
			return getRuleContext(PrevNameAddr_BContext.class,0);
		}
		public PrevName_BContext prevName_B() {
			return getRuleContext(PrevName_BContext.class,0);
		}
		public PdPattern2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pdPattern2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterPdPattern2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitPdPattern2(this);
		}
	}

	public final PdPattern2Context pdPattern2() throws RecognitionException {
		PdPattern2Context _localctx = new PdPattern2Context(_ctx, getState());
		enterRule(_localctx, 130, RULE_pdPattern2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(803);
			currentName();
			setState(805);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
			case 1:
				{
				setState(804);
				comma();
				}
				break;
			}
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(807);
				currentProfession();
				}
				break;
			}
			setState(813);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(810);
				prevNameProfAddr_B();
				}
				break;
			case 2:
				{
				setState(811);
				prevNameAddr_B();
				}
				break;
			case 3:
				{
				setState(812);
				prevName_B();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PdPattern3Context extends ParserRuleContext {
		public CurrentNameContext currentName() {
			return getRuleContext(CurrentNameContext.class,0);
		}
		public TerminalNode PREVIOUSLY() { return getToken(Seg1Parser.PREVIOUSLY, 0); }
		public PrevProfessionContext prevProfession() {
			return getRuleContext(PrevProfessionContext.class,0);
		}
		public TerminalNode CURRENTLY() { return getToken(Seg1Parser.CURRENTLY, 0); }
		public CurrentProfessionContext currentProfession() {
			return getRuleContext(CurrentProfessionContext.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public PdPattern3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pdPattern3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterPdPattern3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitPdPattern3(this);
		}
	}

	public final PdPattern3Context pdPattern3() throws RecognitionException {
		PdPattern3Context _localctx = new PdPattern3Context(_ctx, getState());
		enterRule(_localctx, 132, RULE_pdPattern3);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(815);
			currentName();
			setState(817);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << DOT) | (1L << COMMA))) != 0)) {
				{
				setState(816);
				comma();
				}
			}

			setState(819);
			match(PREVIOUSLY);
			setState(820);
			prevProfession();
			setState(821);
			match(CURRENTLY);
			setState(822);
			currentProfession();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CurrentNameContext extends ParserRuleContext {
		public MainNameContext mainName() {
			return getRuleContext(MainNameContext.class,0);
		}
		public PostNomContext postNom() {
			return getRuleContext(PostNomContext.class,0);
		}
		public Alias_BContext alias_B() {
			return getRuleContext(Alias_BContext.class,0);
		}
		public CurrentNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_currentName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterCurrentName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitCurrentName(this);
		}
	}

	public final CurrentNameContext currentName() throws RecognitionException {
		CurrentNameContext _localctx = new CurrentNameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_currentName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(824);
			mainName();
			setState(826);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				{
				setState(825);
				postNom();
				}
				break;
			}
			setState(829);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
			case 1:
				{
				setState(828);
				alias_B();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Alias_BContext extends ParserRuleContext {
		public TerminalNode O_BKT() { return getToken(Seg1Parser.O_BKT, 0); }
		public TerminalNode ALIAS_PREFIX() { return getToken(Seg1Parser.ALIAS_PREFIX, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode C_BKT() { return getToken(Seg1Parser.C_BKT, 0); }
		public Alias_BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias_B; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterAlias_B(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitAlias_B(this);
		}
	}

	public final Alias_BContext alias_B() throws RecognitionException {
		Alias_BContext _localctx = new Alias_BContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_alias_B);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(831);
			match(O_BKT);
			setState(832);
			match(ALIAS_PREFIX);
			setState(833);
			alias();
			setState(834);
			match(C_BKT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrevName_BContext extends ParserRuleContext {
		public TerminalNode O_BKT() { return getToken(Seg1Parser.O_BKT, 0); }
		public TerminalNode PREVIOUSLY() { return getToken(Seg1Parser.PREVIOUSLY, 0); }
		public PrevNameContext prevName() {
			return getRuleContext(PrevNameContext.class,0);
		}
		public TerminalNode C_BKT() { return getToken(Seg1Parser.C_BKT, 0); }
		public PrevName_BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prevName_B; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterPrevName_B(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitPrevName_B(this);
		}
	}

	public final PrevName_BContext prevName_B() throws RecognitionException {
		PrevName_BContext _localctx = new PrevName_BContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_prevName_B);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(836);
			match(O_BKT);
			setState(837);
			match(PREVIOUSLY);
			setState(838);
			prevName();
			setState(839);
			match(C_BKT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrevNameAddr_BContext extends ParserRuleContext {
		public TerminalNode O_BKT() { return getToken(Seg1Parser.O_BKT, 0); }
		public TerminalNode PREVIOUSLY() { return getToken(Seg1Parser.PREVIOUSLY, 0); }
		public PrevNameContext prevName() {
			return getRuleContext(PrevNameContext.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public PrevAddressContext prevAddress() {
			return getRuleContext(PrevAddressContext.class,0);
		}
		public TerminalNode C_BKT() { return getToken(Seg1Parser.C_BKT, 0); }
		public PrevNameAddr_BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prevNameAddr_B; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterPrevNameAddr_B(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitPrevNameAddr_B(this);
		}
	}

	public final PrevNameAddr_BContext prevNameAddr_B() throws RecognitionException {
		PrevNameAddr_BContext _localctx = new PrevNameAddr_BContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_prevNameAddr_B);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(841);
			match(O_BKT);
			setState(842);
			match(PREVIOUSLY);
			setState(843);
			prevName();
			setState(844);
			comma();
			setState(845);
			prevAddress();
			setState(846);
			match(C_BKT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrevNameProfAddr_BContext extends ParserRuleContext {
		public TerminalNode O_BKT() { return getToken(Seg1Parser.O_BKT, 0); }
		public TerminalNode PREVIOUSLY() { return getToken(Seg1Parser.PREVIOUSLY, 0); }
		public PrevNameContext prevName() {
			return getRuleContext(PrevNameContext.class,0);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public PrevProfessionContext prevProfession() {
			return getRuleContext(PrevProfessionContext.class,0);
		}
		public PrevAddressContext prevAddress() {
			return getRuleContext(PrevAddressContext.class,0);
		}
		public TerminalNode C_BKT() { return getToken(Seg1Parser.C_BKT, 0); }
		public PrevNameProfAddr_BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prevNameProfAddr_B; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterPrevNameProfAddr_B(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitPrevNameProfAddr_B(this);
		}
	}

	public final PrevNameProfAddr_BContext prevNameProfAddr_B() throws RecognitionException {
		PrevNameProfAddr_BContext _localctx = new PrevNameProfAddr_BContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_prevNameProfAddr_B);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(848);
			match(O_BKT);
			setState(849);
			match(PREVIOUSLY);
			setState(850);
			prevName();
			setState(851);
			comma();
			setState(852);
			prevProfession();
			setState(853);
			comma();
			setState(854);
			prevAddress();
			setState(855);
			match(C_BKT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MainNameContext extends ParserRuleContext {
		public PersonNameContext personName() {
			return getRuleContext(PersonNameContext.class,0);
		}
		public MainNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterMainName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitMainName(this);
		}
	}

	public final MainNameContext mainName() throws RecognitionException {
		MainNameContext _localctx = new MainNameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_mainName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(857);
			personName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public PersonNameContext personName() {
			return getRuleContext(PersonNameContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitAlias(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(859);
			personName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrevNameContext extends ParserRuleContext {
		public PersonNameContext personName() {
			return getRuleContext(PersonNameContext.class,0);
		}
		public PrevNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prevName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterPrevName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitPrevName(this);
		}
	}

	public final PrevNameContext prevName() throws RecognitionException {
		PrevNameContext _localctx = new PrevNameContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_prevName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(861);
			personName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CurrentProfessionContext extends ParserRuleContext {
		public ProfessionContext profession() {
			return getRuleContext(ProfessionContext.class,0);
		}
		public CurrentProfessionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_currentProfession; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterCurrentProfession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitCurrentProfession(this);
		}
	}

	public final CurrentProfessionContext currentProfession() throws RecognitionException {
		CurrentProfessionContext _localctx = new CurrentProfessionContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_currentProfession);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(863);
			profession();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrevProfessionContext extends ParserRuleContext {
		public ProfessionContext profession() {
			return getRuleContext(ProfessionContext.class,0);
		}
		public PrevProfessionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prevProfession; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterPrevProfession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitPrevProfession(this);
		}
	}

	public final PrevProfessionContext prevProfession() throws RecognitionException {
		PrevProfessionContext _localctx = new PrevProfessionContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_prevProfession);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(865);
			profession();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PostNomContext extends ParserRuleContext {
		public List<TerminalNode> POST_NOM() { return getTokens(Seg1Parser.POST_NOM); }
		public TerminalNode POST_NOM(int i) {
			return getToken(Seg1Parser.POST_NOM, i);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public TerminalNode ETC() { return getToken(Seg1Parser.ETC, 0); }
		public PostNomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_postNom; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterPostNom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitPostNom(this);
		}
	}

	public final PostNomContext postNom() throws RecognitionException {
		PostNomContext _localctx = new PostNomContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_postNom);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(868);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << DOT) | (1L << COMMA))) != 0)) {
				{
				setState(867);
				comma();
				}
			}

			setState(870);
			match(POST_NOM);
			setState(876);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(871);
					comma();
					setState(872);
					match(POST_NOM);
					}
					} 
				}
				setState(878);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,93,_ctx);
			}
			setState(880);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(879);
				match(ETC);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProfessionContext extends ParserRuleContext {
		public ProfContext prof() {
			return getRuleContext(ProfContext.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public ProfessionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_profession; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterProfession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitProfession(this);
		}
	}

	public final ProfessionContext profession() throws RecognitionException {
		ProfessionContext _localctx = new ProfessionContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_profession);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(882);
			prof(0);
			setState(884);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(883);
				comma();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProfessionsContext extends ParserRuleContext {
		public List<ProfsContext> profs() {
			return getRuleContexts(ProfsContext.class);
		}
		public ProfsContext profs(int i) {
			return getRuleContext(ProfsContext.class,i);
		}
		public TerminalNode AND() { return getToken(Seg1Parser.AND, 0); }
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public ProfessionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_professions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterProfessions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitProfessions(this);
		}
	}

	public final ProfessionsContext professions() throws RecognitionException {
		ProfessionsContext _localctx = new ProfessionsContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_professions);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(886);
			profs();
			setState(889);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
			case 1:
				{
				setState(887);
				match(AND);
				setState(888);
				profs();
				}
				break;
			}
			setState(892);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				{
				setState(891);
				comma();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProfContext extends ParserRuleContext {
		public List<ProfWordContext> profWord() {
			return getRuleContexts(ProfWordContext.class);
		}
		public ProfWordContext profWord(int i) {
			return getRuleContext(ProfWordContext.class,i);
		}
		public List<ProfTextContext> profText() {
			return getRuleContexts(ProfTextContext.class);
		}
		public ProfTextContext profText(int i) {
			return getRuleContext(ProfTextContext.class,i);
		}
		public TerminalNode AND() { return getToken(Seg1Parser.AND, 0); }
		public List<ProfContext> prof() {
			return getRuleContexts(ProfContext.class);
		}
		public ProfContext prof(int i) {
			return getRuleContext(ProfContext.class,i);
		}
		public ProfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterProf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitProf(this);
		}
	}

	public final ProfContext prof() throws RecognitionException {
		return prof(0);
	}

	private ProfContext prof(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ProfContext _localctx = new ProfContext(_ctx, _parentState);
		ProfContext _prevctx = _localctx;
		int _startState = 160;
		enterRecursionRule(_localctx, 160, RULE_prof, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
			case 1:
				{
				setState(902); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(898);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
						while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
							if ( _alt==1 ) {
								{
								{
								setState(895);
								profText();
								}
								} 
							}
							setState(900);
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,98,_ctx);
						}
						setState(901);
						profWord();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(904); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,99,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				{
				setState(906);
				profText();
				setState(907);
				match(AND);
				setState(908);
				profText();
				setState(909);
				profWord();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(918);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ProfContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_prof);
					setState(913);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(914);
					match(AND);
					setState(915);
					prof(4);
					}
					} 
				}
				setState(920);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ProfWordContext extends ParserRuleContext {
		public TerminalNode PROF_WORD() { return getToken(Seg1Parser.PROF_WORD, 0); }
		public TerminalNode REUSED_PROF_WORD() { return getToken(Seg1Parser.REUSED_PROF_WORD, 0); }
		public TerminalNode ALPHA_BLOCK() { return getToken(Seg1Parser.ALPHA_BLOCK, 0); }
		public TerminalNode OF() { return getToken(Seg1Parser.OF, 0); }
		public TerminalNode PROF_SUBJECT() { return getToken(Seg1Parser.PROF_SUBJECT, 0); }
		public WidowContext widow() {
			return getRuleContext(WidowContext.class,0);
		}
		public ProfWordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_profWord; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterProfWord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitProfWord(this);
		}
	}

	public final ProfWordContext profWord() throws RecognitionException {
		ProfWordContext _localctx = new ProfWordContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_profWord);
		try {
			setState(927);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PROF_WORD:
				enterOuterAlt(_localctx, 1);
				{
				setState(921);
				match(PROF_WORD);
				}
				break;
			case REUSED_PROF_WORD:
				enterOuterAlt(_localctx, 2);
				{
				setState(922);
				match(REUSED_PROF_WORD);
				}
				break;
			case ALPHA_BLOCK:
				enterOuterAlt(_localctx, 3);
				{
				setState(923);
				match(ALPHA_BLOCK);
				setState(924);
				match(OF);
				setState(925);
				match(PROF_SUBJECT);
				}
				break;
			case WIDOW:
				enterOuterAlt(_localctx, 4);
				{
				setState(926);
				widow();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProfsContext extends ParserRuleContext {
		public TerminalNode JOINT_PROF_WORD() { return getToken(Seg1Parser.JOINT_PROF_WORD, 0); }
		public List<ProfTextContext> profText() {
			return getRuleContexts(ProfTextContext.class);
		}
		public ProfTextContext profText(int i) {
			return getRuleContext(ProfTextContext.class,i);
		}
		public ProfsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_profs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterProfs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitProfs(this);
		}
	}

	public final ProfsContext profs() throws RecognitionException {
		ProfsContext _localctx = new ProfsContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_profs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(932);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (APOS_S - 41)) | (1L << (SLASH - 41)) | (1L << (DASH - 41)) | (1L << (ALPHA_BLOCK - 41)))) != 0)) {
				{
				{
				setState(929);
				profText();
				}
				}
				setState(934);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(935);
			match(JOINT_PROF_WORD);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProfTextContext extends ParserRuleContext {
		public TerminalNode ALPHA_BLOCK() { return getToken(Seg1Parser.ALPHA_BLOCK, 0); }
		public TerminalNode SLASH() { return getToken(Seg1Parser.SLASH, 0); }
		public TerminalNode DASH() { return getToken(Seg1Parser.DASH, 0); }
		public TerminalNode APOS_S() { return getToken(Seg1Parser.APOS_S, 0); }
		public ProfTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_profText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterProfText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitProfText(this);
		}
	}

	public final ProfTextContext profText() throws RecognitionException {
		ProfTextContext _localctx = new ProfTextContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_profText);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(937);
			_la = _input.LA(1);
			if ( !(((((_la - 41)) & ~0x3f) == 0 && ((1L << (_la - 41)) & ((1L << (APOS_S - 41)) | (1L << (SLASH - 41)) | (1L << (DASH - 41)) | (1L << (ALPHA_BLOCK - 41)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WidowContext extends ParserRuleContext {
		public TerminalNode WIDOW() { return getToken(Seg1Parser.WIDOW, 0); }
		public TerminalNode OF() { return getToken(Seg1Parser.OF, 0); }
		public LateHusbandNameContext lateHusbandName() {
			return getRuleContext(LateHusbandNameContext.class,0);
		}
		public WidowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_widow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterWidow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitWidow(this);
		}
	}

	public final WidowContext widow() throws RecognitionException {
		WidowContext _localctx = new WidowContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_widow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(939);
			match(WIDOW);
			setState(942);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,104,_ctx) ) {
			case 1:
				{
				setState(940);
				match(OF);
				setState(941);
				lateHusbandName();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LateHusbandNameContext extends ParserRuleContext {
		public List<TerminalNode> ALPHA_BLOCK() { return getTokens(Seg1Parser.ALPHA_BLOCK); }
		public TerminalNode ALPHA_BLOCK(int i) {
			return getToken(Seg1Parser.ALPHA_BLOCK, i);
		}
		public LateHusbandNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateHusbandName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterLateHusbandName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitLateHusbandName(this);
		}
	}

	public final LateHusbandNameContext lateHusbandName() throws RecognitionException {
		LateHusbandNameContext _localctx = new LateHusbandNameContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_lateHusbandName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(945); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(944);
					match(ALPHA_BLOCK);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(947); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public TerminalNode RELN_NAME() { return getToken(Seg1Parser.RELN_NAME, 0); }
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitRelation(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_relation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(949);
			match(RELN_NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesigOrgContext extends ParserRuleContext {
		public WellKnownOrgContext wellKnownOrg() {
			return getRuleContext(WellKnownOrgContext.class,0);
		}
		public SmallFirmContext smallFirm() {
			return getRuleContext(SmallFirmContext.class,0);
		}
		public DesigOrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desigOrg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterDesigOrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitDesigOrg(this);
		}
	}

	public final DesigOrgContext desigOrg() throws RecognitionException {
		DesigOrgContext _localctx = new DesigOrgContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_desigOrg);
		try {
			setState(953);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,106,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(951);
				wellKnownOrg();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(952);
				smallFirm();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WellKnownOrgContext extends ParserRuleContext {
		public WkOrgPattern1Context wkOrgPattern1() {
			return getRuleContext(WkOrgPattern1Context.class,0);
		}
		public WkOrgPattern2Context wkOrgPattern2() {
			return getRuleContext(WkOrgPattern2Context.class,0);
		}
		public WkOrgPattern3Context wkOrgPattern3() {
			return getRuleContext(WkOrgPattern3Context.class,0);
		}
		public WellKnownOrgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wellKnownOrg; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterWellKnownOrg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitWellKnownOrg(this);
		}
	}

	public final WellKnownOrgContext wellKnownOrg() throws RecognitionException {
		WellKnownOrgContext _localctx = new WellKnownOrgContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_wellKnownOrg);
		try {
			setState(958);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(955);
				wkOrgPattern1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(956);
				wkOrgPattern2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(957);
				wkOrgPattern3();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WkOrgPattern1Context extends ParserRuleContext {
		public CurrentOrgNameContext currentOrgName() {
			return getRuleContext(CurrentOrgNameContext.class,0);
		}
		public TheContext the() {
			return getRuleContext(TheContext.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public PrevOrgName_BContext prevOrgName_B() {
			return getRuleContext(PrevOrgName_BContext.class,0);
		}
		public WkOrgPattern1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wkOrgPattern1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterWkOrgPattern1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitWkOrgPattern1(this);
		}
	}

	public final WkOrgPattern1Context wkOrgPattern1() throws RecognitionException {
		WkOrgPattern1Context _localctx = new WkOrgPattern1Context(_ctx, getState());
		enterRule(_localctx, 178, RULE_wkOrgPattern1);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(961);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,108,_ctx) ) {
			case 1:
				{
				setState(960);
				the();
				}
				break;
			}
			setState(963);
			currentOrgName();
			setState(965);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
			case 1:
				{
				setState(964);
				comma();
				}
				break;
			}
			setState(968);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==O_BKT) {
				{
				setState(967);
				prevOrgName_B();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WkOrgPattern2Context extends ParserRuleContext {
		public CurrentOrgNameContext currentOrgName() {
			return getRuleContext(CurrentOrgNameContext.class,0);
		}
		public CurrentAddressContext currentAddress() {
			return getRuleContext(CurrentAddressContext.class,0);
		}
		public TheContext the() {
			return getRuleContext(TheContext.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public WkOrgPattern2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wkOrgPattern2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterWkOrgPattern2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitWkOrgPattern2(this);
		}
	}

	public final WkOrgPattern2Context wkOrgPattern2() throws RecognitionException {
		WkOrgPattern2Context _localctx = new WkOrgPattern2Context(_ctx, getState());
		enterRule(_localctx, 180, RULE_wkOrgPattern2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(971);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
			case 1:
				{
				setState(970);
				the();
				}
				break;
			}
			setState(973);
			currentOrgName();
			setState(975);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				{
				setState(974);
				comma();
				}
				break;
			}
			setState(977);
			currentAddress();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WkOrgPattern3Context extends ParserRuleContext {
		public CurrentOrgNameContext currentOrgName() {
			return getRuleContext(CurrentOrgNameContext.class,0);
		}
		public CurrentAddressContext currentAddress() {
			return getRuleContext(CurrentAddressContext.class,0);
		}
		public PrevOrgNameAddr_BContext prevOrgNameAddr_B() {
			return getRuleContext(PrevOrgNameAddr_BContext.class,0);
		}
		public TheContext the() {
			return getRuleContext(TheContext.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public WkOrgPattern3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wkOrgPattern3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterWkOrgPattern3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitWkOrgPattern3(this);
		}
	}

	public final WkOrgPattern3Context wkOrgPattern3() throws RecognitionException {
		WkOrgPattern3Context _localctx = new WkOrgPattern3Context(_ctx, getState());
		enterRule(_localctx, 182, RULE_wkOrgPattern3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,113,_ctx) ) {
			case 1:
				{
				setState(979);
				the();
				}
				break;
			}
			setState(982);
			currentOrgName();
			setState(984);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
			case 1:
				{
				setState(983);
				comma();
				}
				break;
			}
			setState(986);
			currentAddress();
			setState(987);
			prevOrgNameAddr_B();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TheContext extends ParserRuleContext {
		public TerminalNode ALPHA_BLOCK() { return getToken(Seg1Parser.ALPHA_BLOCK, 0); }
		public TheContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_the; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterThe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitThe(this);
		}
	}

	public final TheContext the() throws RecognitionException {
		TheContext _localctx = new TheContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_the);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			if (!(_input.LT(1).getText().equals("the"))) throw new FailedPredicateException(this, "_input.LT(1).getText().equals(\"the\")");
			setState(990);
			match(ALPHA_BLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrevOrgName_BContext extends ParserRuleContext {
		public TerminalNode O_BKT() { return getToken(Seg1Parser.O_BKT, 0); }
		public TerminalNode PREVIOUSLY() { return getToken(Seg1Parser.PREVIOUSLY, 0); }
		public PrevOrgNameContext prevOrgName() {
			return getRuleContext(PrevOrgNameContext.class,0);
		}
		public TerminalNode C_BKT() { return getToken(Seg1Parser.C_BKT, 0); }
		public PrevOrgName_BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prevOrgName_B; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterPrevOrgName_B(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitPrevOrgName_B(this);
		}
	}

	public final PrevOrgName_BContext prevOrgName_B() throws RecognitionException {
		PrevOrgName_BContext _localctx = new PrevOrgName_BContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_prevOrgName_B);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(992);
			match(O_BKT);
			setState(993);
			match(PREVIOUSLY);
			setState(994);
			prevOrgName();
			setState(995);
			match(C_BKT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrevOrgNameAddr_BContext extends ParserRuleContext {
		public TerminalNode O_BKT() { return getToken(Seg1Parser.O_BKT, 0); }
		public TerminalNode PREVIOUSLY() { return getToken(Seg1Parser.PREVIOUSLY, 0); }
		public PrevOrgNameContext prevOrgName() {
			return getRuleContext(PrevOrgNameContext.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public PrevAddressContext prevAddress() {
			return getRuleContext(PrevAddressContext.class,0);
		}
		public TerminalNode C_BKT() { return getToken(Seg1Parser.C_BKT, 0); }
		public PrevOrgNameAddr_BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prevOrgNameAddr_B; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterPrevOrgNameAddr_B(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitPrevOrgNameAddr_B(this);
		}
	}

	public final PrevOrgNameAddr_BContext prevOrgNameAddr_B() throws RecognitionException {
		PrevOrgNameAddr_BContext _localctx = new PrevOrgNameAddr_BContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_prevOrgNameAddr_B);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(997);
			match(O_BKT);
			setState(998);
			match(PREVIOUSLY);
			setState(999);
			prevOrgName();
			setState(1000);
			comma();
			setState(1001);
			prevAddress();
			setState(1002);
			match(C_BKT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SmallFirmContext extends ParserRuleContext {
		public TerminalNode FIRM_OF() { return getToken(Seg1Parser.FIRM_OF, 0); }
		public SmallFirmNameContext smallFirmName() {
			return getRuleContext(SmallFirmNameContext.class,0);
		}
		public CurrentAddressContext currentAddress() {
			return getRuleContext(CurrentAddressContext.class,0);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public TradeContext trade() {
			return getRuleContext(TradeContext.class,0);
		}
		public SmallFirmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smallFirm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterSmallFirm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitSmallFirm(this);
		}
	}

	public final SmallFirmContext smallFirm() throws RecognitionException {
		SmallFirmContext _localctx = new SmallFirmContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_smallFirm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			match(FIRM_OF);
			setState(1005);
			smallFirmName();
			setState(1009);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
			case 1:
				{
				setState(1006);
				comma();
				setState(1007);
				trade();
				}
				break;
			}
			setState(1012);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
			case 1:
				{
				setState(1011);
				comma();
				}
				break;
			}
			setState(1014);
			currentAddress();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TradeContext extends ParserRuleContext {
		public ProfessionsContext professions() {
			return getRuleContext(ProfessionsContext.class,0);
		}
		public TradeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterTrade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitTrade(this);
		}
	}

	public final TradeContext trade() throws RecognitionException {
		TradeContext _localctx = new TradeContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_trade);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1016);
			professions();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CurrentOrgNameContext extends ParserRuleContext {
		public OrgNameContext orgName() {
			return getRuleContext(OrgNameContext.class,0);
		}
		public CurrentOrgNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_currentOrgName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterCurrentOrgName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitCurrentOrgName(this);
		}
	}

	public final CurrentOrgNameContext currentOrgName() throws RecognitionException {
		CurrentOrgNameContext _localctx = new CurrentOrgNameContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_currentOrgName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1018);
			orgName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrevOrgNameContext extends ParserRuleContext {
		public OrgNameContext orgName() {
			return getRuleContext(OrgNameContext.class,0);
		}
		public PrevOrgNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prevOrgName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterPrevOrgName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitPrevOrgName(this);
		}
	}

	public final PrevOrgNameContext prevOrgName() throws RecognitionException {
		PrevOrgNameContext _localctx = new PrevOrgNameContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_prevOrgName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1020);
			orgName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SmallFirmNameContext extends ParserRuleContext {
		public PersonNameContext personName() {
			return getRuleContext(PersonNameContext.class,0);
		}
		public OrgNameContext orgName() {
			return getRuleContext(OrgNameContext.class,0);
		}
		public SmallFirmNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_smallFirmName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterSmallFirmName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitSmallFirmName(this);
		}
	}

	public final SmallFirmNameContext smallFirmName() throws RecognitionException {
		SmallFirmNameContext _localctx = new SmallFirmNameContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_smallFirmName);
		try {
			setState(1024);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PERSON_TOKEN:
			case SALUTATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(1022);
				personName();
				}
				break;
			case ORG_TOKEN:
				enterOuterAlt(_localctx, 2);
				{
				setState(1023);
				orgName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedPartyContext extends ParserRuleContext {
		public TerminalNode NAMED_PARTY() { return getToken(Seg1Parser.NAMED_PARTY, 0); }
		public NamedPartyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedParty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterNamedParty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitNamedParty(this);
		}
	}

	public final NamedPartyContext namedParty() throws RecognitionException {
		NamedPartyContext _localctx = new NamedPartyContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_namedParty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1026);
			match(NAMED_PARTY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PersonNameContext extends ParserRuleContext {
		public TerminalNode PERSON_TOKEN() { return getToken(Seg1Parser.PERSON_TOKEN, 0); }
		public PartyNumContext partyNum() {
			return getRuleContext(PartyNumContext.class,0);
		}
		public TerminalNode TOKEN_END() { return getToken(Seg1Parser.TOKEN_END, 0); }
		public SalutationContext salutation() {
			return getRuleContext(SalutationContext.class,0);
		}
		public PersonNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_personName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterPersonName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitPersonName(this);
		}
	}

	public final PersonNameContext personName() throws RecognitionException {
		PersonNameContext _localctx = new PersonNameContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_personName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1029);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SALUTATION) {
				{
				setState(1028);
				salutation();
				}
			}

			setState(1031);
			match(PERSON_TOKEN);
			setState(1032);
			partyNum();
			setState(1033);
			match(TOKEN_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrgNameContext extends ParserRuleContext {
		public TerminalNode ORG_TOKEN() { return getToken(Seg1Parser.ORG_TOKEN, 0); }
		public PartyNumContext partyNum() {
			return getRuleContext(PartyNumContext.class,0);
		}
		public TerminalNode TOKEN_END() { return getToken(Seg1Parser.TOKEN_END, 0); }
		public OrgNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orgName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterOrgName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitOrgName(this);
		}
	}

	public final OrgNameContext orgName() throws RecognitionException {
		OrgNameContext _localctx = new OrgNameContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_orgName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1035);
			match(ORG_TOKEN);
			setState(1036);
			partyNum();
			setState(1037);
			match(TOKEN_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartyNumContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(Seg1Parser.INT, 0); }
		public PartyNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partyNum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterPartyNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitPartyNum(this);
		}
	}

	public final PartyNumContext partyNum() throws RecognitionException {
		PartyNumContext _localctx = new PartyNumContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_partyNum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1039);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SalutationContext extends ParserRuleContext {
		public TerminalNode SALUTATION() { return getToken(Seg1Parser.SALUTATION, 0); }
		public SalutationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_salutation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterSalutation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitSalutation(this);
		}
	}

	public final SalutationContext salutation() throws RecognitionException {
		SalutationContext _localctx = new SalutationContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_salutation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1041);
			match(SALUTATION);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CurrentAddressContext extends ParserRuleContext {
		public AddressContext address() {
			return getRuleContext(AddressContext.class,0);
		}
		public CurrentAddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_currentAddress; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterCurrentAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitCurrentAddress(this);
		}
	}

	public final CurrentAddressContext currentAddress() throws RecognitionException {
		CurrentAddressContext _localctx = new CurrentAddressContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_currentAddress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1043);
			address();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrevAddressContext extends ParserRuleContext {
		public AddressContext address() {
			return getRuleContext(AddressContext.class,0);
		}
		public PrevAddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prevAddress; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterPrevAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitPrevAddress(this);
		}
	}

	public final PrevAddressContext prevAddress() throws RecognitionException {
		PrevAddressContext _localctx = new PrevAddressContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_prevAddress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1045);
			address();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddressContext extends ParserRuleContext {
		public List<AddrLineContext> addrLine() {
			return getRuleContexts(AddrLineContext.class);
		}
		public AddrLineContext addrLine(int i) {
			return getRuleContext(AddrLineContext.class,i);
		}
		public List<CommaContext> comma() {
			return getRuleContexts(CommaContext.class);
		}
		public CommaContext comma(int i) {
			return getRuleContext(CommaContext.class,i);
		}
		public AddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_address; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitAddress(this);
		}
	}

	public final AddressContext address() throws RecognitionException {
		AddressContext _localctx = new AddressContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_address);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1052);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1047);
					addrLine();
					setState(1048);
					comma();
					}
					} 
				}
				setState(1054);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,119,_ctx);
			}
			setState(1055);
			addrLine();
			setState(1057);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
			case 1:
				{
				setState(1056);
				comma();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddrLineContext extends ParserRuleContext {
		public List<AddrLinePartContext> addrLinePart() {
			return getRuleContexts(AddrLinePartContext.class);
		}
		public AddrLinePartContext addrLinePart(int i) {
			return getRuleContext(AddrLinePartContext.class,i);
		}
		public AddrLineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addrLine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterAddrLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitAddrLine(this);
		}
	}

	public final AddrLineContext addrLine() throws RecognitionException {
		AddrLineContext _localctx = new AddrLineContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_addrLine);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1060); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1059);
					addrLinePart();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1062); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,121,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AddrLinePartContext extends ParserRuleContext {
		public PremiseNumContext premiseNum() {
			return getRuleContext(PremiseNumContext.class,0);
		}
		public SpecialAddrBlockContext specialAddrBlock() {
			return getRuleContext(SpecialAddrBlockContext.class,0);
		}
		public TokensInAddrContext tokensInAddr() {
			return getRuleContext(TokensInAddrContext.class,0);
		}
		public TerminalNode REUSED_PROF_WORD() { return getToken(Seg1Parser.REUSED_PROF_WORD, 0); }
		public TerminalNode ALPHA_BLOCK() { return getToken(Seg1Parser.ALPHA_BLOCK, 0); }
		public TerminalNode DASH() { return getToken(Seg1Parser.DASH, 0); }
		public AddrLinePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_addrLinePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterAddrLinePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitAddrLinePart(this);
		}
	}

	public final AddrLinePartContext addrLinePart() throws RecognitionException {
		AddrLinePartContext _localctx = new AddrLinePartContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_addrLinePart);
		try {
			setState(1070);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1064);
				premiseNum();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1065);
				specialAddrBlock();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1066);
				tokensInAddr();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1067);
				match(REUSED_PROF_WORD);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1068);
				match(ALPHA_BLOCK);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1069);
				match(DASH);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PremiseNumContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(Seg1Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(Seg1Parser.INT, i);
		}
		public TerminalNode ALLCAPS_BLOCK() { return getToken(Seg1Parser.ALLCAPS_BLOCK, 0); }
		public TerminalNode SLASH() { return getToken(Seg1Parser.SLASH, 0); }
		public BlockStartingWithIContext blockStartingWithI() {
			return getRuleContext(BlockStartingWithIContext.class,0);
		}
		public CommaContext comma() {
			return getRuleContext(CommaContext.class,0);
		}
		public PremiseNumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_premiseNum; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterPremiseNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitPremiseNum(this);
		}
	}

	public final PremiseNumContext premiseNum() throws RecognitionException {
		PremiseNumContext _localctx = new PremiseNumContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_premiseNum);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1082);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,123,_ctx) ) {
			case 1:
				{
				setState(1072);
				match(INT);
				setState(1073);
				match(ALLCAPS_BLOCK);
				}
				break;
			case 2:
				{
				setState(1074);
				match(INT);
				setState(1075);
				match(SLASH);
				setState(1076);
				match(INT);
				}
				break;
			case 3:
				{
				setState(1077);
				blockStartingWithI();
				}
				break;
			case 4:
				{
				setState(1078);
				blockStartingWithI();
				setState(1079);
				match(INT);
				}
				break;
			case 5:
				{
				setState(1081);
				match(INT);
				}
				break;
			}
			setState(1085);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,124,_ctx) ) {
			case 1:
				{
				setState(1084);
				comma();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SpecialAddrBlockContext extends ParserRuleContext {
		public OrgNameContext orgName() {
			return getRuleContext(OrgNameContext.class,0);
		}
		public TerminalNode APOS_S() { return getToken(Seg1Parser.APOS_S, 0); }
		public SpecialAddrBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialAddrBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterSpecialAddrBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitSpecialAddrBlock(this);
		}
	}

	public final SpecialAddrBlockContext specialAddrBlock() throws RecognitionException {
		SpecialAddrBlockContext _localctx = new SpecialAddrBlockContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_specialAddrBlock);
		try {
			setState(1095);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(1087);
				match(T__2);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(1088);
				match(T__3);
				setState(1091);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,125,_ctx) ) {
				case 1:
					{
					setState(1089);
					orgName();
					}
					break;
				case 2:
					{
					setState(1090);
					match(T__4);
					}
					break;
				}
				}
				break;
			case APOS_S:
				enterOuterAlt(_localctx, 3);
				{
				setState(1093);
				match(APOS_S);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 4);
				{
				setState(1094);
				match(T__5);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockStartingWithIContext extends ParserRuleContext {
		public TerminalNode ALLCAPS_BLOCK() { return getToken(Seg1Parser.ALLCAPS_BLOCK, 0); }
		public BlockStartingWithIContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockStartingWithI; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterBlockStartingWithI(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitBlockStartingWithI(this);
		}
	}

	public final BlockStartingWithIContext blockStartingWithI() throws RecognitionException {
		BlockStartingWithIContext _localctx = new BlockStartingWithIContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_blockStartingWithI);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1097);
			if (!(_input.LT(1).getText().startsWith("I"))) throw new FailedPredicateException(this, "_input.LT(1).getText().startsWith(\"I\")");
			setState(1098);
			match(ALLCAPS_BLOCK);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TokensInAddrContext extends ParserRuleContext {
		public TerminalNode OF() { return getToken(Seg1Parser.OF, 0); }
		public TerminalNode AND() { return getToken(Seg1Parser.AND, 0); }
		public TokensInAddrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tokensInAddr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterTokensInAddr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitTokensInAddr(this);
		}
	}

	public final TokensInAddrContext tokensInAddr() throws RecognitionException {
		TokensInAddrContext _localctx = new TokensInAddrContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_tokensInAddr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1100);
			_la = _input.LA(1);
			if ( !(_la==OF || _la==AND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DesigPartyRefContext extends ParserRuleContext {
		public DpRefPattern1Context dpRefPattern1() {
			return getRuleContext(DpRefPattern1Context.class,0);
		}
		public DpRefPattern2Context dpRefPattern2() {
			return getRuleContext(DpRefPattern2Context.class,0);
		}
		public DpRefPattern3Context dpRefPattern3() {
			return getRuleContext(DpRefPattern3Context.class,0);
		}
		public DesigPartyRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_desigPartyRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterDesigPartyRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitDesigPartyRef(this);
		}
	}

	public final DesigPartyRefContext desigPartyRef() throws RecognitionException {
		DesigPartyRefContext _localctx = new DesigPartyRefContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_desigPartyRef);
		try {
			setState(1105);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,127,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1102);
				dpRefPattern1();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1103);
				dpRefPattern2();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1104);
				dpRefPattern3();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DpRefPattern1Context extends ParserRuleContext {
		public TerminalNode SAID() { return getToken(Seg1Parser.SAID, 0); }
		public PersonNameContext personName() {
			return getRuleContext(PersonNameContext.class,0);
		}
		public OrgNameContext orgName() {
			return getRuleContext(OrgNameContext.class,0);
		}
		public DpRefPattern1Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dpRefPattern1; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterDpRefPattern1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitDpRefPattern1(this);
		}
	}

	public final DpRefPattern1Context dpRefPattern1() throws RecognitionException {
		DpRefPattern1Context _localctx = new DpRefPattern1Context(_ctx, getState());
		enterRule(_localctx, 230, RULE_dpRefPattern1);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1107);
			match(SAID);
			setState(1110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PERSON_TOKEN:
			case SALUTATION:
				{
				setState(1108);
				personName();
				}
				break;
			case ORG_TOKEN:
				{
				setState(1109);
				orgName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DpRefPattern2Context extends ParserRuleContext {
		public DpRefPattern2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dpRefPattern2; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterDpRefPattern2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitDpRefPattern2(this);
		}
	}

	public final DpRefPattern2Context dpRefPattern2() throws RecognitionException {
		DpRefPattern2Context _localctx = new DpRefPattern2Context(_ctx, getState());
		enterRule(_localctx, 232, RULE_dpRefPattern2);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			_la = _input.LA(1);
			if ( !(_la==T__6 || _la==T__7) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DpRefPattern3Context extends ParserRuleContext {
		public TerminalNode SAID() { return getToken(Seg1Parser.SAID, 0); }
		public DpRefPattern3Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dpRefPattern3; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterDpRefPattern3(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitDpRefPattern3(this);
		}
	}

	public final DpRefPattern3Context dpRefPattern3() throws RecognitionException {
		DpRefPattern3Context _localctx = new DpRefPattern3Context(_ctx, getState());
		enterRule(_localctx, 234, RULE_dpRefPattern3);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1114);
			match(SAID);
			setState(1115);
			match(T__8);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LegalGrpRefContext extends ParserRuleContext {
		public LegalGrpRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_legalGrpRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterLegalGrpRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitLegalGrpRef(this);
		}
	}

	public final LegalGrpRefContext legalGrpRef() throws RecognitionException {
		LegalGrpRefContext _localctx = new LegalGrpRefContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_legalGrpRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1117);
			match(T__9);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DateContext extends ParserRuleContext {
		public DayContext day() {
			return getRuleContext(DayContext.class,0);
		}
		public MonthContext month() {
			return getRuleContext(MonthContext.class,0);
		}
		public YearContext year() {
			return getRuleContext(YearContext.class,0);
		}
		public TerminalNode COMMA() { return getToken(Seg1Parser.COMMA, 0); }
		public DateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_date; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterDate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitDate(this);
		}
	}

	public final DateContext date() throws RecognitionException {
		DateContext _localctx = new DateContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_date);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1119);
			day();
			setState(1120);
			month();
			setState(1122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1121);
				match(COMMA);
				}
			}

			setState(1124);
			year();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatesContext extends ParserRuleContext {
		public List<DatePartContext> datePart() {
			return getRuleContexts(DatePartContext.class);
		}
		public DatePartContext datePart(int i) {
			return getRuleContext(DatePartContext.class,i);
		}
		public TerminalNode AND() { return getToken(Seg1Parser.AND, 0); }
		public List<DateContext> date() {
			return getRuleContexts(DateContext.class);
		}
		public DateContext date(int i) {
			return getRuleContext(DateContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(Seg1Parser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(Seg1Parser.COMMA, i);
		}
		public DatesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dates; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterDates(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitDates(this);
		}
	}

	public final DatesContext dates() throws RecognitionException {
		DatesContext _localctx = new DatesContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_dates);
		int _la;
		try {
			setState(1148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1126);
				datePart();
				setState(1131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1127);
					match(COMMA);
					setState(1128);
					datePart();
					}
					}
					setState(1133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1134);
				match(AND);
				setState(1135);
				date();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1137);
				date();
				setState(1142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1138);
					match(COMMA);
					setState(1139);
					date();
					}
					}
					setState(1144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1145);
				match(AND);
				setState(1146);
				date();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DatePartContext extends ParserRuleContext {
		public DayContext day() {
			return getRuleContext(DayContext.class,0);
		}
		public MonthContext month() {
			return getRuleContext(MonthContext.class,0);
		}
		public DatePartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datePart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterDatePart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitDatePart(this);
		}
	}

	public final DatePartContext datePart() throws RecognitionException {
		DatePartContext _localctx = new DatePartContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_datePart);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1150);
			day();
			setState(1151);
			month();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DayContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(Seg1Parser.INT, 0); }
		public DayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterDay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitDay(this);
		}
	}

	public final DayContext day() throws RecognitionException {
		DayContext _localctx = new DayContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_day);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MonthContext extends ParserRuleContext {
		public TerminalNode MMM() { return getToken(Seg1Parser.MMM, 0); }
		public TerminalNode DOT() { return getToken(Seg1Parser.DOT, 0); }
		public MonthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_month; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterMonth(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitMonth(this);
		}
	}

	public final MonthContext month() throws RecognitionException {
		MonthContext _localctx = new MonthContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_month);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			match(MMM);
			setState(1157);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(1156);
				match(DOT);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class YearContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(Seg1Parser.INT, 0); }
		public YearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_year; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterYear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitYear(this);
		}
	}

	public final YearContext year() throws RecognitionException {
		YearContext _localctx = new YearContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_year);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1159);
			match(INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AmountContext extends ParserRuleContext {
		public MoneyValueContext moneyValue() {
			return getRuleContext(MoneyValueContext.class,0);
		}
		public TerminalNode GBP() { return getToken(Seg1Parser.GBP, 0); }
		public AmountContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_amount; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterAmount(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitAmount(this);
		}
	}

	public final AmountContext amount() throws RecognitionException {
		AmountContext _localctx = new AmountContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_amount);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1162);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GBP) {
				{
				setState(1161);
				match(GBP);
				}
			}

			setState(1164);
			moneyValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MoneyValueContext extends ParserRuleContext {
		public List<TerminalNode> INT() { return getTokens(Seg1Parser.INT); }
		public TerminalNode INT(int i) {
			return getToken(Seg1Parser.INT, i);
		}
		public TerminalNode DOT() { return getToken(Seg1Parser.DOT, 0); }
		public MoneyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_moneyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterMoneyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitMoneyValue(this);
		}
	}

	public final MoneyValueContext moneyValue() throws RecognitionException {
		MoneyValueContext _localctx = new MoneyValueContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_moneyValue);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1167); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1166);
					match(INT);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1169); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,135,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(1172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				setState(1171);
				match(DOT);
				}
				break;
			}
			setState(1177);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==INT) {
				{
				{
				setState(1174);
				match(INT);
				}
				}
				setState(1179);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommaContext extends ParserRuleContext {
		public TerminalNode COMMA() { return getToken(Seg1Parser.COMMA, 0); }
		public TerminalNode DOT() { return getToken(Seg1Parser.DOT, 0); }
		public CommaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).enterComma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof Seg1Listener ) ((Seg1Listener)listener).exitComma(this);
		}
	}

	public final CommaContext comma() throws RecognitionException {
		CommaContext _localctx = new CommaContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_comma);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__10) | (1L << T__11) | (1L << DOT) | (1L << COMMA))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 80:
			return prof_sempred((ProfContext)_localctx, predIndex);
		case 92:
			return the_sempred((TheContext)_localctx, predIndex);
		case 112:
			return blockStartingWithI_sempred((BlockStartingWithIContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean prof_sempred(ProfContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean the_sempred(TheContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return _input.LT(1).getText().equals("the");
		}
		return true;
	}
	private boolean blockStartingWithI_sempred(BlockStartingWithIContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return _input.LT(1).getText().startsWith("I");
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3L\u04a1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\3\2\3\2\3\2\5\2\u0106\n\2\3\2\5\2\u0109\n\2\3\2\3\2\3"+
		"\3\3\3\5\3\u010f\n\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\u011a\n\4"+
		"\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\5\6\u0127\n\6\3\6\3\6\5\6"+
		"\u012b\n\6\3\6\5\6\u012e\n\6\3\7\3\7\3\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\16\3\16\3\17\5\17\u0147\n\17"+
		"\3\17\3\17\3\17\5\17\u014c\n\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\22\5\22\u0159\n\22\3\22\3\22\3\23\5\23\u015e\n\23\3\23\3"+
		"\23\3\24\3\24\3\25\3\25\5\25\u0166\n\25\3\25\5\25\u0169\n\25\3\26\3\26"+
		"\3\27\3\27\3\27\5\27\u0170\n\27\3\30\3\30\3\30\3\30\5\30\u0176\n\30\3"+
		"\31\3\31\3\31\5\31\u017b\n\31\3\31\3\31\3\31\5\31\u0180\n\31\3\32\3\32"+
		"\5\32\u0184\n\32\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35"+
		"\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u019a\n\37\3 \3 \3"+
		" \5 \u019f\n \3!\3!\5!\u01a3\n!\3\"\3\"\3\"\3\"\7\"\u01a9\n\"\f\"\16\""+
		"\u01ac\13\"\3\"\5\"\u01af\n\"\3\"\3\"\3\"\5\"\u01b4\n\"\3#\3#\3#\3#\5"+
		"#\u01ba\n#\3$\3$\3$\3$\7$\u01c0\n$\f$\16$\u01c3\13$\3$\5$\u01c6\n$\3$"+
		"\3$\3$\5$\u01cb\n$\3%\3%\3%\3%\3%\5%\u01d2\n%\3&\3&\3&\3&\3&\3&\3&\3&"+
		"\3&\5&\u01dd\n&\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u01e5\n\'\3\'\5\'\u01e8\n"+
		"\'\3\'\5\'\u01eb\n\'\3\'\3\'\5\'\u01ef\n\'\3\'\5\'\u01f2\n\'\3\'\5\'\u01f5"+
		"\n\'\3\'\3\'\5\'\u01f9\n\'\3(\3(\3(\3(\5(\u01ff\n(\3(\5(\u0202\n(\3(\3"+
		"(\5(\u0206\n(\3(\3(\3(\3(\5(\u020c\n(\3)\3)\3)\3)\5)\u0212\n)\3)\3)\3"+
		")\3)\3)\5)\u0219\n)\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u0225\n*\3*\5*\u0228"+
		"\n*\3*\3*\5*\u022c\n*\3+\3+\3+\3+\3+\5+\u0233\n+\3,\3,\3,\5,\u0238\n,"+
		"\3,\3,\5,\u023c\n,\3,\5,\u023f\n,\3-\3-\3-\7-\u0244\n-\f-\16-\u0247\13"+
		"-\3-\3-\3-\3-\5-\u024d\n-\3.\3.\3.\7.\u0252\n.\f.\16.\u0255\13.\3.\3."+
		"\3.\3.\3.\3.\3.\5.\u025e\n.\3.\3.\3.\5.\u0263\n.\3/\3/\3/\7/\u0268\n/"+
		"\f/\16/\u026b\13/\3/\3/\3/\3/\5/\u0271\n/\3/\3/\3/\3/\5/\u0277\n/\3\60"+
		"\5\60\u027a\n\60\3\60\5\60\u027d\n\60\3\60\3\60\3\61\3\61\3\62\3\62\3"+
		"\63\5\63\u0286\n\63\3\63\3\63\3\64\3\64\3\64\3\64\5\64\u028e\n\64\3\65"+
		"\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\3\65\5\65\u029c\n\65"+
		"\3\66\3\66\3\67\3\67\5\67\u02a2\n\67\3\67\3\67\38\38\58\u02a8\n8\38\5"+
		"8\u02ab\n8\38\38\39\39\59\u02b1\n9\39\39\39\39\3:\3:\5:\u02b9\n:\3:\3"+
		":\3:\3:\3:\3:\3;\3;\5;\u02c3\n;\3;\3;\3;\3;\3;\3;\3;\3;\3<\3<\5<\u02cf"+
		"\n<\3<\3<\3<\3<\3<\3<\3<\3<\3=\3=\5=\u02db\n=\3=\5=\u02de\n=\3=\5=\u02e1"+
		"\n=\3=\3=\3=\5=\u02e6\n=\3=\3=\3=\3>\3>\5>\u02ed\n>\3>\3>\3>\5>\u02f2"+
		"\n>\3>\3>\3>\5>\u02f7\n>\3>\3>\3>\5>\u02fc\n>\3>\3>\3>\3?\3?\5?\u0303"+
		"\n?\3?\5?\u0306\n?\3?\5?\u0309\n?\3?\3?\3?\3@\3@\5@\u0310\n@\3@\5@\u0313"+
		"\n@\3@\3@\3@\3A\3A\3A\5A\u031b\nA\3B\3B\5B\u031f\nB\3B\3B\3B\5B\u0324"+
		"\nB\3C\3C\5C\u0328\nC\3C\5C\u032b\nC\3C\3C\3C\5C\u0330\nC\3D\3D\5D\u0334"+
		"\nD\3D\3D\3D\3D\3D\3E\3E\5E\u033d\nE\3E\5E\u0340\nE\3F\3F\3F\3F\3F\3G"+
		"\3G\3G\3G\3G\3H\3H\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\3I\3I\3I\3I\3J\3J\3K"+
		"\3K\3L\3L\3M\3M\3N\3N\3O\5O\u0367\nO\3O\3O\3O\3O\7O\u036d\nO\fO\16O\u0370"+
		"\13O\3O\5O\u0373\nO\3P\3P\5P\u0377\nP\3Q\3Q\3Q\5Q\u037c\nQ\3Q\5Q\u037f"+
		"\nQ\3R\3R\7R\u0383\nR\fR\16R\u0386\13R\3R\6R\u0389\nR\rR\16R\u038a\3R"+
		"\3R\3R\3R\3R\5R\u0392\nR\3R\3R\3R\7R\u0397\nR\fR\16R\u039a\13R\3S\3S\3"+
		"S\3S\3S\3S\5S\u03a2\nS\3T\7T\u03a5\nT\fT\16T\u03a8\13T\3T\3T\3U\3U\3V"+
		"\3V\3V\5V\u03b1\nV\3W\6W\u03b4\nW\rW\16W\u03b5\3X\3X\3Y\3Y\5Y\u03bc\n"+
		"Y\3Z\3Z\3Z\5Z\u03c1\nZ\3[\5[\u03c4\n[\3[\3[\5[\u03c8\n[\3[\5[\u03cb\n"+
		"[\3\\\5\\\u03ce\n\\\3\\\3\\\5\\\u03d2\n\\\3\\\3\\\3]\5]\u03d7\n]\3]\3"+
		"]\5]\u03db\n]\3]\3]\3]\3^\3^\3^\3_\3_\3_\3_\3_\3`\3`\3`\3`\3`\3`\3`\3"+
		"a\3a\3a\3a\3a\5a\u03f4\na\3a\5a\u03f7\na\3a\3a\3b\3b\3c\3c\3d\3d\3e\3"+
		"e\5e\u0403\ne\3f\3f\3g\5g\u0408\ng\3g\3g\3g\3g\3h\3h\3h\3h\3i\3i\3j\3"+
		"j\3k\3k\3l\3l\3m\3m\3m\7m\u041d\nm\fm\16m\u0420\13m\3m\3m\5m\u0424\nm"+
		"\3n\6n\u0427\nn\rn\16n\u0428\3o\3o\3o\3o\3o\3o\5o\u0431\no\3p\3p\3p\3"+
		"p\3p\3p\3p\3p\3p\3p\5p\u043d\np\3p\5p\u0440\np\3q\3q\3q\3q\5q\u0446\n"+
		"q\3q\3q\5q\u044a\nq\3r\3r\3r\3s\3s\3t\3t\3t\5t\u0454\nt\3u\3u\3u\5u\u0459"+
		"\nu\3v\3v\3w\3w\3w\3x\3x\3y\3y\3y\5y\u0465\ny\3y\3y\3z\3z\3z\7z\u046c"+
		"\nz\fz\16z\u046f\13z\3z\3z\3z\3z\3z\3z\7z\u0477\nz\fz\16z\u047a\13z\3"+
		"z\3z\3z\5z\u047f\nz\3{\3{\3{\3|\3|\3}\3}\5}\u0488\n}\3~\3~\3\177\5\177"+
		"\u048d\n\177\3\177\3\177\3\u0080\6\u0080\u0492\n\u0080\r\u0080\16\u0080"+
		"\u0493\3\u0080\5\u0080\u0497\n\u0080\3\u0080\7\u0080\u049a\n\u0080\f\u0080"+
		"\16\u0080\u049d\13\u0080\3\u0081\3\u0081\3\u0081\2\3\u00a2\u0082\2\4\6"+
		"\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRT"+
		"VXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086\u0088\u008a\u008c\u008e"+
		"\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6"+
		"\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be"+
		"\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6"+
		"\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee"+
		"\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe\u0100\2\7\4\2;;GG\5\2"+
		"++\66\67KK\3\2@A\3\2\t\n\4\2\r\16\64\65\2\u04de\2\u0105\3\2\2\2\4\u010c"+
		"\3\2\2\2\6\u0115\3\2\2\2\b\u011e\3\2\2\2\n\u0124\3\2\2\2\f\u012f\3\2\2"+
		"\2\16\u0132\3\2\2\2\20\u0135\3\2\2\2\22\u0138\3\2\2\2\24\u013a\3\2\2\2"+
		"\26\u013c\3\2\2\2\30\u0141\3\2\2\2\32\u0143\3\2\2\2\34\u0146\3\2\2\2\36"+
		"\u014d\3\2\2\2 \u0155\3\2\2\2\"\u0158\3\2\2\2$\u015d\3\2\2\2&\u0161\3"+
		"\2\2\2(\u0168\3\2\2\2*\u016a\3\2\2\2,\u016f\3\2\2\2.\u0175\3\2\2\2\60"+
		"\u017f\3\2\2\2\62\u0181\3\2\2\2\64\u0188\3\2\2\2\66\u018b\3\2\2\28\u018e"+
		"\3\2\2\2:\u0191\3\2\2\2<\u0199\3\2\2\2>\u019e\3\2\2\2@\u01a2\3\2\2\2B"+
		"\u01a4\3\2\2\2D\u01b9\3\2\2\2F\u01bb\3\2\2\2H\u01d1\3\2\2\2J\u01dc\3\2"+
		"\2\2L\u01de\3\2\2\2N\u01fa\3\2\2\2P\u020d\3\2\2\2R\u021a\3\2\2\2T\u022d"+
		"\3\2\2\2V\u0234\3\2\2\2X\u0245\3\2\2\2Z\u0253\3\2\2\2\\\u0269\3\2\2\2"+
		"^\u0279\3\2\2\2`\u0280\3\2\2\2b\u0282\3\2\2\2d\u0285\3\2\2\2f\u028d\3"+
		"\2\2\2h\u029b\3\2\2\2j\u029d\3\2\2\2l\u029f\3\2\2\2n\u02a5\3\2\2\2p\u02ae"+
		"\3\2\2\2r\u02b6\3\2\2\2t\u02c0\3\2\2\2v\u02cc\3\2\2\2x\u02d8\3\2\2\2z"+
		"\u02ea\3\2\2\2|\u0300\3\2\2\2~\u030d\3\2\2\2\u0080\u031a\3\2\2\2\u0082"+
		"\u031c\3\2\2\2\u0084\u0325\3\2\2\2\u0086\u0331\3\2\2\2\u0088\u033a\3\2"+
		"\2\2\u008a\u0341\3\2\2\2\u008c\u0346\3\2\2\2\u008e\u034b\3\2\2\2\u0090"+
		"\u0352\3\2\2\2\u0092\u035b\3\2\2\2\u0094\u035d\3\2\2\2\u0096\u035f\3\2"+
		"\2\2\u0098\u0361\3\2\2\2\u009a\u0363\3\2\2\2\u009c\u0366\3\2\2\2\u009e"+
		"\u0374\3\2\2\2\u00a0\u0378\3\2\2\2\u00a2\u0391\3\2\2\2\u00a4\u03a1\3\2"+
		"\2\2\u00a6\u03a6\3\2\2\2\u00a8\u03ab\3\2\2\2\u00aa\u03ad\3\2\2\2\u00ac"+
		"\u03b3\3\2\2\2\u00ae\u03b7\3\2\2\2\u00b0\u03bb\3\2\2\2\u00b2\u03c0\3\2"+
		"\2\2\u00b4\u03c3\3\2\2\2\u00b6\u03cd\3\2\2\2\u00b8\u03d6\3\2\2\2\u00ba"+
		"\u03df\3\2\2\2\u00bc\u03e2\3\2\2\2\u00be\u03e7\3\2\2\2\u00c0\u03ee\3\2"+
		"\2\2\u00c2\u03fa\3\2\2\2\u00c4\u03fc\3\2\2\2\u00c6\u03fe\3\2\2\2\u00c8"+
		"\u0402\3\2\2\2\u00ca\u0404\3\2\2\2\u00cc\u0407\3\2\2\2\u00ce\u040d\3\2"+
		"\2\2\u00d0\u0411\3\2\2\2\u00d2\u0413\3\2\2\2\u00d4\u0415\3\2\2\2\u00d6"+
		"\u0417\3\2\2\2\u00d8\u041e\3\2\2\2\u00da\u0426\3\2\2\2\u00dc\u0430\3\2"+
		"\2\2\u00de\u043c\3\2\2\2\u00e0\u0449\3\2\2\2\u00e2\u044b\3\2\2\2\u00e4"+
		"\u044e\3\2\2\2\u00e6\u0453\3\2\2\2\u00e8\u0455\3\2\2\2\u00ea\u045a\3\2"+
		"\2\2\u00ec\u045c\3\2\2\2\u00ee\u045f\3\2\2\2\u00f0\u0461\3\2\2\2\u00f2"+
		"\u047e\3\2\2\2\u00f4\u0480\3\2\2\2\u00f6\u0483\3\2\2\2\u00f8\u0485\3\2"+
		"\2\2\u00fa\u0489\3\2\2\2\u00fc\u048c\3\2\2\2\u00fe\u0491\3\2\2\2\u0100"+
		"\u049e\3\2\2\2\u0102\u0106\5\4\3\2\u0103\u0106\5\6\4\2\u0104\u0106\5\b"+
		"\5\2\u0105\u0102\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0104\3\2\2\2\u0106"+
		"\u0108\3\2\2\2\u0107\u0109\5\u0100\u0081\2\u0108\u0107\3\2\2\2\u0108\u0109"+
		"\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\7\2\2\3\u010b\3\3\2\2\2\u010c"+
		"\u010e\7-\2\2\u010d\u010f\5\n\6\2\u010e\u010d\3\2\2\2\u010e\u010f\3\2"+
		"\2\2\u010f\u0110\3\2\2\2\u0110\u0111\5\"\22\2\u0111\u0112\5&\24\2\u0112"+
		"\u0113\5$\23\2\u0113\u0114\5(\25\2\u0114\5\3\2\2\2\u0115\u0116\7.\2\2"+
		"\u0116\u0117\5\"\22\2\u0117\u0119\5&\24\2\u0118\u011a\5\34\17\2\u0119"+
		"\u0118\3\2\2\2\u0119\u011a\3\2\2\2\u011a\u011b\3\2\2\2\u011b\u011c\5$"+
		"\23\2\u011c\u011d\5(\25\2\u011d\7\3\2\2\2\u011e\u011f\7/\2\2\u011f\u0120"+
		"\5\"\22\2\u0120\u0121\5&\24\2\u0121\u0122\5\36\20\2\u0122\u0123\5(\25"+
		"\2\u0123\t\3\2\2\2\u0124\u0126\7>\2\2\u0125\u0127\7<\2\2\u0126\u0125\3"+
		"\2\2\2\u0126\u0127\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u012a\5\u00fc\177"+
		"\2\u0129\u012b\t\2\2\2\u012a\u0129\3\2\2\2\u012a\u012b\3\2\2\2\u012b\u012d"+
		"\3\2\2\2\u012c\u012e\5\u0100\u0081\2\u012d\u012c\3\2\2\2\u012d\u012e\3"+
		"\2\2\2\u012e\13\3\2\2\2\u012f\u0130\7=\2\2\u0130\u0131\5\u00aeX\2\u0131"+
		"\r\3\2\2\2\u0132\u0133\5\20\t\2\u0133\u0134\5\26\f\2\u0134\17\3\2\2\2"+
		"\u0135\u0136\5\22\n\2\u0136\u0137\5\24\13\2\u0137\21\3\2\2\2\u0138\u0139"+
		"\7J\2\2\u0139\23\3\2\2\2\u013a\u013b\7\62\2\2\u013b\25\3\2\2\2\u013c\u013d"+
		"\7?\2\2\u013d\u013e\5\30\r\2\u013e\u013f\78\2\2\u013f\u0140\5\32\16\2"+
		"\u0140\27\3\2\2\2\u0141\u0142\5\u00f0y\2\u0142\31\3\2\2\2\u0143\u0144"+
		"\5\u00f0y\2\u0144\33\3\2\2\2\u0145\u0147\5\u0100\u0081\2\u0146\u0145\3"+
		"\2\2\2\u0146\u0147\3\2\2\2\u0147\u014b\3\2\2\2\u0148\u0149\7\17\2\2\u0149"+
		"\u014c\5*\26\2\u014a\u014c\7\20\2\2\u014b\u0148\3\2\2\2\u014b\u014a\3"+
		"\2\2\2\u014c\35\3\2\2\2\u014d\u014e\5$\23\2\u014e\u014f\7\21\2\2\u014f"+
		"\u0150\7E\2\2\u0150\u0151\7\3\2\2\u0151\u0152\5 \21\2\u0152\u0153\7F\2"+
		"\2\u0153\u0154\7\4\2\2\u0154\37\3\2\2\2\u0155\u0156\5\u00f0y\2\u0156!"+
		"\3\2\2\2\u0157\u0159\7H\2\2\u0158\u0157\3\2\2\2\u0158\u0159\3\2\2\2\u0159"+
		"\u015a\3\2\2\2\u015a\u015b\79\2\2\u015b#\3\2\2\2\u015c\u015e\7H\2\2\u015d"+
		"\u015c\3\2\2\2\u015d\u015e\3\2\2\2\u015e\u015f\3\2\2\2\u015f\u0160\78"+
		"\2\2\u0160%\3\2\2\2\u0161\u0162\5,\27\2\u0162\'\3\2\2\2\u0163\u0169\5"+
		",\27\2\u0164\u0166\5\f\7\2\u0165\u0164\3\2\2\2\u0165\u0166\3\2\2\2\u0166"+
		"\u0167\3\2\2\2\u0167\u0169\5h\65\2\u0168\u0163\3\2\2\2\u0168\u0165\3\2"+
		"\2\2\u0169)\3\2\2\2\u016a\u016b\5,\27\2\u016b+\3\2\2\2\u016c\u0170\5<"+
		"\37\2\u016d\u0170\5.\30\2\u016e\u0170\5F$\2\u016f\u016c\3\2\2\2\u016f"+
		"\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170-\3\2\2\2\u0171\u0176\5\60\31"+
		"\2\u0172\u0176\5\64\33\2\u0173\u0176\5\66\34\2\u0174\u0176\58\35\2\u0175"+
		"\u0171\3\2\2\2\u0175\u0172\3\2\2\2\u0175\u0173\3\2\2\2\u0175\u0174\3\2"+
		"\2\2\u0176/\3\2\2\2\u0177\u0178\7\26\2\2\u0178\u017a\5:\36\2\u0179\u017b"+
		"\7\27\2\2\u017a\u0179\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u0180\3\2\2\2"+
		"\u017c\u017d\7\25\2\2\u017d\u0180\5:\36\2\u017e\u0180\5\62\32\2\u017f"+
		"\u0177\3\2\2\2\u017f\u017c\3\2\2\2\u017f\u017e\3\2\2\2\u0180\61\3\2\2"+
		"\2\u0181\u0183\5> \2\u0182\u0184\5\u0100\u0081\2\u0183\u0182\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u0186\7\30\2\2\u0186\u0187\5"+
		":\36\2\u0187\63\3\2\2\2\u0188\u0189\7\22\2\2\u0189\u018a\5:\36\2\u018a"+
		"\65\3\2\2\2\u018b\u018c\7\24\2\2\u018c\u018d\5:\36\2\u018d\67\3\2\2\2"+
		"\u018e\u018f\7\23\2\2\u018f\u0190\5:\36\2\u01909\3\2\2\2\u0191\u0192\5"+
		"<\37\2\u0192;\3\2\2\2\u0193\u019a\5h\65\2\u0194\u019a\5\u00b0Y\2\u0195"+
		"\u019a\5@!\2\u0196\u019a\5\u00e6t\2\u0197\u019a\5\u00eex\2\u0198\u019a"+
		"\5\u00caf\2\u0199\u0193\3\2\2\2\u0199\u0194\3\2\2\2\u0199\u0195\3\2\2"+
		"\2\u0199\u0196\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u0198\3\2\2\2\u019a="+
		"\3\2\2\2\u019b\u019f\5h\65\2\u019c\u019f\5\u00b0Y\2\u019d\u019f\5@!\2"+
		"\u019e\u019b\3\2\2\2\u019e\u019c\3\2\2\2\u019e\u019d\3\2\2\2\u019f?\3"+
		"\2\2\2\u01a0\u01a3\5J&\2\u01a1\u01a3\5B\"\2\u01a2\u01a0\3\2\2\2\u01a2"+
		"\u01a1\3\2\2\2\u01a3A\3\2\2\2\u01a4\u01aa\5D#\2\u01a5\u01a6\5\u0100\u0081"+
		"\2\u01a6\u01a7\5D#\2\u01a7\u01a9\3\2\2\2\u01a8\u01a5\3\2\2\2\u01a9\u01ac"+
		"\3\2\2\2\u01aa\u01a8\3\2\2\2\u01aa\u01ab\3\2\2\2\u01ab\u01ae\3\2\2\2\u01ac"+
		"\u01aa\3\2\2\2\u01ad\u01af\5\u0100\u0081\2\u01ae\u01ad\3\2\2\2\u01ae\u01af"+
		"\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\7A\2\2\u01b1\u01b3\5D#\2\u01b2"+
		"\u01b4\5d\63\2\u01b3\u01b2\3\2\2\2\u01b3\u01b4\3\2\2\2\u01b4C\3\2\2\2"+
		"\u01b5\u01ba\5h\65\2\u01b6\u01ba\5\u00b0Y\2\u01b7\u01ba\5J&\2\u01b8\u01ba"+
		"\5\u00e6t\2\u01b9\u01b5\3\2\2\2\u01b9\u01b6\3\2\2\2\u01b9\u01b7\3\2\2"+
		"\2\u01b9\u01b8\3\2\2\2\u01baE\3\2\2\2\u01bb\u01c1\5H%\2\u01bc\u01bd\5"+
		"\u0100\u0081\2\u01bd\u01be\5H%\2\u01be\u01c0\3\2\2\2\u01bf\u01bc\3\2\2"+
		"\2\u01c0\u01c3\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2\u01c5"+
		"\3\2\2\2\u01c3\u01c1\3\2\2\2\u01c4\u01c6\5\u0100\u0081\2\u01c5\u01c4\3"+
		"\2\2\2\u01c5\u01c6\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\7A\2\2\u01c8"+
		"\u01ca\5H%\2\u01c9\u01cb\5d\63\2\u01ca\u01c9\3\2\2\2\u01ca\u01cb\3\2\2"+
		"\2\u01cbG\3\2\2\2\u01cc\u01d2\5h\65\2\u01cd\u01d2\5\u00b0Y\2\u01ce\u01d2"+
		"\5J&\2\u01cf\u01d2\5\u00e6t\2\u01d0\u01d2\5.\30\2\u01d1\u01cc\3\2\2\2"+
		"\u01d1\u01cd\3\2\2\2\u01d1\u01ce\3\2\2\2\u01d1\u01cf\3\2\2\2\u01d1\u01d0"+
		"\3\2\2\2\u01d2I\3\2\2\2\u01d3\u01dd\5L\'\2\u01d4\u01dd\5N(\2\u01d5\u01dd"+
		"\5P)\2\u01d6\u01dd\5R*\2\u01d7\u01dd\5T+\2\u01d8\u01dd\5V,\2\u01d9\u01dd"+
		"\5X-\2\u01da\u01dd\5Z.\2\u01db\u01dd\5\\/\2\u01dc\u01d3\3\2\2\2\u01dc"+
		"\u01d4\3\2\2\2\u01dc\u01d5\3\2\2\2\u01dc\u01d6\3\2\2\2\u01dc\u01d7\3\2"+
		"\2\2\u01dc\u01d8\3\2\2\2\u01dc\u01d9\3\2\2\2\u01dc\u01da\3\2\2\2\u01dc"+
		"\u01db\3\2\2\2\u01ddK\3\2\2\2\u01de\u01df\5h\65\2\u01df\u01e0\7A\2\2\u01e0"+
		"\u01e4\5h\65\2\u01e1\u01e2\5\u0100\u0081\2\u01e2\u01e3\5^\60\2\u01e3\u01e5"+
		"\3\2\2\2\u01e4\u01e1\3\2\2\2\u01e4\u01e5\3\2\2\2\u01e5\u01e7\3\2\2\2\u01e6"+
		"\u01e8\5\u0100\u0081\2\u01e7\u01e6\3\2\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01ea"+
		"\3\2\2\2\u01e9\u01eb\7B\2\2\u01ea\u01e9\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb"+
		"\u01ee\3\2\2\2\u01ec\u01ed\7\33\2\2\u01ed\u01ef\5b\62\2\u01ee\u01ec\3"+
		"\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f1\3\2\2\2\u01f0\u01f2\7B\2\2\u01f1"+
		"\u01f0\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f4\3\2\2\2\u01f3\u01f5\7\34"+
		"\2\2\u01f4\u01f3\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"\u01f8\5`\61\2\u01f7\u01f9\5d\63\2\u01f8\u01f7\3\2\2\2\u01f8\u01f9\3\2"+
		"\2\2\u01f9M\3\2\2\2\u01fa\u01fb\5h\65\2\u01fb\u01fe\5\u0100\u0081\2\u01fc"+
		"\u01fd\7\33\2\2\u01fd\u01ff\5b\62\2\u01fe\u01fc\3\2\2\2\u01fe\u01ff\3"+
		"\2\2\2\u01ff\u0201\3\2\2\2\u0200\u0202\7\34\2\2\u0201\u0200\3\2\2\2\u0201"+
		"\u0202\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0205\5`\61\2\u0204\u0206\5\u0100"+
		"\u0081\2\u0205\u0204\3\2\2\2\u0205\u0206\3\2\2\2\u0206\u0207\3\2\2\2\u0207"+
		"\u0208\7A\2\2\u0208\u0209\5^\60\2\u0209\u020b\5h\65\2\u020a\u020c\5d\63"+
		"\2\u020b\u020a\3\2\2\2\u020b\u020c\3\2\2\2\u020cO\3\2\2\2\u020d\u020e"+
		"\5h\65\2\u020e\u020f\7A\2\2\u020f\u0211\5h\65\2\u0210\u0212\5\u0100\u0081"+
		"\2\u0211\u0210\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0213\3\2\2\2\u0213\u0214"+
		"\7\34\2\2\u0214\u0215\5^\60\2\u0215\u0216\5\u0100\u0081\2\u0216\u0218"+
		"\5`\61\2\u0217\u0219\5d\63\2\u0218\u0217\3\2\2\2\u0218\u0219\3\2\2\2\u0219"+
		"Q\3\2\2\2\u021a\u021b\5h\65\2\u021b\u021c\7A\2\2\u021c\u021d\5h\65\2\u021d"+
		"\u021e\7B\2\2\u021e\u021f\5\u00a0Q\2\u021f\u0224\5\u0100\u0081\2\u0220"+
		"\u0221\7\33\2\2\u0221\u0222\5b\62\2\u0222\u0223\5\u0100\u0081\2\u0223"+
		"\u0225\3\2\2\2\u0224\u0220\3\2\2\2\u0224\u0225\3\2\2\2\u0225\u0227\3\2"+
		"\2\2\u0226\u0228\7\34\2\2\u0227\u0226\3\2\2\2\u0227\u0228\3\2\2\2\u0228"+
		"\u0229\3\2\2\2\u0229\u022b\5`\61\2\u022a\u022c\5d\63\2\u022b\u022a\3\2"+
		"\2\2\u022b\u022c\3\2\2\2\u022cS\3\2\2\2\u022d\u022e\5h\65\2\u022e\u022f"+
		"\7A\2\2\u022f\u0230\5^\60\2\u0230\u0232\5h\65\2\u0231\u0233\5d\63\2\u0232"+
		"\u0231\3\2\2\2\u0232\u0233\3\2\2\2\u0233U\3\2\2\2\u0234\u0235\5\u00e6"+
		"t\2\u0235\u0237\7A\2\2\u0236\u0238\5\f\7\2\u0237\u0236\3\2\2\2\u0237\u0238"+
		"\3\2\2\2\u0238\u0239\3\2\2\2\u0239\u023b\5h\65\2\u023a\u023c\5^\60\2\u023b"+
		"\u023a\3\2\2\2\u023b\u023c\3\2\2\2\u023c\u023e\3\2\2\2\u023d\u023f\5d"+
		"\63\2\u023e\u023d\3\2\2\2\u023e\u023f\3\2\2\2\u023fW\3\2\2\2\u0240\u0241"+
		"\5h\65\2\u0241\u0242\5\u0100\u0081\2\u0242\u0244\3\2\2\2\u0243\u0240\3"+
		"\2\2\2\u0244\u0247\3\2\2\2\u0245\u0243\3\2\2\2\u0245\u0246\3\2\2\2\u0246"+
		"\u0248\3\2\2\2\u0247\u0245\3\2\2\2\u0248\u0249\5h\65\2\u0249\u024a\7A"+
		"\2\2\u024a\u024c\5h\65\2\u024b\u024d\5d\63\2\u024c\u024b\3\2\2\2\u024c"+
		"\u024d\3\2\2\2\u024dY\3\2\2\2\u024e\u024f\5h\65\2\u024f\u0250\5\u0100"+
		"\u0081\2\u0250\u0252\3\2\2\2\u0251\u024e\3\2\2\2\u0252\u0255\3\2\2\2\u0253"+
		"\u0251\3\2\2\2\u0253\u0254\3\2\2\2\u0254\u0256\3\2\2\2\u0255\u0253\3\2"+
		"\2\2\u0256\u0257\5h\65\2\u0257\u0258\7A\2\2\u0258\u0259\5h\65\2\u0259"+
		"\u025a\7D\2\2\u025a\u025b\7\33\2\2\u025b\u025d\5b\62\2\u025c\u025e\5\u0100"+
		"\u0081\2\u025d\u025c\3\2\2\2\u025d\u025e\3\2\2\2\u025e\u025f\3\2\2\2\u025f"+
		"\u0260\7\34\2\2\u0260\u0262\5`\61\2\u0261\u0263\5d\63\2\u0262\u0261\3"+
		"\2\2\2\u0262\u0263\3\2\2\2\u0263[\3\2\2\2\u0264\u0265\5h\65\2\u0265\u0266"+
		"\5\u0100\u0081\2\u0266\u0268\3\2\2\2\u0267\u0264\3\2\2\2\u0268\u026b\3"+
		"\2\2\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a\u026c\3\2\2\2\u026b"+
		"\u0269\3\2\2\2\u026c\u026d\5h\65\2\u026d\u026e\7A\2\2\u026e\u0270\5h\65"+
		"\2\u026f\u0271\7D\2\2\u0270\u026f\3\2\2\2\u0270\u0271\3\2\2\2\u0271\u0272"+
		"\3\2\2\2\u0272\u0273\5\u00a0Q\2\u0273\u0274\5\u0100\u0081\2\u0274\u0276"+
		"\5`\61\2\u0275\u0277\5d\63\2\u0276\u0275\3\2\2\2\u0276\u0277\3\2\2\2\u0277"+
		"]\3\2\2\2\u0278\u027a\5\u0100\u0081\2\u0279\u0278\3\2\2\2\u0279\u027a"+
		"\3\2\2\2\u027a\u027c\3\2\2\2\u027b\u027d\7=\2\2\u027c\u027b\3\2\2\2\u027c"+
		"\u027d\3\2\2\2\u027d\u027e\3\2\2\2\u027e\u027f\5\u00aeX\2\u027f_\3\2\2"+
		"\2\u0280\u0281\5\u00d8m\2\u0281a\3\2\2\2\u0282\u0283\5\u00d8m\2\u0283"+
		"c\3\2\2\2\u0284\u0286\5\u0100\u0081\2\u0285\u0284\3\2\2\2\u0285\u0286"+
		"\3\2\2\2\u0286\u0287\3\2\2\2\u0287\u0288\5f\64\2\u0288e\3\2\2\2\u0289"+
		"\u028a\7\31\2\2\u028a\u028e\7\32\2\2\u028b\u028e\7\31\2\2\u028c\u028e"+
		"\7\32\2\2\u028d\u0289\3\2\2\2\u028d\u028b\3\2\2\2\u028d\u028c\3\2\2\2"+
		"\u028eg\3\2\2\2\u028f\u029c\5j\66\2\u0290\u029c\5l\67\2\u0291\u029c\5"+
		"n8\2\u0292\u029c\5p9\2\u0293\u029c\5r:\2\u0294\u029c\5t;\2\u0295\u029c"+
		"\5t;\2\u0296\u029c\5v<\2\u0297\u029c\5x=\2\u0298\u029c\5z>\2\u0299\u029c"+
		"\5|?\2\u029a\u029c\5~@\2\u029b\u028f\3\2\2\2\u029b\u0290\3\2\2\2\u029b"+
		"\u0291\3\2\2\2\u029b\u0292\3\2\2\2\u029b\u0293\3\2\2\2\u029b\u0294\3\2"+
		"\2\2\u029b\u0295\3\2\2\2\u029b\u0296\3\2\2\2\u029b\u0297\3\2\2\2\u029b"+
		"\u0298\3\2\2\2\u029b\u0299\3\2\2\2\u029b\u029a\3\2\2\2\u029ci\3\2\2\2"+
		"\u029d\u029e\5\u0080A\2\u029ek\3\2\2\2\u029f\u02a1\5\u0080A\2\u02a0\u02a2"+
		"\5\u0100\u0081\2\u02a1\u02a0\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a3\3"+
		"\2\2\2\u02a3\u02a4\5\u0098M\2\u02a4m\3\2\2\2\u02a5\u02a7\5\u0080A\2\u02a6"+
		"\u02a8\5\u0100\u0081\2\u02a7\u02a6\3\2\2\2\u02a7\u02a8\3\2\2\2\u02a8\u02aa"+
		"\3\2\2\2\u02a9\u02ab\7\34\2\2\u02aa\u02a9\3\2\2\2\u02aa\u02ab\3\2\2\2"+
		"\u02ab\u02ac\3\2\2\2\u02ac\u02ad\5\u00d4k\2\u02ado\3\2\2\2\u02ae\u02b0"+
		"\5\u0080A\2\u02af\u02b1\5\u0100\u0081\2\u02b0\u02af\3\2\2\2\u02b0\u02b1"+
		"\3\2\2\2\u02b1\u02b2\3\2\2\2\u02b2\u02b3\5\u0098M\2\u02b3\u02b4\5\u0100"+
		"\u0081\2\u02b4\u02b5\5\u00d4k\2\u02b5q\3\2\2\2\u02b6\u02b8\5\u0080A\2"+
		"\u02b7\u02b9\5\u0100\u0081\2\u02b8\u02b7\3\2\2\2\u02b8\u02b9\3\2\2\2\u02b9"+
		"\u02ba\3\2\2\2\u02ba\u02bb\5\u0098M\2\u02bb\u02bc\5\u0100\u0081\2\u02bc"+
		"\u02bd\5\u00d4k\2\u02bd\u02be\7\33\2\2\u02be\u02bf\5\u00d6l\2\u02bfs\3"+
		"\2\2\2\u02c0\u02c2\5\u0080A\2\u02c1\u02c3\5\u0100\u0081\2\u02c2\u02c1"+
		"\3\2\2\2\u02c2\u02c3\3\2\2\2\u02c3\u02c4\3\2\2\2\u02c4\u02c5\5\u0098M"+
		"\2\u02c5\u02c6\5\u0100\u0081\2\u02c6\u02c7\7\33\2\2\u02c7\u02c8\5\u00d6"+
		"l\2\u02c8\u02c9\5\u0100\u0081\2\u02c9\u02ca\7\34\2\2\u02ca\u02cb\5\u00d4"+
		"k\2\u02cbu\3\2\2\2\u02cc\u02ce\5\u0080A\2\u02cd\u02cf\5\u0100\u0081\2"+
		"\u02ce\u02cd\3\2\2\2\u02ce\u02cf\3\2\2\2\u02cf\u02d0\3\2\2\2\u02d0\u02d1"+
		"\5\u0098M\2\u02d1\u02d2\5\u0100\u0081\2\u02d2\u02d3\7\33\2\2\u02d3\u02d4"+
		"\5\u00d6l\2\u02d4\u02d5\5\u0100\u0081\2\u02d5\u02d6\7\34\2\2\u02d6\u02d7"+
		"\5\u00d4k\2\u02d7w\3\2\2\2\u02d8\u02da\5\u0080A\2\u02d9\u02db\5\u0100"+
		"\u0081\2\u02da\u02d9\3\2\2\2\u02da\u02db\3\2\2\2\u02db\u02dd\3\2\2\2\u02dc"+
		"\u02de\5\u0098M\2\u02dd\u02dc\3\2\2\2\u02dd\u02de\3\2\2\2\u02de\u02e0"+
		"\3\2\2\2\u02df\u02e1\5\u0100\u0081\2\u02e0\u02df\3\2\2\2\u02e0\u02e1\3"+
		"\2\2\2\u02e1\u02e2\3\2\2\2\u02e2\u02e3\7\33\2\2\u02e3\u02e5\5\u00d6l\2"+
		"\u02e4\u02e6\5\u0100\u0081\2\u02e5\u02e4\3\2\2\2\u02e5\u02e6\3\2\2\2\u02e6"+
		"\u02e7\3\2\2\2\u02e7\u02e8\7\34\2\2\u02e8\u02e9\5\u00d4k\2\u02e9y\3\2"+
		"\2\2\u02ea\u02ec\5\u0080A\2\u02eb\u02ed\5\u0100\u0081\2\u02ec\u02eb\3"+
		"\2\2\2\u02ec\u02ed\3\2\2\2\u02ed\u02ee\3\2\2\2\u02ee\u02ef\7\33\2\2\u02ef"+
		"\u02f1\5\u009aN\2\u02f0\u02f2\5\u0100\u0081\2\u02f1\u02f0\3\2\2\2\u02f1"+
		"\u02f2\3\2\2\2\u02f2\u02f3\3\2\2\2\u02f3\u02f4\7\34\2\2\u02f4\u02f6\5"+
		"\u0098M\2\u02f5\u02f7\5\u0100\u0081\2\u02f6\u02f5\3\2\2\2\u02f6\u02f7"+
		"\3\2\2\2\u02f7\u02f8\3\2\2\2\u02f8\u02f9\7\33\2\2\u02f9\u02fb\5\u00d6"+
		"l\2\u02fa\u02fc\5\u0100\u0081\2\u02fb\u02fa\3\2\2\2\u02fb\u02fc\3\2\2"+
		"\2\u02fc\u02fd\3\2\2\2\u02fd\u02fe\7\34\2\2\u02fe\u02ff\5\u00d4k\2\u02ff"+
		"{\3\2\2\2\u0300\u0302\5\u0080A\2\u0301\u0303\5\u0100\u0081\2\u0302\u0301"+
		"\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0305\3\2\2\2\u0304\u0306\5\u0098M"+
		"\2\u0305\u0304\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0308\3\2\2\2\u0307\u0309"+
		"\5\u0100\u0081\2\u0308\u0307\3\2\2\2\u0308\u0309\3\2\2\2\u0309\u030a\3"+
		"\2\2\2\u030a\u030b\7\33\2\2\u030b\u030c\5\u00d6l\2\u030c}\3\2\2\2\u030d"+
		"\u030f\5\u0080A\2\u030e\u0310\5\u0100\u0081\2\u030f\u030e\3\2\2\2\u030f"+
		"\u0310\3\2\2\2\u0310\u0312\3\2\2\2\u0311\u0313\7\34\2\2\u0312\u0311\3"+
		"\2\2\2\u0312\u0313\3\2\2\2\u0313\u0314\3\2\2\2\u0314\u0315\5\u00d4k\2"+
		"\u0315\u0316\5\u008eH\2\u0316\177\3\2\2\2\u0317\u031b\5\u0082B\2\u0318"+
		"\u031b\5\u0084C\2\u0319\u031b\5\u0086D\2\u031a\u0317\3\2\2\2\u031a\u0318"+
		"\3\2\2\2\u031a\u0319\3\2\2\2\u031b\u0081\3\2\2\2\u031c\u031e\5\u0088E"+
		"\2\u031d\u031f\5\u0100\u0081\2\u031e\u031d\3\2\2\2\u031e\u031f\3\2\2\2"+
		"\u031f\u0323\3\2\2\2\u0320\u0324\5\u0090I\2\u0321\u0324\5\u008eH\2\u0322"+
		"\u0324\5\u008cG\2\u0323\u0320\3\2\2\2\u0323\u0321\3\2\2\2\u0323\u0322"+
		"\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0083\3\2\2\2\u0325\u0327\5\u0088E"+
		"\2\u0326\u0328\5\u0100\u0081\2\u0327\u0326\3\2\2\2\u0327\u0328\3\2\2\2"+
		"\u0328\u032a\3\2\2\2\u0329\u032b\5\u0098M\2\u032a\u0329\3\2\2\2\u032a"+
		"\u032b\3\2\2\2\u032b\u032f\3\2\2\2\u032c\u0330\5\u0090I\2\u032d\u0330"+
		"\5\u008eH\2\u032e\u0330\5\u008cG\2\u032f\u032c\3\2\2\2\u032f\u032d\3\2"+
		"\2\2\u032f\u032e\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0085\3\2\2\2\u0331"+
		"\u0333\5\u0088E\2\u0332\u0334\5\u0100\u0081\2\u0333\u0332\3\2\2\2\u0333"+
		"\u0334\3\2\2\2\u0334\u0335\3\2\2\2\u0335\u0336\7\33\2\2\u0336\u0337\5"+
		"\u009aN\2\u0337\u0338\7\34\2\2\u0338\u0339\5\u0098M\2\u0339\u0087\3\2"+
		"\2\2\u033a\u033c\5\u0092J\2\u033b\u033d\5\u009cO\2\u033c\u033b\3\2\2\2"+
		"\u033c\u033d\3\2\2\2\u033d\u033f\3\2\2\2\u033e\u0340\5\u008aF\2\u033f"+
		"\u033e\3\2\2\2\u033f\u0340\3\2\2\2\u0340\u0089\3\2\2\2\u0341\u0342\7E"+
		"\2\2\u0342\u0343\7\35\2\2\u0343\u0344\5\u0094K\2\u0344\u0345\7F\2\2\u0345"+
		"\u008b\3\2\2\2\u0346\u0347\7E\2\2\u0347\u0348\7\33\2\2\u0348\u0349\5\u0096"+
		"L\2\u0349\u034a\7F\2\2\u034a\u008d\3\2\2\2\u034b\u034c\7E\2\2\u034c\u034d"+
		"\7\33\2\2\u034d\u034e\5\u0096L\2\u034e\u034f\5\u0100\u0081\2\u034f\u0350"+
		"\5\u00d6l\2\u0350\u0351\7F\2\2\u0351\u008f\3\2\2\2\u0352\u0353\7E\2\2"+
		"\u0353\u0354\7\33\2\2\u0354\u0355\5\u0096L\2\u0355\u0356\5\u0100\u0081"+
		"\2\u0356\u0357\5\u009aN\2\u0357\u0358\5\u0100\u0081\2\u0358\u0359\5\u00d6"+
		"l\2\u0359\u035a\7F\2\2\u035a\u0091\3\2\2\2\u035b\u035c\5\u00ccg\2\u035c"+
		"\u0093\3\2\2\2\u035d\u035e\5\u00ccg\2\u035e\u0095\3\2\2\2\u035f\u0360"+
		"\5\u00ccg\2\u0360\u0097\3\2\2\2\u0361\u0362\5\u009eP\2\u0362\u0099\3\2"+
		"\2\2\u0363\u0364\5\u009eP\2\u0364\u009b\3\2\2\2\u0365\u0367\5\u0100\u0081"+
		"\2\u0366\u0365\3\2\2\2\u0366\u0367\3\2\2\2\u0367\u0368\3\2\2\2\u0368\u036e"+
		"\7\36\2\2\u0369\u036a\5\u0100\u0081\2\u036a\u036b\7\36\2\2\u036b\u036d"+
		"\3\2\2\2\u036c\u0369\3\2\2\2\u036d\u0370\3\2\2\2\u036e\u036c\3\2\2\2\u036e"+
		"\u036f\3\2\2\2\u036f\u0372\3\2\2\2\u0370\u036e\3\2\2\2\u0371\u0373\7G"+
		"\2\2\u0372\u0371\3\2\2\2\u0372\u0373\3\2\2\2\u0373\u009d\3\2\2\2\u0374"+
		"\u0376\5\u00a2R\2\u0375\u0377\5\u0100\u0081\2\u0376\u0375\3\2\2\2\u0376"+
		"\u0377\3\2\2\2\u0377\u009f\3\2\2\2\u0378\u037b\5\u00a6T\2\u0379\u037a"+
		"\7A\2\2\u037a\u037c\5\u00a6T\2\u037b\u0379\3\2\2\2\u037b\u037c\3\2\2\2"+
		"\u037c\u037e\3\2\2\2\u037d\u037f\5\u0100\u0081\2\u037e\u037d\3\2\2\2\u037e"+
		"\u037f\3\2\2\2\u037f\u00a1\3\2\2\2\u0380\u0388\bR\1\2\u0381\u0383\5\u00a8"+
		"U\2\u0382\u0381\3\2\2\2\u0383\u0386\3\2\2\2\u0384\u0382\3\2\2\2\u0384"+
		"\u0385\3\2\2\2\u0385\u0387\3\2\2\2\u0386\u0384\3\2\2\2\u0387\u0389\5\u00a4"+
		"S\2\u0388\u0384\3\2\2\2\u0389\u038a\3\2\2\2\u038a\u0388\3\2\2\2\u038a"+
		"\u038b\3\2\2\2\u038b\u0392\3\2\2\2\u038c\u038d\5\u00a8U\2\u038d\u038e"+
		"\7A\2\2\u038e\u038f\5\u00a8U\2\u038f\u0390\5\u00a4S\2\u0390\u0392\3\2"+
		"\2\2\u0391\u0380\3\2\2\2\u0391\u038c\3\2\2\2\u0392\u0398\3\2\2\2\u0393"+
		"\u0394\f\5\2\2\u0394\u0395\7A\2\2\u0395\u0397\5\u00a2R\6\u0396\u0393\3"+
		"\2\2\2\u0397\u039a\3\2\2\2\u0398\u0396\3\2\2\2\u0398\u0399\3\2\2\2\u0399"+
		"\u00a3\3\2\2\2\u039a\u0398\3\2\2\2\u039b\u03a2\7\37\2\2\u039c\u03a2\7"+
		" \2\2\u039d\u039e\7K\2\2\u039e\u039f\7@\2\2\u039f\u03a2\7\"\2\2\u03a0"+
		"\u03a2\5\u00aaV\2\u03a1\u039b\3\2\2\2\u03a1\u039c\3\2\2\2\u03a1\u039d"+
		"\3\2\2\2\u03a1\u03a0\3\2\2\2\u03a2\u00a5\3\2\2\2\u03a3\u03a5\5\u00a8U"+
		"\2\u03a4\u03a3\3\2\2\2\u03a5\u03a8\3\2\2\2\u03a6\u03a4\3\2\2\2\u03a6\u03a7"+
		"\3\2\2\2\u03a7\u03a9\3\2\2\2\u03a8\u03a6\3\2\2\2\u03a9\u03aa\7!\2\2\u03aa"+
		"\u00a7\3\2\2\2\u03ab\u03ac\t\3\2\2\u03ac\u00a9\3\2\2\2\u03ad\u03b0\7#"+
		"\2\2\u03ae\u03af\7@\2\2\u03af\u03b1\5\u00acW\2\u03b0\u03ae\3\2\2\2\u03b0"+
		"\u03b1\3\2\2\2\u03b1\u00ab\3\2\2\2\u03b2\u03b4\7K\2\2\u03b3\u03b2\3\2"+
		"\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b3\3\2\2\2\u03b5\u03b6\3\2\2\2\u03b6"+
		"\u00ad\3\2\2\2\u03b7\u03b8\7$\2\2\u03b8\u00af\3\2\2\2\u03b9\u03bc\5\u00b2"+
		"Z\2\u03ba\u03bc\5\u00c0a\2\u03bb\u03b9\3\2\2\2\u03bb\u03ba\3\2\2\2\u03bc"+
		"\u00b1\3\2\2\2\u03bd\u03c1\5\u00b4[\2\u03be\u03c1\5\u00b6\\\2\u03bf\u03c1"+
		"\5\u00b8]\2\u03c0\u03bd\3\2\2\2\u03c0\u03be\3\2\2\2\u03c0\u03bf\3\2\2"+
		"\2\u03c1\u00b3\3\2\2\2\u03c2\u03c4\5\u00ba^\2\u03c3\u03c2\3\2\2\2\u03c3"+
		"\u03c4\3\2\2\2\u03c4\u03c5\3\2\2\2\u03c5\u03c7\5\u00c4c\2\u03c6\u03c8"+
		"\5\u0100\u0081\2\u03c7\u03c6\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8\u03ca\3"+
		"\2\2\2\u03c9\u03cb\5\u00bc_\2\u03ca\u03c9\3\2\2\2\u03ca\u03cb\3\2\2\2"+
		"\u03cb\u00b5\3\2\2\2\u03cc\u03ce\5\u00ba^\2\u03cd\u03cc\3\2\2\2\u03cd"+
		"\u03ce\3\2\2\2\u03ce\u03cf\3\2\2\2\u03cf\u03d1\5\u00c4c\2\u03d0\u03d2"+
		"\5\u0100\u0081\2\u03d1\u03d0\3\2\2\2\u03d1\u03d2\3\2\2\2\u03d2\u03d3\3"+
		"\2\2\2\u03d3\u03d4\5\u00d4k\2\u03d4\u00b7\3\2\2\2\u03d5\u03d7\5\u00ba"+
		"^\2\u03d6\u03d5\3\2\2\2\u03d6\u03d7\3\2\2\2\u03d7\u03d8\3\2\2\2\u03d8"+
		"\u03da\5\u00c4c\2\u03d9\u03db\5\u0100\u0081\2\u03da\u03d9\3\2\2\2\u03da"+
		"\u03db\3\2\2\2\u03db\u03dc\3\2\2\2\u03dc\u03dd\5\u00d4k\2\u03dd\u03de"+
		"\5\u00be`\2\u03de\u00b9\3\2\2\2\u03df\u03e0\6^\3\2\u03e0\u03e1\7K\2\2"+
		"\u03e1\u00bb\3\2\2\2\u03e2\u03e3\7E\2\2\u03e3\u03e4\7\33\2\2\u03e4\u03e5"+
		"\5\u00c6d\2\u03e5\u03e6\7F\2\2\u03e6\u00bd\3\2\2\2\u03e7\u03e8\7E\2\2"+
		"\u03e8\u03e9\7\33\2\2\u03e9\u03ea\5\u00c6d\2\u03ea\u03eb\5\u0100\u0081"+
		"\2\u03eb\u03ec\5\u00d6l\2\u03ec\u03ed\7F\2\2\u03ed\u00bf\3\2\2\2\u03ee"+
		"\u03ef\7%\2\2\u03ef\u03f3\5\u00c8e\2\u03f0\u03f1\5\u0100\u0081\2\u03f1"+
		"\u03f2\5\u00c2b\2\u03f2\u03f4\3\2\2\2\u03f3\u03f0\3\2\2\2\u03f3\u03f4"+
		"\3\2\2\2\u03f4\u03f6\3\2\2\2\u03f5\u03f7\5\u0100\u0081\2\u03f6\u03f5\3"+
		"\2\2\2\u03f6\u03f7\3\2\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f9\5\u00d4k\2"+
		"\u03f9\u00c1\3\2\2\2\u03fa\u03fb\5\u00a0Q\2\u03fb\u00c3\3\2\2\2\u03fc"+
		"\u03fd\5\u00ceh\2\u03fd\u00c5\3\2\2\2\u03fe\u03ff\5\u00ceh\2\u03ff\u00c7"+
		"\3\2\2\2\u0400\u0403\5\u00ccg\2\u0401\u0403\5\u00ceh\2\u0402\u0400\3\2"+
		"\2\2\u0402\u0401\3\2\2\2\u0403\u00c9\3\2\2\2\u0404\u0405\7&\2\2\u0405"+
		"\u00cb\3\2\2\2\u0406\u0408\5\u00d2j\2\u0407\u0406\3\2\2\2\u0407\u0408"+
		"\3\2\2\2\u0408\u0409\3\2\2\2\u0409\u040a\7\'\2\2\u040a\u040b\5\u00d0i"+
		"\2\u040b\u040c\7)\2\2\u040c\u00cd\3\2\2\2\u040d\u040e\7(\2\2\u040e\u040f"+
		"\5\u00d0i\2\u040f\u0410\7)\2\2\u0410\u00cf\3\2\2\2\u0411\u0412\7J\2\2"+
		"\u0412\u00d1\3\2\2\2\u0413\u0414\7*\2\2\u0414\u00d3\3\2\2\2\u0415\u0416"+
		"\5\u00d8m\2\u0416\u00d5\3\2\2\2\u0417\u0418\5\u00d8m\2\u0418\u00d7\3\2"+
		"\2\2\u0419\u041a\5\u00dan\2\u041a\u041b\5\u0100\u0081\2\u041b\u041d\3"+
		"\2\2\2\u041c\u0419\3\2\2\2\u041d\u0420\3\2\2\2\u041e\u041c\3\2\2\2\u041e"+
		"\u041f\3\2\2\2\u041f\u0421\3\2\2\2\u0420\u041e\3\2\2\2\u0421\u0423\5\u00da"+
		"n\2\u0422\u0424\5\u0100\u0081\2\u0423\u0422\3\2\2\2\u0423\u0424\3\2\2"+
		"\2\u0424\u00d9\3\2\2\2\u0425\u0427\5\u00dco\2\u0426\u0425\3\2\2\2\u0427"+
		"\u0428\3\2\2\2\u0428\u0426\3\2\2\2\u0428\u0429\3\2\2\2\u0429\u00db\3\2"+
		"\2\2\u042a\u0431\5\u00dep\2\u042b\u0431\5\u00e0q\2\u042c\u0431\5\u00e4"+
		"s\2\u042d\u0431\7 \2\2\u042e\u0431\7K\2\2\u042f\u0431\7\67\2\2\u0430\u042a"+
		"\3\2\2\2\u0430\u042b\3\2\2\2\u0430\u042c\3\2\2\2\u0430\u042d\3\2\2\2\u0430"+
		"\u042e\3\2\2\2\u0430\u042f\3\2\2\2\u0431\u00dd\3\2\2\2\u0432\u0433\7J"+
		"\2\2\u0433\u043d\7I\2\2\u0434\u0435\7J\2\2\u0435\u0436\7\66\2\2\u0436"+
		"\u043d\7J\2\2\u0437\u043d\5\u00e2r\2\u0438\u0439\5\u00e2r\2\u0439\u043a"+
		"\7J\2\2\u043a\u043d\3\2\2\2\u043b\u043d\7J\2\2\u043c\u0432\3\2\2\2\u043c"+
		"\u0434\3\2\2\2\u043c\u0437\3\2\2\2\u043c\u0438\3\2\2\2\u043c\u043b\3\2"+
		"\2\2\u043d\u043f\3\2\2\2\u043e\u0440\5\u0100\u0081\2\u043f\u043e\3\2\2"+
		"\2\u043f\u0440\3\2\2\2\u0440\u00df\3\2\2\2\u0441\u044a\7\5\2\2\u0442\u0445"+
		"\7\6\2\2\u0443\u0446\5\u00ceh\2\u0444\u0446\7\7\2\2\u0445\u0443\3\2\2"+
		"\2\u0445\u0444\3\2\2\2\u0445\u0446\3\2\2\2\u0446\u044a\3\2\2\2\u0447\u044a"+
		"\7+\2\2\u0448\u044a\7\b\2\2\u0449\u0441\3\2\2\2\u0449\u0442\3\2\2\2\u0449"+
		"\u0447\3\2\2\2\u0449\u0448\3\2\2\2\u044a\u00e1\3\2\2\2\u044b\u044c\6r"+
		"\4\2\u044c\u044d\7I\2\2\u044d\u00e3\3\2\2\2\u044e\u044f\t\4\2\2\u044f"+
		"\u00e5\3\2\2\2\u0450\u0454\5\u00e8u\2\u0451\u0454\5\u00eav\2\u0452\u0454"+
		"\5\u00ecw\2\u0453\u0450\3\2\2\2\u0453\u0451\3\2\2\2\u0453\u0452\3\2\2"+
		"\2\u0454\u00e7\3\2\2\2\u0455\u0458\7C\2\2\u0456\u0459\5\u00ccg\2\u0457"+
		"\u0459\5\u00ceh\2\u0458\u0456\3\2\2\2\u0458\u0457\3\2\2\2\u0459\u00e9"+
		"\3\2\2\2\u045a\u045b\t\5\2\2\u045b\u00eb\3\2\2\2\u045c\u045d\7C\2\2\u045d"+
		"\u045e\7\13\2\2\u045e\u00ed\3\2\2\2\u045f\u0460\7\f\2\2\u0460\u00ef\3"+
		"\2\2\2\u0461\u0462\5\u00f6|\2\u0462\u0464\5\u00f8}\2\u0463\u0465\7\65"+
		"\2\2\u0464\u0463\3\2\2\2\u0464\u0465\3\2\2\2\u0465\u0466\3\2\2\2\u0466"+
		"\u0467\5\u00fa~\2\u0467\u00f1\3\2\2\2\u0468\u046d\5\u00f4{\2\u0469\u046a"+
		"\7\65\2\2\u046a\u046c\5\u00f4{\2\u046b\u0469\3\2\2\2\u046c\u046f\3\2\2"+
		"\2\u046d\u046b\3\2\2\2\u046d\u046e\3\2\2\2\u046e\u0470\3\2\2\2\u046f\u046d"+
		"\3\2\2\2\u0470\u0471\7A\2\2\u0471\u0472\5\u00f0y\2\u0472\u047f\3\2\2\2"+
		"\u0473\u0478\5\u00f0y\2\u0474\u0475\7\65\2\2\u0475\u0477\5\u00f0y\2\u0476"+
		"\u0474\3\2\2\2\u0477\u047a\3\2\2\2\u0478\u0476\3\2\2\2\u0478\u0479\3\2"+
		"\2\2\u0479\u047b\3\2\2\2\u047a\u0478\3\2\2\2\u047b\u047c\7A\2\2\u047c"+
		"\u047d\5\u00f0y\2\u047d\u047f\3\2\2\2\u047e\u0468\3\2\2\2\u047e\u0473"+
		"\3\2\2\2\u047f\u00f3\3\2\2\2\u0480\u0481\5\u00f6|\2\u0481\u0482\5\u00f8"+
		"}\2\u0482\u00f5\3\2\2\2\u0483\u0484\7J\2\2\u0484\u00f7\3\2\2\2\u0485\u0487"+
		"\7\63\2\2\u0486\u0488\7\64\2\2\u0487\u0486\3\2\2\2\u0487\u0488\3\2\2\2"+
		"\u0488\u00f9\3\2\2\2\u0489\u048a\7J\2\2\u048a\u00fb\3\2\2\2\u048b\u048d"+
		"\7,\2\2\u048c\u048b\3\2\2\2\u048c\u048d\3\2\2\2\u048d\u048e\3\2\2\2\u048e"+
		"\u048f\5\u00fe\u0080\2\u048f\u00fd\3\2\2\2\u0490\u0492\7J\2\2\u0491\u0490"+
		"\3\2\2\2\u0492\u0493\3\2\2\2\u0493\u0491\3\2\2\2\u0493\u0494\3\2\2\2\u0494"+
		"\u0496\3\2\2\2\u0495\u0497\7\64\2\2\u0496\u0495\3\2\2\2\u0496\u0497\3"+
		"\2\2\2\u0497\u049b\3\2\2\2\u0498\u049a\7J\2\2\u0499\u0498\3\2\2\2\u049a"+
		"\u049d\3\2\2\2\u049b\u0499\3\2\2\2\u049b\u049c\3\2\2\2\u049c\u00ff\3\2"+
		"\2\2\u049d\u049b\3\2\2\2\u049e\u049f\t\6\2\2\u049f\u0101\3\2\2\2\u008c"+
		"\u0105\u0108\u010e\u0119\u0126\u012a\u012d\u0146\u014b\u0158\u015d\u0165"+
		"\u0168\u016f\u0175\u017a\u017f\u0183\u0199\u019e\u01a2\u01aa\u01ae\u01b3"+
		"\u01b9\u01c1\u01c5\u01ca\u01d1\u01dc\u01e4\u01e7\u01ea\u01ee\u01f1\u01f4"+
		"\u01f8\u01fe\u0201\u0205\u020b\u0211\u0218\u0224\u0227\u022b\u0232\u0237"+
		"\u023b\u023e\u0245\u024c\u0253\u025d\u0262\u0269\u0270\u0276\u0279\u027c"+
		"\u0285\u028d\u029b\u02a1\u02a7\u02aa\u02b0\u02b8\u02c2\u02ce\u02da\u02dd"+
		"\u02e0\u02e5\u02ec\u02f1\u02f6\u02fb\u0302\u0305\u0308\u030f\u0312\u031a"+
		"\u031e\u0323\u0327\u032a\u032f\u0333\u033c\u033f\u0366\u036e\u0372\u0376"+
		"\u037b\u037e\u0384\u038a\u0391\u0398\u03a1\u03a6\u03b0\u03b5\u03bb\u03c0"+
		"\u03c3\u03c7\u03ca\u03cd\u03d1\u03d6\u03da\u03f3\u03f6\u0402\u0407\u041e"+
		"\u0423\u0428\u0430\u043c\u043f\u0445\u0449\u0453\u0458\u0464\u046d\u0478"+
		"\u047e\u0487\u048c\u0493\u0496\u049b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}