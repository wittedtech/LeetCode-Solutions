class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int [] res = new int [2];
        int start = 0;
        int end = numbers.length-1;
        while(numbers[start] + numbers[end] != target){
            if(numbers[start] + numbers[end]<target){
                start++;
            }else if(numbers[start] + numbers[end] > target){
                end--;
            }
        }
        res[0] = start+1;
        res[1] = end+1;
        return res;
    }
}