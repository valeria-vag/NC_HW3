package com.netcracker.ch3;

public class Main {

    public static void main(String[] args) {
        //cashRegisterTest();
        //sheetTest();
        //personTest();
        //studentTest();
        //batteryTest();
    }

    public static void cashRegisterTest() {
        System.out.println("CASH REGISTER TEST");

        CashRegister register = new CashRegister(13);

        register.recordPurchase(29.50);
        register.recordPurchase(9.25);
        register.recordTaxablePurchase(15.1);
        register.receivePayment(60);

        double change = register.giveChange();

        System.out.println("Item count: " + register.getItemCount());
        System.out.println("TotalTax: " + register.getTotalTax());

        if (change > 0) System.out.println("Your change: " + change);
        else if (change < 0)
            System.out.println("Not enough money: " + -change);
        else System.out.println("No change");

        System.out.println("===============================================");
    }

    public static void sheetTest() {
        System.out.println("SHEET");

        Sheet sheet = new Sheet();
        System.out.println("Initial: " + sheet);
        System.out.println("First: " + sheet.cutInHalf());
        System.out.println("Second: " + sheet.cutInHalf());
        System.out.println("Third: " + sheet.cutInHalf());
        System.out.println("Fourth: " + sheet.cutInHalf());
        System.out.println("===============================================");
    }

    public static void personTest() {
        System.out.println("PERSON");
        Person person = new Person("Valeria");
        Person person1 = new Person("Olya");
        Person person2 = new Person("Maria");
        Person person3 = new Person("Max");
        person.befriend(person1);
        person.befriend(person2);
        person.befriend(person3);

        System.out.println(person.getName() + "'s friends: " + person.getFriendNames());
        System.out.println("Count: " + person.getFriendCount());
        person.unfriend(person3);
        System.out.println("Max, go away!");
        System.out.println(person.getName() + "'s friends: " + person.getFriendNames());

        System.out.println("===============================================");
    }

    public static void studentTest() {
        System.out.println("STUDENT");

        Student student = new Student("Valeria");

        student.addQuiz(98);
        student.addQuiz(90);
        student.addQuiz(80);

        System.out.println(student.getName() + "'s result of test: ");
        System.out.println("Total score: " + student.getTotalScore());
        System.out.println("Average score: " + student.getAverageScore());

        System.out.println("===============================================");
    }
    public static void batteryTest() {
        System.out.println("BATTERY");

        Battery battery = new Battery(3000);
        System.out.println("Capacity of battery: " + battery.getRemainingCapacity());
        battery.drain(500);
        System.out.println("After drain: " + battery.getRemainingCapacity());
        battery.drain(300);
        System.out.println("After drain: " + battery.getRemainingCapacity());
        battery.drain(700);
        System.out.println("After drain: " + battery.getRemainingCapacity());
        battery.charge();
        System.out.println("After charge: " + battery.getRemainingCapacity());
        System.out.println("===============================================");
    }

}
