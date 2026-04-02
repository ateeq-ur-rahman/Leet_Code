import java.util.*;

public class powerofthree{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n<1){
            System.out.println("False");
        }
        else{
            while (n%3==0){
                n=n/3;
            }
            if (n==1){
                System.out.println("True");
            }
            else{
                System.out.println("False");
            }

        }
    }
}