class Solution {
    public int firstUniqChar(String s) {
        int freq[][] = new int[26][2];
        int n = s.length();
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            freq[c-'a'][0]++;
            freq[c-'a'][1] = i;
        }
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(freq[c-'a'][0] == 1)
                return freq[c-'a'][1];
        }
        return -1;
    }
}
