class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {

        if (nums.length == 1) return nums;
        if (k == 1) return nums;

        int n = nums.length;
        int[] arr = new int[n - k + 1];  // ✅ FIXED SIZE

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i <= n - k; i++) {   // ✅ FIXED LOOP RANGE
            set.clear();

            // fill window
            for (int j = i; j < i + k; j++) {
                set.add(nums[j]);
            }

            // get max
            arr[i] = Collections.max(set);  // no need to check empty
        }

        return arr;
    }
}