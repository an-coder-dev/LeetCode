class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] diff = new int[n + 1];
        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2];

            int val = direction == 1 ? 1 : -1;

            diff[start] += val;
            if (end + 1 < n) {
                diff[end + 1] -= val;
            }
        }
        int[] shiftVal = new int[n];
        int current = 0;
        for (int i = 0; i < n; i++) {
            current += diff[i];
            shiftVal[i] = current;
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            char original = s.charAt(i);
            int shifted = ((original - 'a') + shiftVal[i]) % 26;
            if (shifted < 0) shifted += 26;
            result.append((char) ('a' + shifted));
        }

        return result.toString();
    }
}
