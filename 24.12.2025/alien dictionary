class Solution {
    public String alienOrder(String[] words) {
        Map<Character,Set<Character>> g=new HashMap<>();
        Map<Character,Integer> indeg=new HashMap<>();
        for(String w:words)
            for(char c:w.toCharArray()){
                g.putIfAbsent(c,new HashSet<>());
                indeg.putIfAbsent(c,0);
            }
        for(int i=0;i<words.length-1;i++){
            String a=words[i], b=words[i+1];
            for(int j=0;j<Math.min(a.length(),b.length());j++)
                if(a.charAt(j)!=b.charAt(j)){
                    if(g.get(a.charAt(j)).add(b.charAt(j)))
                        indeg.put(b.charAt(j),indeg.get(b.charAt(j))+1);
                    break;
                }
        }
        Queue<Character> q=new LinkedList<>();
        for(char c:indeg.keySet()) if(indeg.get(c)==0) q.add(c);
        StringBuilder sb=new StringBuilder();
        while(!q.isEmpty()){
            char c=q.poll(); sb.append(c);
            for(char n:g.get(c))
                if(--indeg.put(n,indeg.get(n)-1)==0) q.add(n);
        }
        return sb.length()==indeg.size()?sb.toString():"";
    }
}
