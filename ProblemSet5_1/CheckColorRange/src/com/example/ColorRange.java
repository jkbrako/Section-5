/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a color code: ");
        double colorNum = input.nextDouble();
        input.close();
        if(colorNum >= 380) {
        System.out.println("The color is Violet.");
        } else {
            if(colorNum < 450) {
                System.out.println("The color is Violet.");
            }
        }
        if(colorNum > 450) {
            System.out.println("The color is Blue.");
        } else {
            if(colorNum < 495) {
                System.out.println("The color is Blue.");
            }
        }
        if(colorNum >= 495) {
            System.out.println("The color is Green.");
        } else {
            if(colorNum < 570) {
                System.out.println("The color is Green.");
            }
        }
            if (colorNum >= 570) {
                System.out.println("The color is Yellow.");
            } else {
                if (colorNum < 590) {
                    System.out.println("The color is Yellow.");
                }
            }
                if (colorNum >= 590) {
                    System.out.println("The color is Orange.");
                } else {
                    if (colorNum < 620) {
                        System.out.println("The color is Orange.");
                    }
                }
                    if (colorNum >= 620) {
                        System.out.println("The color is Red.");
                    } else {
                        if (colorNum < 750) {
                            System.out.println("The color is Red.");
                        }
                    }
    }
}
                        
