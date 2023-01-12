package com.teckos;

public class PanierVisitorImpl extends PanierVisitor {
    @Override
    public int visit(Livre livre) {
        int cost=0;
        //ici on applique une reduction de 5f si le prix du livre est superieur à 50
        if(livre.getPrice() > 50){
            cost = livre.getPrice()-5;
        }else cost = livre.getPrice();
        System.out.println("Le livre: "+livre.getTitle() + " coute ="+cost);
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        int cost = fruit.getPricePerKg()*fruit.getWeight();
        System.out.println(fruit.getName() + " coute = "+cost);
        return cost;
    }
}
