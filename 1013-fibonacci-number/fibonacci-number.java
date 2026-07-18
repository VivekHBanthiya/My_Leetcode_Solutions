class Solution {
    public int fib(int n) {
        //DP
        int[] temp = new int[n+1];
        for(int i=0; i<=n; i++){
            temp[i] = -1;
        }
        return fibS(temp, n);
    }
    public int fibS(int[] temp, int n){
        if(n<=1)return n;
        if(temp[n]!=-1) return temp[n];
        temp[n] = fibS(temp, n-1)+fibS(temp, n-2);
        return fibS(temp, n-1)+fibS(temp, n-2);
    }
}