package Errors_and_Exceptions.Exception_class;

import java.util.Scanner;

class MyException extends Exception {

      @Override
      public String toString() {
            // TODO Auto-generated method stub
            return super.toString() + "I am to string";
      }

      @Override
      public String getMessage() {
            // TODO Auto-generated method stub
            return super.getMessage() + "Ia m get messe";
      }

}

public class Excep1 {
      public static void main(String[] args) {
            Scanner ta = new Scanner(System.in);

            int value1;
            System.out.println("Enter the value");
            value1 = ta.nextInt();
            try {
                  if (value1 > 10) {
                        throw new MyException();
                  }
            } catch (Exception e) {

                  System.out.println(e.toString());
                  System.out.println(e.getMessage());
                  // e.printStackTrace();
            }

      }
}
