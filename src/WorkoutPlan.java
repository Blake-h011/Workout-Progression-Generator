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

    public void setCurrentMax(double currentMax) {
        this.currentMax = currentMax;
    }
    public void setGoalMax(double goalMax) {
        this.goalMax = goalMax;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
    public void setMaxDays(int maxDays) {
        this.maxDays = maxDays;
    }


    public double getCurrentMax() {
        return this.currentMax;
    }
    public double getGoalMax() {
        return this.goalMax;
    }
    public LocalDate getStartDate() {
        return this.startDate;
    }
    public LocalDate getEndDate() {
        return this.endDate;
    }
    public int getMaxDays() {
        return this.maxDays;
    }
}
