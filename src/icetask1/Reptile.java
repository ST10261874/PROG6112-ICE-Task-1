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

 
    class Reptile extends Animal {
  
 
    private double bloodTemp; // Private field to hold the blood temperature of the reptile

    // Constructor to initialize ID tag, species, and blood temperature
    public Reptile(int id, String s, double b) {
        super(id, s);  // Call the superclass constructor to set ID tag and species
        bloodTemp = b;
    }

    // Getter for blood temperature
    public double getBloodTemp() {
        return bloodTemp;
    }

    // Setter for blood temperature
    public void setBloodTemp(double bloodTemp) {
        this.bloodTemp = bloodTemp;
    }

    @Override
    public void input() {
        super.input();  // Call the superclass input method to get ID tag and species
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter blood temperature: ");
        bloodTemp = scanner.nextDouble();
    }

    @Override
    public void output() {
        super.output();  // Call the superclass output method to display ID tag and species
        System.out.println("Blood temperature: " + bloodTemp);
    }
} 


