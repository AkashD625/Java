class Node {
      int data;
      Node next;

      Node(int data) {
            this.data = data;
            this.next = null;
      }
}

public class linkprac {
      Node head;

      linkprac() {
            this.head = null;

      }

      void insertfirst(int value) {
            Node newnode = new Node(value);
            newnode.next = head;
            head = newnode;

            if (head == null) {
                  head = newnode;
                  return;
            } else {
                  Node temp;
                  temp = head;
                  while (temp.next != null) {
                        temp = temp.next;
                  }
                  temp = newnode;
                  return;
            }

      }

      void display() {
            Node temp = head;
            while (temp != null) {
                  System.out.println(temp.data + " ");
                  temp = temp.next;
            }
            System.out.println();
            return;

      }

      public static void main(String[] args) {
            linkprac list = new linkprac();
            list.insertfirst(20);
            list.insertfirst(22);
            list.display();
      }
}
