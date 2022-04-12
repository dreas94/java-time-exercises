package se.lexicon.dreas94.java_time_exercises.exercise08;

import java.time.LocalDate;
import java.time.Period;

public class ExerciseMain08
{
    public boolean runExercise()
    {
        System.out.println("Exercise 8:\nCreate a period of 4 years, 7 months and 29 days. Then create a LocalDate of current date and add the period you created to the current date.");
        Period period = Period.of(4, 7, 29);
        LocalDate date = LocalDate.now().plus(period);
        System.out.println(date);
        return true;
    }
}