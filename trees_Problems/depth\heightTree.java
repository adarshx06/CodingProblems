//o(n)
class Solution{
  public int htoftree(TreeNode root){
    if(root== null){
      return 0;
    }
    int leftdepth = htoftree(root.left);
    int rightdepth = htoftree(root.right);

    return 1+ Math.max(leftdepth, rightdepth)
  }
}
