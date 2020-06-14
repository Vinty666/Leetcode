class Compress {
    public int compress(char[] chars) {
        int write = 0;
        Integer size = 1;

        for (int read = 0; read < chars.length; read++){
            if((read == chars.length-1)||(chars[read + 1] != chars[read])){
                if(size == 1){
                    chars[write] = chars[read];
                    write = write + 1;
                }
                else{
                    chars[write] = chars[read];
                    write = write + 1;
                    
                    String nums = Integer.toString(size);
                    char[] size_arr = nums.toCharArray();
                    for (int i = 0; i < size_arr.length; i++){
                        chars[write] = size_arr[i];
                        write = write + 1;
                    }
                }
                size = 1;
            }
            else{
                size = size + 1;
            }   
        }
        return write;
    }
}
