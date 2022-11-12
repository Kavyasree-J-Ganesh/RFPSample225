package com.bridgelabz.repetition;

public class MultipleOfEvenNumbers {
    static int evenMultiple(int start, int end){
        int mul = 1;
        for(int i=start; i<=end; i++){
            if(i % 2 == 0){
                mul = mul * i;
            }
        }
        return mul;
    }
    public static void main(String[] args){
        int p = evenMultiple(1,10);
        System.out.println(p);

    }
}
