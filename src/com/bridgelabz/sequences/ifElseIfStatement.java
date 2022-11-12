package com.bridgelabz.sequences;


public class ifElseIfStatement {
    public static void main(String[] args) {
        int x = 20;
        System.out.println(x);
        int sum = x + 5;
        System.out.println(sum);


        // if-else-if
        if (x < 20) {
            System.out.println("x less than 20");
        } else if (x > 20 || x < 30) {
            System.out.println("x greater than 20 or x less than 30");
        } else if (x > 20 && x < 30) {
            System.out.println("x greater than or equal to 20 and x less than 30");
        } else {
            System.out.println("x greater than 20");
        }
    }
}