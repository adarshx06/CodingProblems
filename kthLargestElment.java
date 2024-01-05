//Brut force sort arry and return the kelement TC=O(NLOGN) SC=o(1)

class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}

//Optimize using priority queue  TC= O(N LOG K)

class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i: nums){
            pq.add(i);
            if(pq.size()>k){
                pq.poll();
            }

        }
        return pq.poll();
    }
}
