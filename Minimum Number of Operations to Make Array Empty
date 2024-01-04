public class Solution {
    public int minOperations(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        
        for (int i : nums) {
            mp.put(i, mp.getOrDefault(i, 0) + 1);
        }
        
        int ans = 0;
        
        for (int i : mp.values()) {
            if (i == 1) {
                return -1;
            }
            
            ans += (i + 2) / 3;
        }
        
        return ans;
    }
}
