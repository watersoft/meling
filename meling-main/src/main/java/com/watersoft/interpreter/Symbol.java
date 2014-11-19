package com.watersoft.interpreter;

/**
 * A symbol in the meling grammar.
 * Created by Wouter on 11/12/2014.
 */
public class Symbol {
    /**
     * Name of the symbol.
     */
    private final String name;

    /**
     * Type of the symbol.
     */
    private Type type;

    /**
     * Constructor.
     *
     * @param name Name of the symbol.
     */
    public Symbol(final String name) {
        this.name = name;
    }

    /**
     * Constructor.
     *
     * @param name Name of the symbol.
     * @param type Type of the symbol.
     */
    public Symbol(final String name, final Type type) {
        this.name = name;
        this.type = type;
    }

    /**
     * Gets the name of this symbol.
     *
     * @return Name of this symbol.
     */
    public final String getName() {
        return name;
    }

    /**
     * Gets the type of this symbol.
     *
     * @return The name of this symbol.
     */
    public final Type getType() {
        return type;
    }
}
