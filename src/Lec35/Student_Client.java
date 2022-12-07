package Lec35;

public class Student_Client {
    public static void main(String[] args) {

        Student s = new Student();
        System.out.println(s.name);
        System.out.println(s.age);
        s.name = "ramu";
        s.age = 90;
        System.out.println(s.name);
        System.out.println(s.age);
        Student s1 = new Student();
        s1.age = 25;
        s1.name = "vaibhavi";
        System.out.println(s1.age);
        System.out.println(s1.name);

        s.Intro_yourSelf();
        s1.Intro_yourSelf();

    }
}
