class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0,
            j = nums.length;
        while(i<j){
            if(nums[i]==val){
                int temp = nums[i];
                nums[i]=nums[j-1];
                nums[j-1] = temp;
                j--;
                continue;
            }
            i++;
        }
        return j;
    }
}