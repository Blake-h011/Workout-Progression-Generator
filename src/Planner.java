//TODO: Javadoc

import java.time.LocalDate;

public class Planner {
    public static double[] calculateOneRepMaxes(WorkoutPlan input) {
        double currentWeight = input.getCurrentMax();
        double goalWeight = input.getGoalMax();
        boolean[] restDays = markRestDays(input);
        int numberOfSessions = getNumSessions(restDays);
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
        boolean[] restDays = markRestDays(plan);
        int numSessions = getNumSessions(restDays);
        int nextWeight = 0;

        for (int i = 0; i < restDays.length; i++) {
            LocalDate date = plan.getStartDate().plusDays(i);
            if (restDays[i] == true) {
                plan.addDay(new WorkoutDay(0.0, true, date));
            }
            else {
                plan.addDay(new WorkoutDay(weights[nextWeight], false, date));
                nextWeight++;
            }
        }
    }

    public static boolean[] markRestDays(WorkoutPlan input) {
        boolean[] restDays = new boolean[input.getTotalDays()];
        int consecutive = 0;
        int maxDays = input.getMaxDays();

        for (int i = 0; i < restDays.length; i++) {
            if (consecutive >= maxDays) {
                restDays[i] = true;
                consecutive = 0;
            }
            else {
                consecutive++;
            }
        }
        return restDays;
    }

    public static int getNumSessions(boolean[] restDays) {
        int count = 0;
        for (int i = 0; i < restDays.length; i++) {
            if (restDays[i] != true) {
                count++;
            }
        }
        return count;
    }
}
