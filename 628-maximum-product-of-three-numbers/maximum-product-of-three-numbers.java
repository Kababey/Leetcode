class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
    
        int n = nums.length;
        int product = nums[n-1] * nums[n-2] * nums[n-3];
        if(nums[0] * nums[1] * nums[n-1] > product)
            return nums[0] * nums[1] * nums[n-1];

    
        return product;
    }


}