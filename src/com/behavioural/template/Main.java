package com.behavioural.template;

public class Main {
    public static void main(String[] args) {
        var transferTask = new TransferMoneyTask(new AuditTrail());
        transferTask.execute();

    }
}
