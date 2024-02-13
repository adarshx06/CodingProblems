#leetcode 46

class Solution(object):

    def permute(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        result =[]

        if(len(nums) == 1):

            return [nums[:]]

        for i in range(len(nums)):
            n = nums.pop(0)
            perms = self.permute(nums)

            for perm in perms:
                perm.append(n)
            result.extend(perms)
            nums.append(n)

        return result
# class Solution {
#     public List<List<Integer>> permute(int[] nums) {
         
#         List<List<Integer>> result = new ArrayList<>();
#         List<Integer> tempList = new ArrayList<>();
#         boolean[] used = new boolean[nums.length];
#         permuteHelper(result, tempList, nums, used);
#         return result;
#     }

#     private void permuteHelper(List<List<Integer>> result, List<Integer> tempList, int[] nums, boolean[] used) {
#         if (tempList.size() == nums.length) {
#             result.add(new ArrayList<>(tempList));
#         } else {
#             for (int i = 0; i < nums.length; i++) {
#                 if (!used[i]) {
#                     tempList.add(nums[i]);
#                     used[i] = true;
#                     permuteHelper(result, tempList, nums, used);
#                     tempList.remove(tempList.size() - 1); // Backtrack
#                     used[i] = false;
#                 }
#             }
#         }
#     }
        
    
# }
