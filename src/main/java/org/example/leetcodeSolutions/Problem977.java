package org.example.leetcodeSolutions;

public class Problem977 {
    public int[] sortedSquares(int[] nums) {

        for(int i = 0; i<nums.length; i++){
            nums[i] = nums[i] * nums[i];
        }

        int[] resultArray = new int[nums.length];

        int beginingIndex = 0;
        int lastIndex = nums.length-1;
        int count = nums.length-1;

        while (count>=0){
            if(nums[beginingIndex] > nums[lastIndex]){
                resultArray[count] = nums[beginingIndex];
                count--;
                beginingIndex++;
            } else {
                resultArray[count] = nums[lastIndex];
                count--;
                lastIndex--;
            }
        }
        return resultArray;
    }
}
