/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetask1;

import java.util.Scanner;

/**
 *
 * @author Dianca
 */
public class Animal {
  private int IDtag;          // Private field to hold the ID tag of the animal
    private String species;     // Private field to hold the species of the animal

    // Constructor to initialize ID tag and species
    public Animal(int id, String s) {
        IDtag = id;
        species = s;
    }

    // Method to input ID tag and species from user
    public void input() {
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter ID tag: ");
        IDtag = kb.nextInt();
        kb.nextLine(); // Consume newline
        System.out.print("Enter species: ");
        species = kb.nextLine();
    }

    // Method to output ID tag and species
    public void output() {
        System.out.println("ID tag: " + IDtag);
        System.out.println("Species: " + species);
    }
} 