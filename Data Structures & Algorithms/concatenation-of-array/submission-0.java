class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] res = new int[2*nums.length];
        int i =0;
        int n =nums.length;
        while(i<nums.length){
            res[i] = res[n] = nums[i];
            i++;n++;
        }
        return res;
    }
}