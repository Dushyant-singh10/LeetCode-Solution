class Solution {
    // Two pointer approach
    public int numberOfAlternatingGroups(int[] colors, int k) {
        int ans = 0;
        int len = colors.length;
        int alternatingColors = 1;
        int lastVistedColor = colors[0];

        for(int i = 0; i < len + k -1; i++){
            int currColourIND = i%len;

            // If at any point, current and last colour is equal, i.e. the alternative group was altered and then we need to count other possible groups. So update the lastvisited colour and alternatingColors count to calculate new group possiblity.
            if(colors[currColourIND] == lastVistedColor){ 
                alternatingColors = 1; // counting new alternative colours from this moment
                lastVistedColor = colors[currColourIND]; // Last visisted colour
                continue;
            }

            alternatingColors++; // counting continues alternative colours

            if(alternatingColors >= k){ // if alternative colours count exceeds the K value, it means we have a group cycle and increment the reslut.
                ans++;
            }

            lastVistedColor = colors[currColourIND]; // updateing last visited colour
        }
        return ans;
    }
}