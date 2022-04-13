package se.lexicon.dreas94.java_time_exercises.exercise16;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ExerciseMain16
{
    public boolean runExercise()
    {
        System.out.println("Exercise 16:\nCreate a LocalDateTime object. Then get the LocalDate and LocalTime components into separate objects of respective types from the LocalDateTime object.");
        LocalDateTime dateTime = LocalDateTime.now();

        LocalDate date = dateTime.toLocalDate();
        LocalTime time = dateTime.toLocalTime();

        System.out.println("Time: " + time + ", Date: " + date + ", Date + Time: " + dateTime);
        return true;
    }
}