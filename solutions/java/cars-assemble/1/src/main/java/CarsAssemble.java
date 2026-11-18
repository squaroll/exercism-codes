public class CarsAssemble {

    public double productionRatePerHour(int speed) {
        double prob = 1;
        if (speed == 10) prob = 0.77;
        else if (speed == 9) prob = 0.8;
        else if (speed >= 5) prob = 0.9;
        else prob = 1;
        return speed * 221 * prob;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
