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
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();
            double sum = 0;

            for(int i = 0; i < size; i++) {
                TreeNode tmp = q.poll();
                if(tmp.left != null) q.add(tmp.left);
                if(tmp.right != null) q.add(tmp.right);

                sum += tmp.val;
            }
            ans.add(sum/size);
        }

        return res;
    }
}