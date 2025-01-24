class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        boolean [] visited = new boolean[n];

        int [] unsafe = new int[n];
        for(int i = 0;i<n;i++){
            if(unsafe[i]==0){
                visited[i] = true;
                dfs(i,visited,graph,unsafe);
                visited[i] = false;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0;i<unsafe.length;i++){
            if(unsafe[i]==1) result.add(i);
        }
        return result;
    }

    public boolean dfs(int node, boolean [] visited, int [][] graph, int[] unsafe){
        boolean isSafe = true;
        for(int neighbor: graph[node]){

            if(visited[neighbor] || unsafe[neighbor]==2){
                isSafe = false;
                break;
            }
            if(unsafe[neighbor]==1) continue;
            visited[neighbor] = true;
            if(!dfs(neighbor, visited, graph, unsafe)) isSafe = false;
            visited[neighbor] = false;
        }
        unsafe[node] = isSafe?1:2;
        return isSafe;
    }
}