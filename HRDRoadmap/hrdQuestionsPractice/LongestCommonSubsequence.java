// 3. Longest Common Subsequence can do using Recursion, 1d, DP 
// s1: abcde
// s2: ace
// Subsequences: a, ac, ace 
// Output: 3

public class LongestCommonSubsequence {

    public static int lcs(String s1, String s2, int i, int j) {

        // Base case: if any string is finished → no common subsequence
        if (i == s1.length() || j == s2.length()) {
            return 0;
        }

        // If characters match → include this character in LCS
        if (s1.charAt(i) == s2.charAt(j)) {
            return 1 + lcs(s1, s2, i + 1, j + 1);
        }

        // If characters do NOT match → we have 2 choices
        else {
            // Choice 1: skip current character of s1
            int skipS1 = lcs(s1, s2, i + 1, j);

            // Choice 2: skip current character of s2
            int skipS2 = lcs(s1, s2, i, j + 1);

            // Take maximum of both choices
            return Math.max(skipS1, skipS2);
        }
    }

    public static void main(String[] args) {

        String s1 = "abcde";
        String s2 = "bbbace";

        // start from index 0,0
        int result = lcs(s1, s2, 0, 0);

        System.out.println("LCS Length: " + result);
    }
}
