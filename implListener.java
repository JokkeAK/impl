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
	 * Enter a parse tree produced by {@link implParser#simInp}.
	 * @param ctx the parse tree
	 */
	void enterSimInp(implParser.SimInpContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#simInp}.
	 * @param ctx the parse tree
	 */
	void exitSimInp(implParser.SimInpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Latches}
	 * labeled alternative in {@link implParser#latchAct}.
	 * @param ctx the parse tree
	 */
	void enterLatches(implParser.LatchesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Latches}
	 * labeled alternative in {@link implParser#latchAct}.
	 * @param ctx the parse tree
	 */
	void exitLatches(implParser.LatchesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link implParser#updateCom}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(implParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link implParser#updateCom}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(implParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NOT}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNOT(implParser.NOTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NOT}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNOT(implParser.NOTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OR}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOR(implParser.ORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OR}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOR(implParser.ORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AND}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAND(implParser.ANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AND}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAND(implParser.ANDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(implParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(implParser.ParenthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringVar}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterStringVar(implParser.StringVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringVar}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitStringVar(implParser.StringVarContext ctx);
}