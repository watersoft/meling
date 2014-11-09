package com.github.watersoft.main.interpreter;

import org.antlr.v4.runtime.Token;

/**
 * Exception for reporting unexpected tokens in the parse tree.
 * Created by Wouter on 11/9/2014.
 */
public class UnexpectedTokenException extends RuntimeException {
    /**
     * Constructor.
     *
     * @param token Token which was unexpected.
     */
    public UnexpectedTokenException(final Token token) {
        super("Unexpected token: " + token.toString());
    }
}
