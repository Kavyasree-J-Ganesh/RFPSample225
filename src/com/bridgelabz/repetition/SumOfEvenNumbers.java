package com.bridgelabz.repetition;

public class SumOfEvenNumbers {
    static int sumOfNumbers(int start, int end){
        int sum = 0;
        for(int i=start; i<=end; i++){
            if(i % 2 == 0){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main(String[] args){
        int sum = sumOfNumbers(10,50);
        System.out.println(sum);
    }
}

