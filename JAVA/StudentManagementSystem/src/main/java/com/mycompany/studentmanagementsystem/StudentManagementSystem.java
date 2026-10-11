/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studentmanagementsystem;

/**
 *
 * @author HP
 */
public class StudentManagementSystem
{

    public static void main(String[] args)
    {
        // Create two Student objects
        Student student1 = new Student("Jimmy", 1001, 3.6, 95);
        Student student2 = new Student("Ali", 1002, 2.8, 130);
        
        // Display Student Details
        System.out.println(student1);
        System.out.println(student2);
        
        // Add credits to Jimmy
        student1.addCredits(20);
        
        // Display updated details
        System.out.println("Updated Student: " + student1);
        
        // Check Jimmy's eligibility
        if(student1.isEligibleForGraduation())
        {
            System.out.println("Jimmy is eligible for graduation.");
        }
        
        else
        {
            System.out.println("Jimmy is not eligible for graduation.");
        }
        
        // Check Ali's eligibility
        if(student2.isEligibleForGraduation())
        {
            System.out.println("Ali is eligible for graduation.");
        }
        
        else
        {
            System.out.println("Ali is not eligible for graduation.");
        }    
    }
}
