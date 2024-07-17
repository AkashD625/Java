package twod_array;

import java.util.*;

public class file {
      public static void main(String[] args) {

            // problem 1------IMP------------
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number of rows");
            int n = sc.nextInt();
            System.out.println("Enter the number of colloums");
            int m = sc.nextInt();
            int[][] mat = new int[n][m];
            System.out.println("Enter the elements");
            for (int i = 0; i < n; i++) {
                  for (int j = 0; j < m; j++) {
                        mat[i][j] = sc.nextInt();
                  }
                  System.out.println("");
            }

            System.out.println("Printing it in the wave form");
            for (int i = 0; i < n; i++) {
                  if (i % 2 == 0) {
                        for (int j = 0; j < m; j++) {
                              System.out.print(mat[i][j]);
                        }

                  } else {
                        for (int j = m - 1; j >= 0; j--) {
                              System.out.print(mat[i][j]);
                        }
                  }
                  System.out.println();
            }

            // -----------------------------------------------------------------------------------------------------------------------------------

      }

}
