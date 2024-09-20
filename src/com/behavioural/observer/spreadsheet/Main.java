package com.behavioural.observer.spreadsheet;

public class Main {
    public static void main(String[] args) {
        var dataSource = new DataSource();
        var spreadSheet = new SpreadSheet();
        var chart = new Chart();

        dataSource.addObserver(spreadSheet);
        dataSource.addObserver(chart);
        System.out.println(dataSource.getValue());
        dataSource.setValue(50);
        System.out.println(dataSource.getValue());
    }
}
