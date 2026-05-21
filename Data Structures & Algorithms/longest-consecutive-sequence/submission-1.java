class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        if(nums.length == 0) return 0;

        for(int i=0; i<nums.length; i++) {
            set.add(nums[i]);
        }

        int longest = 1;

        for(int s: set) {
            if(!set.contains(s-1)) {
                int count = 1;
                int seqStart = s;
                while(set.contains(seqStart+1)) {
                    count = count+1;
                    seqStart = seqStart+1;
                    }

                longest = Math.max(longest, count);
            }
        }
        return longest;
    }
}
