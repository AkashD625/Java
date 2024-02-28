public class stack1 {
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }

    }

    static class stack {
        public static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public void push(int data) {
            Node newnode = new Node(data);
            if (isEmpty()) {
                head = newnode;
                return;
            } else {

                newnode.next = head;
                head = newnode;
            }

        }

        public static int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            int top = head.data;
            return top;
        }

        public int display() {
            if (head == null) {
                return -1;
            }
            while (head.next == null) {
                head = head.next;
                System.out.println(head.data);
            }
            return 1;
        }
    }

    public static void main(String[] args) {
        stack s1 = new stack();

        s1.push(25);
        s1.push(26);
        s1.push(27);
        s1.push(28);
        s1.push(29);
        s1.display();

        // while (!s1.isEmpty()) {
        // System.out.println(s1.peek());
        // s1.pop();

        // }

    }
}
