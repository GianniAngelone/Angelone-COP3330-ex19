/*
 *  UCF COP3330 Fall 2021 Assignment 19 Solution
 *  Copyright 2021 Gianni Angelone
 */
package com.exercise;
import java.util.Scanner;
public class Exercise19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("What is your weight in pounds? ");
        float weight = scan.nextFloat();
        System.out.printf("What is your height in inches? ");
        float height = scan.nextFloat();
        float bodyMass = (weight / (height * height)) * 703;
        //Need to have the proper answer if the BMI is less than or greater than the ideal weight range
        if (18.5<=bodyMass && bodyMass<=25) {
            System.out.print(String.format("Your BMI is: %.1f.", bodyMass));
            System.out.print("\nYou are within the ideal weight range.");
        }
        else if (bodyMass>25) {
            System.out.print(String.format("Your BMI is: %.1f.", bodyMass));
            System.out.printf("\nYou are overweight. You should see your doctor. ");
        }
        else {
            System.out.print(String.format("Your BMI is: %.1f.", bodyMass));
            System.out.printf("\nYou are underweight. You should see your doctor. ");
                    }
    }
}