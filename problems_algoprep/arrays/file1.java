package arrays;

public class file1 {
      // public static int arrsum(int[] arr) {
      // int ans = 0;
      // for (int i = 0; i < arr.length; i++) {
      // ans = ans + arr[i];

      // }
      // return ans;
      // }

      // public static int maxvalarr(int[] arr){
      // int max = 0;
      // for(int i=0;i<arr.length;i++){
      // if(arr[i]>max){
      // max = arr[i];
      // }
      // }
      // return max;
      // }

      public static void revarr(int[] arr) {
            int startpoint = 0;
            int endpoint = arr.length - 1;
            while (startpoint < endpoint) {
                  int temp = arr[startpoint];
                  arr[startpoint]= arr[endpoint];
                  arr[endpoint] = temp;

                  // swap(arr[startpoint], arr[endpoint]);
                  startpoint++;
                  endpoint--;
            }
      }


      public static void revarrpart(int[] arr ,int start, int end) {
            int startpoint = start;
            int endpoint = end;
            while (startpoint < endpoint) {
                  int temp = arr[startpoint];
                  arr[startpoint]= arr[endpoint];
                  arr[endpoint] = temp;

                  // swap(arr[startpoint], arr[endpoint]);
                  startpoint++;
                  endpoint--;
            }
      }

      public static void main(String[] args) {
            // 1 } // array elements sum
            int[] arr = { 10, 20, 30, 236, 50 ,62,32,21,25,36,65};
            // int finalsum = arrsum(arr);
            // int finalsum = maxvalarr(arr);
            // System.out.println(finalsum);

            // reversing the array
            // revarr(arr);
            // for (int i = 0; i < arr.length; i++) {
            //       System.out.print(arr[i] + " ");
            // }



           // another problem is revesing the array from the start3 to end 8 only
           //Ex -2,3,6,5,8,4,9,5,4,5,6
           //result - 2,3,6,5,9,4,4,5,6
            // revarrpart(arr,2,5);
            // for (int i = 0; i < arr.length; i++) {
            //       System.out.print(arr[i] + " ");
            // }



            //--------imp---------
            //Rotating the array
            

      }

}
