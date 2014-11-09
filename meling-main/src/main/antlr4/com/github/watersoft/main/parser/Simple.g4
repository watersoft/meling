grammar Simple;

program
    : block
    ;

block
    : '{' (statement ';')* '}'
    ;

statement
    : expression
    ;

expression
    : primary
    | expression ('*'|'/'|'%') expression
    | expression ('+'|'-') expression
    ;

primary
    : '(' expression ')'
    | literal
    ;

literal
    : IntegerLiteral
    ;

IntegerLiteral
    : DecimalIntegerLiteral
    ;

fragment
DecimalIntegerLiteral
    : INT
    ;

ID  : [_a-zA-Z] [_a-zA-Z0-9]* ;
INT : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;
