class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int p = numbers.length-1;
        int i=0;
        while(i<p) {
            int sum = numbers[i] + numbers[p];
            if(sum == target) {
                return new int[]{i+1, p+1};
            } else if(sum > target) {
                p--;
            } else {
                i++;
            }
        }
        return new int[0];
    }
}
