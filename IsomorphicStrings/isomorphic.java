import java.util.*;

public class isomorphic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();

        if(s.length()!=t.length()){
            System.out.println("false");
            return;
        }
        Map<Character,Character> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(m.containsKey(c1)){
                if(m.get(c1)!=c2){
                    System.out.println("false");
                    return;
                }
            }
            else{
                if(m.containsValue(c2)){
                    System.out.println("false");
                    return;
                }
            }
        }
        System.out.println("true");
    }
}