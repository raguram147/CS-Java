package String;

import java.util.*;

public class PalindromicSubString {
    public static void main(String[] args) {
        System.out.println(PalindormicSubStr("ccabaad"));
        System.out.println(DPpalindormicSubstring("ccabaad"));
    }

    // Return number of palindormic substring

    /*
     *  breakdown the problem 
     * 1. get substring of the string
     * 2. check is that a palindorme or not
     * 3. if so add to the hashset to maintaine the duplicate removed else use list and count
     * 
     * Approach 1: TIME: O(N^2) and Space O(N)
     */

    private static int PalindormicSubStr(String s){
        HashSet<String> str=new HashSet<String>();
        String temp;
        
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                temp=s.substring(i,j);
                StringBuilder sb=new StringBuilder(temp);

                sb.reverse();

                if(sb.toString().equals(temp)){
                    str.add(temp);
                }
            }
            
        }
        return str.size();
    }

    /* 
     * 
     * Approach- 2 optimize it
     * 
     * DP programming
     * 
     * 
    */
    private static int DPpalindormicSubstring(String s){
        int n=s.length();
        Boolean [][] palindorme=new Boolean[n][n];
        int count=0;

        // each char is a substring and each single char is palindrome
        for(int i=0;i<s.length();i++){
            palindorme[i][i]=true;
            count++;
        }

        for(int i=2;i<=s.length();i++){
            for(int j=0;j<=s.length()-i;j++){
                int k=j+i-1;
                if((s.charAt(j)==s.charAt(k)) && (i==2||(palindorme[j+1][k-1]!=null && palindorme[j+1][k-1]))){
                    palindorme[j][k]=true;
                    count++;
                }
            }
        }
        return count;
    }


}
