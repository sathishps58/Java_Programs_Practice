package src;

import java.util.Scanner;

public class Cube_Root_Program {
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        double x = sc.nextDouble();
        System.out.println("Enter the value of y");
        double y = sc.nextDouble();
        System.out.println("Enter the value of z");
        double z = sc.nextDouble();

        double result = 0;
        /* 3/ x^2 + y^2 -/Z/
        A+B-C -> A -> x^2, B -> y^2, C -> /Z/
       12 */
        result = Math.cbrt(Math.pow(x,2) + Math.pow(y,2) - Math.abs(z));
        System.out.println(result);

        sc.close();
    }
}
