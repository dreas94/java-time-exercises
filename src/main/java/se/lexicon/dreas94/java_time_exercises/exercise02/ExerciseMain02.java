package se.lexicon.dreas94.java_time_exercises.exercise02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ExerciseMain02
{
    public boolean runExercise()
    {
        System.out.println("Exercise 2:\nCreate a LocalDate of the current day and print it out in the following pattern using\nDateTimeFormatter: Torsdag 29 mars");

        LocalDate currentDay = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM", new Locale("SV"));
        String text = currentDay.format(formatter);
        System.out.println(text);
        return true;
    }
}