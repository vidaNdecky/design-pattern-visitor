package com.teckos;

public abstract class PanierVisitor {
    public abstract int visit(Livre livre);
    public abstract int visit(Fruit fruit);
}
