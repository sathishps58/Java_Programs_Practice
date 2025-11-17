package src.Constructor;

public class UserDetails {
    public static void main (String [] args){

        Person P = new Person();
            P.PrintDetails();

            Person P2 = new Person("Sathish", 26, 9848022338l, 'M');
            P2.PrintDetails();
        }
    }
