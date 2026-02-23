import java.util.*;

public class climbingstairs{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of stairs");
        int n=sc.nextInt();
        int a=1;
        int b=2;
        if(n==1){
            System.out.println(a);
        }
        else if(n==2){
            System.out.println(b);
        }
        else{
            for(int i=3;i<=n;i++){
                int c=a+b;
                a=b;
                b=c;
            }
            System.out.println(b);
        }
    }
}