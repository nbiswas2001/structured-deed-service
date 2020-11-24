
grammar BlockLE;


block				:	(stdSecBlock | dispositionBlock | assignationBlock | leaseBlock | noticeOfPigBlock) COMMA? EOF;

//-------------------------------------------------------------------------------------------------------------------------
// Standard Security
stdSecBlock 		: 	STD_SECURITY consideration? deedClause? by grantor deedClause? to grantee COMMA?; 
consideration		:	FOR amount (FURTHER_SUMS)? COMMA?;

//-------------------------------------------------------------------------------------------------------------------------
// Disposition
dispositionBlock 	: 	dispType by grantor to grantee COMMA?;
dispType			: 	DISPOSITION;

//-------------------------------------------------------------------------------------------------------------------------
// Assignation
assignationBlock	:	ASSIGNATION BY grantor deedClause? to grantee COMMA?;

//-------------------------------------------------------------------------------------------------------------------------
// Lease
leaseBlock			:	LEASE by grantor to grantee FOR leasePeriod COMMA?;
leasePeriod			:	duration dateSpan;

duration			:	timeValue timeUnit;
timeValue 			:	INT;
timeUnit			:	TIME_UNIT;

dateSpan			:	FROM startDate TO endDate;
startDate			:	date;
endDate				: 	date;

//-------------------------------------------------------------------------------------------------------------------------
// Improvement Grants
noticeOfPigBlock	:	NOTICE_PIG grantAmount BY grantor TO grantee COMMA?;
grantAmount			:	OF amount COMMA?;

//-------------------------------------------------------------------------------------------------------------------------
// Shared constructs
deedClause			:	COMMA? DEED_CLAUSE_TXT;

by					:	COMMA? BY;
to					:	COMMA? TO;	

//-------------------------------------------------------------------------------------------------------------------------
TO					: 	'TO' | 'to';
BY					:	'by';
OR					:	'OR' | 'or';
//-------------------------------------------------------------------------------------------------------------------------
//	Grantor / Grantees
grantor				: 	legalEntity;
grantee				: 	legalEntity;

legalEntity			: 	desigPerson | desigOrg | desigGroup | legalEntityRef | representative;

//-------------------------------------------------------------------------------------------------------------------------
// Fiduicaries
representative		:	trustees | agentOrg | executors;
trustees			:	'Trustees under Deed of Trust between' trusteesRep |
						'Trustees of' principal |
						farmerTrustees;
						
farmerTrustees		:	desigGroup ', Farmers, as Trustees for their Firm of' generalOrg ', Farmers,' address 'with consent of and by said Firm and said Trustees as Partners of said Firm and as individuals';						

trusteesRep			:	desigGroup;

agentOrg			:	agentOrgRep COMMA 'with consent of' principal;
agentOrgRep			:	desigOrg;

executors			:	'Executors of' principal;

principal			:	desigPerson | desigOrg | desigGroup;


//-------------------------------------------------------------------------------------------------------------------------
// Designated parties and groups
desigGroup			:	jointlyDesigPersons | complexDGroup;
complexDGroup		:	complexDGPart (COMMA complexDGPart)* COMMA? AND complexDGPart (COMMA share)?;
complexDGPart		:	jointlyDesigPersons | desigOrg | desigPerson;

jointlyDesigPersons	: 	person AND person (COMMA relationship)? COMMA? BOTH? NOW? jointCurrentAddress (COMMA share)?  
						| person AND person (COMMA relationship)? COMMA? BOTH? jointFormerAddress NOW jointCurrentAddress (COMMA share)? 
						| person COMMA jointCurrentAddress 'and his' relationship person (COMMA share)?
						| person COMMA jointFormerAddress NOW jointCurrentAddress 'and his' relationship person (COMMA share)?;

relationship		:	RELN_NAME;

jointCurrentAddress	: 	address;
jointFormerAddress	:	formerAddress;

share				: 	EQUAL_SHARE;				

desigPerson			:	person formerAddress? COMMA? currentAddress;


//-------------------------------------------------------------------------------------------------------------------------
// Organisations (designated)
desigOrg			:	publicBody | bank | generalOrg address?;
publicBody			:	council; //Add others here
council				:	COUNCIL_NAME orgType;

bank				: 	BANK_NAME_PREFIX? bankName; 
bankName			:	BANK_TXT orgNamePart+ | orgNamePart+ BANK_TXT;
BANK_NAME_PREFIX	:	'GOVERNOR AND COMPANY OF';			
BANK_TXT			:	'BANK OF ' | 'ROYAL BANK OF ' | ' BANK LIMITED' | ' BANK LTD.' | 
						'Bank Of ' | 'Royal Bank Of ' | ' Bank Limited' | ' Bank Ltd.';


generalOrg			: 	orgName (orgType | orgSuffix);
orgName				:	orgNamePart+;
orgNamePart			:	COUNCIL_NAME | ALLCAPS_BLOCK (DASH ALLCAPS_BLOCK)* | O_BKT | C_BKT;
orgType				:	ORG_TYPE;
orgSuffix			:	ORG_SUFFIX;

ORG_TYPE			:	'LIMITED' | 'LTD.' | 'BUILDING SOCIETY' | 'DISTRICT COUNCIL' |'P L C' | 'PLC' ;
ORG_SUFFIX			:	'AND CO' | 'AND SONS' | 'SOCIETY';


//-------------------------------------------------------------------------------------------------------------------------
// Person
person				:	name (formerName | COMMA formerAddress | formerNameAddress)? (COMMA? profession COMMA?)?;

name				: 	fullName;			
formerName			:	O_BKT FORMERLY fullName C_BKT;
formerAddress		:	(FORMERLY|SOMETIME) address COMMA?;
formerNameAddress	:	O_BKT FORMERLY fullName COMMA address C_BKT;
currentAddress		: 	(NOW | LATTERLY)? address;

fullName			:	salutation? firstNames surName (OR altSurname)?;

firstNames			:	firstNamePart+;
firstNamePart		: 	mcName | ALLCAPS_BLOCK (DASH ALLCAPS_BLOCK)*;
surName				:	mcName | ALLCAPS_BLOCK;
altSurname			: 	mcName | ALLCAPS_BLOCK;

mcName				:	{_input.LT(1).getText().startsWith("Mc")}? ALPHA_BLOCK;

salutation			: 	SALUT_NAME;

profession			:	(professionText* professionWord)+ ;
professionText		:	ALPHA_BLOCK | '/' | '-'; 
professionWord		:	PROFESSION_WORD | 'Teacher of' TEACHING_SUB;


PROFESSION_WORD     : 	'Accountant'| 'Adviser' | 'Advisor' | 'Advocate' | 'Agent' | 'Anaesthetist' | 'Analyst' | 'Apprentice' | 'Architect' | 'Assistant' 
						| 'Auditor' | 'Bank Teller' | 'Bargemaster' | 'Beater' | 'Blacksmith' | 'Book Binder' | 'Book-Keeper' | 'Broker' | 'Builder' | 'Butcher' | 'C.A.' 
						| 'Captain' | 'Cashier' | 'Cementer' | 'Chef' | 'Chemist' | 'Civil Servant' | 'Cleaner' | 'Clerk' | 'Clerkess' | 'Compositor' | 'Confectioner' | 'Constable' 
						| 'Consultant' | 'Controller' | 'Cook' | 'Co-Ordinator' | 'Co-ordinator' | 'Croupier' | 'Dairy Roundsman' | 'Dairyman' | 'Dealer' | 'Decorator' | 'Dentist' 
						| 'Derrickman' | 'Designer' | 'Detective' | 'Director' | 'Diver' | 'Doctor of Medicine' | 'Draper' | 'Draughtsman' | 'Draughtswoman' | 'Drayman' 
						| 'Driller' | 'Driver' | 'Electrician' | 'Employee' | 'Engineer' | 'Estimator' | 'Executive' | 'Fabricator' | 'Farmer' | 'Fireman' | 'Fisherman' 
						| 'Fitter' | 'Foreman' | 'Forester' | 'Fruiterer' | 'Furnisher' | 'Gamekeeper' | 'Gardener' | 'Geologist' | 'Graduate' | 'Greenkeeper' | 'Grocer' 
						| 'Guard' | 'Hairdresser' | 'Headmaster' | 'Horticulturist' | 'Hostess' | 'Hotelier' | 'Housemother' | 'Housewife' | 'Hunter' | 'Inspector' | 'Instructor' 
						| 'Joiner' | 'Journalist' | 'Keeper' | 'Labourer' | 'Leader' | 'Lecturer' | 'Librarian' | 'M.D.' | 'Machineman' | 'Machinist' | 'Manager' | 'Manageress' 
						| 'Manufacturer' | 'Master' | 'Mechanic' | 'Merchant' | 'Nurse' | 'Officer' | 'Official' | 'Operator' | 'Optician' | 'Owner' | 'Painter' | 'Partner' 
						| 'Pharmacist' | 'Photographer' | 'Physician' | 'Pilot' | 'Planner' | 'Player' | 'Plumber' | 'Police Woman' | 'Policeman' | 'Porter' | 'Postman Higher Grade' 
						| 'Poulterer' | 'Practitioner' | 'Programmer' | 'Proprietor' | 'Psychiatrist' | 'Psychologist' | 'Radiologist' | 'Raidographer' | 'Receptionist' 
						| 'Representative' | 'Restauranteur' | 'Restaurateur' | 'Retailer' | 'Retired' | 'Rigger' | 'Salesman' | 'Scaffolder' | 'Schoolmaster' | 'Schoolteacher' 
						| 'Scientist' | 'Seaman' | 'Seamstress' | 'Secretary' | 'Seller' | 'Sen.' | 'Sergeant' | 'Setter Out' | 'Shipowner' | 'Shoemaker' | 'Skipper' | 'Solicitor' 
						| 'Specialist' | 'Steward' | 'Stewardess' | 'Stocktaker' | 'Storekeeper' | 'Storeman' | 'Student' | 'Superintendent' | 'Supervisor' | 'Surgeon' | 'Surveyor' 
						| 'Teacher' | 'Technician' | 'Telephonist' | 'Tester' | 'Therapist' | 'Tobacconist' | 'Traveller' | 'Typist' | 'Underwriter' | 'Waiter' | 'Warden' ;


TEACHING_SUB		:	'Music' | 'Nursing';


RELN_NAME			: 	'spouses' | 'wife';
SALUT_NAME			:	'Dr.';


//-------------------------------------------------------------------------------------------------------------------------
// Address
address				: 	addrLine+ county?;
addrLine			:	addrLinePart+ COMMA?;
addrLinePart		: 	premiseNum | specialAddrBlock | tokensInAddr | ALPHA_BLOCK; 
premiseNum			:	INT | INT ALLCAPS_BLOCK | INT SLASH INT; 
county				: 	COUNTY_NAME; 
specialAddrBlock	:	'St.' | 'c/o' | ALPHA_BLOCK '\u0027' 's';
tokensInAddr		:	OF | AND;

//-------------------------------------------------------------------------------------------------------------------------
legalEntityRef		:	SAID leRefPart+; //Just get the name. orgType needed here
leRefPart			:	ALLCAPS_BLOCK | orgType;

//-------------------------------------------------------------------------------------------------------------------------
// Date 
date				:	day month year;
dates				:	datePart (COMMA datePart)* AND date | date (COMMA date)* AND date;
datePart			:	day month;
day					: 	INT;
month				:	MMM DOT?;
year				:	INT;	

//-------------------------------------------------------------------------------------------------------------------------
// Money
amount				:	currency moneyValue;
moneyValue			:	(INT | COMMA | DOT)+;
currency			:	CURRENCY_SYMBOL;
CURRENCY_SYMBOL		:	'£' | 'GBP'; // GBP used as replacement of £ 

//-------------------------------------------------------------------------------------------------------------------------
// Standard text blocks
DEED_CLAUSE_TXT		:	'(in respect of discount)' | 'with a consent';
EQUAL_SHARE			:	'equally and survivor' | 'equally';	


//-------------------------------------------------------------------------------------------------------------------------
// Deed types
STD_SECURITY		: 	'STANDARD SECURITY';
DISPOSITION			:	'FEU DISP.' | 'BLENCH DISP.' | 'DISP.';
ASSIGNATION			:	'ASSIG.';	
LEASE				:	'LEASE';
NOTICE_PIG			:	'NOTICE OF PAYMENT OF IMPROVEMENT GRANT' | 'NOTICE OF PAYMENT OF GRANT';

//-------------------------------------------------------------------------------------------------------------------------
// Various lists
TIME_UNIT			:	'years';

MMM					: 	'Jan' | 'Feb' | 'Mar' | 'Apr' | 'May' | 'Jun' | 'Jul' | 
						'Aug' | 'Sep' | 'Sept' | 'Oct' | 'Nov' | 'Dec' ;

//-------------------------------------------------------------------------------------------------------------------------
// Counties
COUNTY_NAME			: 	'Glasgow City' | 'Lanark' | 'Edinburgh City' | 'City Of Edinburgh' | 'Renfrew' | 'Ayr' | 'Fife' | 'Dunbarton' | 'Stirling' | 
						'Dundee City' | 'City Of Dundee' | 'Aberdeen City' | 'City Of Aberdeen' | 'Midlothian' | 'Aberdeen' | 'Perth' | 'West Lothian' | 'Angus' |
						'Inverness' | 'Dumfries' | 'Argyll' | 'Ross And Cromarty' | 'East Lothian' | 'Moray' | 'Clackmannan' |
						'Banff' | 'Roxburgh' | 'Caithness' | 'Kirkudbright' | 'Wigtown' | 'Kincardine' | 'Selkirk' | 'Berwick' |
						'Zetland' | 'Orkney' | 'Peebles' | 'Bute' | 'Sutherland' | 'Nairn' | 'Kinross';
						
COUNCIL_NAME		:	'GLASGOW CITY' | 'LANARK' | 'EDINBURGH CITY' | 'CITY OF EDINBURGH' | 'RENFREW' | 'AYR' | 'FIFE' | 'DUNBARTON' | 'STIRLING' | 'DUNDEE CITY' | 
						'CITY OF DUNDEE' | 'ABERDEEN CITY' | 'CITY OF ABERDEEN' | 'MIDLOTHIAN' | 'ABERDEEN' | 'PERTH' | 'WEST LOTHIAN' | 'ANGUS' | 'INVERNESS' | 
						'DUMFRIES' | 'ARGYLL' | 'EAST LOTHIAN' | 'MORAY' | 'CLACKMANNAN' | 'BANFF AND BUCHAN' | 'KINCARDINE AND DEESIDE' | 'BANFF' | 'ROXBURGH' | 
						'CAITHNESS' | 'KIRKUDBRIGHT' | 'WIGTOWN' | 'KINCARDINE' | 'SELKIRK' | 'BERWICK' |'ZETLAND' | 'ORKNEY' | 'PEEBLES' | 'BUTE' | 'SUTHERLAND' | 
						'NAIRN' | 'KINROSS';

//-------------------------------------------------------------------------------------------------------------------------
// Common words and symbols
DOT					:	'.';
COMMA				:	',';
SLASH				:	'/';
DASH				:	'-';

AND					:	'and';	
FOR					:	'for';
FROM				:	'from';
OF					:	'of';


FURTHER_SUMS		:	'and further sums';
SAID				:	'said';
BOTH				:	'both';
FORMERLY			:	'formerly';
LATTERLY			:	'latterly';
SOMETIME			:	'sometime';
NOW					:	'now';
O_BKT				: 	'(';
C_BKT				:	')';	

//**NOTE: Don't put 'of' as a token


//-------------------------------------------------------------------------------------------------------------------------
// Basic fragments
ALLCAPS_BLOCK		:	[A-Z]+;
INT					: 	[0-9]+;
ALPHA_BLOCK			:	[A-Za-z]+;


//-------------------------------------------------------------------------------------------------------------------------
// Ignored tokens
WS 					: 	[ \t\r\n\\?~]+ -> skip; 
