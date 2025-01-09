package com.systemdesign.designpattern.observerpattern.Observer;

import com.systemdesign.designpattern.observerpattern.Observable.StockObservalbleIntfc;

public class MobileAlertObservableImpl implements  NotificationObserverAlert {
    String phoneNum;
    StockObservalbleIntfc observalble;

    public MobileAlertObservableImpl(String phoneNum, StockObservalbleIntfc observalble) {
        this.phoneNum = phoneNum;
        this.observalble = observalble;
    }


    @Override
    public void update() {
        String msg = "Stock Updated!";
        sendMsgOnPhone(phoneNum , msg);
    }

    public void sendMsgOnPhone(String phoneNum , String msg)
    {
        System.out.println("Msg sent to: "+ phoneNum+" :"+msg);
    }
}
