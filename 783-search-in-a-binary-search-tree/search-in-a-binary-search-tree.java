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

    TreeNode rec(TreeNode node, int key){
         if(node==null) return null;
        if(node.val==key) return node ;
        if(node.val>key){
            return rec(node.left,key);
        }
        else return  rec(node.right,key);
    }
    public TreeNode searchBST(TreeNode root, int key) {
       

        // TreeNode cur = root;
        // while(cur!=null && cur.val!=key){
        //     if(cur.val>key){

        //         cur=cur.left;
        //     }
        //     else 
        //     cur=cur.right;
        // }
        // return cur;

       return rec(root,key);
    }

}