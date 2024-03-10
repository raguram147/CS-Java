package Array;
import java.util.*;
public class ContainsDuplicate {
  /*
   * 
   * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
   * Example 1:
   * 
   * Input: nums = [1,2,3,1]
   * 
   * Output: true
   */

   public static void main(String[]args){
    System.out.println(IsContainsDup(new int []{1,2,3,4,55,2}));

   }

   private static Boolean IsContainsDup(int[]a){
      HashSet<Integer> data=new HashSet<Integer>();
      for(int i:a){
        if(data.contains(i))return true;
        else data.add(i);
      }
      return false;
   }
}
