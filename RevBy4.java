import java.util.*;

class RevBy4 {
    public static void main(String []ar) {
        int res = 0;

        for (int i = 10000; i <= 24999; i++) {
            if (new StringBuffer(String.valueOf(i)).reverse().toString().replaceAll("\\s+","").equals(String.valueOf(i * 4).replaceAll("\\s+",""))) {
                res = i;
            }
        }
    
        System.out.println("Numbers is: " + res) ;    
    }
}
