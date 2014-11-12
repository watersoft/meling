// Generated from com\github\watersoft\main\parser\simple\Simple.g4 by ANTLR 4.3
package com.github.watersoft.main.parser.simple;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SimpleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SimpleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(@NotNull SimpleParser.ParenthesesContext ctx);

	/**
	 * Visit a parse tree produced by the {@code MulDivMod}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivMod(@NotNull SimpleParser.MulDivModContext ctx);

	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(@NotNull SimpleParser.AddSubContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimpleParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull SimpleParser.BlockContext ctx);

	/**
	 * Visit a parse tree produced by {@link SimpleParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull SimpleParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link SimpleParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull SimpleParser.IntContext ctx);
}