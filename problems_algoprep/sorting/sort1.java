package sorting;

import java.util.*;

public class sort1 {
      static public void cost(int arr[]) {
            Arrays.sort(arr);
            int ans = 0;
            for (int i = 0; i < arr.length; i++) {
                  int temp = arr[i] * (arr.length - i);
                  ans = ans + temp;

            }
            System.out.println("The cost is : " + ans + "\n Thank you");

      }

      static public void goodinteger(int arr[]) {
            int count = 0;
            int countans = 0;
            for (int i = 0; i < arr.length; i++) {

                  for (int j = 0; j < arr.length; j++) {
                        if (arr[j] < arr[i]) {
                              count = count + 1;

                        }

                  }
                  if (count == arr[i]) {
                        countans = countans + 1;

                  }
                  count = 0;

            }

            System.out.println("The count is :" + countans);

      }

      public static void main(String[] args) {

            int a[] = { 0,2,2,3,3,8 };
            // cost(a);
            goodinteger(a);
      }
}
