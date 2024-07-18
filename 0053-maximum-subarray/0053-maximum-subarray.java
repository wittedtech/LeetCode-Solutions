class Solution {
    public int maxSubArray(int[] nums) {
        int maximum = nums[0], maxEnd = nums[0];
        for(int i=1; i<nums.length; i++) {
        	if(maxEnd<0) {
        		maxEnd = nums[i];
        	}else {
        		maxEnd += nums[i];
        	}
        	
        	if(maxEnd > maximum) {
        		maximum = maxEnd;
        	}
        }
        return maximum;
    }
}