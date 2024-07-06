class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length-1;
        boolean[] exist = new boolean[n];   // each index represents existence of the index+1 element in nums array

        for (int i = 0; i < nums.length; i++){
            if(!exist[nums[i]-1])
                exist[nums[i]-1] = true;
            else 
                return nums[i];
        }
        return -1;
    }
}