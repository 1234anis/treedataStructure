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
    public int sumNumbers(TreeNode root) {
        return dfs(root,new StringBuilder());
    }
    
    public int dfs(TreeNode root,StringBuilder temp){
        if(root == null)return 0;
        
        if(root.left == null && root.right == null){
            int c = Integer.parseInt(temp.toString() + root.val);
            return c;
        }
        
        temp.append(root.val);
        int res = 0; 
        res += dfs(root.left,temp);
        res += dfs(root.right,temp);
        temp.deleteCharAt(temp.length()-1);
        
        return res; 
    }
}
