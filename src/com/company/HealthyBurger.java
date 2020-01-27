package com.company;

import java.util.Scanner;

public class HealthyBurger extends Burger {
    private double price;
    private int amount;
    private String addon1name = "Plastic";
    private double addon1price = 0.5D;
    private String addon2name = "Faat less bacon";
    private double addon2price = 0.75D;

    public HealthyBurger(double price) {
        super(price, "Has no Meat", "Healthy");
        this.price = price;
    }

    public void addAditions() {
        Scanner scan = new Scanner(System.in);
        System.out.println("do you want to add " + this.addon1name + " to your order");
        String answear = scan.nextLine();
        if (answear.equals("Y".toLowerCase())) {
            this.price += this.addon1price;
        } else {
            System.out.println("Addition passed");
        }

        System.out.println("do you want to add " + this.addon2name + " to your order");
        answear = scan.nextLine();
        if (answear.equals("Y".toLowerCase())) {
            this.price += this.addon2price;
        } else {
            System.out.println("Addition passed");
        }

        System.out.println("How many burgers would you like to order?");
        int amount = scan.nextInt();
        if (amount < 0) {
            System.out.println("Wrong amount given");
        } else {
            this.addToOrder(amount);
            System.out.println("Total price for" + amount + " burgers is " + this.price);
        }

    }

    public void addToOrder(int amount) {
        this.amount = amount;
        this.price *= (double)amount;
    }

    public double getPrice() {
        return this.price;
    }

    public int getAmount() {
        return this.amount;
    }

    public String getAddon1name() {
        return this.addon1name;
    }

    public double getAddon1price() {
        return this.addon1price;
    }

    public String getAddon2name() {
        return this.addon2name;
    }

    public double getAddon2price() {
        return this.addon2price;
    }
}
