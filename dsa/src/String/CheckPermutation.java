package String;
import java.util.*;
public class CheckPermutation {
    public static void main(String[]args){
        System.out.println(CheckInclusion("ab","eidboaoo"));
    }   
    public static Boolean CheckInclusion(String s1, String s2){
        List <String> perm=new ArrayList<String>();
        permutation(s1,perm,"");
        for(String i : perm){
            if(s2.contains(i))return true;
        }
        return false;
    }
    private static void permutation(String s,List<String>perm,String a){
        if(s.length()==0)
        {
            perm.add(a);
            return;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            String t=s.substring(0,i)+s.substring(i+1);
            permutation(t,perm,a+ch);
        }
    }
}
