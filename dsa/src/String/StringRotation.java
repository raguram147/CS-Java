package String;

public class StringRotation {
    /*
     * Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
     * A shift on s consists of moving the leftmost character of s to the rightmost position.
     * 
     * 
     * For example, if s = "abcde", then it will be "bcdea" after one shift.
     * 
     * 
     */

     public static void main(String[]args){
        System.out.println(IsRotate("abcde","cdeab"));
     }
     private static Boolean IsRotate(String a, String b){
        if((a+a).contains(b))return true;      
        return false;
     }
}
