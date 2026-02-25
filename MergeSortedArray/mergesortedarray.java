import java.util.*;

public class mergesortedarray{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int arr1[]=new int[r];
        for(int i=0;i<r;i++){
            arr1[i]=sc.nextInt();
        }
        int l =sc.nextInt();
        int arr2[]=new int[l];
        for(int i=0;i<l;i++){
            arr2[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int n=sc.nextInt();

        int k=m+n-1;

        int i=m-1;
        int j=n-1;
        while (i>=0 && j>=0){
            if(arr1[i]>arr2[j]){
                arr1[k]=arr1[i];
                i--;
            }
            else{
                arr1[k]=arr2[j];
                j--;
            }
            k--;

        }
        while (j>=0){
            arr1[k]=arr2[j];
            j--;
            k--;
        }
        for(int p=0;p<arr1.length;p++){
            System.out.print(arr1[p]+" ");
        }
    }
}