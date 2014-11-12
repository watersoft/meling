package com.github.watersoft.main.interpreter.meling;

import com.github.watersoft.main.parser.meling.MelingLexer;
import com.github.watersoft.main.parser.meling.MelingParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.stereotype.Component;

/**
 * Meling grammar parse tree factory.
 * Created by Wouter on 11/12/2014.
 */
@Component
public class ParseTreeFactory {
    /**
     * @param input Input string for the program to parse.
     * @return The parse tree for the program rule.
     */
    public final ParseTree getProgramTree(final String input) {
        ANTLRInputStream stream = new ANTLRInputStream(input);
        MelingLexer lexer = new MelingLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        MelingParser parser = new MelingParser(tokens);
        return parser.program();
    }
}
