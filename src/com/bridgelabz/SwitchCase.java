package com.bridgelabz;


import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value");

        int ch = scan.nextInt();

        // int ch = 3;

        switch (ch) {
            case 1:
                System.out.println("case 1");
                break;

            case 2:
                System.out.println("case 2");
                break;

            case 3:
                System.out.println("case 3");
                break;

            case 4:
                System.out.println("case 4");
                break;

            default:
                System.out.println("default");
        }
    }
}
