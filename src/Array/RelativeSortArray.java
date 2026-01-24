package Array;

public class RelativeSortArray {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] freq = new int[1001];

        for (int num : arr1) {
            freq[num]++;
        }

        int index = 0;

        for (int num : arr2) {
            while (freq[num]-- > 0) {
                arr1[index++] = num;
            }
        }

        for (int i = 0; i < freq.length; i++) {
            while (freq[i]-- > 0) {
                arr1[index++] = i;
            }
        }

        return arr1;
    }
}
