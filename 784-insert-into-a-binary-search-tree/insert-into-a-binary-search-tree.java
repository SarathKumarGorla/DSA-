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
    public TreeNode insert(TreeNode temp,int val){
        if(temp==null){
            return new TreeNode(val);
        }else if(val<temp.val){
            temp.left=insert(temp.left,val);
        }else{
            temp.right=insert(temp.right,val);
        }
        return temp;
    }
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            return new TreeNode(val);
        }
        root=insert(root,val);
        return root;
    }
}