class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();

        list.add(1); 

        for (int i = 1; i <= rowIndex; i++) {
            long val = (long) list.get(i - 1) * (rowIndex - i + 1) / i;
            list.add((int)val);
        }

        return list;
    }
}