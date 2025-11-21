package String;

public class ReverseString {
    public void reverseString(char[] s) {
        int leftPointer = 0;
        int rightPointer = s.length - 1;
        while (rightPointer > leftPointer) {
            char temp = s[leftPointer];
            s[leftPointer] = s[rightPointer];
            s[rightPointer] = temp;
            leftPointer++;
            rightPointer--;
        }
    }
}
