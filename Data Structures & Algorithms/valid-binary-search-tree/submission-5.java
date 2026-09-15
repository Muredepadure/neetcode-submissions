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

public class SpecialNode {
    TreeNode node;
    long leftBoundary;
    long rightBoundary;

    public SpecialNode(TreeNode node, long leftBoundary, long rightBoundary) {
        this.node = node;
        this.leftBoundary = leftBoundary;
        this.rightBoundary = rightBoundary;
    }
}


class Solution {
    public boolean isValidBST(TreeNode root) {
        Queue<SpecialNode> q = new LinkedList<>();
        q.add(new SpecialNode(root, Long.MIN_VALUE, Long.MAX_VALUE));

        while(!q.isEmpty()) {
            int size = q.size();
            for(int i = 0; i < size; i++) {
                SpecialNode current = q.poll();
                if(current.node.val <= current.leftBoundary || current.node.val >= current.rightBoundary){
                    return false;
                }
                if(current.node.left != null) {
                    q.add(new SpecialNode(current.node.left, current.leftBoundary, current.node.val));
                }
                if(current.node.right != null) {
                    q.add(new SpecialNode(current.node.right, current.node.val, current.rightBoundary));
                }
            }
        }

        return true;
    }
}
