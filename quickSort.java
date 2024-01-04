class Solution {
  static void sort(int[] nums, int low, int hi) { //low= 0 and high == arr.length-1;
    if (low >= hi) {
      return;
    }
    int s = low;
    int e = hi;
    int m = s + (e - s) / 2;
    int pivot = nums[m];

    while (s <= e) {
      while (nums[s] < pivot) {
        s++;
      }
      while (nums[e] > pivot) {
        e--;
      }
      if (s <= e) {
        // Fix the typo here: nums[s] should be updated to nums[e]
        int temp = nums[s];
        nums[s] = nums[e];
        nums[e] = temp;
        s++;
        e--;
      }
    }

    // Pivot is at the correct index, solve the rest
    sort(nums, low, e);
    sort(nums, s, hi);
  }
}
