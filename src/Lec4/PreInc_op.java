package Lec4;

public class PreInc_op {
    public static void main(String[] args) {
        int a = 7;
        ++a;    //a=a+1;
        //a= 8

//      --a;    //a=a-1;
//        System.out.println(a);
//        System.out.println(--a);

//        int b = a++ + 9 - a - --a;
//        System.out.println(b);

        int b = a++ + 7 + a + a-- + 3;
        System.out.println(b);
    }
}
