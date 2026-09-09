class Solution {
    public int countGoodSubstrings(String s) {

        int res = 0;

        for (int i = 0; i <= s.length() - 3; i++) {

            if (s.charAt(i) != s.charAt(i + 1)
                    && s.charAt(i + 1) != s.charAt(i + 2)
                    && s.charAt(i) != s.charAt(i + 2)) {

                res++;
            }
        }

        return res;
    }
}