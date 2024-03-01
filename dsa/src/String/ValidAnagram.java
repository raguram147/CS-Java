package String;

import java.util.HashMap;

public class ValidAnagram {
     /*
Given two strings s and t, return true if t is an anagram of s, and false otherwise.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: s = "anagram", t = "nagaram"
Output: true


  */
  
  public static void main(String[]args){
    System.out.println(ValidAnagrams("anagram","negaram"));
  }
  private static Boolean ValidAnagrams(String s,String t){
    if(s.length()!=t.length()) return false;
    HashMap<Character,Integer> map=new HashMap<Character,Integer>();
    for(char c:s.toCharArray()){
        if(!map.containsKey(c)){
            map.put(c,1);
        }
        else{
            map.put(c,map.get(c)+1);
        }
    }
    for(char c:t.toCharArray()){
        if(!map.containsKey(c))return false;
        else map.put(c,map.get(c)-1);
    }
    return true;
  }
}
