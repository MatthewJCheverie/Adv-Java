import java.util.Scanner;

public class HeadsTailsRecursions_MC {

    public static void main(String[] args) {

        //use of longs to try and see highest loss possible
        Scanner userInput = new Scanner(System.in);
        long numberOfCoinTosses;

        do {
            System.out.println("Please enter the number of times you would like to play");
            numberOfCoinTosses = userInput.nextLong();
        } while (numberOfCoinTosses <= 0);//end while loop

        long initialBet = 1;
        long gamesPlayed = 1;
        long sumOfPotentialLosses;
        long totalSumOfLosses = 0;

        do {
            System.out.println("Please enter your initial bet: " + initialBet);
            initialBet = userInput.nextInt();
        } while (initialBet <= 0);//end while loop

        long sumTracker = initialBet;

        do {
            System.out.println("you could lose: " + sumTracker + " on " + gamesPlayed + " games played");
            totalSumOfLosses += sumTracker;
            sumOfPotentialLosses = sumTracker * 2;
            sumTracker = sumOfPotentialLosses;
            gamesPlayed++;
        } while (gamesPlayed <= numberOfCoinTosses);

        System.out.println("The total sum of your losses is: " + totalSumOfLosses);

    }
}
