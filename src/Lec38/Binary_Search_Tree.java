//package Lec38;
//
//public class Binary_Search_Tree {
//
//    public class Node {
//        int val;
//        Node left;
//        Node right;
//
//    }
//
//    private Node root;
//
//    public Binary_Search_Tree(int[] in) {
//        this.root = CreateTree(in, 0, in.length - 1);
//    }
//
//    private Node CreateTree(int[] in, int si, int ei) {
//
//        if (si > ei) {
////            return
//        }
//        int mid = (si + ei) / 2;
//        Node nn = new Node();
//        nn.val = in[mid];
//
//    }
//
//    public void preorder() {
//        preOrder(root);
//        System.out.println();
//    }
//
//    private void preOrder(Node node) {
//        if (node == null) {
//            return;
//        }
//
//        System.out.print(node.val + " ");
//        preOrder(node.left);
//        preOrder(node.right);
//
//    }
//
//    public static void main(String[] args) {
//        int[] in = {10, 20, 30, 40, 50, 60, 70, 80, 90};
//
//        Binary_Search_Tree bst = new Binary_Search_Tree((in));
//        bst.preorder();
//
//    }
//
//}
