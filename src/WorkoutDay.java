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
}
