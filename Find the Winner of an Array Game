class Solution {
    public int getWinner(int[] arr, int k) {
        // Find the maximum element in the array.
        int maxElement = Arrays.stream(arr).max().getAsInt();

        // If k is greater than or equal to the array size, the maximum element wins.
        if (k >= arr.length) {
            return maxElement;
        }

        int currentWinner = arr[0]; // Initialize the current winner with the first element of the array.
        int currentStreak = 0; // Initialize the current streak to 0.

        for (int i = 1; i < arr.length; i++) {
            // If the current winner is greater than the next element, then they will win the next game.
            if (currentWinner > arr[i]) {
                currentStreak++;

            // the current winner lost the game.
            } else {
                currentStreak = 1; // Reset the streak since a new element becomes the winner.
                currentWinner = arr[i]; // Update the current winner.
            }

            // If the current streak reaches k or the current winner is the maximum element
            if (currentStreak == k || currentWinner == maxElement) {
                return currentWinner;
            }
        }

        return currentWinner; // Dummy return
    }
}
