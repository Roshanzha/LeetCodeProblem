class Solution {
    public int longestSubsequence(int[] arr, int d) {
        Map<Integer, Integer> mp = new HashMap<>();
        int mx = 0;
        for (int i : arr) {
            mp.put(i, mp.getOrDefault(i - d, 0) + 1);
            mx = Math.max(mp.get(i), mx);
        }
        return mx;
    }
}
