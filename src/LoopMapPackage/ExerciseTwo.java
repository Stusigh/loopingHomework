package LoopMapPackage;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class ExerciseTwo {
    public static void carSalesman() {
        System.out.println("Exercise Two: Please enter a car make (i.e. Civic) below");
        HashMap<String, String> cars = new HashMap<>(); //create hash map
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
        System.out.println("What model of car are you looking for, sir or madam?"); //ask for input
        String carDesired = userInput.next();
        if(!(cars.containsKey(carDesired))) {
            System.out.println("Let me get the manager, he understands capital letters.");
        } else {
            System.out.println("Well of course we have the " + carDesired + "! " + "That's made by the fine people at " + cars.get(carDesired)+ "!");
        }


        //Using Map.Entry instead:

        Scanner secondUserInput = new Scanner(System.in);
        System.out.println("I'm the manager: case doesn't matter to me. What are you looking for?"); //ask for input
        String secondCarDesired = secondUserInput.next().toLowerCase();
        boolean carInStock = false;

        for(Map.Entry<String, String> car: cars.entrySet())
        {
            if(secondCarDesired.equalsIgnoreCase(car.getKey())) {
                System.out.println("Well of course we have the " + car.getKey() + "! " + "That's made by the fine people at " + car.getValue() + "!");
                carInStock = true;
            }
        }
        if(!(carInStock)) {
            System.out.println("I can say with 100% certainty that we don't have that in stock. Please leave."); //ask for input
        }
        secondUserInput.close();



    }
}
