/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.derick.smartcalculator.test;

import java.util.Scanner;

/**
 *
 * @author derickfelix
 */
public class SmartCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Density, Mass, and Volume: d = m/v

        Scanner input = new Scanner(System.in);
        String guest, YNGuest;
        

        double density, volume, mass;
        boolean flag = true;

        while (flag) {
            System.out.println("Type the letter that you want");
            System.out.println("a) Density");
            System.out.println("b) Mass");
            System.out.println("c) Volume");
            System.out.print("to find the value: ");
            guest = input.nextLine();
            System.out.println(guest);

            switch (guest) {
                case "a":
                    System.out.println("What is the volume? ");
                    volume = input.nextDouble();
                    System.out.println("What is the mass? ");
                    mass = input.nextDouble();

                    density = mass / volume;

                    System.out.println("Density is " + density);
                    break;
                case "b":
                    System.out.println("What is the density?");
                    density = input.nextDouble();
                    System.out.println("What is the volume? ");
                    volume = input.nextDouble();

                    mass = density * volume;

                    System.out.println("Mass is " + mass);
                    break;
                case "c":
                    System.out.println("What is the density?");
                    density = input.nextDouble();
                    System.out.println("What is the mass? ");
                    mass = input.nextDouble();

                    volume = density * mass;
                    System.out.println("Density is " + volume);
                    break;
                default:
                    System.out.println("You typed unavaiable letter!");
            }
            System.out.println("Do you want to stop? Y/N");
            YNGuest = input.nextLine();
            if(YNGuest.equalsIgnoreCase("y")){
                flag = false;
            } else {
               for(int i = 0; i < 5; i ++){
                   System.out.println("");
               }
            }
        }

    }

}
