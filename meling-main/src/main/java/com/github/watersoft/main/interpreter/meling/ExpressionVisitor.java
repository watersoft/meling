package com.github.watersoft.main.interpreter.meling;

import com.github.watersoft.main.interpreter.UnexpectedTokenException;
import com.github.watersoft.main.parser.meling.MelingBaseVisitor;
import com.github.watersoft.main.parser.meling.MelingParser;
import org.springframework.stereotype.Component;

/**
 * Visits the expressions of the parse tree and evaluates them.
 * Created by Wouter on 11/12/2014.
 */
@Component
public class ExpressionVisitor extends MelingBaseVisitor<Integer> {

    @Override
    public final Integer visitMulDivMod(final MelingParser.MulDivModContext ctx) {
        int left = visit(ctx.expression(0));
        int right = visit(ctx.expression(1));

        switch (ctx.op.getType()) {
            case MelingParser.MUL:
                return left * right;
            case MelingParser.DIV:
                return left / right;
            case MelingParser.MOD:
                return left % right;
            default:
                throw new UnexpectedTokenException(ctx.op);
        }
    }

    @Override
    public final Integer visitAddSub(final MelingParser.AddSubContext ctx) {
        int left = visit(ctx.expression(0));
        int right = visit(ctx.expression(1));

        switch (ctx.op.getType()) {
            case MelingParser.PLUS:
                return left + right;
            case MelingParser.MINUS:
                return left - right;
            default:
                throw new UnexpectedTokenException(ctx.op);
        }
    }

    @Override
    public final Integer visitUnary(final MelingParser.UnaryContext ctx) {
        switch (ctx.op.getType()) {
            case MelingParser.PLUS:
                return visit(ctx.expression());
            case MelingParser.MINUS:
                return -visit(ctx.expression());
            default:
                throw new UnexpectedTokenException(ctx.op);
        }
    }

    @Override
    public final Integer visitInt(final MelingParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override
    public final Integer visitParentheses(final MelingParser.ParenthesesContext ctx) {
        return visit(ctx.expression());
    }
}
