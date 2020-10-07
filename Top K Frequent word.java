class Solution {
    public List<String> topKFrequent(String[] words, int k) {
    
        HashMap<String, Integer> myMap = new HashMap();
        
        //counts how many times that word is mentioned in input
        for (String word: words) {
            myMap.put(word, myMap.getOrDefault(word, 0) + 1);
        }
        
        //new arraylist named possible
        ArrayList<String> possible = new ArrayList(myMap.keySet());
        
        //collections sort arranges them 
        //compare to checks if they are equal
        
        Collections.sort(possible, (w1, w2) -> myMap.get(w1).equals(myMap.get(w2)) ?
                w1.compareTo(w2) : myMap.get(w2) - myMap.get(w1));
        
        //returns possible string arraylist from 0 - k (which is inputted by user)
        //it will return the most frequent words Since they are already in order from the Collections sort
        return possible.subList(0, k);
        
        
    }
}
