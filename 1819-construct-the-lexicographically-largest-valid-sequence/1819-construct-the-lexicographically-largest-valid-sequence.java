class Solution {
    public int[] constructDistancedSequence(int n) {
        int[] sequence = new int[n*2 - 1];
        boolean[] used = new boolean[n + 1];
        
        backtrack(sequence, used, n, 0);
        return sequence;
    }

    public boolean backtrack(int[] sequence, boolean[] used, int n, int index) {
        if(index == sequence.length){
            return true;
        }

        if(sequence[index] != 0){
            return backtrack(sequence, used, n, index+1);
        }

        for(int num = n; num >= 1; num--){
            if(used[num])   continue;

            if(num == 1){
                sequence[index] = 1;
                used[num] = true;
                if(backtrack(sequence, used, n, index+1))    return true;
                sequence[index] = 0;
                used[num] = false;
            } else {
                int secondIndex = index + num;
                if(secondIndex < sequence.length && sequence[secondIndex] == 0){
                    sequence[index] = num;
                    sequence[secondIndex] = num;
                    used[num] = true;

                    if (backtrack(sequence, used, n, index + 1))    return true;

                    sequence[index] = 0;
                    sequence[secondIndex] = 0;
                    used[num] = false;
                }
            }
        }
        return false;
    }
}