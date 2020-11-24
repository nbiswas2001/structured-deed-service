
grammar BlockA;

block				:	(stdSecBlock | dispositionBlock | assignationBlock | leaseBlock) recordedDate DOT EOF;

//-------------------------------------------------------------------------------------------------------------------------
// Standard Security
stdSecBlock 		: 	STD_SECURITY (FOR consideration)? deedClause? by grantor deedClause? to grantee COMMA? (over|of) subjects deedClause? DOT;
consideration		:	currency amount (FURTHER_SUMS)? COMMA;

//-------------------------------------------------------------------------------------------------------------------------
// Disposition
dispositionBlock 	: 	DISPOSITION by grantor to grantee of subjects DOT;

//-------------------------------------------------------------------------------------------------------------------------
// Assignation
assignationBlock	:	ASSIGNATION BY grantor deedClause? to grantee of leaseRef of subjects DOT;
leaseRef			:	LEASE O_BKT recordedDate C_BKT; 

//-------------------------------------------------------------------------------------------------------------------------
// Lease
leaseBlock			:	LEASE by grantor to grantee FOR leasePeriod of subjects DOT;
leasePeriod			:	duration dateSpan;


//-------------------------------------------------------------------------------------------------------------------------
// Shared constructs
deedClause			:	COMMA? DEED_CLAUSE_TXT;

by					:	COMMA? BY;
to					:	COMMA? TO;	
over				:	COMMA? OVER;
of					:	COMMA? OF;

//-------------------------------------------------------------------------------------------------------------------------
//	Grantor / Grantees
grantor				: 	legalEntity;
grantee				: 	legalEntity | saidParty;

legalEntity			: 	desigPerson | desigOrg | desigGroup | trusteeGroup;

saidParty			:	SAID ALPHA_BLOCK+ orgType?;


//-------------------------------------------------------------------------------------------------------------------------
// Designated parties and groups
desigGroup			:	jointlyDesigPersons | complexDGroup;
complexDGroup		:	complexDGPart (COMMA complexDGPart)* AND complexDGPart;
complexDGPart		:	jointlyDesigPersons | desigOrg | desigPerson;

trusteeGroup		:	 'Trustees under Deed of Trust between' desigGroup;

jointlyDesigPersons	: 	person AND person (COMMA relationship)? COMMA? BOTH? NOW? jointAddress (COMMA share)? | 
						person AND person (COMMA relationship)? COMMA? BOTH? jointFormerAddress NOW jointAddress (COMMA share)? |
						person COMMA address 'and his wife' person (COMMA share)?;

jointAddress		: 	address;
jointFormerAddress	:	formerAddress;

share				: 	JOINT_OWNERSHIP;				

desigPerson			:	person formerAddress? NOW? address;


//-------------------------------------------------------------------------------------------------------------------------
// Organisations (designated)
desigOrg			:	publicBody | bank | orgFullName;
publicBody			:	countyOrg;
countyOrg			:	county orgType;

bank				: 	BANK_NAME_PREFIX? bankName;
bankName			:	BANK_NAME;

orgFullName			: 	orgName orgType;
orgName				:	ALLCAPS_BLOCK+;
orgType				:	ORG_TYPE;	



//-------------------------------------------------------------------------------------------------------------------------
// Person
person				:	name (formerName | COMMA formerAddress | formerNameAddress)? profession?;

name				: 	fullName;			
formerName			:	O_BKT FORMERLY fullName C_BKT;
formerAddress		:	(FORMERLY|SOMETIME) address COMMA?;
formerNameAddress	:	O_BKT FORMERLY fullName COMMA address C_BKT;

fullName			:	firstNames surName (OR altSurname)?;

firstNames			:	firstNamePart+;
firstNamePart		: 	ALLCAPS_BLOCK;
surName				:	ALLCAPS_BLOCK;
altSurname			: 	ALLCAPS_BLOCK;

relationship		:	RELN_NAME;
profession			:	COMMA? PROFESSION_NAME COMMA?;



//-------------------------------------------------------------------------------------------------------------------------
// Subjects
subjects			:	subject | multiSubjects;
multiSubjects		:	subjectNumber subject;
subjectNumber		:	O_BKT ROMAN_INT DOT C_BKT;
ROMAN_INT			:	'I' | 'II' | 'III' | 'IV' | 'V'	| 'VI' | 'VII' | 'VIII' | 'IX';	

subject				:	subjectRefPart (COMMA? subjectRefPart)*;
subjectRefPart		:	(premises | flatRef) (AT|'in')? address | (AT|'in')? place | COMMA 'with' appurtenances | subjectRefViaDeed | subjectRefViaMinute | areaOfLand | exceptSubjects;


premises			:	premiseType 'premises'? AND_C?;
PREMISE_TYPE		:	'house' | 'warehouse' | 'garage' | 'workshop' ;

appurtenances		:	ALPHA_BLOCK+ AND_C?;

exceptSubjects		:	O_BKT 'under exception of subjects' subjectNumList? subjectRefViaDeed C_BKT; 
subjectRefViaMinute	:	'the subjects' subjectNumList? 'in the' MINUTE_REF_TXT;
MINUTE_REF_TXT		:	'two immediately preceding Minutes' | 'immediately preceding Minute';

subjectRefViaDeed	:	'described'? 'in' deedRef;
subjectNumList		:	ROMAN_INT (COMMA ROMAN_INT)* AND ROMAN_INT;

areaOfLand			:	areaValue areaUnit COMMA? ('with' premiseType (premiseRef AT)? | relativeTo) place AND_C?;
relativeTo			:	TO DIRECTION OF;

areaValue			:	FLOAT | INT;
areaUnit			: 	AREA_UNIT;	
premiseType			: 	PREMISE_TYPE;
premiseRef			:	(ALPHA_BLOCK | INT)+ COMMA?;

place				:	address | ALPHA_BLOCK+;
AND_C				:	'&c.';
DIRECTION			:	'north' | 'south' | 'east' | 'west';

//-------------------------------------------------------------------------------------------------------------------------
// Flat
flatRef				:	flatPosition? (floor FLAT | FLAT  'on' floor | FLAT) 'above street or ground level'? (OF? ('Tenement' | HOUSE))?;
flatPosition		:	FLAT_POS;
floor				:	FLOOR;
FLAT				:	'Flat' | 'flat';
FLOOR				:	'ground floor' | 'first floor' | 'second floor' | 'top floor' ;	
FLAT_POS			:	'southmost' | 'northmost' | 'eastmost' | 'westmost' | 'northwestmost' | 'northeastmost' 'southwestmost' | 'southeastmost' | 'upper' | 'lower';	


//-------------------------------------------------------------------------------------------------------------------------
// Deed reference for Subjects
deedRef				:	deedType TO granteeRef COMMA recordedDate;
deedType			: 	STD_SECURITY | DISPOSITION | ASSIGNATION | LEASE | BLENCH_DISP | FEUDAL_DISP;
granteeRef			:	granteeRefPart+ (COMMA 'as' role)?;
granteeRefPart		:	SAID role | fullName | AND (ANOTHER | OTHERS);
role				: 	ROLE;
ROLE				:	'Trustees' | 'Granter' | 'Granters';

//-------------------------------------------------------------------------------------------------------------------------
// Deed date
recordedDate		: 	(DATED | RECORDED) (date | dates);
DATED				:	'Dated';
RECORDED			: 	'recorded';


//-------------------------------------------------------------------------------------------------------------------------
// Address
address				: 	addrLine+ county?;
addrLine			:	addrLinePart+ COMMA?;
addrLinePart		: 	HOUSE | ALPHA_BLOCK | INT | SLASH | OF; //House needs to be here, otherwise doesn't parse  Newburgh House as addressline

county				: 	COUNTY_NAME; 

//-------------------------------------------------------------------------------------------------------------------------
// Date and Timespan
dateSpan			:	FROM startDate TO endDate;
startDate			:	date;
endDate				: 	date;

date				:	day month year;
dates				:	datePart (COMMA datePart)* AND date | date (COMMA date)* AND date;
datePart			:	day month;
day					: 	INT;
month				:	MMM DOT?;
year				:	INT;	

duration			:	timeValue timeUnit;
timeValue 			:	INT;
timeUnit			:	TIME_UNIT;


//-------------------------------------------------------------------------------------------------------------------------
// Money
amount				:	(INT | COMMA)+;
currency			:	CURRENCY_SYMBOL;
CURRENCY_SYMBOL		:	'£' | '_GBP_'; // _GBP_ used as replacement of £ 

//-------------------------------------------------------------------------------------------------------------------------
// Standard text blocks
DEED_CLAUSE_TXT		:	'(in respect of discount)' | 'with a consent' | 'containing provision as to ranking' ;
RELN_NAME			: 	'spouses';
JOINT_OWNERSHIP		:	'equally and survivor';	


//-------------------------------------------------------------------------------------------------------------------------
// Deed types
STD_SECURITY		: 	'Standard Security' | 'STANDARD SECURITY';
DISPOSITION			:	'Disp.' | 'DISP.';
ASSIGNATION			:	'Assig.' | 'ASSIG.';	
LEASE				:	'Lease'	| 'LEASE';
BLENCH_DISP			:	'Blench Disp.';
FEUDAL_DISP			:	'Feu Disp.';



//-------------------------------------------------------------------------------------------------------------------------
// Organisation types
ORG_TYPE			:	'LIMITED' | 'BUILDING SOCIETY' | 'DISTRICT COUNCIL' |'P L C' | 'PLC';

//-------------------------------------------------------------------------------------------------------------------------
// Banks
BANK_NAME_PREFIX	:	'GOVERNOR AND COMPANY OF';			
BANK_NAME			: 	'BANK OF SCOTLAND';

//-------------------------------------------------------------------------------------------------------------------------
// Various lists
PROFESSION_NAME		: 	'Service Engineer' | 'Manageress' | 'Joiner' | 'Solicitor' | 'Advocate' | 'University Lecturer' | 'Boarding-house Proprietor';

MMM					: 	'Jan' | 'January' | 'Feb' | 'February' | 'Mar' | 'March' | 'Apr' | 'April' | 'May' | 'Jun' | 'June' | 'Jul' | 'July' | 
						'Aug' | 'August' |'Sep' | 'Sept' | 'September' | 'Oct' | 'October' | 'Nov' | 'November' | 'Dec' | 'December';

AREA_UNIT			:	'hectare' | 'square metres' | 'square feet';

TIME_UNIT			:	'years';

//-------------------------------------------------------------------------------------------------------------------------
// Counties
COUNTY_NAME			: 	'Glasgow City' | 'Lanark' | 'Edinburgh City' | 'City Of Edinburgh' | 'Renfrew' | 'Ayr' | 'Fife' | 'Dunbarton' | 'Stirling' | 
						'Dundee City' | 'City Of Dundee' | 'Aberdeen City' | 'City Of Aberdeen' | 'Midlothian' | 'Aberdeen' | 'Perth' | 'West Lothian' | 'Angus' |
						'Inverness' | 'Dumfries' | 'Argyll' | 'Ross And Cromarty' | 'East Lothian' | 'Moray' | 'Clackmannan' |
						'Banff' | 'Roxburgh' | 'Caithness' | 'Kirkudbright' | 'Wigtown' | 'Kincardine' | 'Selkirk' | 'Berwick' |
						'Zetland' | 'Orkney' | 'Peebles' | 'Bute' | 'Sutherland' | 'Nairn' | 'Kinross' |
						'GLASGOW CITY' | 'LANARK' | 'EDINBURGH CITY' | 'CITY OF EDINBURGH' | 'RENFREW' | 'AYR' | 'FIFE' | 'DUNBARTON' | 'STIRLING' | 
						'DUNDEE CITY' | 'CITY OF DUNDEE' | 'ABERDEEN CITY' | 'CITY OF ABERDEEN' | 'MIDLOTHIAN' | 'ABERDEEN' | 'PERTH' | 'WEST LOTHIAN' | 'ANGUS' |
						'INVERNESS' | 'DUMFRIES' | 'ARGYLL' | 'ROSS AND CROMARTY' | 'EAST LOTHIAN' | 'MORAY' | 'CLACKMANNAN' |
						'BANFF' | 'ROXBURGH' | 'CAITHNESS' | 'KIRKUDBRIGHT' | 'WIGTOWN' | 'KINCARDINE' | 'SELKIRK' | 'BERWICK' |
						'ZETLAND' | 'ORKNEY' | 'PEEBLES' | 'BUTE' | 'SUTHERLAND' | 'NAIRN' | 'KINROSS';

//-------------------------------------------------------------------------------------------------------------------------
// Common words and symbols
TO					: 	'TO';
BY					:	'by';
OVER				: 	'OVER' | 'over';
OF					:	'OF' | 'of';
FROM				:	'FROM';
OR					:	'OR' | 'or';
DOT					:	'.';
COMMA				:	',';
AND					:	'and';	
SLASH				:	'/';
AT					:	'at';
FOR					:	'for';
FURTHER_SUMS		:	'and further sums';
SAID				:	'said';
BOTH				:	'both';
FORMERLY			:	'formerly';
SOMETIME			:	'sometime';
NOW					:	'now';
HOUSE				:	'House';
ANOTHER				:	'another';
OTHERS				:	'others';	
O_BKT				: 	'(';
C_BKT				:	')';	


//-------------------------------------------------------------------------------------------------------------------------
// Basic fragments
ALLCAPS_BLOCK		:	[A-Z]+;
ALPHA_BLOCK			:	[A-Za-z]+;
FLOAT				:	INT DOT INT;
INT					: 	[0-9]+;

//-------------------------------------------------------------------------------------------------------------------------
// Ignored tokens
WS 					: 	[ \t\r\n\\?—]+ -> skip; 
