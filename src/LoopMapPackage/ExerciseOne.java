package LoopMapPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseOne {
    public static void inputFiveNumberLoop() {
        ArrayList<Integer> userInputNumbers = new ArrayList<>(5);
        Scanner userInput = new Scanner(System.in);

        int sumOfNumbers = 0;               //Initialising variables to store information.
        int productOfNumbers = 0;
        int largestNumber = 0;
        int smallestNumber = 0;

        //Setting up main loop.
        for(int i = 0; i<5 ; ++i) {
            System.out.println("Please enter a number: ");
            int newNumber = userInput.nextInt();
            userInputNumbers.add(newNumber);          // Getting user input
            sumOfNumbers = sumOfNumbers + newNumber;  //Finding the Sum of the Numbers
            if(i==0) {                                //Finding the Product of the Numbers, and initialising big and small
                productOfNumbers = newNumber;         //to the first integer in the array.
                largestNumber = newNumber;
                smallestNumber = newNumber;
            } else {
                productOfNumbers = productOfNumbers*newNumber;  //calculate product.
                if(newNumber>largestNumber) {                   //calculate if new number is the biggest.
                    largestNumber = newNumber;
                }
                if(newNumber<smallestNumber) {                  //calculate if new number is the smallest.
                    smallestNumber = newNumber;
                }
            }
        }
        System.out.println(userInputNumbers);               //print out results to console.
        System.out.println(sumOfNumbers);
        System.out.println(productOfNumbers);
        System.out.println(smallestNumber);
        System.out.println(largestNumber);
        userInput.close();
    }
}
