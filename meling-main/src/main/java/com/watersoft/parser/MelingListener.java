// Generated from com\watersoft\parser\Meling.g4 by ANTLR 4.3
package com.watersoft.parser;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MelingParser}.
 */
public interface MelingListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MelingParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassMemberDeclaration(@NotNull MelingParser.ClassMemberDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MelingParser#classMemberDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassMemberDeclaration(@NotNull MelingParser.ClassMemberDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link MelingParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(@NotNull MelingParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parentheses}
	 * labeled alternative in {@link MelingParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(@NotNull MelingParser.ParenthesesContext ctx);

	/**
	 * Enter a parse tree produced by {@link MelingParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(@NotNull MelingParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MelingParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(@NotNull MelingParser.MethodDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MelingParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void enterMethodBody(@NotNull MelingParser.MethodBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MelingParser#methodBody}.
	 * @param ctx the parse tree
	 */
	void exitMethodBody(@NotNull MelingParser.MethodBodyContext ctx);

	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MelingParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(@NotNull MelingParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link MelingParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(@NotNull MelingParser.AddSubContext ctx);

	/**
	 * Enter a parse tree produced by {@link MelingParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull MelingParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MelingParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull MelingParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link MelingParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFieldDeclaration(@NotNull MelingParser.FieldDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MelingParser#fieldDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFieldDeclaration(@NotNull MelingParser.FieldDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MelingParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(@NotNull MelingParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MelingParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(@NotNull MelingParser.ProgramContext ctx);

	/**
	 * Enter a parse tree produced by the {@code unary}
	 * labeled alternative in {@link MelingParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary(@NotNull MelingParser.UnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unary}
	 * labeled alternative in {@link MelingParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary(@NotNull MelingParser.UnaryContext ctx);

	/**
	 * Enter a parse tree produced by {@link MelingParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(@NotNull MelingParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MelingParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(@NotNull MelingParser.TypeContext ctx);

	/**
	 * Enter a parse tree produced by the {@code int}
	 * labeled alternative in {@link MelingParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterInt(@NotNull MelingParser.IntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code int}
	 * labeled alternative in {@link MelingParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitInt(@NotNull MelingParser.IntContext ctx);

	/**
	 * Enter a parse tree produced by {@link MelingParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(@NotNull MelingParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MelingParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(@NotNull MelingParser.ClassDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MelingParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(@NotNull MelingParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MelingParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(@NotNull MelingParser.VariableDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by the {@code MulDivMod}
	 * labeled alternative in {@link MelingParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDivMod(@NotNull MelingParser.MulDivModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDivMod}
	 * labeled alternative in {@link MelingParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDivMod(@NotNull MelingParser.MulDivModContext ctx);

	/**
	 * Enter a parse tree produced by {@link MelingParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void enterMethodHeader(@NotNull MelingParser.MethodHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link MelingParser#methodHeader}.
	 * @param ctx the parse tree
	 */
	void exitMethodHeader(@NotNull MelingParser.MethodHeaderContext ctx);

	/**
	 * Enter a parse tree produced by {@link MelingParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassBodyDeclaration(@NotNull MelingParser.ClassBodyDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MelingParser#classBodyDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassBodyDeclaration(@NotNull MelingParser.ClassBodyDeclarationContext ctx);

	/**
	 * Enter a parse tree produced by {@link MelingParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(@NotNull MelingParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MelingParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(@NotNull MelingParser.ParameterContext ctx);

	/**
	 * Enter a parse tree produced by {@link MelingParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(@NotNull MelingParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MelingParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(@NotNull MelingParser.StatementContext ctx);

	/**
	 * Enter a parse tree produced by {@link MelingParser#classBody}.
	 * @param ctx the parse tree
	 */
	void enterClassBody(@NotNull MelingParser.ClassBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MelingParser#classBody}.
	 * @param ctx the parse tree
	 */
	void exitClassBody(@NotNull MelingParser.ClassBodyContext ctx);

	/**
	 * Enter a parse tree produced by {@link MelingParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(@NotNull MelingParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MelingParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(@NotNull MelingParser.ParameterListContext ctx);

	/**
	 * Enter a parse tree produced by {@link MelingParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(@NotNull MelingParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MelingParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(@NotNull MelingParser.BlockContext ctx);
}