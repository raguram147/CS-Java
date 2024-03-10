package Array;

public class LognestSeqPerfixSum {
    public static void main(String []args){
        System.out.println(prefixSum(new int[]{1,2,3,4,5,6,1,2}));
    }
    private static int prefixSum(int[]arr){
        int sum=arr[arr.length-1];
        for(int i=0;i<arr.length-1;i++){
            if(arr[i+1]==arr[i]+1){
                sum+=arr[i];
            }
        }
        return sum;
    }
}
