package com.github.watersoft.main;

import com.github.watersoft.main.config.SimpleConfiguration;
import com.github.watersoft.main.interpreter.simple.ExpressionVisitor;
import com.github.watersoft.main.interpreter.simple.ParseTreeFactory;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Launcher for the application.
 * Created by Wouter on 11/8/2014.
 */
public class Launcher {

    /**
     * Logger.
     */
    private static final Logger LOGGER = LoggerFactory.getLogger(Launcher.class);

    /**
     * Run the application.
     */
    public final void run() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SimpleConfiguration.class);

        LOGGER.info("Getting parse tree.");
        ParseTreeFactory factory = context.getBean(ParseTreeFactory.class);
        ParseTree tree = factory.getProgramTree("{1+2*3;1*2+3;(1+2)*3;}");

        LOGGER.info("Visiting parse tree.");
        ExpressionVisitor visitor = context.getBean(ExpressionVisitor.class);
        visitor.visit(tree);
    }

    /**
     * @param args Application arguments.
     */
    public static void main(final String[] args) {
        new Launcher().run();
    }
}
