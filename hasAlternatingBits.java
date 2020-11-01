class Solution {
    public boolean hasAlternatingBits(int n) {
        int prev=n%2;
        n=(int)Math.floor(n/2);
        int curr=0;
        while (n>=1) {
            curr=n%2;
            if (curr==prev) {
                return false;
            }
            n=(int)Math.floor(n/2);
            prev=curr;
        }
        return true;
    }
}
