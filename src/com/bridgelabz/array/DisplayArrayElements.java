package com.bridgelabz.array;

public class DisplayArrayElements {
    public static void main(String[] args){
        int[] arr1 = new int[5];
        arr1[0] = 3;
        arr1[1] = 5;
        arr1[2] = 6;
        arr1[4] = 9;

        for(int i=0; i<arr1.length; i++){
            System.out.println(arr1[i]);
        }
    }
}
