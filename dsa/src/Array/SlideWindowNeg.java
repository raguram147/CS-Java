import java.util.*;
public class SlideWindowNeg {

    public static void main(String[]args){
        SlideNeg(new int[]{1,2,3,-5,-1},3);
    }
    public static void SlideNeg(int arr[],int k){
        List<Integer> data=new ArrayList<Integer>();
        List<Integer> data1=new ArrayList<Integer>();
        FindNeg(arr,k,data);
        OptimalFindNeg(arr,k,data1);
        for(int i:data){
            System.out.println(i);
        }
        System.out.println("Optimal approach tracking the index in memory");
        for(int i:data1){
            System.out.println(i);
        }
    }
    /*
    This is a brute force solution of Time=> O((n-k+1)*k)
    */ 
    private static void FindNeg(int []arr,int k,List<Integer>d){
        for(int i=0;i<=arr.length-k;i++){
            Boolean found=false;
            for(int j=i;j<i+k;j++){
                if(arr[j]<0){
                    d.add(arr[j]);
                    found=true;
                    break;
                }
                
            }
            if(!found)d.add(0);
        }
    }
    /*
    This is a optimal solution of Time=> O(n)
    */ 
    private static void OptimalFindNeg(int[]arr,int k,List<Integer>d){
        int negIndex=0;
        // int negElement;
        for(int i=k-1;i<arr.length;i++){
            while((negIndex<i)&&(negIndex<=i-k||arr[negIndex]>=0)){
                negIndex++;
            }

            if(arr[negIndex]<0){
                d.add(arr[negIndex]);
            }
            else{
                d.add(0);
            }
        }
    }
}
