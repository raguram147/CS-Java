package String;

public class LongestPlandiromeSubString {
    public static void main(String[] args){
        System.out.println(LongestPalidorme("ccabad"));
        System.out.println(OptimalSolution("ccabad"));
        System.out.println(IndOptimization("ccabad"));
    }
    /*
     * Brute force method - Direct approach
     * 
     * Time- O(n^3) n^2 for substring n for reverse the string
     * 
     * Space- O(1) in worst case the length of the string 
    */
    private static String LongestPalidorme(String s){
        String lognestStr="";
        String temp="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                temp=s.substring(i,j);
                if(IsPalindrome(temp)){
                    if(temp.length()>lognestStr.length()){
                        lognestStr=temp;
                    }
                }
            }
        }
        return lognestStr;
    }
    private static Boolean IsPalindrome(String str){
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        if(sb.toString().equals(str))return true;
        return false;
    }


    /*
     * How to optimize???
     * 
     * expand around center concept
     * 
     * 
     * Time=O(n^2)
     * Space=O(1)
     * 
     * This might work in few test case it might fail
     * 
     * so we have work of few more adjustment based on even and odd index of the current char
     * 
     */

     private static String OptimalSolution(String str){
        if(str==null || str.length()<1)return "";
        int start=0,end=0;
        for(int i=0;i<str.length();i++){
            int len1=expandCenter(str,i,i);
            int len2=expandCenter(str,i,i+1);
            int len=Math.max(len1,len2);
            if(len>end-start){
                start=i-(len-1)/2;
                end=i+len/2;
            }
        }
        return str.substring(start,end+1);
     }

     private static String IndOptimization(String str){
        if(str==null || str.length()<0)return "";
        int [] indPal={0,0};
        for(int i=0;i<str.length();i++){
            int l1[]=IndexpandCenter(str,i,i);
            if(l1[1]-l1[0]>indPal[1]-indPal[0]){
                indPal=l1;
            }
            if(i+1<str.length()&&str.charAt(i)==str.charAt(i+1)){
                int []l2=IndexpandCenter(str,i,i+1);

                if(l2[1]-l2[0]>indPal[1]-indPal[0]){
                    indPal=l2;
                }
            }
        }
        return str.substring(indPal[0],indPal[1]+1);
     }
     private static int[] IndexpandCenter(String s,int left,int right){
        while((left>=0&&right<s.length())&&(s.charAt(left)==s.charAt(right))){
            left--;
            right++;
        }
        return new int[]{left+1,right-1};
     }

     private static int expandCenter(String s,int start,int end){
        while((start>=0&&end<s.length())&&(s.charAt(start)==s.charAt(end))){
            start--;
            end++;
        }
        return end-start-1;
     }
}
