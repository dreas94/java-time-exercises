package se.lexicon.dreas94.java_time_exercises.exercise10;

import java.time.LocalTime;

public class ExerciseMain10
{
    public boolean runExercise()
    {
        System.out.println("Exercise 10:\nExtract the nanoseconds of a LocalTime object of current time. Print out the nanoseconds");
        int nano = LocalTime.now().getNano();
        System.out.println(nano);
        return true;
    }
}