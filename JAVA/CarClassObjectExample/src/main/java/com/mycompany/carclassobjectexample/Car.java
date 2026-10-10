/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.carclassobjectexample;

/**
 *
 * @author HP
 */
public class Car {
    
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;
    
    public String getMake(){
        return make;
    }
    
    public String getModel(){
        return model;
    }
    
    public String getColor(){
        return color;
    }
    
    public int getDoors(){
        return doors;
    }
    
    public boolean isConvertible(){
        return convertible;
    }
    
    public void describeCar(){
        System.out.print(doors + "-Door " +
                color + " " +
                model + " " +
                (convertible ? "Convertible" : ""));
        
    }
    
}
