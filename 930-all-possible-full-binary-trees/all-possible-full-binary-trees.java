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
    public List<TreeNode> allPossibleFBT(int n) {
        List<TreeNode> ans = new ArrayList<>();

        if(n%2==0) return ans;

        if (n == 1) {
            ans.add(new TreeNode(0));
            return ans;
        }

        for(int left = 1; left<n ; left+=2){
            int right = n-1-left;
             List<TreeNode> leftTrees = allPossibleFBT(left);
            List<TreeNode> rightTrees = allPossibleFBT(right);


            for(TreeNode l : leftTrees){
                for(TreeNode r : rightTrees){
                  
                  TreeNode root = new TreeNode(0);
                  root.left = l;
                  root.right = r;

                  ans.add(root);

                }
            }
        } 
        return ans;
    }
}