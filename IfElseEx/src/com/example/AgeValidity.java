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
    Scanner myObj = new Scanner(System.in);
    int age = myObj.nextInt();

    System.out.println("Enter age");
    
    
       boolean drivingUnderAge;
      drivingUnderAge = false;
      int x = 18;
      int y = x++;
      drivingUnderAge = x <= y;
       System.out.println(drivingUnderAge);
    }
}
