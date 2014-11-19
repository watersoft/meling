package com.watersoft.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * Abstract implementation of Scope interface.
 * Created by Wouter on 11/12/2014.
 */
public abstract class BaseScope implements Scope {
    /**
     * Parent scope.
     */
    private final Scope parent;

    /**
     * Symbols in this scope.
     */
    private final Map<String, Symbol> symbols = new HashMap<>();

    /**
     * Constructor.
     *
     * @param parent Parent scope.
     */
    public BaseScope(final Scope parent) {
        this.parent = parent;
    }

    @Override
    public final Symbol resolve(final String name) {
        if (symbols.containsKey(name)) {
            return symbols.get(name);
        } else {
            if (parent != null) {
                return parent.resolve(name);
            } else {
                return null;
            }
        }
    }

    @Override
    public final void define(final Symbol symbol) {
        symbols.put(symbol.getName(), symbol);
    }

    @Override
    public final Scope getParent() {
        return parent;
    }
}
