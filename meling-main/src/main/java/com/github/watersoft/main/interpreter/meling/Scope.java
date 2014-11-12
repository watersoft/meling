package com.github.watersoft.main.interpreter.meling;

/**
 * A scope in the meling grammar.
 * Created by Wouter on 11/12/2014.
 */
public interface Scope {
    /**
     * @return The name of the scope.
     */
    String getName();

    /**
     * @return The parent scope.
     */
    Scope getParent();

    /**
     * Define a symbol in this scope.
     *
     * @param symbol The symbol to define.
     */
    void define(Symbol symbol);

    /**
     * Find the symbol for the given name in this scope, or in the parent scope if it is not here.
     *
     * @param name Name of the symbol to find.
     * @return The symbol associated with the given name.
     */
    Symbol resolve(String name);
}
