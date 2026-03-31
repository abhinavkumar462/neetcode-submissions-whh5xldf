class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set = new TreeSet<>();
        Set<Integer> sets = new TreeSet<>();
        if(nums.length ==0){return 0;}

        for( int num : nums){
            set.add(num);
        }
        int count=1;
       
            for (int se: set){
                int th=se;
                if(set.contains(th+1)){
                    count++;
                }
                if(!(set.contains(th+1))){
                    sets.add(count);
                    count=1;
                    
                }

            }
            sets.add(count);
            int max = Collections.max(sets);
        
        return max;
    }
}
