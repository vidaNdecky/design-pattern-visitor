package com.teckos;

public class Livre extends Produit {
    private int price;
    private String title;

    public Livre(int cost, String ttl){
        this.price=cost;
        this.title=ttl;
    }

    public int getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int accept(PanierVisitor visitor) {
        return visitor.visit(this);
    }
}
