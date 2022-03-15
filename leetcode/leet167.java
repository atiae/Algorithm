package leetcode;

/**
 * leet167
 */
public class leet167 {
    public int[] twoSum(int[] numbers, int target) {
        int j=0;
        int k=numbers.length-1;
        while(j<k){
            if(numbers[j]+numbers[k]<target){
                j++;
            }else if(numbers[j]+numbers[k]>target){
                k--;
            }else{
                return new int []{j+1,j+1};
            }
        }
        return new int[]{-1,-1};
    }
    
}