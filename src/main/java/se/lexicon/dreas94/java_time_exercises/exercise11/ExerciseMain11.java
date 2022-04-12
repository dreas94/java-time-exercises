package se.lexicon.dreas94.java_time_exercises.exercise11;

import java.time.LocalTime;

public class ExerciseMain11
{
    public boolean runExercise()
    {
        System.out.println("Exercise 11:\nCreate a LocalTime object from a String using the .parse() method.");
        LocalTime time = LocalTime.parse("10:32");
        System.out.println(time);
        return true;
    }
}