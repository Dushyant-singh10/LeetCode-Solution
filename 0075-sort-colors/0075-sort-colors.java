class Solution {
    public void sortColors(int[] nums) {
        int largest = Integer.MIN_VALUE;
        for(int i =0;i<nums.length;i++){   //here we find the max element
            largest =Math.max(largest,nums[i]);
        }
        int count [] = new int[largest+1]; // we have create a new array of count why we have done largest+1 here bexause o is also postive number

        for(int i =0;i<nums.length;i++){
            count[nums[i]]++;              //here we are storing freqency
        }

        int index = 0;
        for(int i =0;i<count.length;i++){
            while(count[i]>0){   //overwrite with sorted values
                nums[index]= i;
                index++;
                count[i]--;
            }
        }
    }
}