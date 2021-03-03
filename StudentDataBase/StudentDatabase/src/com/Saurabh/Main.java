package com.Saurabh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    // Ask how many new Students we want to add
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of new Students : ");
        int numOfStudents=sc.nextInt();
        student[] Student = new student[numOfStudents];

        // create n numbers of students
        for(int i = 0 ; i<numOfStudents ; i++){
            Student[i] =new student();
            Student[i].enroll();
            Student[i].payTuitions();
        }
        for(int n = 0 ; n<numOfStudents ; n++){
            System.out.println(Student[n].toString());
        }
    }
}
