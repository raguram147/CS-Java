

public class LongestSubsequence {
    public static void main(String[] args) 
    { 
        // Longest subsequence with one 
        // difference is 
        // {1, 2, 3, 4, 3, 2} 
        int arr[] = { 1, 2, 3, 4, 5, 3, 2,3,4,5,6,7 }; 
        int n = arr.length; 
        System.out.println(longestSubseqWithDiffOne(arr, n)); 
    } 
    private static int longestSubseqWithDiffOne(int []arr,int size){
        int Max=0,len=0;
        for(int i=0;i<size-1;i++){
            if(arr[i+1]==arr[i]+1||arr[i]+1==arr[size-1]){
                len++;
            }
            else{
                Max=Math.max(size-len+1,Max);
                len=0;
            }
        }
        return len;
    }
}
