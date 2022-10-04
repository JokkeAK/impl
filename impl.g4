grammar impl;

start : '.hardware' IDENTIFIER '.inputs' IDENTIFIER '.outputs' IDENTIFIER* latchAct* '.update' updateCom* '.simulate' simInp EOF;

IDENTIFIER : [a-zA-Z_]*[a-zA-Z0-9_]*[0-9]*;

simInp : IDENTIFIER '=' IDENTIFIER; //mangler denne i AST

latchAct: '.latch' IDENTIFIER ' -> ' IDENTIFIER'M'* # Latches;

updateCom : IDENTIFIER '=' expr* # Assignment;

expr : IDENTIFIER               # StringVar
     | '('e1=expr')'            # Parentheses //not needed in abtract syntax
     |('!')e1=expr              # NOT
     |e1=expr ('&&') e2=expr    # AND
     |e1=expr ('||') e2=expr    # OR;

HVIDRUM : [ \t\n]+ -> skip ;
KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip; 


