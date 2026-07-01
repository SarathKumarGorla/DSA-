
  public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
    TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 
class Solution {

    int preIndex=0;
    LinkedHashMap<Integer,Integer> inMap=new LinkedHashMap<>();
    public TreeNode build(int[] preorder, int[] inorder,int left ,int right){
            if(left>right) return null;
            int rootV=preorder[preIndex++];
            TreeNode root = new TreeNode(rootV);
            int index=inMap.get(rootV);
            root.left=build(preorder,inorder,left,index-1);
            root.right=build(preorder,inorder,index+1,right);
            return root;

    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        
        for(int i=0;i<inorder.length;i++){
            inMap.put(inorder[i],i);
        }
         return build(preorder,inorder,0,inorder.length-1);
         
    }
}