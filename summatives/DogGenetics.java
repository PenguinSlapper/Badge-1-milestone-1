/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tsg.summatives;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author nick9
 */
public class DogGenetics {

    public static void main(String[] args) {
        Scanner dogType = new Scanner(System.in);
        Random breed = new Random();

        System.out.println("Whats your dog's name?");
        String userDog = dogType.nextLine();

        int stBernard = breed.nextInt(100);
        int chihuahua = breed.nextInt(100 - stBernard);
        int pug = breed.nextInt(100 - (stBernard + chihuahua));
        int common = breed.nextInt(100 - (stBernard + chihuahua + pug));
        int king = 101 - (stBernard + chihuahua + pug + common );
        System.out.println(userDog + " is");

        System.out.println(stBernard + "% St. Bernard");
        System.out.println(chihuahua + "% Chihuahua");
        System.out.println(pug + "% Dramatic RedNosed Asian Pug");
        System.out.println(common + "% Common Cur");
        System.out.println(king + "% King Doberman");
    }

}
