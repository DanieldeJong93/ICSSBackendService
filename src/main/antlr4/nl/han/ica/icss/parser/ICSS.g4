grammar ICSS;

//Parser
//Base rules
stylesheet: (constant | stylerule) *;
stylerule: selector statement? CURLYOPEN declaration+ CURLYCLOSE;
constant: CONSTANTNAME COLON EQUALS type SEMICOLON;

//Selectors
selector: (classselector | tagselector | idselector);
classselector: DOT TEXT;
tagselector: TEXT;
idselector: HASH TEXT;

//Declarations
declaration: (colorline | dimensionline) SEMICOLON;
colorline: COLOR_PROPERTY COLON (colorvalue | colorternarydeclaration);
dimensionline: DIMENSIONPROPERTY COLON (dimensionvalue | dimensionternarydeclaration);

colorternarydeclaration: booleanexpression extraexpression* TERNARYOPERATOR colorvalue COLON colorvalue;
dimensionternarydeclaration: booleanexpression extraexpression* TERNARYOPERATOR dimensionvalue COLON dimensionvalue;

operation: calculatable operator calculatable extraoperation* ;
extraoperation: operator calculatable;

statement: SQUAREOPEN booleanexpression extraexpression* SQUARECLOSE;
booleanexpression: (CONSTANTNAME | comparison);
extraexpression: (DOUBLEPIPE | DOUBLEAMPERSAND) booleanexpression;
comparison: comparable compoperator comparable;

//Values
type: (COLOR_LITERAL | PERCENTAGE_LITERAL | PIXEL_LITERAL | BOOLEAN_LITERAL);
comparable: (type | CONSTANTNAME | operation);
dimensionvalue: PERCENTAGE_LITERAL | PIXEL_LITERAL | operation | CONSTANTNAME;
colorvalue: COLOR_LITERAL | CONSTANTNAME;
calculatable: CONSTANTNAME | PERCENTAGE_LITERAL | PIXEL_LITERAL;

//Helpers
operator: (SUM | DASH);
compoperator: (BIGGERTHAN | SMALLERTHAN | DOUBLEEQUALS);

//Lexer
//Text regex
DIMENSIONPROPERTY: 'width' | 'height';
COLOR_PROPERTY: 'color' | 'background-color';
PIXEL_LITERAL: [0-9]+'px';
BOOLEAN_LITERAL: 'true' | 'false';
TEXT: [a-z0-9]+;
CONSTANTNAME: [A-Z_]+;
PERCENTAGE_LITERAL: [0-9]+'%';
COLOR_LITERAL: '#'[0-9A-Fa-f][0-9A-Fa-f][0-9A-Fa-f][0-9A-Fa-f][0-9A-Fa-f][0-9A-Fa-f];

//Symbols
HASH: [#];
CURLYOPEN: [{];
CURLYCLOSE: [}];
SQUAREOPEN: [[];
SQUARECLOSE: [\]];
SEMICOLON: [;];
DOT: [.];
COLON: [:];
EQUALS: [=];
SUM: [+];
DASH: [-];
PIPE: [|];
BIGGERTHAN: [>];
SMALLERTHAN: [<];
DOUBLEEQUALS: '==';
DOUBLEPIPE: '||';
DOUBLEAMPERSAND: '&&';
TERNARYOPERATOR: [?];

WS: [ \t\r\n]+ -> skip;