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
    int ans=0;
    public int rangeSumBST(TreeNode root, int low, int high) {
        ans=0;
        if(root==null) return 0;
        int val=root.val;
        if(val>=low && val<=high){
            ans+=val;
        }
        ans+=rangeSumBST(root.left,low,high);
        ans+=rangeSumBST(root.right,low,high);
        return ans;
    }
}