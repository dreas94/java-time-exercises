package se.lexicon.dreas94.java_time_exercises.exercise12;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ExerciseMain12
{
    public boolean runExercise()
    {
        System.out.println("Exercise 12:\nUsing DateTimeFormatter format LocalTime from current time and print it out as following pattern: 10:32:53.");
        LocalTime time = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String text = time.format(formatter);
        System.out.println(text);
        return true;
    }
}