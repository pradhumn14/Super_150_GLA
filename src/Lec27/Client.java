package Lec27;

public class Client {
    public static void main(String[] args) {

        //case 1
//        P obj = new P();
//        System.out.println(obj.d);    //1
//        System.out.println(obj.d1);   //10
//        obj.fun();
//        obj.fun1();


        //case 2
        P obj = new C();
        System.out.println(obj.d);  //1
        System.out.println(obj.d1); //10

    }
}
