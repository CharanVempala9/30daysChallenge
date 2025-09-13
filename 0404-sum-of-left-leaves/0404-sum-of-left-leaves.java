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
    int ans;
    public void sum(TreeNode root){
        if(root==null) return;
        if(root.left!=null && root.left.left==null && root.left.right==null){
            if(root.left!=null)ans+=root.left.val;
        }
        sum(root.left);
        sum(root.right);
    }
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null)return 0;
        sum(root);
        return ans;
    }
}