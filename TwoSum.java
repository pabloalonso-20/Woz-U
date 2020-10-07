class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        //new hash map named map
        HashMap<Integer, Integer> myMap = new HashMap<>();
        
        //for loop to itterate through array
        for(int i=0;i<nums.length;i++){
            
        int remainder = target - nums[i];
            
            //check if the remainder is in our list 
        if (myMap.containsKey(remainder) == true) {
            //if true add the indeces of those numbers andn put them in a new array
            return new  int[] { myMap.get(remainder), i };
        }
        //add item in nums array into our hashmap
        myMap.put(nums[i], i);
        }
        
        //if failed / there is no combination
        return new int[0];
    }
}

