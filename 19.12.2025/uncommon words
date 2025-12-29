class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map=new HashMap<String,Integer>();
        String arr1[]=s1.split(" ");
        String arr2[]=s2.split(" ");
        for(String w :arr1){
            map.put(w,map.getOrDefault(w,0)+1);
        }
        for(String w :arr2){
            map.put(w,map.getOrDefault(w,0)+1);
        }
        List<String> lst=new ArrayList<String>();
        for(Map.Entry<String , Integer> entry: map.entrySet()){
            if(entry.getValue()==1){
                lst.add(entry.getKey());
            }
        }
        return lst.toArray(new String[0]);
    }
}
