package Recursion;

public class rec1 {
    // Q2
    public static void printnum(int n) {

        // Base case (Like condition in loops)
        if (n == 0) {
            return;
        }
        // base case ends here.
        System.out.println(n);
        printnum(n - 1);
    }

    // Q2
    public static void printnum2(int n) {

        // Base case (Like condition in loops)
        if (n == 10) {
            return;
        }
        // base case ends here.
        System.out.println(n);
        printnum2(n + 1);
    }

    // Q3
    public static void sumna(int i, int n, int sum) {
        if (i == n) {
            sum = +i;
            System.out.println(sum);
            return;
        }
        sum += i;
        sumna(i + 1, n, sum);
    }

    public static int facto(int f) {
        if (f == 1 || f == 0) {
            return 1;
        }
        int fact_nm1 = facto(f - 1);
        int result = f * fact_nm1;
        return result;
    }

    // Q5
    // public static int fibo(int n) {
    //     if (n == n) {
    //         return n;
    //     }
    //     int n_1 = fibo(n - 1);
    //     int n_2 = fibo(n - 2);
    //     int result = n_1 + n_2;
    //     return result;
    // }

    public static void main(String[] args) {
        // int n = 0;
        // printnum(n);
        // printnum2(n);
        
        // sumna(0, 10, 0);
        // int finals = facto(5);
        // System.out.println(finals);

        // int finals = fibo(10);
        // System.out.println(finals);

    }
}
