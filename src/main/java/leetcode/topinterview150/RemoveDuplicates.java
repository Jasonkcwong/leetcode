package leetcode.topinterview150;

import org.junit.Test;

public class RemoveDuplicates {

    @Test
    public void test(){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int result = removeDuplicates2(nums);
        System.out.println(result);
        assert(result == 5 &&  nums[0] == 0 && nums[1] == 1 && nums[2] == 2 && nums[3] == 3 && nums[4] == 4);
    }

    public int removeDuplicates(int[] nums) {
        int count = 0;
        for(int i = 0 ; i < nums.length - count - 1; i++){
            if(nums[i] == nums[i + 1]){
                shift(nums, i);
                nums[nums.length - count - 1] = -999;
                count++;
                i--;
            }
        }
        return nums.length - count;
    }

    private void shift(int[] nums, int i){
        for(int j = i ; j < nums.length - 1; j++){
            nums[j] = nums[j + 1];
        }
    }

    public int removeDuplicates2(int[] nums) {
        int start = findFirstDiff(nums);
        if(start == -1){
            return 1;
        }
        int idx = 1;
        int tmp = nums[idx];
        for(int i = start ; i < nums.length ; i++){
            if(nums[i] != tmp){
                nums[idx] = nums[i];
                idx++;
                tmp = nums[i];
            }
        }
        return idx;
    }

    private int findFirstDiff(int[] nums){
        for(int i = 0 ; i < nums.length - 1 ; i++){
            if(nums[i] != nums[i + 1])
                return i + 1;
        }
        return -1;
    }
}
