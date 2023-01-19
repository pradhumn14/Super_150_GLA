package Lec34;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Create_Level_Order {

    public class Node {
        int val;
        Node left;
        Node right;
    }

    private  Node root;

    Scanner sc = new Scanner(System.in);

    public Create_Level_Order() {
        this.root = createTree();
    }

    private Node createTree() {

        Queue<Node> q = new LinkedList<>();
        Node nn = new Node();
        int val = sc.nextInt(); // 10
        nn.val = val;
        root = nn;
        q.add(nn);

        while (!q.isEmpty()) {
            Node rv = q.remove();
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            if (c1 != -1) {
                Node node = new Node();
                node.val = c1;
                rv.left = node;
                q.add(node);
            }
            if (c2 != -1) {
                Node node = new Node();
                node.val = c2;
                rv.right = node;
                q.add(node);
            }
        }
        return root;

    }

}
