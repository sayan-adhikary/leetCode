class Solution {
    int currentNodeIndex = 0;
    public TreeNode recoverFromPreorder(String traversal) {
        List<int[]> nodeDepthPairs = new ArrayList<>();
        int i = 0;
        int len = traversal.length();
        while(i < len){
            int depth = 0;
            while(traversal.charAt(i) == '-'){
                depth++;
                i++;
            }
            int nodeVal = 0;
            while(i < len && traversal.charAt(i) != '-'){
                nodeVal *= 10;
                nodeVal += traversal.charAt(i) - 48;
                i++;
            }
            nodeDepthPairs.add(new int[]{nodeVal,depth});
        }
        return buildSubtree(nodeDepthPairs,0);
    }

    public TreeNode buildSubtree(List<int[]> nodeDepthPairs, int depth){
        if(currentNodeIndex >= nodeDepthPairs.size() || nodeDepthPairs.get(currentNodeIndex)[1] < depth)
            return null;
        TreeNode curr = new TreeNode(nodeDepthPairs.get(currentNodeIndex)[0]); 
        currentNodeIndex++;
        curr.left = buildSubtree(nodeDepthPairs,depth+1);
        curr.right = buildSubtree(nodeDepthPairs,depth+1);
        return curr;
    }
}