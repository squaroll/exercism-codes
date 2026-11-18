
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        int[] lastWeek = {0, 2, 5, 3, 7, 8, 4};
        return lastWeek;
    }

    public int getToday() {
        return this.birdsPerDay[this.birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1] += 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int num : this.birdsPerDay) {
            if (num == 0) return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int res = 0;
        int days = numberOfDays > this.birdsPerDay.length ? this.birdsPerDay.length : numberOfDays;
        for (int i = 0; i < days; i++) {
            res += this.birdsPerDay[i];
        }
        return res;
    }

    public int getBusyDays() {
        int res = 0;
        for (int num : this.birdsPerDay) {
            if (num >= 5) res += 1;
        }
        return res;
    }
}
