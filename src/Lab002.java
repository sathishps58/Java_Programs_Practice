package src;

import java.util.Scanner;

// Take user input of the marks in 5 Subjects and print them
public class Lab002 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[5];
        System.out.println("Enter the marks for 5 subjects");

        for (int i=0; i<5; i++){
            System.out.println("Subject " + (i + 1) + "marks:");
            marks[i] = sc.nextInt();
        }
        System.out.println("\nmarks entered:");
        for (int i=0; i<5; i++){
            System.out.println("Subject" + (i+1) + marks[i]);
        }
        sc.close();
    }
}
