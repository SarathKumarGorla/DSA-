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
 class BstIterator{
    Stack<TreeNode> stack;
    boolean isReverse;
    BstIterator(TreeNode root,boolean isReverse){
            stack=new Stack<TreeNode>();
            this.isReverse=isReverse;
            pushAll(root);
    }
    public boolean hasNext(){
        return !stack.isEmpty();
    }
    public int next(){
        TreeNode node=stack.pop();
        if(isReverse){
            pushAll(node.left);
        }else{
            pushAll(node.right);
        }
        return node.val;
    }
    public void pushAll(TreeNode root){
        while(root!=null){
            stack.push(root);
            if(isReverse){
                root=root.right;
            }else{
                root=root.left;
                
            }
        }

    }
 }
 
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if(root==null)return false;;
        BstIterator l=new BstIterator(root,false);
        BstIterator r=new BstIterator(root,true);
        // Get the first values
        int i = l.next();
        int j = r.next();
        while(i<j){
            if(i+j==k){
                return true;
            }else if(i+j<k){
                i=l.next();
            }else{
                j=r.next();
            }
        }
        return false;
    }
}