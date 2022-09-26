// 350. Intersection of Two Arrays II

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if (nums1.length > nums2.length) {
            ArrayList<Integer> al1 = new ArrayList<Integer>();
            for (int i = 0; i < nums1.length; i++) {
                al1.add(nums1[i]);
            }
            for (int i = 0; i < nums2.length; i++) {
                if (al1.contains(nums2[i])) {
                    ans.add(nums2[i]);
                    al1.set(al1.indexOf(nums2[i]), -1);
                }
            }
        } else {
            ArrayList<Integer> al2 = new ArrayList<Integer>();
            for (int i = 0; i < nums2.length; i++) {
                al2.add(nums2[i]);
            }
            for (int i = 0; i < nums1.length; i++) {
                if (al2.contains(nums1[i])) {
                    ans.add(nums1[i]);
                    al2.set(al2.indexOf(nums1[i]), -1);
                }
            }
        }
        int[] result = new int[ans.size()];
        for  (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}
