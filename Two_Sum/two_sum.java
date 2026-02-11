import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class two_sum {

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }

            map.put(nums[i], i);
        }

        // Since the problem guarantees one solution, this won't be reached
        return new int[0];
    }

    public static void main(String[] args) {
        // Example 1
        Scanner sc=new Scanner(System.in);

        int[] nums;
        int target,n;
        System.out.println("Enter the number of elements in the array:");
        n=sc.nextInt();

        nums=new int[n];

        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the target value:");
        target=sc.nextInt();



        

        int[] result = twoSum(nums, target);

        System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
    }
}
