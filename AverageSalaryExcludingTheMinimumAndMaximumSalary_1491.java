// 1491. Average Salary Excluding the Minimum and Maximum Salary

class Solution {
    public double average(int[] salary) {
        int maxSalary = Integer.MIN_VALUE;
        int minSalary = Integer.MAX_VALUE;
        int sum = 0;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] > maxSalary) {
                maxSalary = salary[i];
            }
            if (salary[i] < minSalary) {
                minSalary = salary[i];
            }
            sum = sum + salary[i];
        }
        return (double) (sum - maxSalary - minSalary) / (salary.length - 2);
    }
}
