package Array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class SortAnArray {
    public int[] sortArray(int[] nums) {
        // [3,6,9,1]

        // Find min,max
        int minVal = nums[0];
        int maxVal = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < minVal) {
                minVal = nums[i];
            } else if (nums[i] > maxVal) {
                maxVal = nums[i];
            }
        }

        int bucketSize = (int) Math.sqrt(nums.length);
        double range = Math.ceil((double) (maxVal - minVal) + 1) / bucketSize;

        List<Integer>[] buckets = new List[bucketSize];

        for (int i = 0; i < bucketSize; i++) {
            buckets[i] = new ArrayList<>();
        }
        
        //Add value to bucket
        for (int value : nums) {
            int bucketIndex = (int) ((value - minVal) / range);
            buckets[bucketIndex].add(value);
        }
        
        //Sort bucket =))
        for (List<Integer> bucket : buckets) {
            Collections.sort(bucket);
        }
        
        //Return the result after sort
        int[] result = new int[nums.length];
        int index = 0;
        for (List<Integer> bucket : buckets) {
            for (int value : bucket) {
                result[index] = value;
                index++;
            }
        }

        return result;
    }
}
