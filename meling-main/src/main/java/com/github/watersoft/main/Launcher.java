package com.github.watersoft.main;

import com.github.watersoft.main.config.SimpleConfiguration;
import com.github.watersoft.main.interpreter.simple.BlockVisitor;
import com.github.watersoft.main.interpreter.simple.ParseTreeFactory;
import com.github.watersoft.main.parser.simple.SimpleParser;
import org.antlr.v4.runtime.tree.ParseTree;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
        ParseTreeFactory factory = context.getBean(ParseTreeFactory.class);

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter expressions to evaluate them.");
        System.out.println("Type 'exit' to stop the application.");
        String line;
        do {
            try {
                line = buffer.readLine();
            } catch (IOException e) {
                LOGGER.error(e.getMessage(), e);
                LOGGER.info("Terminating.");
                return;
            }

            LOGGER.info("Getting parse tree.");
            ParseTree tree = factory.getProgramTree("{" + line + ";}");
            LOGGER.info("Visiting parse tree.");
            BlockVisitor visitor = context.getBean(BlockVisitor.class);
            SimpleParser.BlockContext blockContext = (SimpleParser.BlockContext) tree.getChild(0);
            System.out.println(visitor.visit(blockContext));
        } while (!line.equalsIgnoreCase("exit"));
    }

    /**
     * @param args Application arguments.
     */
    public static void main(final String[] args) {
        new Launcher().run();
    }
}
