package String;

import java.util.*;

public class FirstUniqueChar {
    public static void main(String[]args){
        System.out.println(IsUnique("loveleetcode"));
    }
    private static int IsUnique(String a){
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
}
