 import java.util.*;

public class subarrayIntegers {

    
    public static int subarraysWithKDistinct(int[] nums, int k) {
        return atMostK(nums, k) - atMostK(nums, k - 1);
    }

    private static int atMostK(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        int left = 0, right = 0;
        int count = 0;

        while (right < nums.length) {
            int rightNum = nums[right];
            freqMap.put(rightNum, freqMap.getOrDefault(rightNum, 0) + 1);

            if (freqMap.get(rightNum) == 1) {
                k--;  
            }

            while (k < 0) {
                int leftNum = nums[left];
                freqMap.put(leftNum, freqMap.get(leftNum) - 1);
                if (freqMap.get(leftNum) == 0) {
                    k++;
                }
                left++;
            }

            count += right - left + 1;
            right++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();


        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }


        System.out.print("Enter value of k: ");
        int k = scanner.nextInt();

  
        int result = subarraysWithKDistinct(nums, k);
        System.out.println("Number of subarrays with exactly " + k + " different integers: " + result);

        scanner.close();
    }
}
 
