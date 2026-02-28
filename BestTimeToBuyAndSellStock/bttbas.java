import java.util.*;

public class bttbas{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int[] a=new int[x];
        for(int i=0;i<x;i++){
            a[i]=sc.nextInt();
        }
        int min=a[0];
        int max=0;
        for(int i=1;i<x;i++){
            if(a[i]<min){
                min=a[i];
            }
            else if(a[i]-min>max){
                max=a[i]-min;
            }
        }
        System.out.println(max);
    }
}