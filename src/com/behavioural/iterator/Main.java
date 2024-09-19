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
        System.out.println();

        IterBrowserHistory<String> iterBrowserHistory = new IterBrowserHistory<String>();
        iterBrowserHistory.push("www.facebook.com");
        iterBrowserHistory.push("www.google.com");
        iterBrowserHistory.push("www.tiktok.com");
        iterBrowserHistory.push("www.netflix.com");
        iterBrowserHistory.push("www.x.com");

        for (String url: iterBrowserHistory) {
            System.out.println(url);
        }
        System.out.println("Full iterable browser history listed above");
    }



}
