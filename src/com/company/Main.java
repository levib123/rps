package com.company;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        // Initializing variables that get used later
        int rand;
        int winCounter = 0;
        int lossCounter = 0;

        Scanner input = new Scanner(System.in);


        //while loops keeps the code running until the user wants to quit
        while(true){
            System.out.println("Let's play Paper Rock Scissors! ");
            System.out.println("Type in your choice!");
            //gets user input
            String choice = input.nextLine();
            //generating a random number
            rand = (int) (Math.random() * 3) + 1;

            //if the random number generates a 1, this code gets executed depending on the user input
            if(rand == 1 ) {
                System.out.println("Rock");
                //if user chooses rock, executes this code
                if(choice.equalsIgnoreCase("Rock")){
                    System.out.println("TIE!");
                    System.out.println("Times won: " + winCounter);
                    System.out.println("Times lost: " + lossCounter);
                    continue;
                }
                //if user chooses paper, executes this code
                if(choice.equalsIgnoreCase("Paper" )){
                    System.out.println("YOU WIN!");
                   //adds to the win counter
                    winCounter++;
                    //prints out times won and times lost
                    System.out.println("Times won: " + winCounter);
                    System.out.println("Times lost: " + lossCounter);
                    //asks user if they want to play again
                    System.out.println("Do you want to play again y/n");
                    if(input.nextLine().equals("y")){
                        continue;
                    }
                    //if response is anything but y or no it quits the program
                    break;
                }
                //if user choose Scissors, executes this code
                if(choice.equalsIgnoreCase("Scissors")){
                    System.out.println("YOU LOSE!");
                    lossCounter++;
                    System.out.println("Times won: " + winCounter);
                    System.out.println("Times lost: " + lossCounter);
                    System.out.println("Do you want to play again y/n");
                    if(input.nextLine().equals("y")){
                        continue;
                    }
                    break;
                }


            } else if(rand == 2) {
                System.out.println("Paper");
                if(choice.equalsIgnoreCase("Rock")){
                    System.out.println("YOU WIN!");
                    winCounter++;
                    System.out.println("Times won: " + winCounter);
                    System.out.println("Times lost: " + lossCounter);
                    System.out.println("Do you want to play again y/n");
                    if(input.nextLine().equals("y")){
                        continue;
                    }
                    break;
                }
                if(choice.equalsIgnoreCase("Paper")){
                    System.out.println("TIE!");
                    System.out.println("Times won: " + winCounter);
                    System.out.println("Times lost: " + lossCounter);
                    continue;
                }
                if(choice.equalsIgnoreCase("Scissors")){
                    System.out.println("YOU LOSE!");
                    lossCounter++;
                    System.out.println("Times won: " + winCounter);
                    System.out.println("Times lost: " + lossCounter);
                    if(input.nextLine().equals("y")){
                        continue;
                    }
                    break;
                }

            } else if(rand == 3){
                System.out.println("Scissors");
                if(choice.equalsIgnoreCase("Rock")){
                    System.out.println("YOU LOSE!");
                    lossCounter++;
                    System.out.println("Times won: " + winCounter);
                    System.out.println("Times lost: " + lossCounter);
                    System.out.println("Do you want to play again y/n");
                    if(input.nextLine().equals("y")){
                        continue;
                    }
                    break;
                }
                if(choice.equalsIgnoreCase("Paper")){
                    System.out.println("YOU WIN!");
                    winCounter++;
                    System.out.println("Times won: " + winCounter);
                    System.out.println("Times lost: " + lossCounter);
                    System.out.println("Do you want to play again y/n");
                    if(input.nextLine().equals("y")){
                        continue;
                    }
                    break;

                }
                if(choice.equalsIgnoreCase("Scissors")){
                    System.out.println("TIE!");
                    System.out.println("Times won: " + winCounter);
                    System.out.println("Times lost: " + lossCounter);
                        continue;
                    }
                    break;
                }

            }
        }
    }

