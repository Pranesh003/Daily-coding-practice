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
    public int maxAncestorDiff(TreeNode root) {
        if(root==null)return 0;
        return dfs(root, root.val, root.val);
    }

    private int dfs(TreeNode node, int currMin, int currMax){
        if(node==null)
        return currMax-currMin;

        currMin=Math.min(currMin,node.val);
        currMax=Math.max(currMax,node.val);

        int leftDiff=dfs(node.left,currMin,currMax);
        int rightDiff=dfs(node.right,currMin,currMax);

        return Math.max(leftDiff,rightDiff);
    }
}