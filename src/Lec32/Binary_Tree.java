package Lec32;

import java.util.Scanner;

public class Binary_Tree {
    private class Node {
        int val;
        Node left;
        Node right;
    }

    private Node root;
    Scanner sc = new Scanner(System.in);


    public Binary_Tree() {
        root = createTree();
    }

    private Node createTree() {

        int item = sc.nextInt();
        Node nn = new Node();
        nn.val = item;
        boolean hlc = sc.nextBoolean();
        if (hlc) {
            nn.left = createTree();
        }

        boolean hrc = sc.nextBoolean();

        if (hrc) {
            nn.right = createTree();
        }

        return nn;
    }

    public void display() {
        display(root);
    }

    public void display(Node node) {
        if (node == null) {
            return;
        }

        String s = "";
        s = "<--" + s + node.val + "-->";

        if (node.left != null) {
            s = node.left.val + s;
        } else {
            s = "." + s;
        }

        if (node.right != null) {
            s = s + node.right.val;
        } else {
            s = s + '.';
        }

        System.out.println(s);
        display(node.left);
        display(node.right);

    }

    public void preOrder() {
        preOrder(root);
        System.out.println();
    }

    private void preOrder(Node node) {

        if (node == null) {
            return;
        }

        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void postOrder() {
        inOrder(root);
        System.out.println();
    }

    private void postOrder(Node node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " ");
    }

    public void inOrder() {
        inOrder(root);
        System.out.println();
    }

    private void inOrder(Node node) {

        if (node == null) {
            return;
        }

        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }

    public boolean search(int item) {
        return search(root, item);
    }

    private boolean search(Node node, int item) {

        if (node == null) {
            return false;
        }

        if (node.val == item) {
            return true;
        }

        boolean left = search(node.left, item);
        boolean right = search(node.right, item);

        return left || right;
    }

    public int max(){
        return max(root);
    }

    private int max(Node node){
        if (node==null){
            return Integer.MIN_VALUE;
        }

        int left = max(node.left);
        int right = max(node.right);
        return Math.max(left, Math.max(right, node.val));

    }

    public int ht(Node node){
        if (node==null){
            return Integer.MIN_VALUE;
        }

        int left = max(node.left);
        int right = max(node.right);
        return Math.max(left, right) + 1;
    }

}
