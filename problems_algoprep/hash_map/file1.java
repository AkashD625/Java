package hash_map;

import java.util.*;

public class file1 {

      // public static void returncount(int[] n,int[] m){
      // HashMap<Integer, Integer> hs = new HashMap<>();
      // for(int i=0;i<n.length;i++){
      // if(hs.containsKey(n[i])==true){
      // int temp = hs.get(n[i]);
      // hs.put(n[i],temp+1);

      // }
      // else{
      // hs.put(n[i], 1);
      // }
      // }

      // for(int i=0;i<n.length;i++){
      // int val = n[i];
      // if(hs.containsKey(val)==true){
      // System.out.print(hs.get(val));
      // }
      // else{
      // System.out.print(0);
      // }
      // }

      // }
      public static void main(String[] args) {
            // hash map is something like table which contains key(type) and value defined
            // by the programmer. value may be boolean.
            // Hashing is the technique , which is used to implement the hashing.
            // ex - principle name with the school name
            // key -string value- string

            // facts-
            // keys in the hashtable are only following datatype
            // Integer
            // String
            // boolean
            // Long
            // Character

            // In hash map keys are acting as index
            // syntax -
            // HashMap<Integer(key type) ,Integer(values type)> hashname = new HashMap<>();
            // operations
            // Inser - hashname.put(10,70); where 10 is the key and 70 is value.(valid)
            // hashname(10,30); (valid) - this replaces the 70 with 30

            // Retrive the value based on the key values
            // hashmap.get(10); where the 10 is the key

            // containsKey - this will check whether the key is present or not
            // hashmap.containsKey(10); true , if it is not there then false
            // remove - this will remove the values with the help of key
            // hashmap.remove(48); where the 48 is the key.

            // hs.put(10, 30);
            // hs.put(20, 40);
            // hs.put(30, 50);
            // hs.put(40, 60);
            // hs.put(10, 60);// this will rename the valuue present in 10 key

            // System.out.println(hs.get(10));

            // hs.remove(10);
            // hs.containsKey(30);
            // hs.containsKey(100);

            // //Anather method of printing the array using different for loop
            // int arr[] = {1,2,3,6,5,4,8,9};
            // for(int val:arr){
            // System.out.print(val);
            // }

            // //for hashmap printing using this
            // System.out.println("Printed hashmap");
            // for(int key:hs.keySet()){
            // System.out.print(key);

            // }

            // ---------------------------------------------------------------------------------------------------------------------
            // problems -
            // 1 - find frequence of elements in the gien array using the given q
            // queries(using array)
            int[] arr1 = { 1, 2, 3, 4, 1, 2, 5, 6, 6, 6, 1 };
            int[] query1 = { 1, 2, 3, 4, 5, 6, 7 };
            // int[] ans = new int[query1.length];
            // int count =0;
            // for(int i=0;i<query1.length;i++){
            // for(int j=0;j<arr1.length;j++){
            // if(query1[i]==arr1[j]){
            // count = count+1;

            // }

            // }
            // ans[i] = count;
            // count=0;
            // }
            // for(int i=0;i<ans.length;i++){
            // System.out.print(ans[i]);
            // }

            // using hashmap
            returncount(query1, arr1);

      }
}
