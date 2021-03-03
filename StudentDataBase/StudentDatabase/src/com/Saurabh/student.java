package com.Saurabh;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class student {
    private String firstname;
    private String lastname;
    private int  gradeYear;
    private String StudentID;
    private String courses = ""  ;
    private int tuitionBalance;
    private static int CostofCourse = 600;
    private static int id=1000;

    //Constructor : promt user to enter student's name and year
    public student()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter User's First Name: ");
        this.firstname=sc.nextLine();

        System.out.print("Enter User's Last Name: ");
        this.lastname=sc.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior\nEnter User's grade year: ");
        this.gradeYear=sc.nextInt();

        setStudentId();


    }
    // Generate unique ID
    private void setStudentId(){
        id++;
    this.StudentID = gradeYear + "" + id;

    }
    // Enroll in course
    public void enroll() {
        do {

            System.out.print("Enter Course to enroll (Q to quit) :");
            Scanner sc = new Scanner(System.in);
            String course = sc.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + CostofCourse;
            }
            else{
                break;
            }
        }
        while(1 !=0);
    }

    // View balance
    public void viewBalance(){
        System.out.println("Your Balance : " + tuitionBalance);
    }
    // Pay Tuition
    public void payTuitions(){
        viewBalance();
        System.out.print("Pay your tuition Fees: Rs ");
        Scanner sc = new Scanner(System.in);
        int payment = sc.nextInt();
        tuitionBalance = tuitionBalance -payment;
        System.out.println("Thank you for your Payment of Rs: " + payment);
        viewBalance();

    }
    // Show Status
    public String toString(){
        return  "Name :"  + firstname + " " + lastname +
                "\nGrade year:" + gradeYear +
                "\nStudent Id :" + id +
                "\nCourse Enrolled :" + courses +
                "\nBalance :" +tuitionBalance;
    }
}
