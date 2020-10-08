class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        char[] ch = new char[s.length()]; 
  
        // Copy character by character into array 
        for (int i = 0; i < s.length(); i++) { 
            ch[i] = s.charAt(i); 
        } 
        
        // char[] substring = new char[s.length()];
        
        //create hashmap named substring
        HashMap<Character, Integer> substring = new HashMap();
        
        //iterate through character array
        for(int i=0; i< ch.length;i++){
            
            //if substring has the letter
            if(substring.containsKey(ch[i])){
                return substring.size();
            }
             else{
            substring.put(ch[i], substring.getOrDefault(ch[i],0)+1);
                   
             }
              
        }
       return substring.size();
        
    }
}
