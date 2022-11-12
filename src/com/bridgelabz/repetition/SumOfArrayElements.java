package com.bridgelabz.repetition;

public class SumOfArrayElements {
    static int sumOfElements(int[] array){
        int sum = 0;
        int i = 0;
        while (i< array.length){
            sum = sum + array[i];
            i++;

        }
        return sum;
    }
    public static void main(String[] args){
        int[] array = {7,5,1,4,9,3,8};
        int q = sumOfElements(array);
        System.out.println(q);
    }
}
