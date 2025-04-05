import java.util.*;

class Solution {
    public int countPalindromicSubsequence(String s) {
        Set<String> palindromes = new HashSet<>();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            int first = s.indexOf(ch);
            int last = s.lastIndexOf(ch);
            if (first != -1 && first < last) {
                Set<Character> middleChars = new HashSet<>();
                for (int i = first + 1; i < last; i++) {
                    middleChars.add(s.charAt(i));
                }
                for (char mid : middleChars) {
                    palindromes.add("" + ch + mid + ch);
                }
            }
        }

        return palindromes.size();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.countPalindromicSubsequence("aabca"));  
        System.out.println(sol.countPalindromicSubsequence("adc"));      
        System.out.println(sol.countPalindromicSubsequence("bbcbaba")); 
    }
}
