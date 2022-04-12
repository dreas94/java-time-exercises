package se.lexicon.dreas94.java_time_exercises.exercise01;

import java.time.LocalDate;

public class ExerciseMain01
{
    public boolean runExercise()
    {
        System.out.println("Exercise 1:\nCreate a LocalDate of the current day and print it out");

        LocalDate currentDay = LocalDate.now();

        System.out.println(currentDay);
        return true;
    }
}
