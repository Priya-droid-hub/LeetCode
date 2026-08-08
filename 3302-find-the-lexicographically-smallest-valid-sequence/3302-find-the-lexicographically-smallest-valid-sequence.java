class Solution {
    public int[] validSequence(String word1, String word2) {

        char[] s = word1.toCharArray();
        char[] t = word2.toCharArray();

        int n = s.length;
        int m = t.length;

        int[] suffix = new int[n + 1];

        int j = m - 1;

        int matched = 0;
    //creating suffix from left that matches
        for (int i = n - 1; i >= 0; i--) {

            if (j >= 0 && s[i] == t[j]) {
                matched++;
                j--;
            }

            suffix[i] = matched;
        }

    
        int[] ans = new int[m];

        int i = 0;
        j = 0;

        while (i < n && j < m) {

            if (s[i] == t[j]) {

                ans[j] = i;
                j++;

            } else {
                //if it did'nt match we shift i and j by one place....but by checking the size
                if (suffix[i + 1] >= m - j - 1) {

                    ans[j] = i;
                    j++;
                    i++;
                    break;
                }
            }

            i++;
        }

    //We reached the end of s before finishing t.
        if (j < m && i == n)
            return new int[0];

        while (i < n && j < m) {

            if (s[i] == t[j]) {
                ans[j] = i;
                j++;
            }

            i++;
        }

        if (j != m)
            return new int[0];

        return ans;
    }
}