class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder ans = new StringBuilder(strs[0]);
        int min = strs[0].length();
        for(String s : strs){
            int i = 0;
            while(i<s.length() && i<ans.length()){
                if(ans.charAt(i)== s.charAt(i)){
                    i++;
                }else{break;}
            }
            ans.setLength(i);
        }
        return ans.toString();
    }
}