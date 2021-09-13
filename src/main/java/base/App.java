/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Chris Mathew
 */
package base;

import java.util.Scanner;

public class App
{
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Is the car silent when you turn the key?");
        String answer = in.nextLine();

        switch (answer) {
            case "yes":
                System.out.println("Are the battery terminals corroded?");
                answer = in.nextLine();
                switch (answer) {
                    case "yes":
                        System.out.println("Clean terminals and try starting again.");
                        System.exit(0);
                    case "no":
                        System.out.println("Replace cables and try again.");
                        System.exit(0);
                }
            case "no":
                System.out.println("Does the car make a slicking noise?");
                answer = in.nextLine();
                switch (answer) {
                    case "yes":
                        System.out.println("Replace the battery.");
                        System.exit(0);
                    case "no":
                        System.out.println("Does the car crank up but fail to start?");
                        answer = in.nextLine();
                        switch (answer) {
                            case "yes":
                                System.out.println("Check spark plug connections.");
                                System.exit(0);
                            case "no":
                                System.out.println("Does the engine start and then die?");
                                answer = in.nextLine();
                                switch (answer) {
                                    case "yes":
                                        System.out.println("Does you car have fuel injection?");
                                        answer = in.nextLine();
                                        switch (answer) {
                                            case "yes":
                                                System.out.println("Get it in for service.");
                                                System.exit(0);
                                            case "no":
                                                System.out.println("Check to ensure the choke is opening and closing.");
                                                System.exit(0);
                                        }
                                    case "no":
                                        System.out.println("This should not be possible.");
                                        System.exit(0);
                                }
                        }
                }
            default:
                System.out.println("Please input only yes or no.");
                System.exit(0);
        }
    }
}
