package se.lexicon.dreas94.java_time_exercises.exercise06;

import java.time.LocalDate;

public class ExerciseMain06
{
    public boolean runExercise()
    {
        System.out.println("Exercise 6:\nCreate a LocalDate of current date plus 10 years and minus 10 months. From that date extract the month and print it out.");
        LocalDate date = LocalDate.now().plusYears(10).minusMonths(10);
        System.out.println(date.getMonth());
        return true;
    }
}