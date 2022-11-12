package com.bridgelabz.repetition;

public class SumOfMultiple {
    public static void main(String[] args){
        int sum = 0;
        int x = 1;
        int y = 25;

        int i =x;
        do{
            if(i % 3 == 0){
                sum = sum + i;
            }
            i++;
        }while (i<=y);
      System.out.println(sum);
    }
}
