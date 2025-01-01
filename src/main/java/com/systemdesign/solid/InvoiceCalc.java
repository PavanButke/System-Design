package com.systemdesign.solid;
import  java.util.*;
public class InvoiceCalc {

    private Marker marker;
    private int qty;

    public InvoiceCalc(Marker marker, int qty) {
        this.marker = marker;
        this.qty = qty;
    }

    public int calcTotal() {

        //now it has one reason to change
        //this satisfies single responsibility
        int price = ((marker.price) * this.qty);
        return price;
    }
}