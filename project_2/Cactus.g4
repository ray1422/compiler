grammar Cactus;

// Parser rules program: main_function; function:;
program: MAIN LPAR RPAR LCB declarations statements RCB;

declarations: INT ID SEMICOLON declarations |;

statements: statement statements |;
statement:
	IF LPAR bool_expression RPAR LCB statements RCB ELSE LCB statements RCB FI
	| IF LPAR bool_expression RPAR LCB statements RCB FI
	| WHILE LPAR bool_expression RPAR LCB statements RCB
      | ID ASSIGN arith_expression SEMICOLON
      | 'read' ID SEMICOLON
      | 'write' arith_expression SEMICOLON
	| RETURN SEMICOLON;
// typename: INT;
bool_expression: bool_expression OR bool_term | bool_term;
bool_term: bool_term AND bool_factor | bool_factor;
bool_factor:
	NOT bool_factor
	| LPAR bool_expression RPAR
	| rel_expression;
rel_expression: arith_expression rel_op arith_expression;
rel_op: EQ | NEQ | GT | GEQ | LT | LEQ;

arith_expression:
	arith_expression ADD arith_term
	| arith_expression SUB arith_term
	| arith_term;
arith_term:
	arith_term MUL arith_factor
	| arith_term DIV arith_factor
	| arith_term MOD arith_factor
	| arith_factor;
arith_factor: SUB arith_factor | primary_expression;
primary_expression: INT_CONST | ID | LPAR arith_expression RPAR;

// lexer rules operators

COMMENT: '/*' .*? '*/' -> skip;
// ignore whitespace
WS: [ \t\r\n]+ -> skip;

ADD: '+';
SUB: '-';
MUL: '*';
DIV: '/';
MOD: '%';
EQ: '==';
NEQ: '!=';
GT: '>';
GEQ: '>=';
LT: '<';
LEQ: '<=';
AND: '&&';
OR: '||';
NOT: '!';
ASSIGN: '=';
LPAR: '(';
RPAR: ')';
LCB: '{';
RCB: '}';
SEMICOLON: ';';
NEWLINE: '\n' | '\r\n';

IF: 'if';
ELSE: 'else';
FI: 'fi';
WHILE: 'while';
RETURN: 'return';
READ: 'read';
WRITE: 'write';
MAIN: 'main';
INT: 'int';

ID: [a-zA-Z_][a-zA-Z0-9_]*;
// multiline comment

KEYWORDS:
	IF
	| ELSE
	| FI
	| WHILE
	| RETURN
	| READ
	| WRITE
	| MAIN
	| INT;

INT_CONST: [1-9][0-9]* | [0-9];
OPERATOR:
	ADD
	| SUB
	| MUL
	| DIV
	| MOD
	| EQ
	| NEQ
	| GT
	| GEQ
	| LT
	| LEQ
	| AND
	| OR
	| NOT
	| ASSIGN
	| LPAR
	| RPAR
	| LCB
	| RCB
	| SEMICOLON;
