package org.example.leetcodeSolutions;

import java.util.ArrayList;
import java.util.List;

public class Problem448 {

    public List<int[]> getTestCase(){
        List<int[]> cases = new ArrayList<>();
        cases.add(new int[]{4,3,2,7,8,2,3,1});
        cases.add(new int[]{1, 1, 1});

        return cases;
    }

    public List<Integer> findDisappearedNumbers(int[] nums) {

        int[] arr = new int[nums.length+1];

        for(int number : nums){
            arr[number]++;
        }

        List<Integer> missingNumbers = new ArrayList<>();

        for(int i = 1; i < arr.length; i++){
            if(arr[i] == 0){
                missingNumbers.add(i);
            }
        }
        return missingNumbers;
    }
}
