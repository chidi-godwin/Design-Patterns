package com.behavioural.iterator;

public class Main {
    public static void main(String[] args) {
        var browserHistory = new BrowserHistory();
        browserHistory.push("www.facebook.com");
        browserHistory.push("www.google.com");
        browserHistory.push("www.tiktok.com");
        browserHistory.push("www.netflix.com");
        browserHistory.push("www.x.com");

        var historyIterator = browserHistory.iterator();
        while (historyIterator.hasNext()) {
            System.out.println(historyIterator.current());
            historyIterator.next();
        }
        System.out.println("Full browser history listed above");
    }
}
