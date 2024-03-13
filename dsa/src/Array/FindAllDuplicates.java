
import java.util.*;

public class FindAllDuplicates {
    /*
     * 
     * 
     * 
Given an integer array nums of length n where all the integers of nums are in the range [1, n] and each integer appears once or twice, return an array of all the integers that appears twice.

You must write an algorithm that runs in O(n) time and uses only constant extra space.

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [2,3]

     */
    public static void main(String[] args){
        List<Integer> data=FindAllDup(new int[]{1,2,3,4,5,6,1,3,6});
        for(int i:data){
            System.out.println(i);
        }
    }
    public static List<Integer> FindAllDup(int[] arr){
        Map<Integer,Integer> d=new HashMap<Integer,Integer>();
        for(int i:arr){
            if(d.get(i)==null){
                d.put(i,1);
                
            }
            else d.put(i,1+d.get(i));
        }
        List<Integer> data=new ArrayList<Integer>();
        
        for(Map.Entry<Integer,Integer> st:d.entrySet()){
            if(st.getValue()>1)data.add(st.getKey());
        }
        return data;
    }
}
