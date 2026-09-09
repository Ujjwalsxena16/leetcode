class Solution {
    public List<Integer> findAnagrams(String s, String p) {

        List<Integer> list = new ArrayList<>();

        int k = p.length();
        int l = 0;
        int r = 0;

        int[] freqp = new int[128];
        int[] freqs = new int[128];

        if (p.length() > s.length()) {
            return list;
        }

        // Create the first window
        while (r < k) {
            freqp[p.charAt(r)]++;
            freqs[s.charAt(r)]++;
            r++;
        }

        // Check first window
        if (Arrays.equals(freqp, freqs)) {
            list.add(l);
        }

        // Slide the window
        while (r < s.length()) {

            // Add new character
            freqs[s.charAt(r)]++;

            // Remove old character
            freqs[s.charAt(l)]--;

            l++;
            r++;

            // Check current window
            if (Arrays.equals(freqp, freqs)) {
                list.add(l);
            }
        }

        return list;
    }
}