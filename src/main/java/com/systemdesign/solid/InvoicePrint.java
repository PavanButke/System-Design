package com.systemdesign.solid;

public class InvoicePrint {
    InvoiceCalc invoice;

    public InvoicePrint(InvoiceCalc invoice) {
        this.invoice = invoice;
    }
    public void printInvoice(){
        //now it has one reason to change , to print invoice data
        //this satisfies single responsibility
        //println
    }
}

