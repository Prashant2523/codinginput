class Solution {
    public boolean isNStraightHand(int[] hand, int W) {
        if (hand.length % W != 0) return false;
        if (W == 1) return true;
        
        Arrays.sort(hand);
        Set<Integer> set = new HashSet<>(); 
        for (int i = 0; i < hand.length-(W-1); i++) {
            if (set.contains(i)) continue;
            set.add(i);
            int count = 1, k = 1;
            for (int j = i+1; j < hand.length; j++) {
                if (hand[j] == hand[i]+k && !set.contains(j)) {
                    k++; set.add(j); count++; if(count == W) break;
                }
            }
            if (count != W) return false;
        }
        return true;
    }
}
