package com.bridgelabz;

public class MainMethod {
    static int sumOfTwoNumbers(int x, int y){
        int z = x+y;
        return z;
    }
    static int productOfTwoNumbers(int a, int b){
        int c = a*b;
        return c;
    }
    static int differenceOfTwoNumbers(int m, int n) {
        int k = m-n;
        return k;
    }
    static double divisionOfTwoNumbers(double e, double f) {
        double g = e/f;
        return g;
    }
    public static void main(String[] args){
        int p =sumOfTwoNumbers(10,15);
        System.out.println(p);

        int q = productOfTwoNumbers(20,25);
        System.out.println(q);

        int k =differenceOfTwoNumbers(30,35);
        System.out.println(k);

        double g = divisionOfTwoNumbers(10,20);
        System.out.println(g);
    }

}
