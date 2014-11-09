package com.github.watersoft.main;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.pattern.ParseTreeMatch;
import org.antlr.v4.runtime.tree.pattern.ParseTreePattern;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationTargetException;

/**
 * Created by Wouter on 11/8/2014.
 */
@Component
public class Interpreter {

    /**
     *
     */
    private static final String LEXER_CLASS = "com.github.watersoft.main.parser.HelloLexer";

    /**
     *
     */
    private static final String PARSER_CLASS = "com.github.watersoft.main.parser.HelloParser";

    /**
     *
     */
    private static final String START_RULE_NAME = "r";

    /**
     *
     */
    public final void run() {
        ANTLRInputStream stream = new ANTLRInputStream("hello wouter");
        Lexer lexer = null;
        try {
            lexer = (Lexer) Class.forName(LEXER_CLASS).getConstructor(CharStream.class).newInstance(stream);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        Parser parser = null;
        try {
            parser = (Parser) Class.forName(PARSER_CLASS).getConstructor(TokenStream.class).newInstance(tokens);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        ParseTree tree = null;
        try {
            tree = (ParseTree) parser.getClass().getMethod(START_RULE_NAME).invoke(parser);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        ParseTreePattern pattern = parser.compileParseTreePattern("hello <ID>", parser.getRuleIndex("r"));
        ParseTreeMatch match = pattern.match(tree);

        if (match.succeeded()) {
            String id = match.get("ID").getText();
            System.out.println("Greetings, " + id);
        }
    }
}
