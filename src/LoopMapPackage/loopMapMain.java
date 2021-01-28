package LoopMapPackage;

import java.util.Scanner;

public class loopMapMain {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter 1 or 2 to access each exercise: ");
        int exerciseSelection = userInput.nextInt();
        if(exerciseSelection == 1) {
            ExerciseOne.inputFiveNumberLoop();
        } else if(exerciseSelection == 2) {
            ExerciseTwo.carSalesman();
        } else {
            System.out.println("Please Enter 1 or 2 next time.");
            userInput.close();
        }



    }
}

