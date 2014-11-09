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
	 * Enter a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(@NotNull SimpleParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(@NotNull SimpleParser.ParenthesesContext ctx);

	/**
	 * Enter a parse tree produced by the {@code MulDivMod}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivMod(@NotNull SimpleParser.MulDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivMod}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivMod(@NotNull SimpleParser.MulDivModContext ctx);

	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(@NotNull SimpleParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(@NotNull SimpleParser.AddSubContext ctx);

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
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull SimpleParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull SimpleParser.IntContext ctx);
}