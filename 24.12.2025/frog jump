class Solution {
    public boolean canCross(int[] s) {
        Map<Integer,Set<Integer>> map=new HashMap<>();
        for(int p:s) map.put(p,new HashSet<>());
        map.get(0).add(0);

        for(int p:s)
            for(int k:map.get(p))
                for(int step=k-1;step<=k+1;step++)
                    if(step>0 && map.containsKey(p+step))
                        map.get(p+step).add(step);
        return !map.get(s[s.length-1]).isEmpty();
    }
