package Online.Lec41;

public class LinkedList {

//    public void addFirst(int i) {
//    }

    public class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    private Node head;
    private int size;
    private Node tail;


    public void addFirst(int item) {

        Node nn = new Node(item);

        if (this.size == 0) {
            this.head = nn;
            this.tail = nn;
            this.size++;
        } else {
            nn.next = this.head;
            this.head = nn;
            this.size++;

        }
    }

    public void addLast(int item) {
        if (this.size == 0) {
            addFirst(item);
        } else {
            Node nn = new Node(item);
            this.tail.next = nn;
            this.tail = nn;
            this.size++;
        }
    }

    public void addAtIndex(int item, int k) {

    }

    // get

    public int getFirst() throws Exception {
        if (head == null) {
            throw new Exception("pagal LinkedList khaali h");
        }
        return this.head.data;
    }

    public void display() {
        Node temp = this.head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
