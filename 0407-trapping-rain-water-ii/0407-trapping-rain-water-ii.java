class Solution {
    public int trapRainWater(int[][] arr) {
        int direction[][] = {{0,1},{0,-1},{1,0},{-1,0}};
        int result = 0,n = arr.length , m = arr[0].length;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            return a[2]-b[2];
        });
        for(int i=0;i<m;i++){
            if(arr[0][i]>=0)
            pq.add(new int[]{0,i,arr[0][i]});
            if(arr[n-1][i]>=0){
                pq.add(new int[]{n-1,i,arr[n-1][i]});
            }
            arr[0][i]=-1;
            arr[n-1][i] =-1;
        }
        for(int i=0;i<n;i++){
            if(arr[i][0]>=0)
            pq.add(new int[]{i,0,arr[i][0]});
            if(arr[i][m-1]>=0){
                pq.add(new int[]{i,m-1,arr[i][m-1]});
            }
            arr[i][0]=-1;
            arr[i][m-1] =-1;
        }
        while(!pq.isEmpty()){
            int a[] = pq.poll();
            for(int d[]:direction){
                int i= d[0]+a[0];
                int j = d[1]+a[1];
                if(i<0||i>=n||j<0||j>=m||arr[i][j]==-1){
                    continue;
                }  
                if(a[2]>arr[i][j]){
                    result += a[2] - arr[i][j];
                }
                pq.add(new int[]{i,j,Math.max(a[2],arr[i][j])});
                arr[i][j] = -1;
            } 
        }
        return result;
    }
}