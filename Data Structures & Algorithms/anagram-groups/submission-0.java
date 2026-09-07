class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String , List<String>> map = new HashMap<>();
        for(String str : strs){
            char[] temp = str.toCharArray();
            Arrays.sort(temp);
            String s = String.valueOf(temp);
            if(map.get(s)!=null){
                List<String> a = map.get(s);
                a.add(str);
                map.put(s,a);
            }else{
                List<String> a = new ArrayList<>();
                a.add(str);
                map.put(s,a);
            }
        }
        return new ArrayList<>(map.values());
    }
}
