package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaximumGap {
    public int maximumGap(int[] nums) {

        int minValue = nums[0];
        int maxValue = nums[0];

        for (int value : nums) {
            if (value < minValue) {
                minValue = value;
            } else if (value > maxValue) {
                maxValue = value;
            }
        }

        int bucketSize = (int) Math.sqrt(nums.length);
        double range = Math.ceil((double) (maxValue - minValue) + 1) / bucketSize;

        List<Integer>[] buckets = new List[bucketSize];

        for (int i = 0; i < bucketSize; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int value : nums) {
            int bucketIndex = (int) ((value - minValue) / range);
            buckets[bucketIndex].add(value);
        }

        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }

        int[] sortedArray = new int[nums.length];

        int index = 0;

        for (List<Integer> bucket : buckets) {
            for (int value : bucket) {
                sortedArray[index++] = value;
            }
        }

        // [1,3,6,9]

        int result = 0;

        int fastPointer = 1;
        for (int slowPointer = 0; fastPointer <= sortedArray.length - 1; slowPointer++) {
            int diff = sortedArray[fastPointer] - sortedArray[slowPointer];
            if (diff > result) {
                result = diff;
            }
            fastPointer++;
        }

        return result;
    }
}
