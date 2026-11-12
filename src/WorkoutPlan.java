import java.time.LocalDate;
import java.util.ArrayList;

//TODO: Javadoc

public class WorkoutPlan {
    private double currentMax;
    private double goalMax;
    private LocalDate startDate;
    private LocalDate endDate;
    private int maxDays;
    private ArrayList<WorkoutDay> schedule = new ArrayList<>();

    public WorkoutPlan(double currentMax, double goalMax, LocalDate startDate,
                       LocalDate endDate, int maxDays) {
        this.currentMax = currentMax;
        this.goalMax = goalMax;
        this.startDate = startDate;
        this.endDate = endDate;
        this.maxDays = maxDays;
    }
}
