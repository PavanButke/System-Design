package com.systemdesign.designpattern.observerpattern.Observable;

import com.systemdesign.designpattern.observerpattern.Observer.NotificationObserverAlert;

public  interface StockObservalbleIntfc {

    public void add(NotificationObserverAlert observerAlert);
    public  void remove(NotificationObserverAlert remove);
    public void notifySubscribers();
    public void setStockCount(int stockAdded);
    public int getStockCount();

}