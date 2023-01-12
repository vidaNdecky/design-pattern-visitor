package com.teckos;
import org.jetbrains.annotations.NotNull;

public class Client {
    public static void main(String[] args) {
        Produit[] items = new Produit[]{new Livre(20, "Une si longue lettre"),new Livre(100, "React Framework"),
                new Fruit(10, 2, "Banane"), new Fruit(5, 5, "Pomme")};

        int total = calculatePrice(items);
        System.out.println("Coût Total du panier = "+total);
    }

    private static int calculatePrice(Produit[] items) {
        PanierVisitor visitor = new PanierVisitorImpl();
        int sum=0;
        for(Produit item : items){
            sum = sum + item.accept(visitor);
        }
        return sum;
    }
}
