package se.lexicon.dreas94.java_time_exercises.exercise13;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ExerciseMain13
{
    public boolean runExercise()
    {
        System.out.println("Exercise 13:\nUsing DateTimeFormatter format LocalTime from current time and print it out as following pattern: 10:32:53.");
        LocalDateTime time = LocalDateTime.parse("2018-04-05T10:00");
        System.out.println(time);
        return true;
    }
}