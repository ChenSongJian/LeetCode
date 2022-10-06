// 120. Triangle

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle.size() == 1) {
            return triangle.get(0).get(0);
        }
        ArrayList<ArrayList<Integer>> triangleSum = new ArrayList<>();
        ArrayList<Integer> height1 = new ArrayList<>();
        height1.add(triangle.get(0).get(0));
        triangleSum.add(height1);
        for (int i = 1; i < triangle.size(); i++) {
            ArrayList<Integer> curHeight = new ArrayList<>();
            for (int j = 0; j < triangle.get(i).size(); j++) {
                if (j == 0) {
                    curHeight.add(triangleSum.get(i - 1).get(j) + triangle.get(i).get(j));
                } else if (j == triangle.get(i).size() - 1) {
                    curHeight.add(triangleSum.get(i - 1).get(j - 1) + triangle.get(i).get(j));
                } else {
                    curHeight.add(Math.min(triangleSum.get(i - 1).get(j - 1), triangleSum.get(i - 1).get(j)) + triangle.get(i).get(j));
                }
                
            }
            triangleSum.add(curHeight);
        }
        int ans = triangleSum.get(triangle.size() - 1).get(0);
        for (int i = 1; i < triangle.size(); i++) {
            if (ans > triangleSum.get(triangle.size() - 1).get(i)) {
                ans = triangleSum.get(triangle.size() - 1).get(i);
            }
        }
        return ans;
    }
}
