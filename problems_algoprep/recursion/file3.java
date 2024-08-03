package recursion;
// finnding the ans for a^n; using factorial.(Solved by me)

public class file3 {
      public static int calpower(int a, int b) {
            int count = 0;
            int ans = a * a;
            count++;
            if (count == b) {
                  return 1;
            }
            calpower(ans, b - 1);
            return ans;
      }

      public static void main(String args[]) {
            int a = 654954641;
            int n = 2;
            int ans = calpower(a, n);
            System.out.println(ans);
      }

}
