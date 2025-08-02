//Vowels Program using Switch condition

package src;

import java.util.Scanner;

public class Switch_Condition {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter an Alphabet");
        char vowels = sc.next().toCharArray()[0];

        switch (vowels) {
            case 'a':
                System.out.println("a is an Vowel");
                break;
            case 'e':
                System.out.println("e is an Vowel");
                break;
            case 'i':
                System.out.println("i is an Vowel");
                break;
            case 'o':
                System.out.println("o is an Vowel");
                break;
            case 'u':
                System.out.println("u is an Vowel");
                break;
            default:
                System.out.println("It is not an Vowel");
        }

    }

}


