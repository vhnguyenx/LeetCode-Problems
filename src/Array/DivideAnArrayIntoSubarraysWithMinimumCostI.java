package Array;

public class DivideAnArrayIntoSubarraysWithMinimumCostI {
     public int minimumCost(int[] nums) {
        int[] base = new int[51];

        for (int num : nums) {
            base[num]++;
        }

        base[nums[0]]--;

        int sum = nums[0];
        int count = 2;
        for (int i = 1; i < 51; i++) {
            if (base[i] == 0) {
                continue;
            }

            while (base[i] > 0) {
                sum += i;
                base[i]--;
                count--;
                if (count == 0) {
                    break;
                }
            }

            if (count == 0) {
                break;
            }
        }

        return sum;
    }
}
