package hash_map;

import java.util.*;

public class file2 {
      public static void main(String[] args) {
            HashMap<Integer, Integer> hs = new HashMap<>();
            // problem 1- find the firt non reapititng element using hash map
            int arr[] = { 1, 2, 3, 2, 1, 5, 6, 1, 2, 3 };
            for (int i = 0; i < arr.length; i++) {
                  int val = arr[i];
                  if (hs.containsKey(val)) {
                        int temp = hs.get(val);
                        hs.put(val, temp + 1);
                  } else {
                        hs.put(val, 1);
                  }
            }

            for (int j = 0; j < arr.length; j++) {
                  int val = arr[j];
                  if (hs.get(val) == 1) {
                        System.out.print(val);
                        break;
                  } // else {
                    // continue;
                    // }
            }
      }

}
