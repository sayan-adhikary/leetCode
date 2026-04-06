class Solution {
    public long maxWeight(int[] pizzas) {
        long ans = 0, totalDays = pizzas.length / 4, oddDays = (totalDays + 1) / 2;
        Arrays.sort(pizzas);
        for (int i = pizzas.length - 1, day = 1; day <= totalDays; --i, ++day) {
            if (day > oddDays)
                --i; //skip the largest, if we are pickking for the even days
            ans += (long) pizzas[i];
        }
        return ans;
    }
}