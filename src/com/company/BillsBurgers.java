package com.company;

public class BillsBurgers {
    private Burger burger;
    private HealthyBurger healthyBurger;
    private DeluxeBurger deluxeBurger;

    public BillsBurgers(Burger burger, HealthyBurger healthyBurger, DeluxeBurger deluxeBurger) {
        this.burger = burger;
        this.healthyBurger = healthyBurger;
        this.deluxeBurger = deluxeBurger;
    }

    public void finalOrderPrice() {
        double finalPrice = 0.0D;
        finalPrice += this.getBurger().getPrice();
        System.out.println("Price of your order is: " + finalPrice);
        finalPrice += this.getDeluxeBurger().getPrice();
        System.out.println("Price of your order is: " + finalPrice);
        finalPrice += this.getHealthyBurger().getPrice();
        System.out.println("Price of your order is: " + finalPrice);
    }

    public Burger getBurger() {
        return this.burger;
    }

    public HealthyBurger getHealthyBurger() {
        return this.healthyBurger;
    }

    public DeluxeBurger getDeluxeBurger() {
        return this.deluxeBurger;
    }
}
