package Design;

import java.util.HashMap;

public class DesignUndergroundSystem {
    public UndergroundSystem() {}

    HashMap<Integer, String> checkInTime = new HashMap<>();
    HashMap<String, Integer> totalTime = new HashMap<>();
    HashMap<String, Integer> ways = new HashMap<>();

    public void checkIn(int id, String stationName, int t) {
        checkInTime.put(id, t + "-" + stationName);
    }

    public void checkOut(int id, String stationName, int t) {
        String[] infor = checkInTime.get(id).split("-");
        int time = Integer.valueOf(infor[0]);
        String startStation = infor[1];
        String endStation = stationName;
        String pairState = startStation + "-" + endStation;
        int minusTime = t - time;

        totalTime.put(pairState, totalTime.getOrDefault(pairState, 0) + minusTime);
        ways.put(pairState, ways.getOrDefault(pairState, 0) + 1);
    }

    public double getAverageTime(String startStation, String endStation) {
        String pairStation = startStation + "-" + endStation;

        int time = totalTime.get(pairStation);
        int way = ways.get(pairStation);

        double ans = (double) time / (double) way;
        return ans;
    }
}
