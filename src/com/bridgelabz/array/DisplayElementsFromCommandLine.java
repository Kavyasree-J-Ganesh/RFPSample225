package com.bridgelabz.array;

import java.util.Scanner;

public class DisplayElementsFromCommandLine {
    public static void main(String[] args){
        System.out.println("Enter the Elements");
        int[] arr = new int[5];
        Scanner scan = new Scanner(System.in);

        for(int i=0; i<arr.length; i++){
            int element = scan.nextInt();
            arr[i] = element;
        }
        for(int j=0; j<arr.length; j++){
            System.out.println(arr[j]);
        }
    }
}
