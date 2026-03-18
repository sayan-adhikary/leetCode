class Solution {

    //HELPER
    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();

        list.add(1);

        for (int i = 1; i < rowIndex; i++) {
            long val = (long) list.get(i - 1) * (rowIndex - i) / i;
            list.add((int) val);
        }

        return list;
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        for (int r = 1; r <= numRows; r++) {
            pascalTriangle.add(getRow(r));
        }
        return pascalTriangle;
    }
}