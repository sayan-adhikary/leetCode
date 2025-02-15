class Solution {
    public int punishmentNumber(int n) {
        int sum=0;

        for(int i=1; i<=n; i++ ){
            int sqr=i*i;
            if(canPartition(String.valueOf(sqr), i, 0)){                
                sum+=sqr;
            }
        }

        return sum;
    }


    boolean canPartition(String sqr, int tgt, int sum){
        if(sqr.isEmpty() && tgt==sum){
            return true;
        }
        else if(sum>tgt){
            return false;
        }

        for(int i=0; i<sqr.length(); i++){
            String left=sqr.substring(0, i+1);
            String right=sqr.substring(i+1);

            if(canPartition(right, tgt, sum + Integer.parseInt(left))){
                return true;
            }
        }

        return false;
    }

}