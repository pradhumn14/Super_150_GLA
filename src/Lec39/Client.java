package Lec39;

public class Client {
    public static void main(String[] args) {

        Student[] arr = new Student[5];
        System.out.println(arr[0]);
        arr[0] = new Student("pappu", 12);
        arr[1] = new Student("pappy", 1);
        arr[2] = new Student("A", 17);
        arr[3] = new Student("B", 99);
        arr[4] = new Student("C", 5);

    }

    public static void print(Student[] arr) {
        for (Student s : arr) {
            System.out.println(s);
        }
    }

    public static void bubble(Student[] arr) {

        for (int count = 1; count < arr.length - 1; count++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].age > arr[i + 1].age) {
                    Student temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }

            }
        }
    }

}
