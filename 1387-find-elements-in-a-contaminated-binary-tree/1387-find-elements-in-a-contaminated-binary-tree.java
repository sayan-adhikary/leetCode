/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class FindElements {
    TreeNode tree;
    HashSet<Integer> set;
    
    public FindElements(TreeNode root) {
        tree = root;
        set = new HashSet<>();
        recoverTree(tree, 0);
    }

    public void recoverTree(TreeNode root, int x) {
        if(root == null) {
            return;
        }

        root.val = x;
        set.add(x);
        recoverTree(root.left, (x*2)+1);
        recoverTree(root.right, (x*2)+2);
    }
    
    public boolean find(int target) {
        if(set.contains(target)) {
            return true;
        }
        return false;
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */