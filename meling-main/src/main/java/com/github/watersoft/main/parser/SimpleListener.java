// Generated from com\github\watersoft\main\parser\Simple.g4 by ANTLR 4.3
package com.github.watersoft.main.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SimpleParser}.
 */
public interface SimpleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull SimpleParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull SimpleParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull SimpleParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull SimpleParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimpleParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull SimpleParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull SimpleParser.BlockContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull SimpleParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull SimpleParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimpleParser#primary}.
	 * @param ctx the parse tree
	 */
	void enterPrimary(@NotNull SimpleParser.PrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#primary}.
	 * @param ctx the parse tree
	 */
	void exitPrimary(@NotNull SimpleParser.PrimaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link SimpleParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(@NotNull SimpleParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SimpleParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(@NotNull SimpleParser.LiteralContext ctx);
}