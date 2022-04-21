package com.netcracker.ch3;

public class CashRegister {

    private double purchase; //покупка
    private double payment; //оплата
    private double taxRate; //ставка налога
    private int itemCount; //количество товара
    private double totalTax;

    public CashRegister() {
    }

    public CashRegister(double taxRate) {
        this.taxRate = taxRate;
    }

    //фиксация продажи товара
    public void recordPurchase(double amount) {
        purchase += amount;
        itemCount++;
    }

    //оплата
    public void receivePayment(double amount) {
        payment += amount;
    }

    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }

    public void recordTaxablePurchase(double amount) {
        purchase += amount * (1 + taxRate / 100);
        totalTax += amount * taxRate / 100;
        itemCount++;
    }

    public int getItemCount() {
        return itemCount;
    }

    public double getTotalTax() {
        return totalTax;
    }
}
