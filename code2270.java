class Solution {
    public int waysToSplitArray(int[] nums) {
        long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        long leftSum = 0;
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            leftSum += nums[i];
            long rightSum = totalSum - leftSum;

            if (leftSum >= rightSum) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] nums1 = {10, 4, -8, 7};
        System.out.println("Valid splits: " + sol.waysToSplitArray(nums1)); 

        int[] nums2 = {2, 3, 1, 0};
        System.out.println("Valid splits: " + sol.waysToSplitArray(nums2)); 
    }
}
