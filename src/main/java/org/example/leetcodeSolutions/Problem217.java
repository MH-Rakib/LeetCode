package org.example.leetcodeSolutions;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Problem217 {

    public List<int[]> getTestCase(){
        List<int[]> testCases = new ArrayList<>();
        testCases.add(new int[]{1, 5, -2, -4, 0});
        testCases.add(new int[]{1, 5, -2, -5, 1});

        return testCases;
    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hashSet = new HashSet<Integer>();

        for(int number : nums){
            if(hashSet.contains(number)){
                return true;
            }
            hashSet.add(number);
        }
        return false;
    }
}
