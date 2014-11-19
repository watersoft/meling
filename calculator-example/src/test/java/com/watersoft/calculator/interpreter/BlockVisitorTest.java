package com.watersoft.calculator.interpreter;

import com.google.common.collect.Lists;
import com.watersoft.calculator.config.CalculatorConfiguration;
import com.watersoft.calculator.parser.SimpleParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * Tests BlockVisitor and ExpressionVisitor as a result.
 * Created by Wouter on 11/19/2014.
 */
public class BlockVisitorTest {

    private final ApplicationContext context = new AnnotationConfigApplicationContext(CalculatorConfiguration.class);

    @Test
    public void testVisitBlock() {
        testProgram("{}", Lists.newArrayList());
        testProgram("{0;}", Lists.newArrayList(0));
        testProgram("{00;}", Lists.newArrayList(0));
        testProgram("{000;}", Lists.newArrayList(0));
        testProgram("{1;}", Lists.newArrayList(1));
        testProgram("{11;}", Lists.newArrayList(11));
        testProgram("{111;}", Lists.newArrayList(111));
        testProgram("{0;0;}", Lists.newArrayList(0, 0));
        testProgram("{0;1;}", Lists.newArrayList(0, 1));
        testProgram("{999999999;}", Lists.newArrayList(999999999));
        testProgram("{2147483647;}", Lists.newArrayList(2147483647));

        testProgram("{0+0;}", Lists.newArrayList(0));
        testProgram("{0 + 0;}", Lists.newArrayList(0));
        testProgram("{0+1;}", Lists.newArrayList(1));
        testProgram("{1+0;}", Lists.newArrayList(1));
        testProgram("{1+1;}", Lists.newArrayList(2));
        testProgram("{1+1;2+2;}", Lists.newArrayList(2, 4));
        testProgram("{1+1;2+2;3+3;}", Lists.newArrayList(2, 4, 6));
        testProgram("{1+2+3;}", Lists.newArrayList(6));

        testProgram("{0-0;}", Lists.newArrayList(0));
        testProgram("{0 - 0;}", Lists.newArrayList(0));
        testProgram("{0-1;}", Lists.newArrayList(-1));
        testProgram("{1-0;}", Lists.newArrayList(1));
        testProgram("{1-1;}", Lists.newArrayList(0));
        testProgram("{1-1;2-2;}", Lists.newArrayList(0, 0));
        testProgram("{1-1;2-2;3-3;}", Lists.newArrayList(0, 0, 0));
        testProgram("{1-2-3;}", Lists.newArrayList(-4));

        testProgram("{0*0;}", Lists.newArrayList(0));
        testProgram("{0 * 0;}", Lists.newArrayList(0));
        testProgram("{0*1;}", Lists.newArrayList(0));
        testProgram("{1*0;}", Lists.newArrayList(0));
        testProgram("{1*1;}", Lists.newArrayList(1));
        testProgram("{1*1;2*2;}", Lists.newArrayList(1, 4));
        testProgram("{1*1;2*2;3*3;}", Lists.newArrayList(1, 4, 9));
        testProgram("{1*2*3;}", Lists.newArrayList(6));


        testProgram("{0/1;}", Lists.newArrayList(0));
        testProgram("{1/1;}", Lists.newArrayList(1));
        testProgram("{1/1;2/2;}", Lists.newArrayList(1, 1));
        testProgram("{1/1;2/2;3/3;}", Lists.newArrayList(1, 1, 1));
        testProgram("{1/2/3;}", Lists.newArrayList(0));


        testProgram("{0%1;}", Lists.newArrayList(0));
        testProgram("{1%1;}", Lists.newArrayList(0));
        testProgram("{1%1;2%2;}", Lists.newArrayList(0, 0));
        testProgram("{1%1;2%2;3%3;}", Lists.newArrayList(0, 0, 0));
        testProgram("{1%2%3;}", Lists.newArrayList(1));
    }

    @Test
    public void testArithmeticException() {
        testProgramException("{0/0;}", ArithmeticException.class);
        testProgramException("{0 / 0;}", ArithmeticException.class);
        testProgramException("{1/0;}", ArithmeticException.class);

        testProgramException("{0%0;}", ArithmeticException.class);
        testProgramException("{0 % 0;}", ArithmeticException.class);
        testProgramException("{1%0;}", ArithmeticException.class);
    }

    @Test
    public void testNumberFormatException() {
        testProgramException("{2147483648;}", NumberFormatException.class);
        testProgramException("{9999999999;}", NumberFormatException.class);
    }

    public void testProgram(String program, List<Integer> answers) {
        // Given
        ParseTreeFactory parseTreeFactory = context.getBean(ParseTreeFactory.class);
        ParseTree parseTree = parseTreeFactory.getProgramTree(program);
        SimpleParser.BlockContext blockContext = (SimpleParser.BlockContext) parseTree.getChild(0);
        BlockVisitor blockVisitor = context.getBean(BlockVisitor.class);

        // When
        List<Integer> results = blockVisitor.visitBlock(blockContext);

        // Then
        assertEquals(answers, results);
    }

    public <T extends Throwable> void testProgramException(String program, Class<T> type) {
        // Given
        ParseTreeFactory parseTreeFactory = context.getBean(ParseTreeFactory.class);
        ParseTree parseTree = parseTreeFactory.getProgramTree(program);
        SimpleParser.BlockContext blockContext = (SimpleParser.BlockContext) parseTree.getChild(0);
        BlockVisitor blockVisitor = context.getBean(BlockVisitor.class);

        // When
        try {
            blockVisitor.visitBlock(blockContext);
        } catch (Throwable ex) {
            if (type.isInstance(ex)) {
                return;
            }
        }

        // Then
        fail("Expected exception " + type.toString());
    }
}
