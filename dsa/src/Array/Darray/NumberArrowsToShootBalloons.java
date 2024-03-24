package Darray;
import java.util.*;

public class NumberArrowsToShootBalloons {
    public static void main(String []args){
        System.out.println(BruteForce(new int[][] {{1,2},{3,4},{5,6},{7,8}}));
    }
//Time= O(NlogN)
    public static int BruteForce(int[][]arr){
        int arrow=0;
        Arrays.sort(arr,Comparator.comparingInt(o -> o[1]));
        int prev=arr[0][1];
        for(int i=1;i<arr.length;i++){
            if((arr[i][0]>prev)){
                arrow++;
                prev=arr[i][1];
            }
        }
        return arrow+1;
    }
}
