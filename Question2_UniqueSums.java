import java.util.*;

public class Question2_UniqueSums {
    public static void main(String[] args) {
        // Here i am testing with the examples from the problem
        int target = 10;
        int[] nums = {1, 2, 3, 4, 5};
        System.out.println("Example 1:");
        System.out.println("Target: " + target + ", Numbers: " + Arrays.toString(nums));
       
        int ways = countWays(target, nums);
        System.out.println("Found " + ways + " unique combinations");
        System.out.println();

        // second example 
        target = 17;
        nums = new int[]{1, 2, 4, 7, 5};
        System.out.println("Example 2:");
        System.out.println("Target: " + target + ", Numbers: " + Arrays.toString(nums));
       
        ways = countWays(target, nums);
        System.out.println("Found " + ways + " unique combinations");
    }

    // This function finds all unique ways to sum numbers to reach target
    public static int countWays(int target, int[] nums) {
        Set<String> found = new HashSet<>();
        
        // bit manipulation 
        int n = nums.length;
        for (int mask = 1; mask < (1 << n); mask++) {
            int sum = 0;
            List<Integer> combo = new ArrayList<>();
            
            // check which numbers are included in this combination (using bitwise and)
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    sum += nums[i];
                    combo.add(nums[i]);
                }
            }
            
            // if we found a valid combination, add it tp our set
            if (sum == target) {
                Collections.sort(combo); // sort to make combinations unique
                found.add(combo.toString());
            }
        }
        
        return found.size();
    }
}
