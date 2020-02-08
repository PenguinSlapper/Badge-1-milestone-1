/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.summatives;

import java.util.Scanner;

/**
 *
 * @author nick9
 */
public class HealthyHearts {

    public static void main(String[] args) {

        Scanner userInput;

        userInput = new Scanner(System.in);

        System.out.println("What is your age?");
        int age = userInput.nextInt();

        int maxHeartRate = 220 - age;

        System.out.println("Your maximum heart rate should be " + maxHeartRate + " beats per minute.");

        int minTarget = maxHeartRate * 50/100;
        
        int maxTarget = maxHeartRate * 85/100;

        System.out.println("Your target HR Zone is " + minTarget + " - " + maxTarget + " beats per minute.");

    }

}
