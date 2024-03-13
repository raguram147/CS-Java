
import java.util.*;
public class TwoSum {
    /*
     * Example 1:
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     *  
     */
    public static void main(String[]args){
        int[] ans=TwoSome(new int[] {2,7,11,15},9);
        for(int i:ans){
            System.out.println(i);
        }
        
    }
    private static int[] TwoSome(int arr[],int k){
        HashMap<Integer,Integer>data=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!data.containsKey(arr[i]-k)){
                data.put(arr[i],i);
            }
            else{
                return new int[]{data.get(arr[i]-k),i};
            }
        }
        return new int[]{};
    }
}
