/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clientpizza;

/**
 *
 * @author HP
 */


import java.util.Scanner;

public class ClientPizza {

    public static void main(String[] args) {
        char pizza_code;
        int qty = 0;
        double price = 0.00;
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter Pizza Type : ");
        pizza_code = in.next().charAt(0);
        
        switch (pizza_code) {
            case 'v':
                price = 25.00;
                break;
                
            case 'c':
                price = 30.00;
                break;
                
            case 'p':
                price = 35.00;
                break;
                
            default:
                System.out.println("Invalid pizza type.");
                in.close();
                return;
        }
        
        System.out.print("Enter Quantity : ");
        qty = in.nextInt();
        
        // Fixed type capitalization from 'pizza' to 'Pizza'
        Pizza pizza = new Pizza(pizza_code, price, qty);
        
        System.out.println("\nBilling");
        System.out.println("*********");
        System.out.println(pizza);
        
        in.close();
    }
}
