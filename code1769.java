class Solution {
    public int[] minOperations(String boxes) {
        int n = boxes.length();
        int[] answer = new int[n];

        int leftBalls = 0, leftCost = 0;
        for (int i = 0; i < n; i++) {
            answer[i] += leftCost;
            leftBalls += boxes.charAt(i) - '0';
            leftCost += leftBalls;
        }

        int rightBalls = 0, rightCost = 0;
        for (int i = n - 1; i >= 0; i--) {
            answer[i] += rightCost;
            rightBalls += boxes.charAt(i) - '0';
            rightCost += rightBalls;
        }

        return answer;
    }
}
