class SmallerNumbersThanCurren {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int size = nums.length;
        int[] ret = new int[size];
        int[] copy = new int[size];
        copy = Arrays.copyOf(nums,size);

        Arrays.sort(nums);
        
        //key:数字，value:大于多少数字
        HashMap<Integer,Integer> sorted = new HashMap<Integer,Integer>();
        sorted.put(nums[0],0);

        for(int j = 1; j < size; j++){
            if(nums[j] == nums[j-1]){
                sorted.put(nums[j],sorted.get(nums[j-1])); 
            }  
            else{
                sorted.put(nums[j],j);  
            }  
        }
        for(int k = 0; k<size;k++){
            ret[k] = sorted.get(copy[k]);
        }
        return ret;
    }
}
