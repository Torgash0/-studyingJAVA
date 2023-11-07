package Enum;

public enum Day {
    mnd(true, 8), tsd(true, 8), wsd(true, 8),
    thsd(true, 8), frd(true, 8), std(false, 0),
    snd(false, 0);
    private boolean isWorkingDay;
    private int workingHouer;

    Day(boolean isWorkingDay, int workingHouer) {
        this.isWorkingDay = isWorkingDay;
        this.workingHouer = workingHouer;
    }

    public boolean isWorkingDay() {
        return isWorkingDay;
    }

    public void setWorkingDay(boolean workingDay) {
        isWorkingDay = workingDay;
    }

    public int getWorkingHouer() {
        return workingHouer;
    }

    public void setWorkingHouer(int workingHouer) {
        this.workingHouer = workingHouer;
    }

    public static void main(String[] args) {
        System.out.println(Day.mnd.isWorkingDay);

        for (Day day : Day.values()) {
            System.out.println(day.name() + " " + day.isWorkingDay + " " + day.workingHouer);
        }
    }
}
