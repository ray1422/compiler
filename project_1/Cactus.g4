// The grammar for Cactus language
grammar Cactus;

// Parser rules
token: (COMMENT | WHITESPACE | KEYWORDS | ID | CONST | OPERATOR)*;
COMMENT : '/*' .*? '*/' -> skip;
KEYWORDS: IF | ELSE | FI | WHILE | RETURN | READ | WRITE | MAIN | INT;
// lexer rules
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
CONST: [1-9][0-9]* | [0-9];
OPERATOR: ADD | SUB | MUL | DIV | MOD |
     EQ | NEQ | GT | GEQ | LT | LEQ | AND | OR | NOT |
      ASSIGN | LPAR | RPAR | LCB | RCB | SEMICOLON;

      
// operators
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
WHITESPACE: [ \t\r\n] -> skip;
NEWLINE: '\n' | '\r\n';