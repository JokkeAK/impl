grammar impl;

start : '.hardware' IDENTIFIER '.inputs' IDENTIFIER '.outputs' IDENTIFIER* latchAct* '.update' command* '.simulate' simInp EOF;

simInp : IDENTIFIER '=' BINARY;

latchAct: '.latch' IDENTIFIER ' -> ' IDENTIFIER'M'* # Latches;

command : IDENTIFIER '=' expr # Assignment;

expr : IDENTIFIER               # StringVar
     | '('e1=expr')'            # Parentheses //not needed in abtract syntax
     |('!')e1=expr              # NOT
     |e1=expr ('&&') e2=expr    # AND
     |e1=expr ('||') e2=expr    # OR;

IDENTIFIER : [a-zA-Z_]*[a-zA-Z]*;
BINARY: [0-1]*;
HVIDRUM : [ \t\n]+ -> skip ;
KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip;

//Hjælpelæreren syntes at nedenstående var godt - ovenstående syntes forelæseren var godt
/*
grammar impl;

start : cs=commands EOF;

IDENTIFIER : [a-zA-Z_]*[a-zA-Z0-9_]*[0-9]*;

simInp : IDENTIFIER '=' IDENTIFIER;

latchAct: '.latch' IDENTIFIER ' -> ' IDENTIFIER'M'* # Latches;

command : IDENTIFIER '=' expr # Assignment
     | '.hardware' IDENTIFIER # Hardware
     | '.inputs' IDENTIFIER # Input
     | '.outputs' IDENTIFIER+ # Output
     | '.latch' IDENTIFIER ' -> ' IDENTIFIER'M'+ # Latch
     | '.update' commands+ # Update
     |'.simulate' simInp #  Simulationinput ;

commands : c=command cs=commands* # Sequence;

expr : IDENTIFIER               # StringVar
     | '('e1=expr')'            # Parentheses //not needed in abtract syntax
     |('!')e1=expr              # NOT
     |e1=expr ('&&') e2=expr    # AND
     |e1=expr ('||') e2=expr    # OR;

HVIDRUM : [ \t\n]+ -> skip ;
KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '' -> skip;

*/