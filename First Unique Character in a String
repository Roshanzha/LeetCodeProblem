import java.util.HashMap;
import java.util.Map;

class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> ump = new HashMap<>();
        
        // Count character frequencies
        for (char c : s.toCharArray()) {
            ump.put(c, ump.getOrDefault(c, 0) + 1);
        }
        
        // Find the first unique character
        for (int i = 0; i < s.length(); i++) {
            if (ump.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        
        // If no unique character is found
        return -1;
    }
}
