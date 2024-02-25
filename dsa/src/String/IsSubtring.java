package String;

public class IsSubtring {
    public static void main(String[] args){
        System.out.println(Issub("ab","abc"));
    }

    private static Boolean Issub(String a,String b){
        if(b.contains(a)) return true;
        return false;
    }
}
