class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> answer = new ArrayList<>();
        int n = strs.length;
        if( n == 0)
            return answer;
        Map<String,List> map = new HashMap<String,List>();
        for (String s : strs) {
            char[] freq = new char[26];
            for (char c : s.toCharArray()) freq[c - 'a']++;
            String key = String.valueOf(freq);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(s);
        }
        answer = new ArrayList(map.values());
        return answer;
    }
}
