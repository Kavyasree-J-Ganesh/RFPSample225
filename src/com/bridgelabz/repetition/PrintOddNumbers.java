package com.bridgelabz.repetition;

public class PrintOddNumbers {
    static void printNumbers(int start, int end){
        for(int i=start; i<=end; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args){

        printNumbers(0,25);
    }
}
