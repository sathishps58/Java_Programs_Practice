package src;

import java.util.Scanner;

public class Prime_Number_Check {
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        boolean result = isPrime(number);
        if(result){
            System.out.println(number + " is a Prime Number");
        }
        else{
            System.out.println(number + " is not a Prime Number");
        }

    }
}



