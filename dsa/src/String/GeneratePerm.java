package String;
import java.util.*;
public class GeneratePerm{
    public static void main(String []args){
       GenPermutation("abb");
    }
    public static void GenPermutation(String s){
        List<String> prem=new ArrayList<String>();
        Generate("",s,prem);

        for(String i:prem){
            System.out.println(i);
        }
    }
    private static void Generate(String prefix,String s,List<String>prem){
        if(s.length()==0){
            prem.add(prefix);
            return;
        }
        for(int i=0;i<s.length();i++){
            Generate(prefix+s.charAt(i),s.substring(0,i)+s.substring(i+1),prem);
        }
    }

    // Time complexcity is O(n!)

    /*
    This can be optimized to O(n*n!)
    */  
}