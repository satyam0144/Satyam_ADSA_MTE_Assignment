// Find the longest palindromic substring in a given string

public class question8 {
    public static String expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left + 1, right);
    }
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 1) return "";
        String longest = "";
        for (int i = 0; i < s.length(); i++) {
            String odd = expandAroundCenter(s, i, i);
            String even = expandAroundCenter(s, i, i + 1);
            String currentLongest = (odd.length() > even.length()) ? odd : even;
            if (currentLongest.length() > longest.length()) {
                longest = currentLongest;
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        String input = "babad";
        String result = longestPalindrome(input);
        System.out.println("Longest palindromic substring: " + result);
    }
}