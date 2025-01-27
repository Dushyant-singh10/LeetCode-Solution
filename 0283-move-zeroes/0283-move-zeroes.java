class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0; // place non-zero elements

        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0 ) {
                
                int temp = nums[i];  //swap kro non zero elements ko j ki taraf....
                nums[i] = nums[j];
                nums[j] = temp;
                j++; 
            }
        }

    }
        
    }
