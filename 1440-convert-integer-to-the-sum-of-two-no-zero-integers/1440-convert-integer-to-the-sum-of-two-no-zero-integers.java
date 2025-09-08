class Solution {
    public int[] getNoZeroIntegers(int n) {
        int a = n - 1;
        int b = 1;
        while (!isnonzero(a) || !isnonzero(b)) {
            a--;
            b++;
        }
        return new int[] { a, b };
    }

    private boolean isnonzero(int x) {
        while (x > 0) {
            if (x % 10 == 0)   return false;
                    x/= 10;
              
            
            

        }
         return true;
    }
    

}