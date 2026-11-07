/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentmanagementsystem;

/**
 *
 * @author HP
 */
public class Student {
    
    // Attributes
    private String name;
    private int id;
    private double gpa;
    private int credits;
    
    // Parameterized Constructor
    public Student(String name, int id, double gpa, int credits)
    {
        this.name = name;
        this.id = id;
        setGpa(gpa);
        setCredits(credits);
    }
    
    // Getters
    public String getName()
    {
        return name;
    }
    
    public int getId()
    {
        return id;
    }
    
    public double getGpa()
    {
        return gpa;
    }
    
    public int getCredits()
    {
        return credits;
    }
    
    // Setters
    public void setName(String name)
    {
        this.name = name;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void setGpa(double gpa)
    {
        if(gpa >= 0.0 && gpa <= 4.0)
        {
            this.gpa = gpa;
        }
        else
        {
            System.out.println("Invalid GPA!");
        }
    }
    
    public void setCredits(int credits)
    {
        if(credits >= 0)
        {
            this.credits = credits;
        }
        else
        {
            System.out.println("Invalid Credits!");
        }
    }
    
    // Add Credits Method
    public void addCredits(int credits)
    {
        if(credits > 0)
        {
            this.credits = this.credits + credits;
        }
        else
        {
            System.out.println("Credit must be positive!");
        }
    }
        
    //Check Graduation Eligibility
    public boolean isEligibleForGraduation()
    {
        return credits >= 120 && gpa >= 2.0;
    }
    
    // Override toString() Method
    @Override
    public String toString()
    {
        return "Student Name: " + name
                + ", ID: " + id
                + ", GPA: " + gpa
                + ", Credits: " + credits;
    }
    
}
