package src.Multi_Level_Inheritance;

public class TestInheritance {
    public static void main (String [] args){

       Grandfather G = new Son ();
       G.bhk3();
        System.out.println("----------");

        Father F = new Son();
        F.bhk2();
        System.out.println("----------");

        Son S = new Son();
        S.bhk1();
        S.bhk2();
        S.bhk3();
    }



}
