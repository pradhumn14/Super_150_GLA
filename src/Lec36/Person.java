package Lec36;

public class Person {

    String name = "kriti";
    int age = 89;

    // Constructor
//    public Person() {
//        this.name = "Motu";
//        this.age = 24;
//    }


    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void fun() {

        String name = "Panchi";
        int Aadhar_No = 901928;
        System.out.println(this.name + " " + this.age + " " + Aadhar_No);

    }

}
