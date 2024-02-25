package String;

import java.util.*;
public class SubsequenceOfString {
    public static void main(String[]args){
        List<String> sub= Subsequence("abc");
        for(String item : sub){
            System.out.println(item);
            
        }
        System.out.println(sub.size());
    }
    
    private static List<String> Subsequence(String a){
        List<String> temp=new ArrayList<String>();
        generateSeq(a,0,"",temp);
        return temp;
    }
    private static void generateSeq(String a,int ind,String curr,List<String> seq){
        if(ind==a.length()){
            seq.add(curr);
            return;
        }
        generateSeq(a,ind+1,curr+a.charAt(ind),seq);
        generateSeq(a,ind+1,curr,seq);
    }
}