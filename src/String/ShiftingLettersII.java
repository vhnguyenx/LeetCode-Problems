package String;

public class ShiftingLettersII {
    public String shiftingLetters(String s, int[][] shifts) {
        int n = s.length();
        int[] diff = new int[n + 1];

        for (int[] shift : shifts) {
            int left = shift[0];
            int right = shift[1];
            int direction = shift[2];
            int value = (direction == 1) ? 1 : -1;
            diff[left] += value;
            diff[right + 1] -= value;
        }

        char[] arr = s.toCharArray();
        int prefix = 0;

        for (int i = 0; i < n; i++) {
            prefix += diff[i];
            int shift = ((prefix % 26) + 26) % 26;
            int index = arr[i] - 'a';
            index = (index + shift) % 26;
            arr[i] = (char) (index + 'a');
        }

        return new String(arr);
    }
}