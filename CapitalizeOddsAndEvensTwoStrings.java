class Solution{
    public static String[] capitalize(String s){
      
    String[] myArray = new String[2];
      
    String odd = "" ;
    String even = "";
    for(int x=1;x<=2;x++){
      for(int i=0; i<s.length();i++){
        if(x ==1){
          even += (i%2 == 0) ? String.valueOf(s.charAt(i)).toUpperCase() : String.valueOf(s.charAt(i));
                                              
        }
        else{
          odd += (i%2 != 0) ? String.valueOf(s.charAt(i)).toUpperCase() : String.valueOf(s.charAt(i));
      }
    }
                                          
  }
    myArray[0] = even;
    myArray[1] = odd;
        
        return myArray;
        
        
        // OR
        
//      class Solution{
//     public static String[] capitalize(String s){
//      
//         String[] myArray = new String[2];
       
//         // Loop for 2 iteration: one for even, one for odd
//         for (int x = 1; x <= 2; x++) { 
//             StringBuilder builder = new StringBuilder();
            
//             for (int i = 0; i < s.length(); i++) { 
//                 if (x == 1) { // If we are on first iteration
//                    builder.append((i % 2 == 0) 
//                         ? String.valueOf(s.charAt(i)).toUpperCase() 
//                         : String.valueOf(s.charAt(i)));
//                 } else { // If we are on second iteration
//                     builder.append((i % 2 != 0) 
//                         ? String.valueOf(s.charAt(i)).toUpperCase() 
//                         : String.valueOf(s.charAt(i)));
//                 }
//             }
            
//             if (x == 1) { myArray[0] = builder.toString(); }
//             else { myArray[1] = builder.toString(); }

//             builder.delete(0, s.length());
//         }

//         return myArray;
    }
}
        
        
        
    
    }                                      
    
}
