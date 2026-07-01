
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

    int postIndex;
    LinkedHashMap<Integer,Integer> inMap=new LinkedHashMap<>();
    public TreeNode build(int[] postorder, int[] inorder,int left ,int right){
            if(left>right) return null;
            int rootV=postorder[postIndex--];
            TreeNode root = new TreeNode(rootV);
            int index=inMap.get(rootV);
            root.right=build(postorder,inorder,index+1,right);
            root.left=build(postorder,inorder,left,index-1);
            
            return root;

    }
    public TreeNode buildTree(int[] inorder ,int[] postorder) {
        postIndex=postorder.length-1;
        for(int i=0;i<inorder.length;i++){
            inMap.put(inorder[i],i);
        }
         return build(postorder,inorder,0,inorder.length-1);
         
    }
}