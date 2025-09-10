class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode current = root;
        List<Integer> list = new ArrayList<>();

        while (current != null) {
            if (current.left == null) {
                list.add(current.val); // No left child, visit node
                current = current.right;
            } else {
                // Find the inorder predecessor of current
                TreeNode predecessor = current.left;
                while (predecessor.right != null && predecessor.right != current) {
                    predecessor = predecessor.right;
                }

                if (predecessor.right == null) {
                    // Establish thread to current
                    predecessor.right = current;
                    current = current.left;
                } else {
                    // Thread already established, time to visit node
                    predecessor.right = null;
                    list.add(current.val); // Visit node after left subtree
                    current = current.right;
                }
            }
        }
        return list;
    }
}