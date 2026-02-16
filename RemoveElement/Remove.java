import java.util.*;

public class Remove{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array");
        int l=sc.nextInt();
        int a[]=new int[l];
        System.out.println("Enter the elements of array");
        for (int i=0;i<l;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the value to be removed");
        int val=sc.nextInt();
        int c=0;
        for(int i=0;i<l;i++){
            if(a[i]!=val){
                a[c]=a[i];
                c++;
            }
        }

        System.out.println("The array after removing the value is:");
        for(int i=0;i<c;i++){
            System.out.print(a[i]+" ");
        }
    }

}