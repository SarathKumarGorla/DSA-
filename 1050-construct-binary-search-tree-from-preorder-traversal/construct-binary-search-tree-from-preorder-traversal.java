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
    TreeNode root=null;
    public void build(TreeNode root,int val){

            if(root.val>val){
                if(root.left==null){
                    root.left=new TreeNode(val);
                    return;
                }else{
                    build(root.left,val);
                }
                
            }else{
                if(root.right==null){
                    root.right=new TreeNode(val);
                    return;
                }else{
                    build(root.right,val);
                    
                }
            }
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length==0){
            return null;
        }
        root=new TreeNode(preorder[0]);
        for(int i=1;i<preorder.length;i++){
            build(root,preorder[i]);
        }
        return root;
    }
}