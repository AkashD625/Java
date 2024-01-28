package linkede_list;
// constom linked list.

public class link1 {

    private Node head;
    private Node tail;
    private int size;

    public link1() {
        this.size = 0;
    }

    // code for creating the new node and inserting it to the first position.
    public void insertfirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    // Code for inserting the node at the last of the linked list
    public void insertlast(int value) {
        if (tail == null) {
            insertfirst(value);
            return;

        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
    }

    // Code for inserting the element at the middle of the list
    public void insertmid(int value, int index) {
        if (index == 0) {
            insertfirst(value);
        }
        if (index == size) {
            insertlast(value);
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(value, temp.next);
        temp.next = node;
        size++;
    }

    // code for delete the first element
    public int deletefirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    // code for deleting the last element of the linked list.

    public int deletelast() {
        if (size <= 1) {
            return deletefirst();
        }
        Node secoundlast = get(size - 1);
        int value = tail.value;
        tail = secoundlast;
        tail.next = null;

        return value;

    }

    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // Displaying the linked list by creating the temp variable

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.err.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println(" ");
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;

        }

    }

    public static void main(String[] args) {
        // Internal linked list...
        // LinkedList<Integer> list=new LinkedList<>();
        // list.add(20);
        // list.add(30);

        link1 list = new link1();
        list.insertfirst(20);
        list.insertfirst(50);
        list.insertfirst(60);
        list.insertfirst(210);
        list.insertfirst(60);
        list.insertfirst(70);
        list.insertlast(10);
        list.insertmid(69, 4);
        list.display();

        // list.deletefirst();
        System.out.println(list.deletefirst());

        list.display();
        list.deletelast();

        // System.out.println(list.deletelast());
        list.display();

    }

}
