package se.lexicon.dreas94;
import se.lexicon.dreas94.java_time_exercises.exercise01.ExerciseMain01;
import se.lexicon.dreas94.java_time_exercises.exercise02.ExerciseMain02;
import se.lexicon.dreas94.java_time_exercises.exercise03.ExerciseMain03;
import se.lexicon.dreas94.java_time_exercises.exercise04.ExerciseMain04;
import se.lexicon.dreas94.java_time_exercises.exercise05.ExerciseMain05;
import se.lexicon.dreas94.java_time_exercises.exercise06.ExerciseMain06;
import se.lexicon.dreas94.java_time_exercises.exercise07.ExerciseMain07;
import se.lexicon.dreas94.java_time_exercises.exercise08.ExerciseMain08;
import se.lexicon.dreas94.java_time_exercises.exercise09.ExerciseMain09;
import se.lexicon.dreas94.java_time_exercises.exercise10.ExerciseMain10;
import se.lexicon.dreas94.java_time_exercises.exercise11.ExerciseMain11;
import se.lexicon.dreas94.java_time_exercises.exercise12.ExerciseMain12;
import se.lexicon.dreas94.java_time_exercises.exercise13.ExerciseMain13;
import se.lexicon.dreas94.java_time_exercises.exercise14.ExerciseMain14;
import se.lexicon.dreas94.java_time_exercises.exercise15.ExerciseMain15;
import se.lexicon.dreas94.java_time_exercises.exercise16.ExerciseMain16;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        int choice;
        do
        {
            Scanner sc = new Scanner(System.in);
            do
            {
                choice = -1;
                System.out.println("--------------------------------------------------");
                System.out.print("Pick Exercise to run (1-16), 0 exits the program: ");
                if (sc.hasNextInt())
                {
                    choice = sc.nextInt();
                    if(choice != 0)
                        System.out.println("Running Exercise " + choice);
                    else
                        System.out.println("Exiting Program");
                }
                else {
                    System.out.println("That is not a number between 0-16, TRY AGAIN!");
                    sc.nextLine();
                }
            }
            while (choice == -1);

            System.out.println("--------------------------------------------------");

            boolean completed = false;

            switch(choice)
            {
                case 1:
                    //Completed
                    ExerciseMain01 exercise1 = new ExerciseMain01();
                    completed = exercise1.runExercise();
                    break;
                case 2:
                    //Completed
                    ExerciseMain02 exercise2 = new ExerciseMain02();
                    completed = exercise2.runExercise();
                    break;
                case 3:
                    //Completed
                    ExerciseMain03 exercise3 = new ExerciseMain03();
                    completed = exercise3.runExercise();
                    break;
                case 4:
                    //Completed
                    ExerciseMain04 exercise4 = new ExerciseMain04();
                    completed = exercise4.runExercise();
                    break;
                case 5:
                    //Completed
                    ExerciseMain05 exercise5 = new ExerciseMain05();
                    completed = exercise5.runExercise();
                    break;
                case 6:
                    //Completed
                    ExerciseMain06 exercise6 = new ExerciseMain06();
                    completed = exercise6.runExercise();
                    break;
                case 7:
                    //Completed
                    ExerciseMain07 exercise7 = new ExerciseMain07();
                    completed = exercise7.runExercise();
                    break;
                case 8:
                    //Completed
                    ExerciseMain08 exercise8 = new ExerciseMain08();
                    completed = exercise8.runExercise();
                    break;
                case 9:
                    //Completed
                    ExerciseMain09 exercise9 = new ExerciseMain09();
                    completed = exercise9.runExercise();
                    break;
                case 10:
                    //Completed
                    ExerciseMain10 exercise10 = new ExerciseMain10();
                    completed = exercise10.runExercise();
                    break;
                case 11:
                    //Completed
                    ExerciseMain11 exercise11 = new ExerciseMain11();
                    completed = exercise11.runExercise();
                    break;
                case 12:
                    //Completed
                    ExerciseMain12 exercise12 = new ExerciseMain12();
                    completed = exercise12.runExercise();
                    break;
                case 13:
                    //Completed
                    ExerciseMain13 exercise13 = new ExerciseMain13();
                    completed = exercise13.runExercise();
                    break;
                case 14:
                    //Completed
                    ExerciseMain14 exercise14 = new ExerciseMain14();
                    completed = exercise14.runExercise();
                    break;
                case 15:
                    //Completed
                    ExerciseMain15 exercise15 = new ExerciseMain15();
                    completed = exercise15.runExercise();
                    break;
                case 16:
                    //Completed
                    ExerciseMain16 exercise16 = new ExerciseMain16();
                    completed = exercise16.runExercise();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
            }
            if(completed)
                System.out.println("Exercise " + choice + " has finished.");
            else
                System.out.println("Exercise " + choice + " has not been completed. Try again later.");

            System.out.println("Returning to menu!");
        }while(choice != 0);
    }
}
