//package Lec31;
//
//public class LinkedList {
//
//    private class Node {
//        int val;
//        Node next;
//    }
//
//    private Node head;
//    private Node tail;
//    private int size;
//
//    public void addFirstPlace(int item) {
//        Node nn = new Node();
//        nn.val = item;
//        if (this.size == 0) {
//            head = nn;
//            tail = nn;
//        } else {
//            nn.next = head;
//            head = nn;
//            size++;
//        }
//
//    }
//
//    public void addLast(int item) {
//        if (size == 0) {
//            addFirstPlace(item);
//        } else {
//            Node nn = new Node();
//            nn.val = item;
//            tail.next = nn;
//            tail = nn;
//            size++;
//        }
//    }
//
//    //O(n)
//
//    public void AddAtIndex(int item, int k) throws Exception {
//        if (k < 0 || k > size) {
//            throw new Exception("BkLOL k out of Range hai");
//        }
//        if (k == 0) {
//            addFirstPlace(item);
//        } else if (k == size) {
//            addLast(item);
//        } else {
////            Node k_1th = GetNode(k - 1);
//            Node nn = new Node();
//            nn.val = item;
//            nn.next = k_1th.next;
//            k_1th.next = nn;
//            size++;
//
//        }
//    }
//
//    public int getFirst() {
//        return head.val;
//    }
//
//    public int getLast() {
//        return tail.val;
//    }
//
//    public int getAtIndex(int k) throws Exception {
//        return GetNode(k).val;
//    }
//
//
//    public void display() {
//        Node temp = head;
//        while (temp != null) {
//            System.out.print(temp.val + " -->");
//            temp = temp.next;
//        }
//        System.out.println("NULL");
//    }
//
//    //O(n)
////    private Node GetNode(int k) throws Exception {
////        if (k < 0 || k >= size) {
////            throw new Exception("BkLOL k out of Range hai");
////        }
////        Node temp = head;
////        for (int i = 1; i <= k; i++) {
////            temp = temp.next;
////        }
////        return temp;
////    }
//
//    //O(1)
//    public int removeFirst() {
//        Node temp = head;
//        if (size == 1) {
//            head = null;
//            tail = null;
//            size--;
//        } else {
//            head = head.next;
//            temp.next = null;
//            size--;
//        }
//
//        return temp.val;
//
//    }
//
//    public int removeAtLast() {
//        if (size == 1) {
//            return removeFirst();
//        } else {
////            Node ss = GetNode(size - 2);
//            int rv = tail.val;
////            tail = ss;
//            tail.next = null;
//            size--;
//            return rv;
//        }
//    }
//
////    public int removeAtIndex(int k) throws Exception {
////        if (k == 0) {
////            return removeFirst();
////        } else if (k == size - 1) {
////            return removeAtLast();
////        } else {
////            Node prev = GetNode(k-1);
////
////        }
////    }
//
//}
