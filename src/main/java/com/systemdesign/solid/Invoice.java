package com.systemdesign.solid;
import  java.util.*;
public class Invoice {

    private Marker marker;
    private int qty;

    public Invoice(Marker marker, int qty) {
        this.marker = marker;
        this.qty = qty;
    }

    public int calcTotal(){

        //if we want to add tax or the convience fees , we'll need to modify the method
        //this violets single responsibility
        int price = ((marker.price)* this.qty);
        return  price;
    }

    public void printInvoice(){

        //if we want to add new section for offer off , we'll need to modify the method
        //this violets single responsibility
        //syso
    }

    public void saveToDb(){
        //if we want to add additional fees or convert to other currency , we'll need to modify the method
        //this violets single responsibility
        //.save()
    }
}
