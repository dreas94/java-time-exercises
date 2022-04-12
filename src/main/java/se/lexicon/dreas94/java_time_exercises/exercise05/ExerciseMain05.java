package se.lexicon.dreas94.java_time_exercises.exercise05;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class ExerciseMain05
{
    public boolean runExercise()
    {
        System.out.println("Exercise 5:\nThe date time api provides enums for time units such as day and month. Create a LocalDate of 1945-05-08 and extract the day of week for that date.");
        LocalDate date = LocalDate.parse("1945-05-08");
        System.out.println(date.getDayOfWeek());
        return true;
    }
}