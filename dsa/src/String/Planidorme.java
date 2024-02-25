package String;

public class Planidorme {
    public static void main(String []args){
        System.out.println(Plaindorme("abc"));
        System.out.println(StrBuilderPalindorme("aabaa"));
    }
    public static Boolean Plaindorme(String a){
        StringBuilder s=new StringBuilder(a);
        if(s.reverse().toString().equals(a)){
            return true;
        }
        return false;
    }
    private static Boolean StrBuilderPalindorme(String a){
        String s="";
        int i=a.length()-1;
        while(i>=0){
            s+=a.charAt(i);
            i--;
        }
        if(s.equals(a))return true;
        return false;
    }
}
