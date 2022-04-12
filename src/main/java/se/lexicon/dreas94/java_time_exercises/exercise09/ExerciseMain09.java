package se.lexicon.dreas94.java_time_exercises.exercise09;

import java.time.LocalTime;

public class ExerciseMain09
{
    public boolean runExercise()
    {
        System.out.println("Exercise 9:\nCreate a LocalTime object of the current time.");
        LocalTime date = LocalTime.now();
        System.out.println(date);
        return true;
    }
}