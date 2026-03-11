import java.util.*;

public class pow{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<31;i++){
            if(n==Math.pow(2, i)){
                System.out.println("true");
                sc.close();
                return;
            }
        }
        System.out.println("false");
        sc.close();
    }
}