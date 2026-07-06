class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        boolean foundZero = false;
        for(int i=0; i< nums.length; i++) {
            int number = nums[i];
            if (number == 0 && !foundZero) {
                foundZero = true;
            } else if (number == 0 && foundZero) {
                product = 0;
       
                break;
            } else {
                product = product * number;
            }
        }
        int[] output = new int[nums.length];
        for (int i = 0; i< nums.length; i++) {
            int number = nums[i];
            if (product == 0) {
                output[i] = 0;
            } else if (foundZero) {
                if (number == 0) {
                    output[i] = product;
                } else {
                    output[i] = 0;
                }
            } 
            else {
            int productWithoutNumber = product / number;
            output[i] = productWithoutNumber;
            }
            
        }
        return output;
    }
}  
