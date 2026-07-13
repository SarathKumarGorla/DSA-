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
    int index=0;
    TreeNode build(int ub,int[] preorder){
            if(index==preorder.length || preorder[index]>ub){
                return null;
            }
            TreeNode root=new TreeNode(preorder[index++]);
            root.left=build(root.val,preorder);
            root.right=build(ub,preorder);
            return root;
           


    }
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length==0){
            return null;
        }
        return build(Integer.MAX_VALUE,preorder);
       

    }     
}