package com.systemdesign.solid;

public class InvoiceDAO {
    InvoiceCalc invoice;

    public InvoiceDAO(InvoiceCalc invoice) {
        this.invoice = invoice;
    }

    public void saveToDb(){
        //now it has one reason to change , to store data
        //this satisfies single responsibility
        //.save()
    }
}
