package com.company;

import java.util.Scanner;

public class outputAssignmnt2 {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);

        String firstName;
        int age;
        String height;
        double gpa;

        System.out.print( "What is your first name? " );
        firstName = keyboard.next();

        System.out.print( "How old are you? " );
        age = keyboard.nextInt();

        System.out.print( "How tall are you? " );
        height = keyboard.next();

        System.out.print( "What is your GPA? " );
        gpa = keyboard.nextDouble();

        System.out.print( "name: " + firstName +" age " + age +" height "+ height +" "+ "gps" + gpa);


    }
}
