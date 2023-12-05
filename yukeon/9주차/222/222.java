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
    int nodeCnt = 0;
    private int searchTree(TreeNode treeNode){
        nodeCnt++;
        if(treeNode.left != null){
            nodeCnt = searchTree(treeNode.left);
        } else {
            return nodeCnt;
        }
        if(treeNode.right != null){
            nodeCnt = searchTree(treeNode.right);
        }
        return nodeCnt;
    }

    public int countNodes(TreeNode root) {
        if(root == null) return 0;
        return searchTree(root);
    }
}