package Errors_and_Exceptions;

import java.util.Scanner;

public class errors {
      public static void main(String[] args) {
            // Erorrs - these are the mistakes done by any of the persone may be user and
            // the coder and many more.
            // Types of error - 1] Syntax Error
            // 2] Logical Error
            // 3] Run time errors

            // Run time errors are handle by the programer if the user enters the wrong
            // input the instead of crashing the completre program the , exc3eption is
            // thrown .... this is called as exeption handling.

            // try - THis try method will try to execute the programe , if the programe is
            // not havving any wrong expression or some other problem related to logic or
            // the user input then the programe will run without any problem

            // catch - if there is any exception from the side of compiler then we can
            // handle it with our message.
            // Ex1
            // int a = 10;
            // int b = 0;
            // try {
            // int div = a / b;
            // System.out.println(div);
            // } catch (Exception e) {
            // System.out.println("Exception - Check values");
            // System.out.println(e);
            // }

            // Ex 2
            // int[] arr = new int[3];
            // arr[0] = 25;
            // arr[1] = 68;
            // arr[2] = 85;
            // try {
            // int test = arr[5] / 20;
            // System.out.println(test);
            // } catch (ArrayIndexOutOfBoundsException e) {
            // System.out.println("Exception occured ");
            // System.out.println(e);
            // } catch (ArithmeticException e) {
            // System.out.println("Exception occured ");
            // System.out.println(e);
            // }

            // Nested try and catch block
            // Ex 3
            // int[] arr = new int[3];
            // arr[0] = 25;
            // arr[1] = 68;
            // arr[2] = 85;
            // boolean tr = true;
            // Scanner sc = new Scanner(System.in);
            // while (true) {

            // System.out.println("Enter the array index to divide");
            // int num1 = sc.nextInt();
            // System.out.println("Enter the value to devide");
            // int val = sc.nextInt();

            // try {
            // System.out.println("Welcome to the try block");
            // try {
            // int result = arr[num1] / val;
            // System.out.println(result);
            // tr = false;
            // System.out.println("Thankl you ");
            // } catch (ArithmeticException e) {
            // System.out.println("Execption ");
            // System.out.println(e);
            // } catch (ArrayIndexOutOfBoundsException e) {
            // System.out.println("Execption ");
            // System.out.println(e);
            // }

            // } catch (Exception e) {
            // System.out.println("Wait something went wrong");
            // }

            // }

      }

}
