package Math;

public class IntegerReplacement {
    public int integerReplacement(int n) {
        int steps = 0;
        long x = n;

        while (x != 1) {
            if (x % 2 == 0) {
                x = x / 2;
            } else {
                if (x == 3 || x % 4 == 1) {
                    x = x - 1;
                } else {
                    x = x + 1;
                }
            }

            steps++;
        }

        return steps;
    }
}
