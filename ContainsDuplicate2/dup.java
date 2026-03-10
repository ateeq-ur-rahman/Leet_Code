import java.util.*;

public class dup{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<n;i++){
            if(set.contains(arr[i])){
                System.out.println("true");
                sc.close();                return;
            }
            set.add(arr[i]);
            if(i>=k){
                set.remove(arr[i-k]);
            }


        }
        System.out.println("false");
        sc.close();

    }
}