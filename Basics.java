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
  
