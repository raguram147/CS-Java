

public class MoveZeros {
 
    public static void main(String[]args){
        Move(new int[] {1,0,2,3,0,5,0});
    }
    private static void Move(int []arr){
        int i = 0; 
        for (int num:arr){
            if(num != 0){
                arr[i] = num;
                i++;
            }
        }

        while(i<arr.length){
            arr[i] = 0;
            i++;
        }

        for(int z:arr){
            System.out.println(z);
        }
    }
}
