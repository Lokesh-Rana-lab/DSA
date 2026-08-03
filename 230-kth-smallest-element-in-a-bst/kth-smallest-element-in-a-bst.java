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
    // public void inorder(TreeNode root, ArrayList<Integer> arr ){
    //     if(root == null) return;
    //     inorder(root.left , arr);
    //     arr.add(root.val);
    //     inorder(root.right,arr);
    // }
    // public int kthSmallest(TreeNode root, int k) {
    //     ArrayList<Integer> arr = new ArrayList<>();
    //     inorder(root,arr);
    //     if(arr.size()<k) return -1;
    //     return arr.get(k-1);

     static int ans;
     static int k2;
    public void inorder(TreeNode root){
        if(root == null) return;
        inorder(root.left);
        k2--;
        if(k2==0) ans=root.val;
        inorder(root.right);
    }
    public int kthSmallest(TreeNode root, int k) {
         ans =-1;
         k2=k;
        inorder(root);
        return ans;
    }
}