package org.example;

import org.example.helperClasses.LinkedList;
import org.example.helperClasses.ListNode;
import org.example.leetcodeSolutions.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Problem2022 problem2022 = new Problem2022();

        int[] arr = new int[]{1,2,3,4};

        int[][] result = problem2022.construct2DArray(arr, 2,2 );
    }
}