package com.systemdesign.designpattern.observerpattern.Observer;

import com.systemdesign.designpattern.observerpattern.Observable.StockObservalbleIntfc;

public class EmailAlertObserverImpl implements  NotificationObserverAlert{
    public String emailId;
    public StockObservalbleIntfc observable;

    public EmailAlertObserverImpl(String emailId , StockObservalbleIntfc observable)
    {
        this.observable = observable;
        this.emailId= emailId;
    }

    @Override
    public void update() {
        String msg = "Stock Updated";
        sendMail(emailId , msg);
    }

    public void sendMail(String emailId , String msg){
        System.out.println("Mail Sent to: "+emailId+" :"+msg );
    }
}
