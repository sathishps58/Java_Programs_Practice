package src;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Year");
        int year = sc.nextInt();
        if((year%4 == 0 && year%100 != 0) || (year%400 == 0)){
            System.out.println(year + " is an Leap year");
        }else{
            System.out.println(year + " is Not a leap Year");
        }
    }
}
