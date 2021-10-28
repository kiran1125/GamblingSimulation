/**
 * Gambling simulation
 *
 * @author : kiran
 * @date
 */

package com.bridgeLabz;

import java.util.Random;

public class GamblingSimulation {
    final int EVERY_DAY_STAKE =100;
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
    int WinOrLoseForDay(){
         while (stake>50 && stake<150) {
             winOrLose();
         }
         return stake;
     }
     void WinOrLoseForMonth(){
         int totalStake=0;
         int stakeAfterBetting=0;
         for (int day=1;day<=20;day++){
             stake = WinOrLoseForDay();
             totalStake=totalStake + EVERY_DAY_STAKE;
             stakeAfterBetting = stakeAfterBetting + stake;
             stake = EVERY_DAY_STAKE;
         }
         if (totalStake > stakeAfterBetting)
             System.out.println("Gambler wins for the month : " + (totalStake-stakeAfterBetting));
         else
             System.out.println("Gambler loses for the month : " + (stakeAfterBetting-totalStake));
     }


    public static void main(String[] args) {
        GamblingSimulation gamblingSimulation = new GamblingSimulation();
        gamblingSimulation.WinOrLoseForMonth();

    }
}
