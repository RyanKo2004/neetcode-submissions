class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums){set.add(num);}
        ArrayList<Integer> sorted = new ArrayList<>(set);
        Collections.sort(sorted);
        int pointer1 = 0;
        int pointer2 = 1;
        
        ArrayList<Integer> sizes = new ArrayList<>();
        int size = 1;
        
        while (pointer2 < sorted.size()){
            int val1 = sorted.get(pointer1);
            int val2 = sorted.get(pointer2);
            if (val1 + 1 == val2){
                size++;
            }
            else{
                sizes.add(size);
                size = 1;
            }
            pointer1++;
            pointer2++;
        }
    
        sizes.add(size);
        return Collections.max(sizes);

        


    }
}
