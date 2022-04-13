package se.lexicon.dreas94.java_time_exercises.exercise14;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ExerciseMain14
{
    public boolean runExercise()
    {
        System.out.println("Exercise 14:\nUsing DateTimeFormatter format the LocalDateTime object from exercise 13 to a String that should look tile this: torsdag 5 april 10:00");
        LocalDateTime time = LocalDateTime.parse("2018-04-05T10:00");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd MMMM HH:mm", new Locale("SV"));
        String text = time.format(formatter);
        System.out.println(text);
        return true;
    }
}