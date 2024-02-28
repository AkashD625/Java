package errors_and_exceptions;

class excep extends Exception {
      @Override
      public String toString() {
            // TODO Auto-generated method stub
            return super.toString() + "By Zero not possible";
      }
}

public class throws_vs_throw {
      public static int result(int a, int b) throws excep {
            {
                  int result = a / b;
                  return result;
            }

      }

      public static void main(String args[]) {
            // Throws - This tells us , theri might be chances of throwing the exception so
            // be prepered with the try catch block.
            // Ex-throws customclass{

            // }

            // try{}catch(){}

            // Throw - This will initiate the custom exception created by us.
            // ex - throw new custamclass_name();
            try {

                  int c = result(6, 0);
                  System.out.println(c);

            } catch (Exception e) {
                  System.out.println(e.toString());
            }

      }

}
