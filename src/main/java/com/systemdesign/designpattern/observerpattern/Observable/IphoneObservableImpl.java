package com.systemdesign.designpattern.observerpattern.Observable;

import com.systemdesign.designpattern.observerpattern.Observer.NotificationObserverAlert;

import java.util.ArrayList;
import java.util.List;

public  class IphoneObservableImpl implements StockObservalbleIntfc{

    public List<NotificationObserverAlert> observerList = new ArrayList<>();
    public int stockCount=0;

    @Override
    public void add(NotificationObserverAlert observer) {
        observerList.add(observer);
    }


    @Override
    public void remove(NotificationObserverAlert observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationObserverAlert observer : observerList)
        {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int stockAdded) {
        if(stockCount ==0)
        {
            notifySubscribers();
        }
        stockCount = stockCount + stockAdded;
    }

    @Override
    public int getStockCount() {
        return stockCount;
    }
}