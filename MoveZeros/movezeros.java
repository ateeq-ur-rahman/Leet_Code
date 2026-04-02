import java.util.*;

public class movezeros {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        moveZeroes(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }

        public static void moveZeroes(int[] nums) {
            int n=nums.length;
            int count=0;
            for(int i=0;i<n;i++){
                if(nums[i]!=0){
                    nums[count++]=nums[i];
                }
            }
            while(count<n){
                nums[count++]=0;
            }
        }
    

}
