package arrays;

public class file2 {
      public static void rotatearray(int[] arr, int k){
            int startpoint = 0;
            int endpoint = arr.length-1;
            while(startpoint<endpoint){
                  int temp = arr[startpoint];
                  arr[startpoint] = arr[endpoint];
                  arr[endpoint] = temp;
                  startpoint++;
                  endpoint--;
            }

            int start = 0;
            int end = k-1;
            while(start<end){
                  int temp = arr[start];
                  arr[start] = arr[end];
                  arr[end] = temp;
                  start++;
                  end--;
            }
            int startlast = k;
            int end1 = arr.length-1;
            while(startlast<end1){
                  int temp = arr[startlast];
                  arr[startlast] = arr[end1];
                  arr[end1] = temp;
                  startlast++;
                  end1--;
            }


      }


      public static void elegre(int[] arr){
            int max = arr[0];
            int count =0;
            for(int i=0;i<=arr.length-1;i++){
                  if(arr[i]>max){
                        max = arr[i];
                       
                  }
            }


            for(int i=0;i<arr.length-1;i++){
                  if(arr[i]==max){
                        count++;
                  }
            }
            int ans = arr.length - count;
            System.out.println(ans);
      }




      // sum of element equal to give number but i!=j
      public static void sumelementcheck(int[] arr ,int k){
            for(int i=0;i<arr.length-1;i++){
                  for(int j =i+1;j<=arr.length;j++){
                        if(arr[i]+arr[j]==k){
                              System.out.println("yes");
                        }
                  }
            }
      }



      public static void main(String[] args) {
            int[] arr = { 10,32,65,98,56,23,98,12,45,84};
            //--------imp---------
            //Rotating the array
            // rotatearray(arr, 2);
            // for(int i=0;i<arr.length;i++){
            // System.out.print(arr[i]+" ");}




            // Given array , every element in the array has atleast 1 greter then it in the array then that element is valid - return count.
            //-----> solution - count max element - array length - count = ans
            //elegre(arr);



            // sum of element equal to give number but i!=j
            sumelementcheck(arr, 42);
            



      
      }
      
}
