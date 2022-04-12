package se.lexicon.dreas94.java_time_exercises.exercise04;

import java.time.LocalDate;

public class ExerciseMain04
{
    public boolean runExercise()
    {
        System.out.println("Exercise 4:\nCreate a LocalDate object from a String by using the .parse() method.");
        LocalDate nextBirthDay = LocalDate.parse("2023-03-14");
        System.out.println(nextBirthDay);
        return true;
    }
}