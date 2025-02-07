class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer,Integer> a=new HashMap<Integer,Integer>();
        HashMap<Integer,Integer> c=new HashMap<Integer,Integer>();
        int k[]=new int[queries.length];
        int i=0;
        for(int x[]:queries){
            if(a.containsKey(x[0])){
                int prec=a.get(x[0]);
                c.put(prec,c.get(prec)-1);
                if(c.get(prec)==0)c.remove(prec);
            }
            c.put(x[1], c.getOrDefault(x[1],0)+1);
            a.put(x[0],x[1]);
            k[i]=c.size();
            i++;
        }
        return k;
    }
}