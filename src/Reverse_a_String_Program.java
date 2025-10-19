package src;

import java.util.Scanner;

// Using a CharAt function
 public class Reverse_a_String_Program {
    /* public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = sc.nextLine();
        String reversed ="";
        for (int i =input.length()-1; i>=0; i--){
            reversed = reversed + input.charAt(i);
        }
        System.out.println(reversed);
    }
}

 */

// Using swapping the variables

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String input = sc.nextLine();
        char[] charArray = input.toCharArray();
        System.out.println(charArray.length);
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            left++;
            right--;
        }
        String rev_name = new String(charArray);
        System.out.println(rev_name);
    }
}