package Lec32;

public class BinaryTree_Client {
    public static void main(String[] args) {
        Binary_Tree bt = new Binary_Tree();
//        bt.display();
        // 10 true 20 true 40 false false true 50 false false true 30 false true 60 true 70 false false false
//        bt.preOrder();
//        bt.postOrder();
        bt.inOrder();
        System.out.println(bt.search(60));
        System.out.println(bt.max());


    }
}
