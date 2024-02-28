import java.util.LinkedList;

public class Linkedlist {
      public static void main(String[] args) {
            LinkedList<Integer> li = new LinkedList<>();
            // some of the methodes are same as arraylist .
            // addfirst and addlast .are some extra usefull methods of linked list.

            li.addFirst(20);                                          
            li.add(30);
            li.addLast(30);
            for (int i = 0; i < li.size(); i++) {
                  System.out.println(li.get(i));
            }
      }
}
