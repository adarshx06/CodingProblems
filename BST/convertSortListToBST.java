class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = new TreeNode(nums[0]);
        // for(int i = 1; i < nums.length; i++){
        //     if(nums[i] < root.val ){
        //         //root = root.left
        //         root.left = new TreeNode(nums[i])
        //     }else{
        //         root.right = new TreeNode(nums[i])
        //     }

        // }
        if(nums.length== 0){
            return null;
        }
        return convertBST(nums, 0, nums.length-1);

    }
    public TreeNode convertBST(int [] arr, int s, int e){
        if(s> e){
            return null;
        }
        else{
            int mid = (s+e)/2;
            TreeNode root = new TreeNode(arr[mid]);
            root.left = convertBST(arr, s ,mid-1);
            root.right = convertBST(arr,mid+1,e);
            return root;
        }
        

    }
}
