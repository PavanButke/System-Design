package com.systemdesign.designpattern.decorater;

public class ExtraCheese extends ToppingDecorater{
    BasePizza pizzaBasic;

    public  ExtraCheese(BasePizza pizza)
    {
        this.pizzaBasic= pizza;
    }
    @Override
    public int cost() {
        return this.pizzaBasic.cost()+112;
    }
}
