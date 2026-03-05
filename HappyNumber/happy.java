import java.util.*;

public class happy{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Integer> s=new HashSet<>();
        while(n!=1 && !s.contains(n)){
            s.add(n);
            int sum=0;
            while(n>0){
                int d=n%10;
                sum+=d*d;
                n=n/10;
            }
            n=sum;
        }
        if(n==1){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}