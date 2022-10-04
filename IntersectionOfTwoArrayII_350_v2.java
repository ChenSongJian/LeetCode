// 350. Intersection of Two Arrays II

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ansArr = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            if (map1.containsKey(nums1[i])) {
                map1.put(nums1[i], map1.get(nums1[i]) + 1);
            } else {
                map1.put(nums1[i], 1);
            }
            set.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (map2.containsKey(nums2[i])) {
                map2.put(nums2[i], map2.get(nums2[i]) + 1);
            } else {
                map2.put(nums2[i], 1);
            }
            set.add(nums2[i]);
        }
        for (int num: set) {
            if (map1.containsKey(num) && map2.containsKey(num)) {
                int count = Math.min(map1.get(num), map2.get(num));
                while (count > 0) {
                    count--;
                    ansArr.add(num);
                }
            }
        }
        int[] ans = new int[ansArr.size()];
        for  (int i = 0; i < ansArr.size(); i++) {
            ans[i] = ansArr.get(i);
        }
        return ans;
    }
}
