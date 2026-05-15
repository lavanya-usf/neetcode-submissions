
class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Boolean> map= new HashMap<>();

        for(int key: nums) {
            if(map.containsKey(key)) {
                return true;
            }
            map.put(key, true);
        }
        return false;
    }

}