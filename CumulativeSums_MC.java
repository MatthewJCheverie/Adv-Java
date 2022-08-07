import java.util.Arrays;
import java.util.Scanner;

public class CumulativeSums_MC {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int output;
        int winningsToBeStored = 0;

        do {
            System.out.println("Please enter the number of values you want to store");
            output = userInput.nextInt();
        } while (output <= 0);

        int[] amountOfUserWinnings = new int[output];

        //for loop to iterate the array
        for (int i = 0; i < amountOfUserWinnings.length; i++) {
            do {
                System.out.println("Please enter your winnings for day " + (i + 1));
                winningsToBeStored = userInput.nextInt();
            } while (winningsToBeStored <= 0);

            amountOfUserWinnings[i] = winningsToBeStored;
        }
        System.out.println(Arrays.toString(amountOfUserWinnings));
        sumOfWinningsArrays(amountOfUserWinnings);
    }

    public static void sumOfWinningsArrays(int[] arrayPassed) {
        for (int i = 0; i <= arrayPassed.length - 1; i++) {
            if(i == 0) {
                arrayPassed[0] = arrayPassed[i];
            } else {
                arrayPassed[i] += arrayPassed[i - 1];
            }
        }
        System.out.println(Arrays.toString(arrayPassed));
    }
}
