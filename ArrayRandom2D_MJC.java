import java.util.Random;
import java.util.Scanner;

public class ArrayRandom2D_MJC {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int output;

        //do while loop to trap user input in a int between 1 - 9
        do {
            System.out.println("Please enter enter a number between 1 - 9");
            output = userInput.nextInt();
        } while (output <= 0 || output > 9);

        int column = output;
        int row = output;

        int[][] userArray = new int[row][column];

        //nested for loops to populate array with random numbers
        for (int r = 0; r < userArray.length; r++) {
            for (int c = 0; c < userArray[r].length; c++) {
                Random randomNumber = new Random();
                userArray[r][c] = randomNumber.nextInt(81);
            }
        }

        //nested for loops to print array
        for (int r2 = 0; r2 < userArray.length; r2++) {
            for (int c2 = 0; c2 < userArray[r2].length; c2++) {
                System.out.print(userArray[r2][c2] + " ");
            }
            System.out.println();
        }
    }
}

