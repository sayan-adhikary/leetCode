class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        List<Integer> helper = new ArrayList<>();

        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            if (set.contains(i)) {
                helper.add(i);
                set.remove(i);   //you have to remove contains element
            }
        }

        int ans[] = new int[helper.size()];
        for (int i = 0; i < helper.size(); i++) {
            ans[i] = helper.get(i);
        }
        return ans;
    }
}