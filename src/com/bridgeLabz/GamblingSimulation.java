/**
 * Gambling simulation
 *
 * @author : kiran
 * @date
 */

package com.bridgeLabz;

import java.util.Random;

public class GamblingSimulation {
    int stake = 100;
    final int BET = 1;
     int winOrLose(){           //creating method to find win or lose
        int win =1;
        Random random = new Random();
        int result = random.nextInt(2);
        if ( result == win ){                   //checking the random whether win or lose
            stake = stake + BET;
        }
        else{
            stake = stake - BET;
        }
        return stake;
    }


    public static void main(String[] args) {
        GamblingSimulation gamblingSimulation = new GamblingSimulation();
        System.out.println(gamblingSimulation.winOrLose());

    }
}
