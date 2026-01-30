package Math;

public class FindClosestPerson {
    public int findClosest(int x, int y, int z) {
        int personX = Math.abs(z - x);
        int personY = Math.abs(z - y);

        if (personX < personY) {
            return 1;
        } else if (personX > personY) {
            return 2;
        } else {
            return 0;
        }
    }
}
