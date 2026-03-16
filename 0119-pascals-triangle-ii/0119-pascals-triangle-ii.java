class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        long prev = 1;
        ans.add(1);

        for (int i = 1; i <= rowIndex; i++) {
            long curr = prev * (rowIndex - i + 1) / i;
            ans.add((int) curr);
            prev = curr;
        }

        return ans;
    }
}