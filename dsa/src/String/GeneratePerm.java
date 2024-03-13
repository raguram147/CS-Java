package String;
import java.util.*;
public class GeneratePerm{
    public static void main(String []args){
       GenPermutation("abb");
    }
    public static void GenPermutation(String s){
        List<String> prem=new ArrayList<String>();
        List<String> otpprem=new ArrayList<String>();
        Generate("",s,prem);
        OptGenerate(s.toCharArray(),s.length(),otpprem);
        for(String i:prem){
            System.out.println(i);
        }
        System.out.println("Optimal Solution");
        for(String i:otpprem){
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

    // Time complexcity is O(n*n!)

    /*
    This can be optimized to O(n!)
    Optimal solution below
    */  

    private static void OptGenerate(char[] cs, int n, List<String> otpprem){
        if(n==1){
            otpprem.add(new String(cs));
        }
        for(int i=0;i<n;i++){
            OptGenerate(cs,n-1,otpprem);
            if(n%2==0){
                swap(cs,i,n-1);

            }
            else{
                swap(cs,0,n-1);
            }
        }
    }
    private static void swap(char[] c,int i,int j){
        char temp=c[i];
        c[i]=c[j];
        c[j]=temp;
        return;
    }


}