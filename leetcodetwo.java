 class Solution {
    public int maxScore(String s) {
        int t1 = 0;  
        int mS = 0;  
        int lZ = 0; 
        for (char c : s.toCharArray()) {
            if (c == '1') t1++;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '0') {
                lZ++;
            } else {
                t1--;
            }
            mS = Math.max(mS, lZ + t1);
        }

        return mS;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "011101";
        System.out.println("Max Score: " + sol.maxScore(s)); 
    }
}
