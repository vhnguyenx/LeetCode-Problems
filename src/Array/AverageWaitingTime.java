package Array;

public class AverageWaitingTime {
    public double averageWaitingTime(int[][] customers) {
        double totalTime = 0;
        int cooked = 0;

        for (int i = 0; i < customers.length; i++) {
            int arrivalTime = customers[i][0];
            int endTime = customers[i][1] + arrivalTime;

            if (cooked >= arrivalTime) {
                endTime = customers[i][1] + cooked;
                totalTime += cooked + customers[i][1] - arrivalTime;
            } else {
                totalTime += endTime - arrivalTime;
            }

            cooked = endTime;

        }

        return totalTime / customers.length;
    }
}
