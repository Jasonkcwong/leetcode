package leetcode.topinterview150;

import org.junit.Test;

import java.util.Arrays;

public class MergeSortedArray {

    @Test
    public void test(){
        // test case 1
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
        assert(Arrays.equals(nums1, new int[]{1,2,2,3,5,6}));

        // test case 2
        int[] nums3 = {4,0,0,0,0,0};
        int[] nums4 = {1,2,3,5,6};
        merge(nums3, 1, nums4, 5);
        System.out.println(Arrays.toString(nums3));
        assert(Arrays.equals(nums3, new int[]{1,2,3,4,5,6}));

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int j = 0 ; j < n ; j++){
            boolean found = false;
            for(int i = 0 ; i < m + j ; i++){
                if(nums2[j] < nums1[i]){
                    shiftRight(nums1, i);
                    nums1[i] = nums2[j];
                    found = true;
                    break;
                }
            }
            if(!found) {
                nums1[m + j] = nums2[j];
            }
        }
    }

    private void shiftRight(int[] nums1, int idx){
        for(int i = nums1.length - 1 ; i > idx ; i--){
            nums1[i] = nums1[i - 1];
        }
    }
}
