import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public abstract class AST{

}



abstract class Trace extends AST{
    String name;
    List<Boolean> input;
    List<Boolean> output;
    Trace(String name, List<Boolean> input, List<Boolean> output){this.name = name; this.input=input; this.output=output;}
    public String toString(Environment e)
    {
        return e.toString();
    };
}

class Simulation extends AST{
    String identifier;
    String input;
    List<Boolean> binary;

    Simulation(String identifier, String input){
        this.identifier = identifier;
        this.input = input;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == 0){
                this.binary.add(false);
            } else{
                this.binary.add(true);
            }
        }
    }
}

class Outputs extends AST{
    String output;
    Outputs(String output){
        this.output = output;
    }
}

class Latch extends AST{
    String input;
    String output;
    String identifier;
    Latch(String identifier){this.identifier=identifier;this.input="0";this.output="0";}
    /*public void initialize(Environment e, String name){
        e.setVariable(name,false);
    }
    public void nextCycle(Environment env,Expr e,String name){
        env.setVariable(name,env.getVariable(e.identifier));
    }*/
}

class Assignment extends AST{
    String identifier;
    Expr e;
    Assignment(String identifier, Expr e){this.identifier=identifier; this.e=e;}
}

abstract class Expr extends AST{
    String identifier;
    Expr e;
    Expr(){};
    Expr(String identifier, Expr e)
    {
        this.identifier=identifier;
        this.e=e;
    }
    abstract public Boolean eval(Environment env);
}

class Identifier extends Expr {
    public String identifier;
    Identifier(String identifier){
        this.identifier=identifier;}

    @Override
    public Boolean eval(Environment env){
        return env.getVariable(this.identifier);}
    }

class NOT extends Expr{
    Expr e1;
    NOT(Expr e1){this.e1=e1;}

    @Override
    public Boolean eval(Environment env) {
        return !env.getVariable(e1.identifier);
    }
}

class AND extends Expr{
    Expr e1, e2;
    AND(Expr e1, Expr e2){this.e1=e1; this.e2=e2;}

    @Override
    public Boolean eval(Environment env) {
        return env.getVariable(e1.identifier) && env.getVariable(e2.identifier);
    }
}

class OR extends Expr{
    Expr e1, e2;
    OR(Expr e1, Expr e2){this.e1=e1; this.e2=e2;}

    @Override
    public Boolean eval(Environment env) {
        return env.getVariable(e1.identifier) || env.getVariable(e2.identifier);
    }
}
