package String;
import java.util.HashMap;
public class DNAStorgae {
    public static void main(String[]args){
        HashMap <String,Character> map=new HashMap<String,Character>();
        map.put("00",'A');
        map.put("01",'T');
        map.put("10",'C');
        map.put("11",'G');
        System.out.println(DNA("0001",map));
    }
    private static String DNA(String in,HashMap <String,Character> m){
        StringBuilder out=new StringBuilder();
        for(int i=0;i<in.length();i+=2){
            String pair=in.substring(i,i+2);
            // switch(pair){
            //     case "00":
            //         out.append('A');
            //         break;
            //     case "01":
            //         out.append('T');
            //         break;
            //     case "10":
            //         out.append('A');
            //         break;
            //     case "11":
            //         out.append('A');
            //         break;
            // }
            if(m.containsKey(pair)){
                out.append(m.get(pair));
            }
        }

        return out.toString();
    }
}
