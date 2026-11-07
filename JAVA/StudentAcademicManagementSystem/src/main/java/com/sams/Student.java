/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sams;

/**
 *
 * @author HP
 */
public class Student
{
    //Attributes
    private String name;
    private int id;
    private String university;
    private String course;
    private double gpa;
    private int credits;
    
// Parameterized Constructor
    public Student(String name, int id, String university, String course, double gpa, int credits)
    {
        this.name = name;
        this.id = id;
        this.university = university;
        this.course = course;
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
    
    public String getUniversity()
    {
        return university;
    }
    
    public String getCourse()
    {
        return course;
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
    
    public void setUniversity(String university)
    {
        this.university = university;
    }
    
    public void setCourse(String course)
    {
        this.course = course;
    }
    
    public void setGpa(double gpa)
    {
        if(gpa >= 0.0 && gpa <= 4.0)
        {
            this.gpa = gpa;
        }
        else
        {
            System.out.println("Invalid GPA! GPA must be between 0.00 and 4.0");   
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
            System.out.println("Invalid credits! Credits cannot be negative.");
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
            System.out.println("Invalid input! Credits must be positive.");
        }
    }
    
    // Check Graduation Eligibility
    public boolean isEligibleForGraduation()
    {
        return credits >= 120 && gpa >= 2.0;
    }
    
    // Override toString Method
    @Override
    public String toString()
    {
        return "Student Name: " + name
                + ", ID: " + id
                + ", University: " + university
                + ", Course: " + course
                + ", GPA: " + gpa
                + ", Credits: " + credits;
    }
}
