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
    int v;
    TreeNode ans=null;
    public void FindSmall(TreeNode node){
        if(node!=null){
            FindSmall(node.left);
            if(--v==0){
                
                    ans=node;
                    return ;
            }
            FindSmall(node.right);
        }
    }

    public int kthSmallest(TreeNode root, int k) {
        v=k;
        FindSmall(root);
        return ans.val;
    }
}