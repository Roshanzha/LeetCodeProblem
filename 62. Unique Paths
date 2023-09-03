class Solution {
  private int traverse(int i, int j, int[][] memo, int m, int n) {
    if (i < 0 || j < 0 || i >= m || j >= n) return 0;
    if (i == m-1 && j == n-1) return 1;
    if (memo[i][j] != 0) return memo[i][j];
    
    memo[i][j] = traverse(i+1, j, memo, m, n) + traverse(i, j+1, memo, m, n);
    return memo[i][j];
  }
  
  public int uniquePaths(int m, int n) {
    var memo = new int[m][n];
    return traverse(0, 0, memo, m, n);
  }
}
