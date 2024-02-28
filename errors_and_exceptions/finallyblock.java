// Finally- This keyword will be compulsisirillly excuted , whether the try wiil give exception or not .
// basicaly , if try block is excuted without any exception then the catch block will not excute therfore statements below that catch block will not excuted .
// To excecute thos compulsisirillly , we wrap them into the Finally block 
// syntax - finally{}

public class finallyblock {
      static public int greet() {
            try {
                  int a = 2;
                  int b = 0;
                  int c = a / b;
                  return c;
            } catch (Exception e) {
                  System.out.println(e);
            } finally {// This willl be executed compulsorily .
                  System.out.println("This is the compulsiry block ,  to be excecuted..");
            }
            return 0;
      }

      public static void main(String[] args) {
            System.out.println("WELCOME");
            int k = greet();
      }
}
