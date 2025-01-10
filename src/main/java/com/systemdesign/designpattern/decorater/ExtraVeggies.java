package com.systemdesign.designpattern.decorater;

public class ExtraVeggies extends  ToppingDecorater{

    BasePizza pizzaBasic;

    public ExtraVeggies(BasePizza pizzaBasic) {
        this.pizzaBasic = pizzaBasic;
    }

    @Override
    public int cost() {
        return this.pizzaBasic.cost()+11;
    }
}
