import java.util.*;

public class coins{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0;
        int i=1;
        while(n>=i){
            n-=c;
            c++;
            i++;
        }
        System.out.println(c-1);
    }
}