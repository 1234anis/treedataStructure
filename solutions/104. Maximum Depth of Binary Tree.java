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
      int max = 1;
    
    public int maxDepth(TreeNode root) {
           if(root == null) return 0;
        helper(root, 0);
        return max;
    }
    public void helper(TreeNode root, int counter){
        if(root != null){
            counter++; 
            if(root.left == null && root.right == null){
                if(counter > max){
                    max = counter;
                } 
            }
            helper(root.left, counter);
            helper(root.right, counter);
        }
}
}
