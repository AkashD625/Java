package functions;

public class pi {
      public static void main(String[] args) {
            int ansfinal = fact(500);
            System.out.println(ansfinal);
      }

      public static int fact(int n) {
            int ans = 1;
            for (int i = 1; i <= n; i++) {
                  ans = ans * i;
            }
            return ans;
      }
}