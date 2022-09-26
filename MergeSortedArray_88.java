// 88. Merge Sorted Array

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {  
        int id = nums1.length - 1;
        int id1 = m - 1;
        int id2 = n - 1;
        while (id1 >= 0 && id2 >= 0) {
            if (nums1[id1] > nums2[id2]) {
                nums1[id] = nums1[id1];
                id1--;
            } else {
                nums1[id] = nums2[id2];
                id2--;
            }
            id--;
        }
        while (id2 >= 0) {
            nums1[id] = nums2[id2];
            id--;
            id2--;
        }
    }
}
