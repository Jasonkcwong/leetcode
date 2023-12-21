package leetcode.topinterview150;

import java.util.Arrays;

import org.junit.Test;

public class TopInterviewTest{
    
    @Test
    public void testRemoveDuplicates(){
        
        int[] nums1 = {0,0,1,1,1,2,2,3,3,4};
        int[] nums2 = {1,2};
        
        int result1 = new RemoveDuplicates().removeDuplicates2(nums1);
        System.out.println(result1);
        assert(result1 == 5 &&  nums1[0] == 0 && nums1[1] == 1 && nums1[2] == 2 && nums1[3] == 3 && nums1[4] == 4);
    
        int result2 = new RemoveDuplicates().removeDuplicates2(nums2);
        System.out.println(result2);
        assert(result2 == 2 && nums2[0] == 1 && nums1[1] == 2);
    }

    @Test
    public void testRemoveElement(){
        int[] nums = {0,1,2,2,3,0,4,2};
        int result = new RemoveElement().removeElement(nums, 2);
        System.out.println(result);
        assert(result == 5 && nums[0] == 0 && nums[1] == 1 && nums[2] == 3 && nums[3] == 0 && nums[4] == 4);
    }

    @Test
    public void testMergeSortedArray(){
        // test case 1
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        new MergeSortedArray().merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
        assert(Arrays.equals(nums1, new int[]{1,2,2,3,5,6}));

        // test case 2
        int[] nums3 = {4,0,0,0,0,0};
        int[] nums4 = {1,2,3,5,6};
        new MergeSortedArray().merge(nums3, 1, nums4, 5);
        System.out.println(Arrays.toString(nums3));
        assert(Arrays.equals(nums3, new int[]{1,2,3,4,5,6}));

    }
}