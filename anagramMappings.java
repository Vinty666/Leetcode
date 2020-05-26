class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        int size = A.length;
        int[] ret = new int[size];
        HashMap<Integer,Integer> bSet = new HashMap<Integer,Integer>();
        
        for (int i = 0; i < size; i++){
            bSet.put(B[i],i);
        }
        
        for (int j = 0; j < size; j++){
            ret[j] = bSet.get(A[j]);
        }
        return ret;    
    }
}
