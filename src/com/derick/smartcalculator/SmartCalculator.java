/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.derick.smartcalculator;

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
        // Density, Volume, and Mass. d = m/v
        
        Scanner input = new Scanner(System.in);
        double density, volume, mass;
        System.out.println("What is the density? if you want to discover it, fill in blank");
        density = input.nextDouble();
        System.out.println("What is the volume? if you want to discover it, fill in blank");
        volume = input.nextDouble();
        System.out.println("What is the mass? if you want to discover it, fill in blank");
        mass = input.nextDouble();
        
    }
    
}
