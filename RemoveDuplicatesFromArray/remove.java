import java.util.*;

public class remove{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length of array");
        int l=sc.nextInt();
        int a[]=new int[l];
        System.out.println("Enter the elements of array");
        for (int i=0;i<l;i++){
            a[i]=sc.nextInt();
        }

        Arrays.sort(a);
        int d=0;
        for(int i=1;i<l;i++){
            if(a[i]==a[i-1]){
                d++;
            }
            else{
                a[i-d]=a[i];

            }
        }
        System.out.println("The array after removing duplicates is:");
        for(int i=0;i<l-d;i++){
            System.out.print(a[i]+" ");
        }
    }
}