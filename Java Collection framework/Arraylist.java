import java.util.ArrayList;

public class Arraylist {
      public static void main(String[] args) {
            // To access all the classes in the arraylist we can use official document of or Java 14 docs
            // oracle .
            // Ex - .add(),.remove,....
            ArrayList<Integer> fa = new ArrayList<>();

            fa.add(10);
            fa.add(11);
            fa.add(12);
            fa.add(13);
            fa.add(14);
            fa.add(15);
            fa.add(16);
            fa.add(17);
            fa.add(18);
            fa.add(0, 15);
            for (int i = 0; i < fa.size(); i++) {
                  System.out.println(fa.get(i));
            }
      }
}
