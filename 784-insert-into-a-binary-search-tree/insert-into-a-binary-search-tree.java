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
    public TreeNode insertIntoBST(TreeNode root, int key) {
        TreeNode new_node = new TreeNode(key);
        if(root==null) return new_node;
        TreeNode cur = root;
        TreeNode prv = null;
        while(cur!=null){
            if(cur.val>key){
                prv = cur;
                cur=cur.left;
            }
            else{
                prv = cur;
                cur = cur.right;
            }
        }
        if(prv.val > key){
            prv.left = new_node;
        }
        else
        prv.right=new_node;
        return root;


        
    }
}