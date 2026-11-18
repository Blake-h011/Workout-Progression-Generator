//TODO: Javadoc

public class Planner {
    public static double[] calculateOneRepMaxes(WorkoutPlan input) {
        double currentWeight = input.getCurrentMax();
        double goalWeight = input.getGoalMax();
        int numberOfSessions = input.getNumSessions();
        double[] maxes = new double[numberOfSessions];
        double increment = (goalWeight - currentWeight) / (numberOfSessions - 1);

        for (int i = 0; i < numberOfSessions; i++) {
            maxes[i] = roundToStep(currentWeight + (i * increment));
        }
        maxes[0] = currentWeight;
        maxes[numberOfSessions - 1] = goalWeight;
        return maxes;
    }

    static final double roundingStep = 2.5;
    public static double roundToStep(double weight) {
        return Math.round(weight / roundingStep) * roundingStep;
    }

    public static void buildSchedule(WorkoutPlan plan) {
        double[] weights = calculateOneRepMaxes(plan);

        for (int i = 0; i < weights.length; i++) {
            WorkoutDay day = new WorkoutDay(weights[i], false, plan.getStartDate().plusDays(i));
            plan.addDay(day);
        }
    }
}
