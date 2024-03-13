package String;
import java.util.*;
public class Acronym {
    public static void main(String[]args){
        System.out.println(IsAcronym(Arrays.asList("apple","ball","cat"),"abc"));
    }
    public static Boolean IsAcronym(List<String> words, String s) {
        String temp="";
        for(String item: words){
            temp+=item.charAt(0);
        }
        if(temp.equals(s))return true;
        return false;
    }
}
