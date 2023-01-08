package org.example.leetcodeSolutions;

public class Problem136 {
    public int singleNumber(int[] nums) {
        int result = 0;

        for(int i =0; i<nums.length; i++){
            // XOR operation
            result = result^nums[i];
        }
        return result;
    }
}
