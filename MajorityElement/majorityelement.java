import java.util.*;

public class majorityelement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int []a=new int[x];
        for(int i=0;i<x;i++){
            a[i]=sc.nextInt();
        }
        int count=1;
        int majority=a[0];
        for(int i=1;i<x;i++){
            if(a[i]==majority){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                majority=a[i];
                count=1;
            }
        }
        System.out.println(majority);
    }
}