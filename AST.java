import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class AST{};

abstract class Latch extends AST{
    abstract public Integer eval();
}

abstract class Assignment extends AST{
    String varname;
    Expr e;
    Assignment(String varname, Expr e){this.varname=varname; this.e=e;}
}

abstract class Trace extends AST{}

abstract class Expr extends AST{
}

class Signal extends Expr {
    public String value;
    public Signal(String s) {
        value = s;
    }
}


class NOT extends Expr{
    Expr e1;
    NOT(Expr e1){this.e1=e1;}
}

class AND extends Expr{
    Expr e1, e2;
    AND(Expr e1, Expr e2){this.e1=e1; this.e2=e2;}
}

class OR extends Expr{
    Expr e1, e2;
    OR(Expr e1, Expr e2){this.e1=e1; this.e2=e2;}
}


