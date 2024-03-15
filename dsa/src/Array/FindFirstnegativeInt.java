public class FindFirstnegativeInt {
    public static void main(String[]args){
        System.out.println(FirstNegInt(new int[]{1,2,3,-5,-1}));
    }
    private static int FirstNegInt(int[]arr){
        for(int i:arr){
            if(i<0)return i;
        }
        return 0;
    }
}
