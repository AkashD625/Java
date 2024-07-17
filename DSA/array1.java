import java.util.Scanner;

public class array1 {
      static void lastoccurence(int[] arr, int x) {
            int co = 0;
            for (int i = 0; i < arr.length; i++) {
                  if (arr[i] == x) {

                        co = i;
                  }
            }
            System.out.println("Last Occurence : " + co);
      }

      static void strictlybigger(int[] arr, int x) {
            int bigger = 0;
            for (int i = 0; i < arr.length; i++) {
                  if (arr[i] > x) {

                        bigger = bigger + 1;
                  }
            }
            System.out.println("Count : " + bigger);
      }

      public static boolean sorted(int[] arr) {
            boolean check = true;
            for (int i = 1; i < arr.length; i++) {
                  if (arr[i] < arr[i - 1]) {
                        check = false;
                        break;

                  }
            }
            return check;

      }

      public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            // System.out.println("Enter the array size");
            // int n;
            // n = sc.nextInt();
            // int co = 0;
            // int[] arr = new int[n];
            // System.out.println("Enter elements");
            // for (int i = 0; i < arr.length; i++) {
            // arr[i] = sc.nextInt();
            // }
            // System.out.println("Enter the target elemennt to search");
            // int target = sc.nextInt();

            // for (int i = 0; i < arr.length; i++) {
            // if (arr[i] == target) {

            // co = co + 1;
            // }
            // }
            // System.out.println("The element" + target + "forund" + co + "Times");
            // }

            // problem =2
            // System.out.println("Enter the array size");
            // int n;
            // n = sc.nextInt();
            // int[] arr = new int[n];
            // System.out.println("Enter elements");
            // for (int i = 0; i < arr.length; i++) {
            // arr[i] = sc.nextInt();
            // }
            // System.out.println("Enter the target elemennt to search");
            // int target = sc.nextInt();
            // lastoccurence(arr, target);

            // problem 3
            // System.out.println("Enter the array size");
            // int n;
            // n = sc.nextInt();
            // int[] arr = new int[n];
            // System.out.println("Enter elements");
            // for (int i = 0; i < arr.length; i++) {
            // arr[i] = sc.nextInt();
            // }
            // System.out.println("Enter the target elemennt to search");
            // int target = sc.nextInt();
            // strictlybigger(arr, target);

            // problem 4
            System.out.println("Enter the array size");
            int n;
            n = sc.nextInt();
            int[] arr = new int[n];
            System.out.println("Enter elements");
            for (int i = 0; i < arr.length; i++) {
                  arr[i] = sc.nextInt();
            }
            boolean re = sorted(arr);
            System.out.println("Is sorted : " + re);
            // System.out.println("Enter the target elemennt to search");
            // int target = sc.nextInt();
            // strictlybigger(arr, target);

      }
}