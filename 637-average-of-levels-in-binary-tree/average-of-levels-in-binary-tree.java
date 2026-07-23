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
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null) return list ;
        q.add(root);
        while(q.size()>0){
            int size = q.size();
            long sum = 0;
            for(int i=0;i<size;i++){
                TreeNode front = q.remove();
                sum+=front.val;
                if(front.left!=null) q.add(front.left);
                 if(front.right!=null) q.add(front.right);
            }
             list.add((double)sum/size);
        }
        return list;
      


    }
}