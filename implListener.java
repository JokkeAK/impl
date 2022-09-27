// Generated from impl.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link implParser}.
 */
public interface implListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(implParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(implParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(implParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(implParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(implParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(implParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(implParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(implParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(implParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(implParser.ExprContext ctx);
}