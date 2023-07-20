
class Solution {
    public boolean samesign(int x, int y) {
        if (x < 0 && y < 0)
            return true;
        else if (x > 0 && y > 0)
            return true;
        return false;
    }

    public int[] asteroidCollision(int[] a) {
        int n = a.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            if (st.size() == 0 || (st.peek() < 0 && a[i] > 0) || samesign(st.peek(), a[i])) {
                st.push(a[i]);
            } else {
                while (st.size() > 0 && st.peek() > 0 && st.peek() < Math.abs(a[i]))
                    st.pop();

                if (st.size() == 0 || st.peek() < 0) {
                    st.push(a[i]);
                } else if (st.peek() == Math.abs(a[i])) {
                    st.pop();
                }
            }
        }

        int[] ans = new int[st.size()];
        int i = st.size() - 1;
        while (!st.isEmpty()) {
            ans[i] = st.peek();
            i--;
            st.pop();
        }
        return ans;
    }
}
