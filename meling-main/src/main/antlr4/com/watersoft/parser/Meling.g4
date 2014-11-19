grammar Meling;

program
    : classDeclaration
    ;

classDeclaration
    : 'class' name=ID classBody
    ;

classBody
    : '{' classBodyDeclaration* '}'
    ;

classBodyDeclaration
    : classMemberDeclaration
    ;

classMemberDeclaration
    : fieldDeclaration
    | methodDeclaration
    ;

fieldDeclaration
    : variableDeclaration
    ;

variableDeclaration
    : type ID ('=' expression)?
    ;

methodDeclaration
    : methodHeader methodBody
    ;

methodHeader
    : type ID '(' parameterList? ')'
    ;

methodBody
    : block
    ;

block
    : '{' (statement ';')* '}'
    ;

statement
    : variableDeclaration
    | assignment
    ;

assignment
    : ID '=' expression
    ;

parameterList
    : parameter (',' parameter)*
    ;

parameter
    : type ID
    ;

expression
    : op=('+'|'-') expression                   # unary
    | expression op=('*'|'/'|'%') expression    # MulDivMod
    | expression op=('+'|'-') expression        # AddSub
    | INT                                       # int
    | '(' expression ')'                        # parentheses
    ;

type
    : 'int'
    ;

MUL     : '*' ;
DIV     : '/' ;
MOD     : '%' ;
PLUS    : '+' ;
MINUS   : '-' ;

ID  : [_a-zA-Z] [_a-zA-Z0-9]* ;
INT : [0-9]+ ;

WS              : [ \t\r\n]+            -> skip ;
LINE_COMMENT    : '//' .*? '\r'? '\n'   -> skip ;
COMMENT         : '/*' .*? '*/'         -> skip ;
