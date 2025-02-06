class Solution {
    public int tupleSameProduct(int[] nums) {
        Map<Integer,Integer> mp=new HashMap<>();
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++)
            {
                int pro=nums[i]*nums[j];
                if(mp.containsKey(pro))
                cnt+=mp.get(pro);
                mp.put(pro,mp.getOrDefault(pro,0)+1);
            }
        }
        return cnt*8;
    }
}