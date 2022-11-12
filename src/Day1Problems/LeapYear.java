package Day1Problems;

import java.util.Scanner;

public class LeapYear {
    //static void checkLeapYear(int year){
      //  if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
        //    System.out.println("Leap Year");
        //}else {
          //  System.out.println("Not a Leap Year");
        //}
    //}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Year");
        int year = in.nextInt();
        System.out.println(year);

        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
            System.out.println("Leap Year");
        }else {
            System.out.println("Not a Leap Year");
        }

       // checkLeapYear(1594);
    }
}

