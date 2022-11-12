package com.bridgelabz.repetition;

public class Factorial {
    static int factorialOfNumber(int p){
        int factorial = 1;
        int i = p;
        while(i>0){
            factorial = factorial * i;
            i--;
        }
        return factorial;
    }
    public static void main(String[] args){
        int m = factorialOfNumber(6);
        System.out.println(m);
    }
}
