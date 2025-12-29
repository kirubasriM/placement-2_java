class Solution {
    public int minCost(int n, int[] cuts) {
        int[] a = new int[cuts.length + 2];
        System.arraycopy(cuts,0,a,1,cuts.length);
        a[a.length-1] = n;
        Arrays.sort(a);

        int[][] dp = new int[a.length][a.length];
        for (int len=2;len<a.length;len++)
            for (int i=0;i+len<a.length;i++){
                int j=i+len;
                dp[i][j]=Integer.MAX_VALUE;
                for (int k=i+1;k<j;k++)
                    dp[i][j]=Math.min(dp[i][j],
                        dp[i][k]+dp[k][j]+a[j]-a[i]);
                if(dp[i][j]==Integer.MAX_VALUE) dp[i][j]=0;
            }
        return dp[0][a.length-1];
    }
}
