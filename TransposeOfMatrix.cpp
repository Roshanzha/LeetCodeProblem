class Solution
{   
    public:  
    //Function to find transpose of a matrix.
    void transpose(vector<vector<int> >& matrix, int n)
    { 
        // code here 
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(j>=i)
                {
                swap(matrix[i][j],matrix[j][i]);
                
                }
            }
        }
    }
};
