class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int majorityCount = n/2;
        HashSet<Integer> set = new HashSet<>();
        if(n==1){
            return nums[0];
        }
        for(int i =0;i< n ;i++){
            if(set.contains(nums[i])){
                int count=0;
                for(int ele: nums){
                    if(ele == nums[i]){
                        count++;
                    }
                }
                if(count>majorityCount){
                    return nums[i];
                }

            }else{
                set.add(nums[i]);
            }

        }
        return -1;
    }
}
