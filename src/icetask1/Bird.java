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

   class Bird extends Animal {
    private int colour; // Private field to hold the feather color of the bird

    // Constructor to initialize ID tag, species, and feather color
    public Bird(int id, String s, int c) {
        super(id, s);  // Call the superclass constructor to set ID tag and species
        colour = c;
    }

    // Getter for feather color
    public int getColour() {
        return colour;
    }

    // Setter for feather color
    public void setColour(int colour) {
        this.colour = colour;
    }

    @Override
    public void input() {
        super.input();  // Call the superclass input method to get ID tag and species
        Scanner kb = new Scanner(System.in);
        System.out.print("Enter feather colour (1- grey, 2- white, 3- black): ");
        colour = kb.nextInt();
    }

    @Override
    public void output() {
        super.output();  // Call the superclass output method to display ID tag and species
        System.out.println("Feather colour: " + getColourName(colour));
    }

    // Private method to convert color code to color name
    private String getColourName(int colour) {
        switch (colour) {
            case 1:
                return "Grey";
            case 2:
                return "White";
            case 3:
                return "Black";
            default:
                return "Unknown";
        }
    }
}