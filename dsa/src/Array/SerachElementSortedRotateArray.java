package Array;

public class SerachElementSortedRotateArray {
    public static void main(String[]args){
        int arr[]=new int[]{4,5,6,7,0,1,2};
        int key=2;
        int pivot=Findpivot(arr);
        int res;
        if(pivot==-1)
            res=BinarySearch(arr,key,0,arr.length-1);
        if(key>arr[arr.length-1]){
            res=BinarySearch(arr,key,0,pivot);
        }
        else res=BinarySearch(arr,key,pivot+1,arr.length-1);

        System.out.println(res);
    }
    /*
    1. find the pivot of the array where the array start to rotate
    2. if pivot is not found then that means array is not rotated where we can find the element by default binary search
    3. case -1 if the key > array's last element that means the element must before the element in that case 
        start=0 end=pivot

    4. case -2 if the key< array's last element then 
        start=pivot+1 end=last of the array   
    
    
    */ 
    private static int Findpivot(int []arr){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return i;
            }
        }

        return -1;
    }
    private static int BinarySearch(int[]arr,int key,int start,int end){
        // int start=0;
        // int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==key)return mid;
            else if(arr[mid]<key){
                start=mid+1;
            }
            else end=mid-1;
        }
        return -1;
    }
    
    
}
