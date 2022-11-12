package com.bridgelabz.repetition;

public class ElementInArray {
    static String checkElement(int[] array,int x){
        int i = 0;
        while(i< array.length){
            if(x == array[i]){
                return "Element is present";
            }
            i++;
        }
        return "Element is not Present";
    }
    public static void main(String[] args){
        int[] array = {1,5,8,9,7,6};
        String p = checkElement(array,4);
        System.out.println(p);
    }
}
