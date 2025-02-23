class Solution {
    int preorderIndex = 0;
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        //first node of preorder is always the root
        //first node of postorder is always the leftmost node, then the rightmost node, and then parent
        //root of tree is always last in postorder
        
        //children subtree nodes of a node at index i in the preorder array are all at index j, for all j < i, in the postorder array.
            //so when we build the tree, and want to step into the left child of the current node we just created from preorder[i], ensure with recursive parameter bounds, that any children (if any) must exist at index j < i
        //so iterate along the preorder array, and recursively keep track of bounds on where the left and right children of current node should  be

        int[] idxOfPreorderInPostorderArray = new int[postorder.length+1];
        for(int i = 0; i < postorder.length; i++)
            idxOfPreorderInPostorderArray[postorder[i]] = i;
        return buildSubtree(preorder,idxOfPreorderInPostorderArray,0,preorder.length-1);
    }
    public TreeNode buildSubtree(int[] preorder, int[] idxOfPreorderInPostorderArray, int lowerIdxBound, int upperIdxBound){
        if(preorderIndex >= preorder.length)
            return null;    
        int postIndex = idxOfPreorderInPostorderArray[preorder[preorderIndex]];
        if(postIndex < lowerIdxBound || postIndex > upperIdxBound)
            return null;
        TreeNode curr = new TreeNode(preorder[preorderIndex++]);
        curr.left = buildSubtree(preorder,idxOfPreorderInPostorderArray, lowerIdxBound, postIndex-1);
        curr.right = buildSubtree(preorder,idxOfPreorderInPostorderArray, lowerIdxBound, postIndex-1);
        return curr;
    }   
}