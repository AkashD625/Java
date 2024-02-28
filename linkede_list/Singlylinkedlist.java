class Node {
      int data;
      Node next;

      Node(int data) {
            this.data = data;
            this.next = null;
      }
}

public class Singlylinkedlist {
      Node head;

      Singlylinkedlist() {
            this.head = null;
      }

      public void insertatfirst(int data) {
            Node newnode = new Node(data);
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

      public void display() {
            Node temp = head;
            while (temp != null) {
                  System.out.print(temp.data + " ");
                  temp = temp.next;

            }
            System.out.println();

      }

      public static void main(String[] args) {
            Singlylinkedlist list = new Singlylinkedlist();
            list.insertatfirst(12);
            list.insertatfirst(65);
            list.insertatfirst(65);
            list.display();
      }
}
