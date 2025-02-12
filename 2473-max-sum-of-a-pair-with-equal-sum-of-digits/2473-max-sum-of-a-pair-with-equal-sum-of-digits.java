class Solution {
    public int maximumSum(int[] nums) {
        int m=-1;
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for (int i=0;i<nums.length;i++){
            int key=0;
            int n=nums[i];
            while (n!=0){
                key+=n%10;
                n=n/10;
            }

            if (!map.containsKey(key)){
                map.put(key,nums[i]);
            }
            else{
                m=Math.max(m,map.get(key)+nums[i]);
                map.put(key, Math.max(map.get(key),nums[i]));
            }
        }
        return m;
    }
}