package com.github.watersoft.main.interpreter.simple;

import com.github.watersoft.main.parser.simple.SimpleBaseVisitor;
import com.github.watersoft.main.parser.simple.SimpleParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Visits the parse tree and evaluates blocks.
 * Created by Wouter on 11/12/2014.
 */
@Component
public class BlockVisitor extends SimpleBaseVisitor<List<Integer>> {

    /**
     * Expression evaluator.
     */
    @Autowired
    private ExpressionVisitor expressionVisitor;

    @Override
    public final List<Integer> visitBlock(final SimpleParser.BlockContext ctx) {
        return ctx.expression().stream().map(expressionVisitor::visit).collect(Collectors.toList());
    }
}
