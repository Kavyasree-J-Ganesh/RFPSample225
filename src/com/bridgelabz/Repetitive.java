package com.bridgelabz;

public class Repetitive {
    public static void main(String[] args) {
        int x=0;
        int res1 = x++ + ++x + x++ + x++ + ++x + x++; // 0+2+2+3+5+5=17
        System.out.println(x); //6
        System.out.println(res1); //17

        int v = 1;
        int res2 = v-- + v++ - --v + v++ + ++v + v-- + v-- + --v + ++v + v-- ; //1+0+0+0+2+2+1+(-1)+0+0 = 5
        System.out.println(v); // -1
        System.out.println(res2); // 5

        int z =2;
        int res3 = --z - --z + ++z + z-- + z++ + --z + ++z + z-- +z; // 1-0+1+1+0+0+1+1+0 = 5
        System.out.println(z); // 0
        System.out.println(res3); // 5

        int q =5;
        int res4 = q++ + q-- + q++; //16
        System.out.println(q); // 6
        System.out.println(res4); // 16


    }
}
