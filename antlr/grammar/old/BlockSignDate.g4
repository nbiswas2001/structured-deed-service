grammar BlockSignDate;

block				: 	DATED dates DOT?;

dates				:	date | datesInSameMonth | datesInSameYear | separateDates; 

datesInSameMonth	:	day (COMMA day)* AND day commonMonth DOT? commonYear;
day					: 	dayNum;

datesInSameYear		:	dayMonth (COMMA dayMonth)* AND dayMonth commonYear;
dayMonth			:	dayNum month DOT?;
commonMonth			: 	month;
commonYear			:	year;

separateDates		:	date (COMMA date)* AND date;

date		:	dayNum month DOT? year;

dayNum		: 	INT;
month		:	MMM;
year		:	INT;	

MMM			: 	'Jan' | 'Feb' | 'Mar' | 'Apr' | 'May' | 'Jun' | 'Jul' | 
				'Aug' | 'Sep' | 'Sept' | 'Oct' | 'Nov' | 'Dec' ;

DATED		:	'Dated';
COMMA		:	',';
AND			:	'and';
DOT			:	'.';

INT			: 	[0-9]+;

WS 			: 	[ \t\r\n]+ -> skip; 
