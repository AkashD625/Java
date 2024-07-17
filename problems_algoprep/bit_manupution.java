public class bit_manupution {
      public static void main(String args[]){
                  // prob 1 - check weather the number is odd or even without using mathematical operation.
                  // int n = 23;
                  // if(n & 1 == 0){
                  //       System.out.println("Tne number is even");

                  // } 
                  // else{
                  //       System.out.println("The number is odd");
                  // }


                  // problem 2 - return the element that is not repeating using bitwise operator.
                  int[] arr ={2,3,5,3,2,6,6};
                  int ans =0;
                  for(int i=0;i<arr.length;i++){
                        ans = ans ^ arr[i];
                  }
                  System.out.println(ans);
      }
}
