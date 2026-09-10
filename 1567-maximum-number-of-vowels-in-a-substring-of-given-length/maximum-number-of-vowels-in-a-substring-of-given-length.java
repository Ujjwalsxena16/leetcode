class Solution {
    public int maxVowels(String s, int k) {

        boolean[] isVowel = new boolean[128];

        isVowel['a'] = true;
        isVowel['e'] = true;
        isVowel['i'] = true;
        isVowel['o'] = true;
        isVowel['u'] = true;

        int count = 0;
        for (int i = 0; i < k; i++) {
            if (isVowel[s.charAt(i)]) {
                count++;
            }
        }
        int max = count;
        for (int i = k; i < s.length(); i++) {

            if (isVowel[s.charAt(i)]) {
                count++;
            }
            if (isVowel[s.charAt(i - k)]) {
                count--;
            }
            max = Math.max(max, count);
        }

        return max;
    }
}