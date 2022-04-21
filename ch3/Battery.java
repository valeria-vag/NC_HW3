package com.netcracker.ch3;

public class Battery {

    private double capacity;
    private double fullCapacity;

    public Battery(double capacity) {
        fullCapacity = capacity;
        this.capacity = capacity;
    }

    public void drain(double amount) {
        if (amount > capacity)
            System.out.println("Battery low");
        else
            capacity -= amount;
    }

    public void charge() {
        if (capacity >= 3000)
            System.out.println("Battery full");
        else
            this.capacity = fullCapacity;
    }

    public double getRemainingCapacity() {
        return capacity;
    }
}
