/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
         return root != null && helper(root, targetSum, 0);
    }
    
    public boolean helper(TreeNode node, int targetSum, int sum) {
        sum += node.val;
        if(node.left == null && node.right == null){
            return targetSum == sum;
        }
        return (node.left != null && helper(node.left, targetSum, sum)) || (node.right != null && helper(node.right, targetSum, sum));
    }
}
