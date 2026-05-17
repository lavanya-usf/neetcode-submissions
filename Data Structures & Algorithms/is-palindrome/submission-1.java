class Solution {
    public boolean isPalindrome(String t) {
        String s = t.toLowerCase().replaceAll("[^a-z0-9]", "");
        char a[] = s.toCharArray();
        int p = s.length()-1;
        for(int i =0; i<p; i++) {
            if(a[i] == a[p]) {
                p--;
            } else {
                return false;
            }
        }
        return true;

    }
}
