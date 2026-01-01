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
    int height(TreeNode node,int c){
        if(node!=null){
            if(node.left==null && node.right==null){
            return 1;
            }
        
        int lh=height(node.left,c);
        int rh=height(node.right,c);
        return 1+Math.max(lh,rh);
        }else{
            return 0;
        }
        
    }
    public int maxDepth(TreeNode root) {
         return height(root,0);
    }
}