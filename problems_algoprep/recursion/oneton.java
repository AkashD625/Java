package recursion;

public class oneton {
      public static void prntn(int s){
            
            if(s==1){
               System.out.println(1);
               return;

            }
       prntn(s-1);
       System.out.println(s);
       
      }
      public static void main(String[] args) {
            int n =9;
            prntn(n);
      }
}
