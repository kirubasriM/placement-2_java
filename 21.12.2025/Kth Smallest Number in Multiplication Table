// class Solution {
//     public int findKthNumber(int m, int n, int k) {
//         int x[][]=new int[m][n];
//         for(int i=1;i<=m;i++)
//         {
//             for(int j=1;j<=n;j++)
//             {
//                 x[i-1][j-1]=i*j;
//             }
//         }
//         int z[]=new int[m*n];
//         int o=0;
//         for(int l[]:x)
//         {
//             for(int h:l)
//             {
//                 z[o++]=h;
//             }
//         }
//         Arrays.sort(z);
//         return z[k-1];
        
//     }
// }
class Solution {
    public int findKthNumber(int m, int n, int k) {
        int low = 1, high = m * n;
        while (low < high) {
            int mid = low + (high - low) / 2;//5
            int count = 0;//4 
            for (int i = 1; i <= m; i++) {
                count += Math.min(mid / i, n);//3 
            }
            if (count < k) {
                low = mid + 1;//4
            } else {
                high = mid;
            }
        }
        return low;
    }
}
