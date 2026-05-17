class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        int p = numbers.length-1;
        int i=0;
        while(i<p) {
            int sum = numbers[i] + numbers[p];
            if(sum == target) {
                result[0] = i+1;
                result[1] = p+1;
                return result;
            } else if(sum > target) {
                p--;
            } else {
                i++;
            }
        }
        return result;
    }
}
