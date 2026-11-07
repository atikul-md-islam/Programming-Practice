/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clientpizza;

/**
 *
 * @author HP
 */


public class Pizza {

    private char pizzaCode;
    private double price;
    private int quantity;

    public Pizza(char pizzaCode, double price, int quantity) {
        setPizzaInfo(pizzaCode, price, quantity);
    }

    private void setPizzaInfo(char pizzaCode, double price, int quantity) {
        this.pizzaCode = pizzaCode;
        this.price = price;
        this.quantity = quantity;
    }

    public char getPizzaCode() {
        return pizzaCode;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getPizzaType() {
        switch (pizzaCode) {
            case 'v':
                return "Vegetable Pizza";
            case 'c':
                return "Chicken Pizza";
            case 'p':
                return "Pepperoni Pizza";
            default:
                return "Unknown Pizza";
        }
    }

    public double calcTotalPrice() {
        return price * quantity;
    }

    @Override
    public String toString() {
        return String.format(
            "Pizza Type : %s%nPrice : RM%.2f%nQuantity : %d%nTotal Price : RM%.2f",
            getPizzaType(),
            getPrice(),
            getQuantity(),
            calcTotalPrice()
        );
    }
}