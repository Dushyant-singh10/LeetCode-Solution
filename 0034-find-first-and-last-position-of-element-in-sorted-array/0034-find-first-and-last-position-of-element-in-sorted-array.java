class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high =nums.length-1;
        int ans1=-1;
        int ans2=-1;
        while(low<=high){
            int mid =low+(high-low)/2;
            if(nums[mid]==target){
                ans1=mid;
                high=mid-1;
            }
            else if(target>nums[mid]){
                low = mid+1;
            }
            else{
                    high =mid-1; 
            }
            
        }
        
          low = 0;
         high =nums.length-1;
       
        while(low<=high){
            int mid =low+(high-low)/2;
            if(nums[mid]==target){
                ans2=mid;
                low=mid+1;
            }
            else if(target>nums[mid]){
                low = mid+1;
            }
            else{
                    high =mid-1; 
            }
            
        }
        int res[]={ans1,ans2};
        return res;
        
    }
}