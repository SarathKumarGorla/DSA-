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
            if(node==null){
                return 0;
            }
            
        
        int lh=height(node.left,c);
        int rh=height(node.right,c);
        return 1+Math.max(lh,rh);
        }
        
        
    
    public int maxDepth(TreeNode root) {
         return height(root,0);
    }
}