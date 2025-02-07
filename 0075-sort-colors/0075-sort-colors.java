class Solution {
    public void sortColors(int[] nums) {
       int low=0;
       int high=nums.length-1;
       int mid=0;
       while(mid<=high){
        if(nums[mid]==0){
            swap(nums,mid,low);
                mid++;
                low++;
            }
            else if(nums[mid]==1)
            mid++;
            else{
                swap(nums,mid,high);
                high--;
            }
        }
       }
        public static void swap(int arr[],int a,int b){
            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        }
    }
