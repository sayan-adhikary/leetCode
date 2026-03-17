class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> al = new ArrayList<>();
        for(int i = 0; i <= rowIndex; i++){
            al.add(pascalTriangleValue(rowIndex, i));
        }
        return al;
    }
    private int pascalTriangleValue(int n, int r){
        r = Math.min(n, r);
        if(r == 1) return n;
        long ans = 1;
        for(int i = 0; i < r; i++){
            ans *= (n - i);
            ans /= (i + 1);
        }
        return (int)ans;
    }
}