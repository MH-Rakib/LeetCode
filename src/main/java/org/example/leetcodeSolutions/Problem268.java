package org.example.leetcodeSolutions;

public class Problem268 {
    public int missingNumber(int[] nums) {
        // only one number is missing within the range
        // min = 0, max = n [length of array]
        // Steps:
        // 1. Get expected sum within the range
        // 2. Get actual sum within the range
        // 3. Result = expected sum - actual sum

        int length = nums.length;
        int expectedSum = ( length * ( length + 1 ) ) / 2;

        int actualSum = 0;

        for(int num : nums){
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
