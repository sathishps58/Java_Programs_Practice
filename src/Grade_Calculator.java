package src;

import java.util.Scanner;

public class Grade_Calculator {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Score");
        int score = sc.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("Your Grade is A");
        }else if (score >= 80 && score <= 89) {
            System.out.println("Your Grade is B");
        }else if (score >= 70 && score <= 79) {
            System.out.println("Your Grade is C");
        }else if (score >= 60 && score <=69) {
            System.out.println("Your Grade is D");
        }else{
            System.out.println("Your Grade is F");
        }
    }
}
