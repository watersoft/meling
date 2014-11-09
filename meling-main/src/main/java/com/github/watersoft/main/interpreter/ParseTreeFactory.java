package com.github.watersoft.main.interpreter;

import com.github.watersoft.main.parser.SimpleLexer;
import com.github.watersoft.main.parser.SimpleParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.stereotype.Component;

/**
 * Simple grammar parse tree factory.
 * Created by Wouter on 11/8/2014.
 */
@Component
public class ParseTreeFactory {

    /**
     * @param input Input string for the program to parse.
     * @return The parse tree for the program rule.
     */
    public final ParseTree getProgramTree(final String input) {
        ANTLRInputStream stream = new ANTLRInputStream(input);
        SimpleLexer lexer = new SimpleLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SimpleParser parser = new SimpleParser(tokens);
        return parser.program();
    }
}
