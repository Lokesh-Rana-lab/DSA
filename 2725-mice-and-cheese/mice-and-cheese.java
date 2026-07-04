class Solution {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {

        int n = reward1.length;

        int total = 0;
        Integer[] diff = new Integer[n];

        for (int i = 0; i < n; i++) {
            total += reward2[i];
            diff[i] = reward1[i] - reward2[i];
        }

        Arrays.sort(diff, Collections.reverseOrder());

        for (int i = 0; i < k; i++) {
            total += diff[i];
        }

        return total;
    }
}