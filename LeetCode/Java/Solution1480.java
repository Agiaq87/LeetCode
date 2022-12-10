package LeetCode.Java;

import utils.Java.Utils;

public final class Solution1480 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, 4};
        Utils.printArray(arr, false);
        Utils.printArray(new Solution1480().runningSum(arr), false);

        arr = new Integer[]{1, 1, 1, 1, 1};
        Utils.printArray(arr, false);
        Utils.printArray(new Solution1480().runningSum(arr), false);

        arr = new Integer[]{3, 1, 2, 10, 1};
        Utils.printArray(arr, false);
        Utils.printArray(new Solution1480().runningSum(arr), false);
    }

    public Integer[] runningSum(Integer[] nums) {
        Integer[] result = new Integer[nums.length];
        int eval = 0;

        for (int i = 0; i < nums.length; i++) {
            eval = 0;
            for (int j = 0; j <= i; j++) {
                eval += nums[j];
            }
            result[i] = eval;
        }

        return result;
    }
}