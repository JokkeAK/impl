// Generated from impl.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link implParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface implVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(implParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#simInp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimInp(implParser.SimInpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Latches}
	 * labeled alternative in {@link implParser#latchAct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatches(implParser.LatchesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Assignment}
	 * labeled alternative in {@link implParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(implParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sequence}
	 * labeled alternative in {@link implParser#commands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence(implParser.SequenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NOT}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNOT(implParser.NOTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OR}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOR(implParser.ORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AND}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAND(implParser.ANDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(implParser.ParenthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringVar}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringVar(implParser.StringVarContext ctx);
}