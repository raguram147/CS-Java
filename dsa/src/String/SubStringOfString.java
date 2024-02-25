package String;
import java.util.*;
public class SubStringOfString {
 
    public static void main(String[]args){
        List <String> sub=new ArrayList<String>();
        ListSub("abc",sub);
        for(String i : sub){
            System.out.println(i);
        }
    }
    private static void ListSub(String a,List<String> s){
        for(int i=0;i<a.length();i++){
            for(int j=i+1;j<=a.length();j++){
                s.add(a.substring(i,j));
            }
        }
    }
}
