package com.github.watersoft.main.interpreter.simple;

import com.github.watersoft.main.interpreter.UnexpectedTokenException;
import com.github.watersoft.main.parser.simple.SimpleBaseVisitor;
import com.github.watersoft.main.parser.simple.SimpleParser;
import org.springframework.stereotype.Component;

/**
 * Visits the parse tree and evaluates expressions.
 * Created by Wouter on 11/9/2014.
 */
@Component
public class ExpressionVisitor extends SimpleBaseVisitor<Integer> {

    @Override
    public final Integer visitMulDivMod(final SimpleParser.MulDivModContext ctx) {
        int left = visit(ctx.expression(0));
        int right = visit(ctx.expression(1));

        switch (ctx.op.getType()) {
            case SimpleParser.MUL:
                return left * right;
            case SimpleParser.DIV:
                return left / right;
            case SimpleParser.MOD:
                return left % right;
            default:
                throw new UnexpectedTokenException(ctx.op);
        }
    }

    @Override
    public final Integer visitAddSub(final SimpleParser.AddSubContext ctx) {
        int left = visit(ctx.expression(0));
        int right = visit(ctx.expression(1));

        switch (ctx.op.getType()) {
            case SimpleParser.ADD:
                return left + right;
            case SimpleParser.SUB:
                return left - right;
            default:
                throw new UnexpectedTokenException(ctx.op);
        }
    }

    @Override
    public final Integer visitInt(final SimpleParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override
    public final Integer visitParentheses(final SimpleParser.ParenthesesContext ctx) {
        return visit(ctx.expression());
    }
}
