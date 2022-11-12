package com.bridgelabz.repetition;

public class PowerOfNumber {
    static int power(int x, int y){
        int mul = 1;
        int i = 0;
        while(i<y){
            mul = mul * x;
            i++;
        }
        return mul;
    }
    public static void main(String[] args){
        int a = power(2,3);
        System.out.println(a);
    }
}
