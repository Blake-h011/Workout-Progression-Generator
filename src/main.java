import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.FileOutputStream;

//TODO: Javadoc

public static void main(String[] args) {
 double currentMax = 0.0;
 while (true) {
  try {
   currentMax = Double.parseDouble(IO.readln("Enter your current max:\n"));
   if (currentMax <= 0) {
    IO.println("Max must be greater than zero");
    continue;
   }
   break;
  } catch (NumberFormatException e) {
   IO.println("Enter a valid number");
  }
 }

 double goalMax = 0.0;
 while (true) {
  try {
   goalMax = Double.parseDouble(IO.readln("Enter your goal max:\n"));
   if (goalMax <= 0) {
    IO.println("Goal max must be greater than zero");
    continue;
   }
   break;
  } catch (NumberFormatException e) {
   IO.println("Enter a valid number");
  }
 }

 LocalDate startDate = null;
 while (true) {
  String input = IO.readln("Starting date (yyyy-mm-dd)\n");
  if (input.isEmpty()) {
   startDate = LocalDate.now();
   break;
  }
  try {
   startDate = LocalDate.parse(input);
   break;
  } catch (DateTimeParseException e) {
   IO.println("Enter a valid date");
  }
 }

 LocalDate endDate = null;
 while (true) {
  try {
   endDate = LocalDate.parse(IO.readln("Ending date (yyyy-mm-dd)\n"));
   break;
  } catch (DateTimeParseException e) {
   IO.println("Enter a valid date");
  }
 }

 int maxDays = 0;
 while (true) {
  try {
   maxDays = Integer.parseInt(IO.readln("Enter the maximum number " +
           "of days you want to workout in a row:\n"));
   break;
  } catch (NumberFormatException e) {
   IO.println("Enter a valid number");
  }
 }
 WorkoutPlan plan = new WorkoutPlan(currentMax, goalMax, startDate, endDate, maxDays);
}
