package String;

public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int leftPointer = 0;
        int rightPointer = s.length() - 1;

        while (leftPointer < rightPointer) {
            if (s.charAt(leftPointer) != s.charAt(rightPointer)) {
                return isValidPlalindrome(s, leftPointer + 1, rightPointer)
                        || isValidPlalindrome(s, leftPointer, rightPointer - 1);
            }
            leftPointer++;
            rightPointer--;
        }

        return true;
    }

    public boolean isValidPlalindrome(String s, int leftPointer, int rightPointer) {

        while (leftPointer < rightPointer) {
            if (s.charAt(leftPointer) != s.charAt(rightPointer)) {
                return false;
            }
            leftPointer++;
            rightPointer--;
        }
        return true;
    }
}
