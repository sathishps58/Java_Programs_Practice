package src;

import java.util.Scanner;

public class Palindrome_program {
    /*public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String or Number:  ");
        String input = sc.nextLine().toLowerCase();
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }
            if (input.equals(reversed)){
                System.out.println(input + " is a Palindrome");
            }
            else {
                System.out.println(input + " is not a palindrome");
            }
            sc.close();
        }
    }

     */

    //Method 2 : using a StringBuilder

/*public static void main (String[] args){
Scanner sc = new Scanner(System.in);
    System.out.println("Enter a String or Number: ");
    String input = sc.nextLine();
    input = input.toLowerCase();
    String reversed = new StringBuilder(input).reverse().toString();
    if (input.equals(reversed)){
        System.out.println(input + " is a palindrome");
    } else {
        System.out.println(input + " is not a palindrome");
    }
}
}

 */

// Method : 3 - Using a Function & StringBuilder.

public static void main (String[] args){
Scanner sc = new Scanner (System.in);
    System.out.println("Enter a String or Number: ");
    String input = sc.nextLine();
    if (isPalindrome(input)){
        System.out.println(input + " is a Palindrome");
    } else {
        System.out.println(input + " is not a Palindrome");
    }
}
public static boolean isPalindrome(String input){
    input = input.toLowerCase();
    String reversed = new StringBuilder(input).reverse().toString();
    return input.equals(reversed);
}
}