package com.netcracker.ch9.employee;

public class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double weeklyPay(int hoursWorked) {
        return 0.0d;
    }
}
