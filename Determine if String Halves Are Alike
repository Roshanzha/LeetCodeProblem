class Solution {
    public boolean halvesAreAlike(String s) {
        int count1 = 0, count2 = 0;
        
        // Convert the string to lowercase
        s = s.toLowerCase();
        
        // Iterate through the first half of the string and count vowels
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count1++;
            }
        }
        
        // Iterate through the second half of the string and count vowels
        for (int i = s.length() / 2; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                count2++;
            }
        }
        
        // Check if count1 is equal to count2
        return count1 == count2;
    }
}
