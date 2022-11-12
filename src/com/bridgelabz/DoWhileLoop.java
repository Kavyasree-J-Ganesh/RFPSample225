package com.bridgelabz;

public class DoWhileLoop {
    public static void main(String[] args){
        int i=0;
        System.out.println("print numbers from 0 to 5");
        do {
          System.out.println(i);
          i++;
        } while(i<=5);


        i=6;
        System.out.println("do while looping only once"); // because 6 is greater than 5.
        do {
            System.out.println(i);
            i++;
        } while (i<5);
    }

}

