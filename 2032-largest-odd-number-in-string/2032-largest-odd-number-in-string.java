class Solution {
    public String largestOddNumber(String num) {
        int len = num.length();
        for (int i = len - 1; i >= 0; i--) {
            if (num.charAt(i) % 2 == 1) { // checks if the digit is odd
                return num.substring(0, i + 1); // return prefix up to i
            }
        }
        return ""; // if no odd digit found
    }
}