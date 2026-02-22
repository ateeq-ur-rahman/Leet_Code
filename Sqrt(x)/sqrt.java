import java.util.*;
public class sqrt{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int r=n;

        while (r*r>n){
            r=(r+n/r)/2;

        }
        System.out.println(r);
    }
}