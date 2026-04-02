import java.util.*;

public  class nimgame{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%4==0){
            System.out.println("False");
        }
        else{
            System.out.println("True");
        }
    }
}