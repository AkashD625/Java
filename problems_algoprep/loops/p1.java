//factors of the number
class p1 {
      public static int sq(int n) {
            int i = 1;
            int ans = 0;
            while (i * i <= n) {
                  ans = i;
                  i++;
            }
            return ans;
      }

      public static int digex(int val) {
            int sum = 0;
            int multi = 1;

            while (val > 0) {
                  int lastdigit = val % 10;
                  sum = sum + lastdigit;
                  multi = multi * lastdigit;
                  val = val / 10;
            }
            return sum - multi;
      }

      

      public static void main(String[] args) {
            // int count = 0;
            // int a = 12;
            // int[] se = new int[a];
            // for (int i = 1; i <= a; i++) {
            // if (a % i == 0) {
            // count = count + 1;
            // se[i] = i;
            // }

            // }
            // if (count == 2) {
            // System.out.println("This is prime");
            // } else {
            // System.out.println("This is not prime");
            // }

            // int a = 9;
            // for (int i = 1; i <= a; i++) {
            // for (int j = 1; j <= i; j++) {
            // System.out.print("*");
            // }
            // System.out.println();
            // }

            // int count = 1;
            // int a = 9;
            // for (int i = 1; i <= a; i++) {
            // for (int j = 1; j <= i; j++) {

            // System.out.print(count+" ");
            // count++;
            // }
            // System.out.println();
            // }

            // -------------> IMPPORTANT for pattern
            // if N=7
            // int N = 7;
            // int nsp = 3;
            // int nst = 1;
            // for (int i = 1; i < N; i++) {
            // for (int j = 1; j <= nsp; j++) {
            // System.out.print(" ");
            // }

            // for (int k = 1; k <= nst; k++) {
            // System.out.print("*");
            // }
            // System.out.println("");

            // if (i <= N / 2) {
            // nsp--;
            // nst = nst + 2;
            // } else {
            // nst = nst-2;
            // nsp++;
            // }

            // }

            // int N = 10;
            // int nst = N / 2 + 1;
            // int nsp = 1;
            // for (int i = 1; i <= N; i++) {
            // for (int j = 0; j <= nst; j++) {
            // System.out.print("*");
            // }
            // for (int k = 0; k <= nsp; k++) {
            // System.out.print(" ");
            // }
            // for (int j = 0; j <= nst; j++) {
            // System.out.print("*");
            // }
            // if (i <= N / 2) {
            // nsp = nsp + 2;
            // nst--;
            // } else {
            // nst++;
            // nsp = nsp - 2;
            // }
            // System.out.println();

            // }

            // finding the squaroot
            // int fi = sq(36);
            // System.out.println(fi);

            // Difference of the product of the digit and the sum of the digits(Digit
            // extraction)
            // int f1 = digex(236595);
            // System.out.println(f1);

            
      }

}
