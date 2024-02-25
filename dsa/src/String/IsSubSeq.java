package String;

public class IsSubSeq {
    public static void main(String args[]){
        System.out.println(IsSeq("x","abc"));
    }

    private static Boolean IsSeq(String a,String b){
        int i=0,j=0;
        while(i<a.length()&&j<b.length()){
            if(b.indexOf(a.charAt(i))>-1){
                i++;
            }
            j++;
        }

        return i==a.length();
    } 
}
