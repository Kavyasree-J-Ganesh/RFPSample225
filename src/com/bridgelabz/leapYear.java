package com.bridgelabz;

import java.util.Scanner;

public class leapYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a year");
        int year = in.nextInt();
        System.out.println(year);

        if ((year % 100 != 0 && year % 4 == 0) || year % 400 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("non leap year");
        }
    }
}
