class Solution {
    public int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {

        if(price == null || needs == null || price.size() == 0 || needs.size() == 0) return 0;
        return backtrack(price, special, needs, new HashMap<String,Integer>());
        
    }

    private int backtrack(List<Integer> price, List<List<Integer>> special, List<Integer> needs, Map<String, Integer> cache){
        
        // if found in cache, return the minimum
        if(cache.get(getKey(needs))!=null){
            return cache.get(getKey(needs));
        }

        // base conditions. Check if there are no pending needs. i.e all needs values are 0. Simultaneously, compute the cost of paying undiscounted price
        int i = 0;
        boolean pendingNeeds = false;
        int unDiscountedCostCombination = 0;

        while(i<needs.size() && needs.get(i) >= 0){
            if(needs.get(i) > 0) pendingNeeds = true;
            unDiscountedCostCombination += needs.get(i) * price.get(i);
            i++;
        }
        // no more pending needs
        if(!pendingNeeds){
            return 0;
        }
        // unDiscountedCostCombination is a valid final price for the needs combination. So store it in the cache as the first minimum to start with. 
        cache.put(getKey(needs), unDiscountedCostCombination);

        int needCost = Integer.MAX_VALUE;
        for(int j=0;j<special.size();j++){
            List<Integer> offer = special.get(j);
            List<Integer> newNeeds = computeNewNeeds(offer, needs);
            if(newNeeds!=null){
                needCost = offer.get(offer.size()-1) + backtrack(price,special, newNeeds, cache);
            }
            // Update the cache if there is a new min
            cache.put(getKey(needs), Math.min(cache.get(getKey(needs)),needCost));

        }
        return cache.get(getKey(needs));
    }

    private String getKey(List<Integer> needs){
        StringBuilder sb = new StringBuilder();
        for(int need : needs){
            sb.append(need+",");
        }
        return sb.substring(0,sb.length()-1);
    }

    private List<Integer> computeNewNeeds(List<Integer> offer, List<Integer> needs){
        
        List<Integer> newNeeds = new ArrayList<>();
        for(int i = 0;i<needs.size();i++){
        // Need quantities are less than the offer quantities. So invalid offer, hence return null
            if(needs.get(i) - offer.get(i) < 0) return null;
            // Reduce the needed quantities by what's on offer to form the new needs
            newNeeds.add(needs.get(i) - offer.get(i));
        }
        return newNeeds;
    }
}
