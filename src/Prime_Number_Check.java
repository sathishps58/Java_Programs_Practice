// Java Program of Prime Number using function declaration

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

// Java Program of Prime Number without using function declaration

/*import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // To take input from user

        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read the number

        boolean isPrime = true; // Assume the number is prime first

        // Prime numbers are greater than 1
        if (num <= 1) {
            isPrime = false;
        } else {
            // Check if num is divisible by any number from 2 to num-1
            for (int i = 2; i < num; i++) {
                if (num % i == 0) { // if divisible, not prime
                    isPrime = false;
                    break; // no need to check further
                }
            }
        }

        // Display the result
        if (isPrime) {
            System.out.println(num + " is a Prime Number.");
        } else {
            System.out.println(num + " is NOT a Prime Number.");
        }

        sc.close(); // Close the scanner
    }
}

 */
