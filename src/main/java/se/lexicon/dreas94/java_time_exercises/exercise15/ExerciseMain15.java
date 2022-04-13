package se.lexicon.dreas94.java_time_exercises.exercise15;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ExerciseMain15
{
    public boolean runExercise()
    {
        System.out.println("Exercise 15:\nCreate a LocalDateTime object by combining LocalDate object and LocalTime object.");
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println("Time: " + time + ", Date: " + date + ", Date + Time: " + dateTime);
        return true;
    }
}