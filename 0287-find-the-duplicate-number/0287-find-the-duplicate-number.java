class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer, Integer> hs = new HashMap<>();
        for (int i : nums) {
            hs.put(i, hs.getOrDefault(i, 0) + 1);
        }

        int repeated = 0;
        for (Integer i : hs.keySet()) {
            if (hs.get(i) > 1) {
                repeated = i;
            }
        }
        return repeated;
    }
}