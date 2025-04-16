// Find the longest common prefix among a list of strings

public class question9 {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        question9 sol = new question9();
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + sol.longestCommonPrefix(strs1));
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Longest Common Prefix: " + sol.longestCommonPrefix(strs2));
    }
}