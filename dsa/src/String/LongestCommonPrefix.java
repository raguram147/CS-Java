package String;
import java.util.*;
public class LongestCommonPrefix {
    public static void main(String[]args){
        System.out.println(CommonPrefix(new String[]{"flower","flow","flaw"}));
    }
    private static String CommonPrefix(String[]arr){
        // String prefix="";
        Arrays.sort(arr);
        String prefix=arr[0];
        for(String i:arr){
            while(i.indexOf(prefix)!=0){
                prefix=prefix.substring(0,prefix.length()-1);
            }
        }
        return prefix;
    }
}
