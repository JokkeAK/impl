import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class AST{};

abstract class Trace extends AST{
    String name;
    List<Boolean> input;
    List<Boolean> output;
    Trace(String name, List<Boolean> input, List<Boolean> output){this.name = name; this.input=input; this.output=output;}

}

/* Det her er fra den grammar som hjælpelæreren syntes var godt
class Latches extends AST{
    List<Latch> latches;
    Latches(List<Latch> latches){this.latches = latches;}
}

class Latch extends Command{
    String fromS, toS;
    Latch(String fromS, String toS){this.fromS=fromS; this.toS=toS;}
}

class Sequence extends AST{
    List<Assignment> seq;
    Sequence(List<Assignment> ass){this.seq = ass;}

    public Sequence(Command visit, AST visit1) {}
}


class Command extends AST {}

class Assignment extends Command {
    String varName;
    Expr e;
    Assignment(String varName, Expr e){this.varName=varName; this.e=e;}
    Assignment(){}
}
 */

abstract class Expr extends AST{
    String varName;
    Expr e;
    Expr(){};
    Expr(String varName, Expr e)
    {
        this.varName=varName;
        this.e=e;
    }
    //abstract public Boolean eval();

}

class StringVar extends Expr {
    public String value;
    StringVar(String value){
        this.value=value;}
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


