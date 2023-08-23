/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icetask1;

import java.util.Scanner;

/**
 *
 * @author Dianca
 */
public class ICEtask1 {

    public static void main(String[] args) {
        
      Scanner kb = new Scanner(System.in);
        
   Bird[] birds = new Bird[10]; // Array for birds (up to 10 instances)
        Reptile[] reptiles = new Reptile[10]; // Array for reptiles (up to 10 instances)

        int birdCount = 0; // Count of birds
        int reptileCount = 0; // Count of reptiles

        int choice;
        do {
            // Display menu options
            System.out.println("Select an option:");
            System.out.println("1: Add Bird");
            System.out.println("2: Add Reptile");
            System.out.println("3: Exit");
            System.out.print("Choice: ");
            
            // Read user's choice
            choice = kb.nextInt();
            kb.nextLine(); 

            switch (choice) {
                case 1:
                    if (birdCount < birds.length) {
                        System.out.println("Enter Bird details:");
                        birds[birdCount] = new Bird(0, "", 0);
                        birds[birdCount].input();
                        birdCount++;
                    } else {
                        System.out.println("Bird capacity reached.");
                    }
                    break;
                case 2:
                    if (reptileCount < reptiles.length) {
                        System.out.println("Enter Reptile details:");
                        reptiles[reptileCount] = new Reptile(0, "", 0.0);
                        reptiles[reptileCount].input();
                        reptileCount++;
                    } else {
                        System.out.println("Reptile capacity reached.");
                    }
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 3);

        // Display bird details
        System.out.println("\nBird details:");
        for (int i = 0; i < birdCount; i++) {
            birds[i].output();
            System.out.println();
        }

        // Display reptile details
        System.out.println("\nReptile details:");
        for (int i = 0; i < reptileCount; i++) {
            reptiles[i].output();
            System.out.println();
        }
    }
}