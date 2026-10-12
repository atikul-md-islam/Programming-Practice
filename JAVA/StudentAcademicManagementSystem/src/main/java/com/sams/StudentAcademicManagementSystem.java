/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.sams;

/**
 *
 * @author HP
 */

import java.util.Scanner;
import java.util.ArrayList;

public class StudentAcademicManagementSystem
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice = 0;

        while(choice != 9)
        {
            System.out.println("\n===================================");
            System.out.println("  STUDENT ACADEMIC MANAGEMENT SYSTEM");
            System.out.println("===================================");

            System.out.println("1. Register Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Student Information");
            System.out.println("5. Delete Student");
            System.out.println("6. Manage Credits");
            System.out.println("7. Check Graduation Eligibility");
            System.out.println("8. Generate Academic Report");
            System.out.println("9. Exit");

            System.out.println("====================================");

            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            if(choice == 1)
            {
                System.out.println("\n========= REGISTER STUDENT ==========");

                System.out.print("Enter student name: ");
                String name = input.nextLine();

                System.out.print("Enter student ID: ");
                int id = input.nextInt();
                input.nextLine();

                System.out.print("Enter university name: ");
                String university = input.nextLine();

                System.out.print("Enter course name: ");
                String course = input.nextLine();

                System.out.print("Enter GPA: ");
                double gpa = input.nextDouble();

                System.out.print("Enter completed credits: ");
                int credits = input.nextInt();
                input.nextLine();

                Student student = new Student(
                        name, id, university, course, gpa, credits);

                students.add(student);

                System.out.println("\nStudent registered successfully!");
                System.out.println(student);
            }
            else if(choice == 2)
            {
                System.out.println("\n============= ALL STUDENTS ==========");
                
                if(students.isEmpty())
                {
                    System.out.println("No students have been registered yet.");
                }
                else
                {
                    for(Student student : students)
                    {
                        System.out.println(student);
                    }
                }
            }
            else if(choice == 9)
            {
                System.out.println("\nThank you for using SAMS!");
            }
            else
            {
                System.out.println("This option has not been implemented yet.");
            }
            
        }

        input.close();
    }
}