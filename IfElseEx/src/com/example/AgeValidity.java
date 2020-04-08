/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

/**
 *
 * @author anshenoy
 */
public class AgeValidity {

    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);  // Reading from System.in
    System.out.println("Enter your age: ");
    int ageRequirement = reader.nextInt(); // Scans the next token of the input as an int.
    //once finished
    reader.close();    
    
    boolean drivingUnderAge;
    drivingUnderAge = false;
    if (ageRequirement <= 18)
        drivingUnderAge = true;
      System.out.println("Are you driving underage: " + drivingUnderAge);
    }
}
