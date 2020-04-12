class Solution231 {
    public boolean isPowerOfTwo(int n) {
        
        if(n==0) return false;
        
        long x =(long) n;
        return (x &(-x))==x;
    }
}

// to see if a binary number is 2's power
check x&(-x)== x because 2's complement would leave only the rightmost 1-bit to 1
or check x&(x-1)==0 because x-1 and x would have nothing in common if x is 2's power
