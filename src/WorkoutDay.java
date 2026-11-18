import java.time.LocalDate;

//TODO: Javadoc

public class WorkoutDay {
    private double dailyMax;
    private boolean isRestDay;
    private LocalDate date;

    public WorkoutDay(double dailyMax, boolean isRestDay, LocalDate date) {
        this.dailyMax = dailyMax;
        this.isRestDay = isRestDay;
        this.date = date;
    }

    public double getDailyMax() {
        return this.dailyMax;
    }
    public boolean isRestDay() {
        return this.isRestDay;
    }
    public LocalDate getDate() {
        return this.date;
    }

    public void setDailyMax(double dailyMax) {
        this.dailyMax = dailyMax;
    }

    @Override
    public String toString() {
        if (isRestDay() == true) {
            return getDate() + ": Rest";
        }
        return getDate() + ": " + getDailyMax();
    }
}
