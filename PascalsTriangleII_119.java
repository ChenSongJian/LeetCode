// 119. Pascal's Triangle II

class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> PascalsTriangle = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> curRow = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    curRow.add(1);
                } else {
                    List<Integer> preRow = PascalsTriangle.get(i - 1);
                    curRow.add(preRow.get(j - 1) + preRow.get(j));
                }
            }
            PascalsTriangle.add(curRow);
        }
        return PascalsTriangle.get(rowIndex);
    }
}
