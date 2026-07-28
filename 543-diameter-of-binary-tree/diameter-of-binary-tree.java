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
//     public int diameterOfBinaryTree(TreeNode root) {
//         if(root == null) return 0;
//         int a = levels(root.left)+levels(root.right);    
//         int b = diameterOfBinaryTree(root.left);
//         int c = diameterOfBinaryTree(root.right);
//         return Math.max(a, Math.max(b,c));
//     }
//     public static int levels(TreeNode root){
//         if(root==null) return 0;
//         return 1 + Math.max(levels(root.left),levels(root.right));
//     }
// }

class Solution {
    static int max;

    public int diameterOfBinaryTree(TreeNode root) {
        max = 0;
        levels(root);
        return max;
    }

    int levels(TreeNode root) {
        if (root == null)
            return 0;

        int leftLevels = levels(root.left);
        int rightLevels = levels(root.right);

        max = Math.max(max, leftLevels + rightLevels);

        return 1 + Math.max(leftLevels, rightLevels);
    }
}