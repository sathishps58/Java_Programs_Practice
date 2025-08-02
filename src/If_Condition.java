package src;

import java.util.Scanner;

public class If_Condition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num > 8) {
            System.out.println("Number is Greater than 8");
        }
            else if(num > 10) {
            System.out.println("Number is Greater than 10");
        }
            else {
            System.out.println("Number is less than 10");
        }
    }



}
