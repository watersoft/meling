grammar Simple;

program
    : block
    ;

block
    : '{' (expression ';')* '}'
    ;

expression
    : expression op=('*'|'/'|'%') expression    # MulDivMod
    | expression op=('+'|'-') expression        # AddSub
    | INT                                       # int
    | '(' expression ')'                        # parentheses
    ;

MUL : '*' ;
DIV : '/' ;
MOD : '%' ;
ADD : '+' ;
SUB : '-' ;

ID  : [_a-zA-Z] [_a-zA-Z0-9]* ;
INT : [0-9]+ ;
WS  : [ \t\r\n]+ -> skip ;
