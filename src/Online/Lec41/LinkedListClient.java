package Online.Lec41;

public class LinkedListClient {
    public static void main(String[] args) throws Exception {
        LinkedList ll = new LinkedList();
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.display();
        ll.addLast(40);
        ll.display();
        System.out.println(ll.getFirst());


    }
}
