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
    List<Integer> traverseRec(TreeNode root,List<Integer> list){
        if(root == null) return list;
        list.add(root.val);
        traverseRec(root.left,list);
        traverseRec(root.right,list);
        return list;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List <Integer> list = new ArrayList<>();
        list =  traverseRec(root,list);
        return list;

    }
}