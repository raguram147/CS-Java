package Array;

public class RotateTheArray {
    public static void main(String[]args){
        int[]rotated=Rotate(new int[]{1,2,3,4,5,6,7},3);
        for(int i:rotated){
            System.out.println(i);
        }
    }
    /*
    TIme complexcity -O(n**2)
    
    
    
    private static int[] Rotate(int[] arr,int time){
        for(int i=0;i<time;i++){
            int temp=arr[0];
            for(int j=0;j<arr.length-1;j++){
                arr[j]=arr[j+1];
            }
            arr[arr.length-1]=temp;
        }
        return arr;
    }

    which can be optimized currently the above approach is rotating the array each and every time from the start to end

    1. If we can get the last time element started to rotated 
    2. and we can continue the rotation

    for example 
    
    1,2,3 k=2

    the start =0 end=length of array

    so that 2,3,1

    now start= k end=length of array


    */ 
    private static int[] Rotate(int[]arr,int time){
        int n=arr.length;
        time=time%n;

        reverse(arr,0,time-1);
        reverse(arr,time,n-1);
        reverse(arr,0,n-1);
        return arr;
    }

    private static void reverse(int []arr,int s,int e){
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        return;
    }

}
