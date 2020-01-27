package com.company;
import java.util.Scanner;

public class Burger {

        private double price;
        private String meatType;
        private String breadType;
        private int amount;


        public Burger(double price, String meatType, String breadType) {
            this.price = price;
            this.meatType = meatType;
            this.breadType = breadType;
        }
    private String addon1name = "Lecctuce";
    private double addon1price = 0.5D;
    private String addon2name = "Bacon";
    private double addon2price = 0.75D;
    private String addon3name = "Tomato";
    private double addon3price = 0.3D;
    private String addon4name = "Cheese";
    private double addon4price = 0.75D;

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

            System.out.println("do you want to add " + this.addon3name + " to your order");
            answear = scan.nextLine();
            if (answear.equals("Y".toLowerCase())) {
                this.price += this.addon3price;
            } else {
                System.out.println("Addition passed");
            }

            System.out.println("do you want to add " + this.addon4name + " to your order");
            answear = scan.nextLine();
            if (answear.equals("Y".toLowerCase())) {
                this.price += this.addon4price;
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
            this.price *= (double)amount;
        }

        public double getPrice() {
            return this.price;
        }

        public String getMeatType() {
            return this.meatType;
        }

        public String getBreadType() {
            return this.breadType;
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

        public String getAddon3name() {
            return this.addon3name;
        }

        public double getAddon3price() {
            return this.addon3price;
        }

        public String getAddon4name() {
            return this.addon4name;
        }

        public double getAddon4price() {
            return this.addon4price;
        }
    }


