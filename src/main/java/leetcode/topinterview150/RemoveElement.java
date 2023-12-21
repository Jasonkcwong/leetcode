package leetcode.topinterview150;

import org.junit.Test;

public class RemoveElement {

    @Test
    public void test(){
        int[] nums = {0,1,2,2,3,0,4,2};
        int result = removeElement(nums, 2);
        System.out.println(result);
        assert(result == 5 && nums[0] == 0 && nums[1] == 1 && nums[2] == 3 && nums[3] == 0 && nums[4] == 4);
    }

    public int removeElement(int[] nums, int val) {
        int idx = nums.length;
        for(int i = 0; i < idx ; i++){
            while(nums[i] == val){
                // swap with last number
                shift(nums, i);
                idx--;
            }
        }
        return idx;
    }

    private void shift(int[] nums, int idx){
        for(int i = idx ; i < nums.length - 1 ; i++){
            nums[i] = nums[i + 1];
        }
        nums[nums.length - 1] = -1;
    }
}
