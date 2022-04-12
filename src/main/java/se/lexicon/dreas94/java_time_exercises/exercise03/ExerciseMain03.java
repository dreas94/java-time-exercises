package se.lexicon.dreas94.java_time_exercises.exercise03;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ExerciseMain03
{
    public boolean runExercise()
    {
        System.out.println("Exercise 3:\nCreate a LocalDate of last Monday. Then print out the entire week in a loop using standard ISO format.");

        LocalDate endDate = LocalDate.now().with(DayOfWeek.SUNDAY).plusDays(1);

        for(LocalDate date = LocalDate.now().with(DayOfWeek.MONDAY); !date.equals(endDate); date = date.plusDays(1))
        {
            System.out.println(date);
        }
        return true;
    }
}