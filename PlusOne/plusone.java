import java.util.*;

public class plusone {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // boolean allNine = true;

        // for (int i = n - 1; i >= 0; i--) {
        //     if (a[i] == 9) {
        //         a[i] = 0;
        //     } else {
        //         a[i] = a[i] + 1;
        //         allNine = false;
        //         break;
        //     }
        // }

        // System.out.println("The updated array is:");

        // if (allNine) {
        //     System.out.print("1 ");
        // }

        // for (int i = 0; i < n; i++) {
        //     System.out.print(a[i] + " ");
        // }

        for(int i=n-1;i>=0;i--){
            if(a[i]<9){
                a[i]++;
                for (int j = 0; j < n; j++) {    
                    System.out.print(a[j] + " ");
        }

                return;
            }
            a[i]=0;
        }
        a=new int[n+1];
        a[0]=1;

        System.out.println("The updated array is:");
        for (int i = 0; i < n+1; i++) {    
            System.out.print(a[i] + " ");
        }
    }
}