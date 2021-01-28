package LoopMapPackage;

import java.util.HashMap;
import java.util.Scanner;

public class ExerciseTwo {
    public static void carSalesman() {
        HashMap<String, String> cars = new HashMap<>();
        cars.put("Accord", "Honda");
        cars.put("Civic", "Honda");
        cars.put("M3", "BMW");
        cars.put("Mini Cooper", "BMW");
        cars.put("S-Type", "Jaguar");
        cars.put("X-Type", "Jaguar");
        cars.put("Elantra", "Hyundai");
        cars.put("Accent", "Hyundai");
        cars.put("Beetle", "Volkswagen");
        cars.put("Golf", "Volkswagen");

        Scanner userInput = new Scanner(System.in);
        System.out.println("What model of car are you looking for, sir or madam?");
        String carDesired = userInput.next();
        if(!(cars.containsKey(carDesired))) {
            System.out.println("I think you should leave. We don't serve your sort around here.");
        } else {
            System.out.println("Well of course we have the " + carDesired + "!" + "That's made by the fine people at " + cars.get(carDesired)+ "!");
        }




        userInput.close();
    }
}
