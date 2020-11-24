
grammar Seg1;


block				:	(stdSecSeg1 | dispSeg1 | dischSeg1 ) comma? EOF;

//-------------------------------------------------------------------------------------------------------------------------
stdSecSeg1 	        : 	STDSEC consideration? by grantor to grantee;
dispSeg1            : 	DISP by grantor withConsent? to grantee;
dischSeg1           :   DISCH by grantor ofSecurityBy grantee TO_SAID_GRANTER?;

//assigSeg1			:	ASSIG BY grantor deedClause? TO grantee COMMA?;
//leaseSeg1			:	LEASE BY grantor TO grantee FOR leasePeriod COMMA?;



//-------------------------------------------------------------------------------------------------------------------------
// Deed attributes

//NOTE: deed clause text, which appears in either side of grantor, is now removed during deed block processing. Was interfering with parsing of grantor.

consideration		:	FOR MAX_SUM_OF? amount (FURTHER_SUMS | ETC)? comma?;
gorRelation			:	RELN_PREFIX relation;

//-------------------------------------------------------------------------------------------------------------------------
// Discharge

TO_SAID_GRANTER		: 	'to said Granter';

//-------------------------------------------------------------------------------------------------------------------------
// Lease
leasePeriod			:	duration dateSpan;

duration			:	timeValue timeUnit;
timeValue 			:	INT;
timeUnit			:	TIME_UNIT;

dateSpan			:	FROM startDate TO endDate;
startDate			:	date;
endDate				: 	date;


//-------------------------------------------------------------------------------------------------------------------------
// Consent
withConsent			:   comma? (WITH_CONSENT_OF consenter | WITH_CONSENT);
WITH_CONSENT_OF		:   'with consent of' | 'with consent of and by' | 'at request of and by';
WITH_CONSENT		:	'with a consent' | 'with consent of Beneficiaries' ;


//-------------------------------------------------------------------------------------------------------------------------
// Discharged Std Security details
ofSecurityBy        :   to SECURITY_DEED O_BKT 'recorded' stdSecDate C_BKT 'by';
SECURITY_DEED		:	'Standard Security' | 'Bond';
stdSecDate          :   date;


by					:	TIL? BY;
to					:	TIL? TO;

//-------------------------------------------------------------------------------------------------------------------------
//	Grantor / Grantees
grantor				: 	legalEntity;
grantee				: 	legalEntity 
						| gorRelation? desigPerson; //this one belongs here rather than inside a desigPerson pattern
consenter			:   legalEntity;

legalEntity			: 	principalLE | representative | mixedGroup;

//-------------------------------------------------------------------------------------------------------------------------
// Representatives
representative		:	trustee | executor | trusteeExecutor | curatorBonis;
trustee				:	TRUSTEE_UNDER_DoT lrPrincipalLE AND_OTHERS? | TRUSTEE_OF lrPrincipalLE | ownerTrustee;
ownerTrustee		:   agentLE comma? AS_TRUSTEE_OF lrPrincipalLE;
executor			:	EXECUTOR_OF lrPrincipalLE;
trusteeExecutor		:	TRUSTEE_EXECUTOR_OF lrPrincipalLE;
curatorBonis		: 	CURATOR_BONIS_OF lrPrincipalLE;		

lrPrincipalLE		: 	principalLE;


EXECUTOR_OF			:	'Executors of' 
						| 'Executrix of' 
						| 'Executor of';

CURATOR_BONIS_OF	:	'Curator Bonis of';

TRUSTEE_EXECUTOR_OF	:	'Trustee and Executor of';

TRUSTEE_OF			:	'Trustees of Trust Deed by'
						| 'Custodian Trustees of'
						| 'Trustees for'
						| 'Trustees of' 
						| 'Trustee of'; 
				
TRUSTEE_UNDER_DoT	:	'Trustees under Deed of Trust between'
						| 'Trustees under Deed of Trust by said Granter for behoof of';

AND_OTHERS			: 	'and others';

AS_TRUSTEE_OF		:	'as Trustees for their' 
						| 'as Trustees and Trustee for the' 
						| 'as Trustees and Trustee for their'; 

principalLE			:	desigPerson | desigOrg | legalGroup | desigPartyRef | legalGrpRef | namedParty;
agentLE				:	desigPerson | desigOrg | legalGroup;

//-------------------------------------------------------------------------------------------------------------------------
// Designated parties and groups
legalGroup			:	jdPersons | complexGroup;
complexGroup		:	complexGrpPart (comma complexGrpPart)* comma? AND complexGrpPart share?;
complexGrpPart		:	desigPerson | desigOrg | jdPersons | desigPartyRef;

mixedGroup			:	mixedGrpPart (comma mixedGrpPart)* comma? AND mixedGrpPart share?; 
mixedGrpPart		:	desigPerson | desigOrg | jdPersons | desigPartyRef | representative;


jdPersons			: 	jdCouple1 | jdCouple2 | jdCouple3 | jdCouple4 | jdCouple5 | jdCouple6  
						| jdPersonGrp1 | jdPersonGrp2 | jdPersonGrp3 | jdPersonGrp4;

jdCouple1			:	desigPerson AND desigPerson (comma jdRelationship)? comma? BOTH? (PREVIOUSLY jointPrevAddress)? BOTH? CURRENTLY? jointCurrentAddress share? ;
jdCouple2			:	desigPerson comma (PREVIOUSLY jointPrevAddress)? CURRENTLY? jointCurrentAddress comma? AND jdRelationship desigPerson share?;
jdCouple3			:	desigPerson AND desigPerson comma? CURRENTLY jdRelationship comma jointCurrentAddress share?;
jdCouple4			:	desigPerson AND desigPerson BOTH professions comma (PREVIOUSLY jointPrevAddress comma)? CURRENTLY? jointCurrentAddress share?;
jdCouple5			:	desigPerson AND jdRelationship desigPerson share?;

//only one with a desigPartyref instead of a desigPerson. Load these differently.
jdCouple6			:	desigPartyRef AND gorRelation? desigPerson jdRelationship? share?;	


jdPersonGrp1		: 	(desigPerson comma)* desigPerson AND desigPerson share?;
jdPersonGrp2		:	(desigPerson comma)* desigPerson AND desigPerson ALL PREVIOUSLY jointPrevAddress comma? CURRENTLY jointCurrentAddress share?;
jdPersonGrp3		:	(desigPerson comma)* desigPerson AND desigPerson ALL? professions comma jointCurrentAddress share?;
jdPersonGrp4		:   (desigPerson comma)* desigPerson AND desigPerson ALL_AT jointCurrentAddress share?;


jdRelationship		:	comma? RELN_PREFIX? relation;

jointCurrentAddress	: 	address;
jointPrevAddress	:	address;

share				: 	comma? equalShare;	//add others later		
equalShare			:	EQUALLY AND_SURVIVOR | EQUALLY | AND_SURVIVOR;	
EQUALLY				:	'equally' | 'jointly';
AND_SURVIVOR		:	'and survivors and survivor' | 'and survivor' ;


//-------------------------------------------------------------------------------------------------------------------------
// Person
desigPerson			:	dpPattern1 | dpPattern2 | dpPattern3 | dpPattern4 | dpPattern5 | dpPattern6 
						| dpPattern6 | dpPattern7 | dpPattern8 | dpPattern9 | dpPattern10 | dpPattern11;

dpPattern1			:	personDetails;
dpPattern2			:	personDetails comma? currentProfession;
dpPattern3			:	personDetails comma? CURRENTLY? currentAddress;
dpPattern4			:	personDetails comma? currentProfession comma currentAddress;
dpPattern5			:	personDetails comma? currentProfession comma currentAddress PREVIOUSLY prevAddress;
dpPattern6			:	personDetails comma? currentProfession comma PREVIOUSLY prevAddress comma CURRENTLY currentAddress;
dpPattern7			:	personDetails comma? currentProfession comma PREVIOUSLY prevAddress comma CURRENTLY currentAddress;
dpPattern8			:	personDetails comma? currentProfession? comma? PREVIOUSLY prevAddress comma? CURRENTLY currentAddress;
dpPattern9			:	personDetails comma? PREVIOUSLY prevProfession comma? CURRENTLY currentProfession comma? PREVIOUSLY prevAddress comma? CURRENTLY currentAddress;
dpPattern10			:	personDetails comma? currentProfession? comma? PREVIOUSLY prevAddress;
dpPattern11         :   personDetails comma? CURRENTLY? currentAddress prevNameAddr_B;

personDetails		: 	pdPattern1 | pdPattern2 | pdPattern3;

pdPattern1			:	currentName comma? (prevNameProfAddr_B | prevNameAddr_B | prevName_B)?;
pdPattern2			:	currentName comma? currentProfession? (prevNameProfAddr_B | prevNameAddr_B | prevName_B)?;
pdPattern3			:	currentName comma? PREVIOUSLY prevProfession CURRENTLY currentProfession;

currentName			:	mainName postNom? alias_B?;
alias_B				:	O_BKT ALIAS_PREFIX alias C_BKT;
prevName_B			:	O_BKT PREVIOUSLY prevName C_BKT;
prevNameAddr_B		:	O_BKT PREVIOUSLY prevName  comma prevAddress C_BKT;
prevNameProfAddr_B	:	O_BKT PREVIOUSLY prevName comma prevProfession comma prevAddress C_BKT;

mainName			: 	personName;
alias				: 	personName;
prevName			:	personName;

currentProfession	:	profession;
prevProfession		:	profession;

PREVIOUSLY			: 	'formerly' | 'previously' | 'sometime';	
CURRENTLY			:	'latterly' | 'now' | 'currently' | 'thereafter' | 'presently';
ALIAS_PREFIX		:	'otherwise' | 'subscribing';

postNom				:	comma? POST_NOM (comma POST_NOM)* ETC?;
POST_NOM			:	'M.B.' | 'C.A.' | 'M.D.' | 'M.R.C.V.S.' | 'D.Sc.' | 'S.S.C.' | 'F.R.C.P.' | 'M.B.' | 'Ch.B.' | 'M.C.S.F.' | 'R.A.F.'; 

profession			: 	prof comma?;
professions			:	profs (AND profs)? comma?;
		
prof				:	prof AND prof | (profText* profWord)+ | profText AND profText profWord;
profWord			:	PROF_WORD | REUSED_PROF_WORD | ALPHA_BLOCK OF PROF_SUBJECT | widow;

profs				:	(profText* JOINT_PROF_WORD);
profText			:	ALPHA_BLOCK | SLASH | DASH | APOS_S; 

PROF_WORD       	: 'Accountant'| 'Adviser' | 'Advisor' | 'Advocate' | 'Agent' | 'Anaesthetist' | 'Analyst' | 'Apprentice' | 'Architect' | 'Assistant' | 'Auctioneer' 
					| 'Auditor' | 'Bargemaster' | 'Beater' | 'Blacksmith' | 'Binder' | 'Bricklayer' | 'Broker' | 'Builder' | 'Butcher' | 'C.A.' | 'Captain' | 'Cashier' 
					| 'Cementer' | 'Chef' | 'Chemist' | 'Cleaner' | 'Clerk' | 'Clerkess' | 'Clothier' | 'Compositor' | 'Confectioner' | 'Constable' | 'Consultant' | 'Contractor' 
					| 'Controller' | 'Cook' | 'Co-Ordinator' | 'Co-ordinator' | 'Crofter' | 'Croupier' | 'Dairyman' | 'Dealer' | 'Decorator' | 'Dentist' | 'Derrickman' 
					| 'Designer' | 'Detective' | 'Director' | 'Diver' | 'Draper' | 'Draughtsman' | 'Draughtswoman' | 'Drayman' | 'Driller' | 'Driver' | 'Editor' | 'ElectroPlater' 
					| 'Electrician' | 'Employee' | 'Engineer' | 'Estimator' | 'Executive' | 'Fabricator' | 'Farmer' | 'Fireman' | 'Fisherman' | 'Fishmerchant' | 'Fishmonger' 
					| 'Fitter' | 'Foreman' | 'Forester' | 'Fruiterer' | 'Furnisher' | 'Gamekeeper' | 'Gardener' | 'Geologist' | 'Graduate' | 'Greenkeeper' | 'Grocer' 
					| 'Guard' | 'Hairdresser' | 'Headmaster' | 'Hirer' | 'Horticulturist' | 'Hosier' | 'Hostess' | 'Hotelier' | 'House Factor' | 'Housemother' | 'Housewife' 
					| 'Hunter' | 'Inspector' | 'Instructor' | 'Joiner' | 'Journalist' | 'Keeper' | 'Labourer' | 'Layer' | 'Leader' | 'Lecturer' | 'Librarian' | 'M.D.' 
					| 'Machineman' | 'Machinist' | 'Maker' | 'Manager' | 'Manageress' | 'Manufacturer' | 'Mason' | 'Matron' | 'Mechanic' | 'Miller' | 'Nurse' | 'Nurseryman' 
					| 'Officer' | 'Official' | 'Operator' | 'Optician' | 'Owner' | 'Owner/Driver' | 'Painter' | 'Partner' | 'Pharmacist' | 'Photographer' | 'Physician' 
					| 'Pilot' | 'Planner' | 'Player' | 'Plumber' | 'Police Woman' | 'Policeman' | 'Postman' | 'Postman Higher Grade' | 'Poulterer' | 'Practitioner' | 'Professional' 
					| 'Programmer' | 'Proprietor' | 'Psychiatrist' | 'Psychologist' | 'Publican' | 'Radiologist' | 'Raidographer' | 'Receptionist' | 'Representative' 
					| 'Restauranteur' | 'Restaurateur' | 'Retailer' | 'Retired' | 'Rigger' | 'Roundsman' | 'Sales' | 'Salesman' | 'Scaffolder' | 'Schoolmaster' | 'Schoolteacher' 
					| 'Scientist' | 'Scriptwriter' | 'Sculptor' | 'Seaman' | 'Seamstress' | 'Secretary' | 'Secretary/Accountant' | 'Sen.' | 'Sergeant' | 'Servant' | 'Setter Out' 
					| 'Shipowner' | 'Shoemaker' | 'Shopkeeper' | 'Signalman' | 'Skipper' | 'Slaughterman' | 'Solicitor' | 'Specialist' | 'Sprayer' | 'Stationer' | 'Steward' 
					| 'Stewardess' | 'Stockbroker' | 'Stocktaker' | 'Storekeeper' | 'Storeman' | 'Student' | 'Superintendent' | 'Supervisor' | 'Surgeon' | 'Surveyor' 
					| 'Tailor' | 'Teacher' | 'Technician' | 'Technologist' | 'Telephonist' | 'Teller' | 'Tester' | 'Therapist' | 'Tobacconist' | 'Traveller' | 'Typist' 
					| 'Underwriter' | 'Waiter' | 'Warden' | 'Warehouseman' | 'Watchmaker' | 'Welder' | 'Wholesaler' | 'Worker' | 'Writer' | 'Valuator' | 'Vanman' ;



REUSED_PROF_WORD	:	'Merchant' | 'Master' | 'Porter' | 'Seller'; //also appear in addresses

JOINT_PROF_WORD		: 'Advocates'| 'Apprentices' | 'Builders' | 'Contractors' | 'Farmers' | 'Solicitors' | 'Surveyors' ;

PROF_SUBJECT		:	'Music' | 'Nursing' | 'Dancing' | 'Medicine' | 'Taxes';
widow				:	WIDOW (OF lateHusbandName)?;
WIDOW				:	'Widow' | 'widow';
lateHusbandName		:	ALPHA_BLOCK+;

relation			:	RELN_NAME;
RELN_NAME			: 	'spouses' | 'wife' | 'husband';

//-------------------------------------------------------------------------------------------------------------------------
// Designated Organisation
desigOrg			:   wellKnownOrg | smallFirm ;

wellKnownOrg		:	wkOrgPattern1 | wkOrgPattern2 | wkOrgPattern3;

wkOrgPattern1		: 	the? currentOrgName comma? prevOrgName_B? ;
wkOrgPattern2		: 	the? currentOrgName comma? currentAddress ;
wkOrgPattern3		:	the? currentOrgName comma? currentAddress prevOrgNameAddr_B ;
the					:	{_input.LT(1).getText().equals("the")}? ALPHA_BLOCK;

prevOrgName_B		:   O_BKT PREVIOUSLY prevOrgName C_BKT;
prevOrgNameAddr_B	:   O_BKT PREVIOUSLY prevOrgName comma prevAddress C_BKT;

smallFirm			:	FIRM_OF smallFirmName (comma trade)? comma?  currentAddress;
trade				: 	professions;
FIRM_OF				:	'firm of' | 'Firm of';

currentOrgName		:	orgName;
prevOrgName			:	orgName;
smallFirmName		:	personName | orgName;			

namedParty			:   NAMED_PARTY;
NAMED_PARTY			: 	'SECRETARY OF STATE FOR SCOTLAND';

//-------------------------------------------------------------------------------------------------------------------------
// Party names
personName			:	salutation? PERSON_TOKEN partyNum TOKEN_END;
orgName				:	ORG_TOKEN partyNum TOKEN_END;
partyNum			:	INT;
salutation			: 	SALUTATION;

PERSON_TOKEN		:	'{PERSON-';	
ORG_TOKEN			:	'{ORG-';	
TOKEN_END			:	'}';

SALUTATION			:	'Dr.' | 'Rev.' | 'Sen.' | 'Sheriff' | 'Capt.' | 'Lieut. Col.' | 'Lieut.'; 

//-------------------------------------------------------------------------------------------------------------------------
// Address
currentAddress		: 	address;
prevAddress			: 	address;

address				: 	(addrLine comma)* addrLine comma?;
addrLine			:	addrLinePart+;
addrLinePart		: 	premiseNum | specialAddrBlock | tokensInAddr | REUSED_PROF_WORD| ALPHA_BLOCK | DASH; 
premiseNum			:	(INT ALLCAPS_BLOCK | INT SLASH INT | blockStartingWithI | blockStartingWithI INT | INT) comma?; 
specialAddrBlock	:	'St.' | 'c/o' (orgName|'B.P.')? | APOS_S | 'U.K.' ;
blockStartingWithI	:	{_input.LT(1).getText().startsWith("I")}? ALLCAPS_BLOCK;
APOS_S				:	ALPHA_BLOCK '\u0027' 's';
tokensInAddr		:	OF | AND ;

//-------------------------------------------------------------------------------------------------------------------------
desigPartyRef		:	dpRefPattern1 | dpRefPattern2 | dpRefPattern3;
dpRefPattern1		: 	SAID (personName | orgName); //Just get the name. orgType needed here
dpRefPattern2		: 	'himself' | 'herself';
dpRefPattern3		:	SAID 'Society';

//-------------------------------------------------------------------------------------------------------------------------
legalGrpRef			: 	'themselves';

//-------------------------------------------------------------------------------------------------------------------------
// Date 
date				:	day month COMMA? year;
dates				:	datePart (COMMA datePart)* AND date | date (COMMA date)* AND date;
datePart			:	day month;
day					: 	INT;
month				:	MMM DOT?;
year				:	INT;	

//-------------------------------------------------------------------------------------------------------------------------
// Money
amount				:	GBP? moneyValue;
moneyValue			:	INT+ DOT? INT*;
GBP					:	'$'; // $ used as replacement of £ 


//-------------------------------------------------------------------------------------------------------------------------
// Deed types
STDSEC				: 	'STDSEC';
DISP				:	'DISP' | 'FEUDISP' | 'BLDISP';
DISCH               :   'DISCH';
ASSIG				:	'ASSIG';	
LEASE				:	'LEASE';

//-------------------------------------------------------------------------------------------------------------------------
// Various lists
TIME_UNIT			:	'years';

MMM					: 	'Jan' | 'Feb' | 'Mar' | 'Apr' | 'May' | 'Jun' | 'Jul' | 
						'Aug' | 'Sep' | 'Sept' | 'Oct' | 'Nov' | 'Dec' ;


//-------------------------------------------------------------------------------------------------------------------------
// Common words and symbols
comma				:	COMMA | DOT | ';' | ':'; //treat all these as commas

DOT					:	'.';
COMMA				:	',';
SLASH				:	'/';
DASH				:	'-';

//-------------------------------------------------------------------------------------------------------------------------
TO					: 	'TO';
BY					:	'BY';
OR					:	'OR';

FURTHER_SUMS		:	'and further sums';
MAX_SUM_OF			:	'a maximum sum of';
RELN_PREFIX			: 	'his' | 'her' | 'their';

FOR					: 	'for';
FROM				: 	'from';
OF					: 	'of';
AND					: 	'and';
BOTH				: 	'both';
SAID				:	'said';
ALL					:	'all';
ALL_AT				:	'all at';

O_BKT				: 	'(';
C_BKT				:	')';
ETC					:	'&c.';
TIL					:	'~';

//**NOTE: Don't put 'of' as a token


//-------------------------------------------------------------------------------------------------------------------------
// Basic fragments
ALLCAPS_BLOCK		:	[A-Z]+;
INT					: 	[0-9]+;
ALPHA_BLOCK			:	[A-Za-z]+;


//-------------------------------------------------------------------------------------------------------------------------
// Ignored tokens
WS 					: 	[ \t\r\n\\?]+ -> skip; 
