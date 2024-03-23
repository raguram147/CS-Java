package String;
import java.util.*;
public class RemovethridDup {
    public static void main(String []args){
        System.out.println(RemoveDup("ababaad"));
    }   
    private static String RemoveDup(String str){
        HashMap <Character,Integer> data=new HashMap <Character,Integer>();
        String str1="";
        
        for(int i=0;i<str.length();i++){
            int count=data.getOrDefault(str.charAt(i),0);
            if(count<2){
                data.put(str.charAt(i),count+1);
                str1+=str.charAt(i);
            }
        }
        return str1;
    }
}
