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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
          return helper(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }
    public TreeNode helper(int[] preorder,int[] inorder,int ps,int pe,int is,int ie){
        if(is>ie){
            return null;
        }
        TreeNode root=new TreeNode(preorder[ps]);
        int count=0,i;
        for(i=is;i<=ie;i++){
            if(inorder[i]==root.val){
                break;
            }
            count++;
        }
    root.left=helper(preorder,inorder,ps+1,ps+count,is,i-1);
    root.right=helper(preorder,inorder,ps+count+1,pe,i+1,ie);
        return root;
    }
}
