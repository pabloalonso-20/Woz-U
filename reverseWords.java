class Solution {
    public String reverseWords(String s) {
        
        String[] myArray = stringToArray(s.trim());
        String newstring = "";
        
        for (int i = myArray.length -1; i>=0; i--){
            
            newstring += myArray[i] + " ";
        }
        
        return newstring.trim();
        
    }
    
    public static String[] stringToArray(String s){
        return s.split("\\s+");
    }
}
