import java.util.*;

public class palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int x=sc.nextInt();
        int o=x;
        int r=0;
        while(x>0){
            int d=x%10;
            r=r*10+d;
            x=x/10;
        }
        if(o==r){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}