package src.Constructor;

public class Person {

    String name;
    int age;
    long phone;
    char gender;

    Person(){
        System.out.println("Default Constructor");
    }
    Person(String ref_name, int ref_age, long ref_phone, char ref_gender) {
        this.name = ref_name;
        this.age = ref_age;
        this.phone = ref_phone;
        this.gender = ref_gender;
        }
    void PrintDetails() {
            System.out.println(this.name + "  " + this.age + "  " + this.phone + "  " + this.gender);
    }
}
