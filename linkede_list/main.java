package linkede_list;
// import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        //   Internal linked list...
        // LinkedList<Integer> list=new LinkedList<>();
        // list.add(20);
        // list.add(30);
        


        link1 list=new link1();
        list.insertfirst(20);
        list.insertfirst(50);
        list.insertfirst(60);
        list.insertfirst(210);
        list.insertfirst(60);
        list.insertfirst(70);

        list.display();

    }
}
