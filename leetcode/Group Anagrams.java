class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
       
//         string strs -> convert to list
        List<String> coconut = new ArrayList<String>(strs.length);
        
        for (String s:strs) {
            coconut.add(s);
        }
        
        
            
//         use Collections.shuffle(name of list)
        Collections.shuffle(coconut);
        

    
    List<List<String>> myList = new ArrayList<List<String>>();
        myList.add(coconut);
        return myList;
        
        
        

    }
}
