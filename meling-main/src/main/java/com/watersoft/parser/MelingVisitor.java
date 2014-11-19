// Generated from com\watersoft\parser\Meling.g4 by ANTLR 4.3
package com.watersoft.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MelingParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MelingVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MelingParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassMemberDeclaration(@NotNull MelingParser.ClassMemberDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link MelingParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(@NotNull MelingParser.ParenthesesContext ctx);

	/**
	 * Visit a parse tree produced by {@link MelingParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(@NotNull MelingParser.MethodDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link MelingParser#methodBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodBody(@NotNull MelingParser.MethodBodyContext ctx);

	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MelingParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(@NotNull MelingParser.AddSubContext ctx);

	/**
	 * Visit a parse tree produced by {@link MelingParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(@NotNull MelingParser.AssignmentContext ctx);

	/**
	 * Visit a parse tree produced by {@link MelingParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldDeclaration(@NotNull MelingParser.FieldDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link MelingParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(@NotNull MelingParser.ProgramContext ctx);

	/**
	 * Visit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link MelingParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary(@NotNull MelingParser.UnaryContext ctx);

	/**
	 * Visit a parse tree produced by {@link MelingParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(@NotNull MelingParser.TypeContext ctx);

	/**
	 * Visit a parse tree produced by the {@code int}
	 * labeled alternative in {@link MelingParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt(@NotNull MelingParser.IntContext ctx);

	/**
	 * Visit a parse tree produced by {@link MelingParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(@NotNull MelingParser.ClassDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link MelingParser#variableDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableDeclaration(@NotNull MelingParser.VariableDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by the {@code MulDivMod}
	 * labeled alternative in {@link MelingParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDivMod(@NotNull MelingParser.MulDivModContext ctx);

	/**
	 * Visit a parse tree produced by {@link MelingParser#methodHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodHeader(@NotNull MelingParser.MethodHeaderContext ctx);

	/**
	 * Visit a parse tree produced by {@link MelingParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBodyDeclaration(@NotNull MelingParser.ClassBodyDeclarationContext ctx);

	/**
	 * Visit a parse tree produced by {@link MelingParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(@NotNull MelingParser.ParameterContext ctx);

	/**
	 * Visit a parse tree produced by {@link MelingParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(@NotNull MelingParser.StatementContext ctx);

	/**
	 * Visit a parse tree produced by {@link MelingParser#classBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassBody(@NotNull MelingParser.ClassBodyContext ctx);

	/**
	 * Visit a parse tree produced by {@link MelingParser#parameterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterList(@NotNull MelingParser.ParameterListContext ctx);

	/**
	 * Visit a parse tree produced by {@link MelingParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(@NotNull MelingParser.BlockContext ctx);
}