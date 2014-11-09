package com.github.watersoft.main;

import com.github.watersoft.main.generated.HelloBaseListener;
import com.github.watersoft.main.generated.HelloLexer;
import com.github.watersoft.main.generated.HelloListener;
import com.github.watersoft.main.generated.HelloParser;
import com.github.watersoft.main.generated.HelloParser.RContext;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.springframework.stereotype.Component;

/**
 * Created by Wouter on 11/8/2014.
 */
@Component
public class Interpreter {

    /**
     *
     */
    public final void run() {
        ANTLRInputStream stream = new ANTLRInputStream("hello wouter");
        HelloLexer lexer = new HelloLexer(stream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        HelloParser parser = new HelloParser(tokens);
        RContext context =  parser.r();
        ParseTreeWalker walker = new ParseTreeWalker();
        HelloListener listener = new HelloBaseListener();
        walker.walk(listener, context);
    }
}
