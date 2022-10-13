grammar impl;

start : '.hardware' IDENTIFIER '.inputs' IDENTIFIER '.outputs' simOut latchAct+ '.update' command* '.simulate' simInp EOF;

simInp : x=IDENTIFIER '=' b=BINARY                                # Simulation;

simOut : x=IDENTIFIER*                                            # Outputs;

latchAct: '.latch' x=IDENTIFIER ' -> ' y=IDENTIFIER               # Latch;

command : x=IDENTIFIER '=' e=expr                                 # Assignment;

expr : x=IDENTIFIER                                               # Identifier
     |'('e1=expr')'                                               # Parentheses //not needed in abtract syntax
     |('!')e1=expr                                                # NOT
     |e1=expr ('&&') e2=expr                                      # AND
     |e1=expr ('||') e2=expr                                      # OR;

IDENTIFIER : [a-zA-Z_][a-zA-Z0-9_]*;
BINARY: [0-1]+;
HVIDRUM : [ \t\n]+ -> skip ;
KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip;
