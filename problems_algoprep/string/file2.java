package string;
import java.util.*;

public class file2 {
    public static void main(){
      Scanner sc = new Scanner(System.in);
      String str;
      System.out.println("Enter the string\n");
      str = sc.nextLine();
      int n = str.length();
      System.out.println("Enter the key");
      String s = sc.nextLine();

      int count =0;
      char[] ch =new char[n];
      for(int i=0;i<n;i++){
          char c= str.charAt(i);
       if(c==s.charAt(0)){
            count++;
       }
      }

   


      System.out.println(count);
    }  
}
