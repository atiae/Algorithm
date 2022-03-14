package leetcode;

import java.util.Arrays;

public class leet135 {
    public int candy(int[] ratings) {
        int size = ratings.length;
        int count = 0;
        if(ratings.length<2){
        	return size;
        }
        int[] nums = new int[size];
        Arrays.fill(nums, 1);
        for(int i=1;i<size;i++){
        	if(ratings[i]>ratings[i-1]){
        		nums[i] = nums[i-1]+1;
        	}
        }
        for(int i=size-1;i>0;i--){
        	if(ratings[i]<ratings[i-1]){
        		nums[i-1] = Math.max(nums[i-1], nums[i]+1);
        	}
        }
        for(int i=0;i<nums.length;i++){
            count+=nums[i];
        }
        return count;
    }
}
