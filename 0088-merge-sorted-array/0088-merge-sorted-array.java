class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int indx = m + n - 1; 
        int j = n - 1;  
        int i = m - 1;  

        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[indx--] = nums1[i--];  
            } else {
                nums1[indx--] = nums2[j--];
            }
        }

       
        while (j >= 0) {//bache  huye nums2 ke element nums1 ke andar copy krdo 
            nums1[indx--] = nums2[j--];
        }
    }
}
