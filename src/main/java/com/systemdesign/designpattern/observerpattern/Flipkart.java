package com.systemdesign.designpattern.observerpattern;

import com.systemdesign.designpattern.observerpattern.Observable.IphoneObservableImpl;
import com.systemdesign.designpattern.observerpattern.Observable.StockObservalbleIntfc;
import com.systemdesign.designpattern.observerpattern.Observer.EmailAlertObserverImpl;
import com.systemdesign.designpattern.observerpattern.Observer.MobileAlertObservableImpl;
import com.systemdesign.designpattern.observerpattern.Observer.NotificationObserverAlert;

public class Flipkart {
    public  static  void main(String ...args)
    {
        StockObservalbleIntfc iphoneObservable = new IphoneObservableImpl();

        NotificationObserverAlert observer1 = new EmailAlertObserverImpl("abcde@gmail.com", iphoneObservable);
        NotificationObserverAlert observer2 = new EmailAlertObserverImpl("pavan54@gmail.com" , iphoneObservable);
        NotificationObserverAlert observer3 = new MobileAlertObservableImpl("8623032252" , iphoneObservable);

        iphoneObservable.add(observer1);
        iphoneObservable.add(observer2);
        iphoneObservable.add(observer3);

        iphoneObservable.setStockCount(229);
    }
}
