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
// class Solution {
//     public boolean isBalanced(TreeNode root) {
//         if(root == null) return true;
//         int leftlv = levels(root.left);
//         int rightlv = levels(root.right);
//         if(Math.abs(leftlv-rightlv)>1) return false;
//         return isBalanced(root.left) && isBalanced(root.right);
//     }
//     private int levels(TreeNode root){
//         if(root==null) return 0;
//         return 1+ Math.max(levels(root.left),levels(root.right));
//     }
// }




class Solution {
    static boolean flag;
    public boolean isBalanced(TreeNode root) {    // optimise
        if(root == null) return true;
        flag = true;
        levels(root);
        return flag;
    }
    private int levels(TreeNode root){
        if(root==null) return 0;
        int leftlv= levels(root.left);
        int rightlv=levels(root.right);
        if(Math.abs(leftlv-rightlv)>1) flag = false;
        return 1+ Math.max(leftlv,rightlv);
    }
}