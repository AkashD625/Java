package recursion;

public class file1 {
      public static int fact(int n){
            int temp =0;
            if(n==1){
                  return 1;
            }
            else{
                  temp = n * fact(n-1);
            }
            return temp;
      }
      public static void main(String[] args) {
                    int n=3;  
            int tempans = fact(n);
            System.out.println(tempans);

      }
      // preoblem 9 dunding the sum of each element in the given array
      // public static int resur(int n){
      //       int temp = resur(n-1);
      //       if(n==1){
      //             return 1;
      //       }
      //       int temp = resur(n-1);
      //       return temp+n;
      }
  

