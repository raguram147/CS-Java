package String;
import java.util.*;
public class LongestCommonSuffix {
    public static void main(String[]args){
        System.out.println(CommonSuffix(new String[]{"flower","floor","flavor"}));
    }
    private static String CommonSuffix(String [] arr){
        if(arr.length<0||arr==null)return "";
        Arrays.sort(arr); //log(n)
        for(int i=0;i<arr.length;i++){
            arr[i]=new StringBuilder(arr[i]).reverse().toString();//O(m*n)
        }
        String suffix=arr[0];
        for(String i:arr){//O(M*N)
            while(i.indexOf(suffix)!=0){
                suffix=suffix.substring(0,suffix.length()-1);
                // if(suffix.isEmpty())return "" ;
            }
        }
        return suffix;
    } 
}
