public class MakeArrayNonDecreasing {
    public static void main(String[] args) {
        int[] nums = {4, 2, 5, 3, 5};
        int decrease = decrease(nums);
        System.out.println(decrease);
    }

    private static int decrease(int[] nums) {
        int step = 0;
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]<max){
                step++;
            }else{
                max=nums[i];
            }
        }
        return nums.length-step;
    }
}

-----------------------------------------------------------------------------
  package leetcode;

import java.util.Arrays;

public class LongestIncreasingSubArray {
    public static void main(String[] args) {
        int nums[] = {1, 3, 5, 4, 7};
        longestIncreasingSubArray(nums);
        longestIncreasingSubArraySize(nums);
    }

    private static int[] longestIncreasingSubArray(int[] nums) {
        if (nums.length == 0)
            return new int[]{};
        int startIndex = 0;
        int maxLength = 1;

        int curStartIndex = 0;
        int curLength = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                curLength++;
               if(curLength>maxLength){
                   maxLength= curLength;
                   startIndex=curStartIndex;
               }
            } else {
                curLength = 1;
                curStartIndex = i;
            }
        }
        return Arrays.copyOfRange(nums,startIndex, startIndex+maxLength);
    }

    private static int longestIncreasingSubArraySize(int[] nums) {
        if (nums.length == 0)
            return 0;
        int maxLength = 1;
        int curLe = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                curLe++;
                maxLength = Math.max(curLe, maxLength);
            } else {
                curLe = 1;
            }
        }
        return maxLength;
    }
}

-------------------------------------------
    
