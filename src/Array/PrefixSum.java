package Array;

import static Utility.ArrayUtility.printArray;
import static Utility.ArrayUtility.sampleArray;

public class PrefixSum {
    public int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }

    public static void main(String[] args) {
        PrefixSum ps = new PrefixSum();
        printArray(ps.runningSum(sampleArray(3)));
    }
}
