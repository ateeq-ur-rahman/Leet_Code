import java.util.*;

public class reversebits{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        for(int i=0;i<32;i++){
            rev=rev<<1;
            rev=rev|(n&1);
            n=n>>1;
        }
        System.out.println(rev);
    }
}