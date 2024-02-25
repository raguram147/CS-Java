package String;

import java.util.*;

public class FirstUniqueChar {
    public static void main(String[]args){
        System.out.println(EfficientIsUnique("loveleetcode"));
        System.out.println(OptimalIsUnique("loveleetcode"));
    }
    private static int EfficientIsUnique(String a){
        HashMap <Character,Integer> data=new HashMap<Character,Integer>();
        for(int i=0;i<a.length();i++){
            if(!data.containsKey(a.charAt(i))){
                data.put(a.charAt(i),1);
            }
            else{
                data.put(a.charAt(i),(data.get(a.charAt(i))+1));
            }
        }
        int min=Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> e : data.entrySet()){
            if(e.getValue()==1){
                min=Math.min(min,a.indexOf(e.getKey()));
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }

    private static int OptimalIsUnique(String a){
        int [] ch=new int[26];
        for(int i=0;i<a.length();i++){
            if(ch[a.charAt(i)-97]==0){
                ch[a.charAt(i)-97]=i;
            }
            else ch[a.charAt(i)-97]=-1;
        }
        int mini=Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(ch[i]>0){
                mini=Math.min(mini,ch[i]);
            }
        }
        return mini==Integer.MAX_VALUE?-1:mini;
    }
}
