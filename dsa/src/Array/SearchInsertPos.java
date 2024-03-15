public class SearchInsertPos {
    /**
     * 
     * 
Search Insert Position

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.


Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2


Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1

    */

    public static void main(String[]args){
        System.out.println(Search(new int[] {1,3,5,6},2));
    }

    public static int Search(int[] a, int t) {
        int start=0;
        int end=a.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(a[mid]==t){
                return mid;
            }
            else if(a[mid]>t){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;   
    }
    
}
