package recursion;

public class fibo {
      public static int fibo1(int n){
            int temp1,temp2;
            if(n==0 || n==1){
                  return n;
            }
            else{
                  temp1 = fibo1(n-1);
                  temp2 = fibo1(n-2);
            }
            return temp1+temp2;
      }
      public static void main(String[] args) {
            
            int f = 7;
            int temp = fibo1(7);
            System.out.println(temp);
      }
}
