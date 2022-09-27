import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException{

	// we expect exactly one argument: the name of the input file
	if (args.length!=1) {
	    System.err.println("\n");
	    System.err.println("Impl Interpreter\n");
	    System.err.println("=================\n\n");
	    System.err.println("Please give as input argument a filename\n");
	    System.exit(-1);
	}
	String filename=args[0];

	// open the input file
	CharStream input = CharStreams.fromFileName(filename);
	    //new ANTLRFileStream (filename); // depricated
	
	// create a lexer/scanner
	implLexer lex = new implLexer(input);
	
	// get the stream of tokens from the scanner
	CommonTokenStream tokens = new CommonTokenStream(lex);
	
	// create a parser
	implParser parser = new implParser(tokens);
	
	// and parse anything from the grammar for "start"
	ParseTree parseTree = parser.start();

	// Construct an interpreter and run it on the parse tree
	Interpreter interpreter = new Interpreter();
	Expr result=interpreter.visit(parseTree);
    }
}

// We write an interpreter that implements interface
// "implVisitor<T>" that is automatically generated by ANTLR
// This is parameterized over a return type "<T>" which is in our case
// simply a Double.

//task 4 laves i main
class Interpreter extends AbstractParseTreeVisitor<Expr> implements implVisitor<Expr> {

	public Expr visitStart(implParser.StartContext ctx){return visit(ctx.e1);}

	@Override
	public Expr visitCommand(implParser.CommandContext ctx) {
		return null;
	}

	@Override
	public Expr visitBlock(implParser.BlockContext ctx) {
		return null;
	}

	@Override
	public Expr visitCondition(implParser.ConditionContext ctx) {
		return null;
	}

	@Override
	public Expr visitExpr(implParser.ExprContext ctx) {
		return null;
	}

	;

/*
	@Override
	public Double visitCommand(implParser.CommandContext ctx) {
		return null;
	}

	@Override
	public Double visitBlock(implParser.BlockContext ctx) {
		return null;
	}

	@Override
	public Double visitCondition(implParser.ConditionContext ctx) {
		return null;
	}

	@Override
	public Double visitExpr(implParser.ExprContext ctx) {
		return null;
	}

	;
    //public Double visitExpr(implParser.ExprContext ctx){return null;};
*/
}
