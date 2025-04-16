// Generate all permutations of a given string.


import java.util.*;

public class question10 {
    public List<String> generatePermutations(String s) {
        List<String> result = new ArrayList<>();
        if (s == null || s.length() == 0) {
            return result;
        }
        char[] chars = s.toCharArray();
        backtrack(result, chars, 0);
        return result;
    }
    private void backtrack(List<String> result, char[] chars, int start) {
        if (start == chars.length) {
            result.add(new String(chars));
            return;
        }
        for (int i = start; i < chars.length; i++) {
            if (i > start && chars[i] == chars[start]) {
                continue;
            }
            swap(chars, i, start);
            backtrack(result, chars, start + 1);
            swap(chars, i, start);
        }
    }
    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
    public static void main(String[] args) {
        question10 sol = new question10();
        String s1 = "abc";
        System.out.println("Permutations of 'abc': " + sol.generatePermutations(s1));
        String s2 = "aab";
        System.out.println("Permutations of 'aab': " + sol.generatePermutations(s2));
    }
}