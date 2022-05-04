package com.netcracker.ch8;

public class Main {
    public static void main(String[] args) {
        ComboLock lock1 = new ComboLock(10, 39, 0);
        System.out.println(lock1);
        lock1.turnRight(10);
        System.out.println("Right by 10");
        System.out.println("Current secret: " + lock1.getCurrentSecret());
        lock1.turnLeft(11);
        System.out.println("Left by 11");
        System.out.println("Current secret: " + lock1.getCurrentSecret());
        lock1.turnRight(1);
        System.out.println("Right by 1");
        System.out.println("Current secret: " + lock1.getCurrentSecret());
        System.out.println(lock1.open() ? "Is open" : "Is close. Try again." );

        lock1.reset();
        lock1.setSecret(5, 7, 6);
        System.out.println(lock1);
        lock1.turnRight(5);
        System.out.println("Right by 5");
        System.out.println("Current secret: " + lock1.getCurrentSecret());
        lock1.turnRight(2);
        System.out.println("Right by 2");
        System.out.println("Current secret: " + lock1.getCurrentSecret());
        lock1.turnLeft(1);
        System.out.println("Left by 1");
        System.out.println("Current secret: " + lock1.getCurrentSecret());
        System.out.println(lock1.open() ? "Is open" : "Is close. Try again." );

    }
}
