package Array;

public class NumberOfStudentsUnableToEatLunch {
    public int countStudents(int[] students, int[] sandwiches) {
        int circularStudent = 0;
        int squareStudent = 0;

        for (int i = 0; i < students.length; i++) {
            if (students[i] == 0) {
                circularStudent++;
            } else {
                squareStudent++;
            }
        }

        for (int i = 0; i < sandwiches.length; i++) {
            if (sandwiches[i] == 0) {
                if (circularStudent == 0) {
                    break;
                }
                circularStudent--;
            } else {
                if (squareStudent == 0) {
                    break;
                }
                squareStudent--;
            }
        }

        return circularStudent + squareStudent;
    }
}
