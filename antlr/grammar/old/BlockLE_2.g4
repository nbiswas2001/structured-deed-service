grammar BlockLE_2;

block				:	deed BY blockGrantor TO blockGrantee EOF;

blockGrantor		:	blockText? (party blockText?)+;
blockGrantee		:	blockText? (party blockText?)+;
party				:	person | org;

//-----------------------------------------------------------------------------
person				:	name formerName?;
name				:	fullName;
formerName			:	O_BKT FORMERLY fullName C_BKT;

fullName			:	salutation? firstNames surName (OR altSurname)?;

firstNames			:	firstNamePart+;
firstNamePart		: 	mcName | ALLCAPS_BLOCK (DASH ALLCAPS_BLOCK)*;
surName				:	mcName | ALLCAPS_BLOCK;
altSurname			: 	mcName | ALLCAPS_BLOCK;

mcName				:	{_input.LT(1).getText().startsWith("Mc")}? ASCII_BLOCK;
salutation			: 	SALUT_NAME;
SALUT_NAME			:	'Dr.';
//-----------------------------------------------------------------------------
org					:	publicBody | bank | generalOrg;
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

COUNCIL_NAME		:	'GLASGOW CITY' | 'LANARK' | 'EDINBURGH CITY' | 'CITY OF EDINBURGH' | 'RENFREW' | 'AYR' | 'FIFE' | 'DUNBARTON' | 'STIRLING' | 'DUNDEE CITY' | 
						'CITY OF DUNDEE' | 'ABERDEEN CITY' | 'CITY OF ABERDEEN' | 'MIDLOTHIAN' | 'ABERDEEN' | 'PERTH' | 'WEST LOTHIAN' | 'ANGUS' | 'INVERNESS' | 
						'DUMFRIES' | 'ARGYLL' | 'EAST LOTHIAN' | 'MORAY' | 'CLACKMANNAN' | 'BANFF AND BUCHAN' | 'KINCARDINE AND DEESIDE' | 'BANFF' | 'ROXBURGH' | 
						'CAITHNESS' | 'KIRKUDBRIGHT' | 'WIGTOWN' | 'KINCARDINE' | 'SELKIRK' | 'BERWICK' |'ZETLAND' | 'ORKNEY' | 'PEEBLES' | 'BUTE' | 'SUTHERLAND' | 
						'NAIRN' | 'KINROSS';

//-------------------------------------------------------------------------------
blockText		:	(ASCII_BLOCK | BY | OR | O_BKT | C_BKT | DASH | FORMERLY)+ ;

deed			:	'DISP.' | 'BLENCH DISP.' | 'FEU DISP.' |'STANDARD SECURITY' | 'STAN DARD SECURITY' | 'LEASE' | 'ASSIG.' | 'NOTICE OF PAYMENT OF IMPROVEMENT GRANT'
					| 'NOTICE OF CESSOR OF CONDITIONS OF IMPROVEMENT GRANT' | 'DEED OF RESTRICTION' | 'CON. OF EXCAMBION' | 'CONVEY' | 'RECONVEY.';


TO				:	'TO';
BY				:	'by';
OR				:	'OR' | 'or';
O_BKT			: 	'(';
C_BKT			:	')';	
DASH			: 	'-';
FORMERLY		:	'formerly';

//-------------------------------------------------------------------------------
ALLCAPS_BLOCK	:	[A-Z]+;
ASCII_BLOCK		:	[!-:]+ | [<-}]+;


WS 				: 	[ \t\r\n\\?~,]+ -> skip; 