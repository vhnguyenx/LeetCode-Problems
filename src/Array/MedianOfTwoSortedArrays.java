package Array;

public class MedianOfTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;

        int[] newArray = new int[nums1.length + nums2.length];

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] <= nums2[j]) {
                newArray[k] = nums1[i];
                i++;
                k++;
            } else {
                newArray[k] = nums2[j];
                j++;
                k++;
            }
        }

        while (i < nums1.length) {
            newArray[k] = nums1[i];
            i++;
            k++;
        }

        while (j < nums2.length) {
            newArray[k] = nums2[j];
            j++;
            k++;
        }

        int median = 0;
        int median2 = -1;
        if (newArray.length % 2 != 0) {
            median = (newArray.length / 2);
        } else {
            median = (newArray.length / 2);
            median2 = (newArray.length / 2) - 1;
        }

        double result;

        if (median2 != -1) {
            result = ((double) newArray[median] + (double) newArray[median2]) / 2;
        } else {
            result = newArray[median];
        }

        return result;

    }
}
