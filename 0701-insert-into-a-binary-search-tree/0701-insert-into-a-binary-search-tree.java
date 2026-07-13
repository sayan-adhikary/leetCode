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
class Solution {
    private TreeNode solve(TreeNode root, int val) {
        if (root == null) {
            return new TreeNode(val);
        } else if (root.val > val) {
            root.left = solve(root.left, val);
        } else {
            root.right = solve(root.right, val);
        }
        return root;
    }

    public TreeNode insertIntoBST(TreeNode root, int val) {
        return solve(root, val);
    }
}