import java.util.*;

public class searchindexposition{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length of array");
        int l=sc.nextInt();
        int a[]=new int[l];
        System.out.println("Enter the elements of array");
        for(int i=0;i<l;i++){
            a[i]=sc.nextInt();

        }
        System.out.println("Enter the value to search");
        int val=sc.nextInt();
        int c=0;
        for(int i=0;i<l;i++){
            if(a[i]<val){
                c++;

            }
        }
        System.out.println("The index position of the value is:"+c);
    }

}