package com.Arrays.Easy;

public class Q1512 {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        for (int i=0;i<nums.length-1;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j])
                    count++;
            }
        }
        System.gc();
        return count;
    }
}
