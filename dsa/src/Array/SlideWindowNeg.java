import java.util.*;
public class SlideWindowNeg {

    public static void main(String[]args){
        SlideNeg(new int[]{1,2,3,-5,-1},3);
    }
    public static void SlideNeg(int arr[],int k){
        List<Integer> data=new ArrayList<Integer>();
        Deque<Integer> d=new LinkedList<Integer>();
        FindNeg(arr,k,data);
        OptimalFindNeg(arr,k,d);
        for(int i:data){
            System.out.println(i);
        }
        System.out.println("Optimal approach using LINKED LIST");
        for(int i:d){
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
    private static void OptimalFindNeg(int[]arr,int k,Deque<Integer>d){
        for(int i=0;i<k;i++){
            if(arr[i]<0){
                d.addLast(i);
            }
        }
        for(int i=k;i<arr.length;i++){
           if(d.isEmpty()) 
            while(!d.isEmpty()&& d.peekFirst()<i-k+1){
                d.removeFirst();
            }
            if(i<arr.length && arr[i]<0){
                d.addLast(i);
            }
        }
    }
}
