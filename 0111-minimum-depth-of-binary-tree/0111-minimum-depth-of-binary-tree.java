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
    int min=Integer.MAX_VALUE;
    public void cnt(TreeNode root,int cnt){
        if(root==null) return;
        if(root.left==null && root.right==null){
            min=Math.min(cnt,min);
            return;
        }
        cnt(root.left,cnt+1);
        cnt(root.right,cnt+1);
    }
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        cnt(root,1);
        return min;
    }
}

//2147483647