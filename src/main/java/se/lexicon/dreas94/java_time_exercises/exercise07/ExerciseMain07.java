package se.lexicon.dreas94.java_time_exercises.exercise07;

import java.time.LocalDate;
import java.time.Period;

public class ExerciseMain07
{
    public boolean runExercise()
    {
        System.out.println("Exercise 7:\nUsing the LocalDate from exercise 6 and your birthdate, create a Period between your birthdate and the date from exercise 6. Print out the elapsed years, months and days.");
        LocalDate date = LocalDate.now().plusYears(10).minusMonths(10);
        LocalDate birthDate = LocalDate.parse("1994-03-14");
        System.out.println(date.getMonth());
        Period period = Period.between(birthDate, date);
        System.out.println(period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days");
        return true;
    }
}