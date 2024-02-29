package Array;

public class ZeroMatrix {
    public static void main(String[]args){
        int [][]arr={{1,2,0},{0,1,5},{1,2,3}};
        Zero(arr);
        // for(int i=0;i<arr.length;i++){
        //     for(int j=0;j<arr[0].length;j++){
        //         System.out.println(arr[i][j]);
        //     }
        // }
        for(int[] i:arr){
            for(int j:i){
                System.out.println(j);
            }
            
        }
    }
    private static int[][] Zero(int a[][]){
        Boolean []row=new Boolean[a.length];
        Boolean []col=new Boolean[a[0].length];

        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[0].length;j++){
                if(a[i][j]==0){
                    row[i]=true;
                    col[j]=true;
                }
            }
        }
        for(int i=0;i<row.length;i++){
            if(row[i]!=null&&row[i]==true){
                for(int j=0;j<a[0].length;j++){
                    a[i][j]=0;
                }
            }
        }
        for(int j=0;j<col.length;j++){
            if(col[j]!=null&&col[j]==true){
                for(int i=0;i<a.length;i++){
                    a[i][j]=0;
                }
            }
        }
        return a;
    } 
}
