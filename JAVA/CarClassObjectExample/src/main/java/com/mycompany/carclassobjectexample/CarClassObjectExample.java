/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.carclassobjectexample;

/**
 *
 * @author HP
 */
public class CarClassObjectExample {

    public static void main(String[] args) {
    
        Car car = new Car();
        
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();
    }
}
