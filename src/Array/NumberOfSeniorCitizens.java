package Array;

public class NumberOfSeniorCitizens {
    public int countSeniors(String[] details) {
        int countSenior = 0;

        for (String passenger : details) {
            if (Integer.parseInt(passenger.substring(11, 13)) > 60) {
                countSenior++;
            }
        }

        return countSenior;
    }
}
