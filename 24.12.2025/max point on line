class Solution {
    public int maxPoints(int[][] p) {
        if(p.length<=2) return p.length;
        int ans=0;
        for(int i=0;i<p.length;i++){
            Map<String,Integer> map=new HashMap<>();
            int dup=1;
            for(int j=i+1;j<p.length;j++){
                int dx=p[j][0]-p[i][0];
                int dy=p[j][1]-p[i][1];
                if(dx==0&&dy==0){dup++;continue;}
                int g=gcd(dx,dy);
                dx/=g; dy/=g;
                map.put(dx+"/"+dy,map.getOrDefault(dx+"/"+dy,0)+1);
            }
            ans=Math.max(ans,dup);
            for(int v:map.values())
                ans=Math.max(ans,v+dup);
        }
        return ans;
    }
    int gcd(int a,int b){ return b==0?a:gcd(b,a%b); }
}
