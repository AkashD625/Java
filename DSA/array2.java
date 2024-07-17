public class array2 {
      int i;
      int j;

      static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j]; // with usng the temp variable.
            arr[j] = temp;

            // // without temp variable
            // a = a + b;
            // b = a - b;
            // a = a - b;
            // System.out.println("a:" + a);
            // System.out.println("b:" + b);
      }

      // static int[] reversarray(int[] arr) {
      // int n = arr.length;
      // int[] ans = new int[n];
      // int j = 0;
      // for (int i = n - 1; i >= 0; i--) {
      // ans[j++] = arr[i];
      // }
      // return ans;
      // }

      // problem 3
      static int[] givenreverse(int[] arr) {
            int i = 0;
            int n = arr.length;
            int j = n - 1;
            while (i > j) {
                  swap(arr, i, j);
                  i++;
                  j--;
            }
            return arr;
      }

      static void print(int[] take) {
            for (int i = 0; i <= take.length; i++) {
                  System.out.print(take[i] + " ");
            }

      }

      public static void main(String[] args) {
            // swap(20, 30);
            int[] arr = { 1, 2, 3, 4, 5, 6 };
            // int store[] = reversarray(arr);
            // print(store);
            givenreverse(arr);
            print(arr);

      }
}
