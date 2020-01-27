package com.company;
import java.util.Scanner;

public class DeluxeBurger extends Burger {
    private double price;
    private int amount;


    public DeluxeBurger(double price) {
        super(price, "Fat as fuck", "White");
        this.price = price;
    }

    private double addon1Price = 1.20;
    private String addon1Name = "Fries";
    private double addon2Price = 2.20;
    private String addon2Name = "Cola";

    public void addAditions() {
        Scanner scan = new Scanner(System.in);
        System.out.println("do you want to add " + this.addon1Name + " to your order");
        String answear = scan.nextLine();
        if (answear.equals("Y".toLowerCase())) {
            this.price += this.addon1Price;
        } else {
            System.out.println("Addition passed");
        }

        System.out.println("do you want to add " + this.addon2Name + " to your order");
        answear = scan.nextLine();
        if (answear.equals("Y".toLowerCase())) {
            this.price += this.addon2Price;
        } else {
            System.out.println("Addition passed");
        }

        System.out.println("How many burgers would you like to order?");
        int amount = scan.nextInt();
        if (amount <= 0) {
            System.out.println("Wrong amount given");
        } else {
            this.addToOrder(amount);
            System.out.println("Total price for" + amount + " burgers is " + this.price);
        }

    }

    public void addToOrder(int amount) {
        this.amount = amount;
        this.price *= (double) amount;
    }

    public double getAddone1Price() {
        return this.addon1Price;
    }

    public String getAddon1Name() {
        return this.addon1Name;
    }

    public double getAddon2Price() {
        return this.addon2Price;
    }

    public String getAddon2Name() {
        return this.addon2Name;
    }

}