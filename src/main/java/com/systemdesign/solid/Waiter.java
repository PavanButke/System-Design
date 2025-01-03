package com.systemdesign.solid;

public class Waiter  implements  RestrauEmployee{
    @Override
    public void washDishes() {
        //not waiter's job
        //hence violated interface segmentation principle
    }

    @Override
    public void serveOrder() {
        System.out.println("Serving order");
    }

    @Override
    public void cookDish() {
        //not waiter's job
        //hence violated interface segmentation principle
    }
}
