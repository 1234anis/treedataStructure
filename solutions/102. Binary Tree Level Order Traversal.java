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
    public List<List<Integer>> levelOrder(TreeNode root) {
         List<List<Integer>> res = new ArrayList();
        solve(root, res, 0);
        return res;
    }
    
    void solve(TreeNode root, List<List<Integer>> list, int level ){
        if(root == null) {
            return;
        }
        if(list.size() < level + 1) {
            list.add(new ArrayList());
        }
        list.get(level).add(root.val);
        solve(root.left, list, level + 1);
        solve(root.right, list, level + 1);
    }
    
}
