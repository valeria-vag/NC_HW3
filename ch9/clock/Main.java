package com.netcracker.ch9.clock;

public class Main {
    public static void main(String[] args) {

        Clock clock = new Clock();
        WorldClock worldClock = new WorldClock(3);
        System.out.println("Now: " + clock.getTime());
        System.out.println(worldClock);
        clock.setAlarm(7,30);
        System.out.println("Set alarm");
        System.out.println("Now: " + clock.getTime());
    }
}
