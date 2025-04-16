// Find the length of the longest substring without repeating characters.

public class question6 {
    public static int lengthOfLS(String s) {
        int[] lastSeen = new int[256];
        for (int i = 0; i < 256; i++) {
            lastSeen[i] = -1;
        }
        int maxLength = 0;
        int start = 0;
        for (int end = 0; end < s.length(); end++) {
            char ch = s.charAt(end);
            if (lastSeen[ch] >= start) {
                start = lastSeen[ch] + 1;
            }
            lastSeen[ch] = end;
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }
    public static void main(String[] args) {
        String str = "abcabcbb";
        int length = lengthOfLS(str);
        System.out.println("Length of longest substring without repeating characters: " + length);
    }
}
