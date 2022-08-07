import java.io.*;
import java.util.Scanner;

public class lsbi_MC {

    public static void main(String[] args) {

        Scanner inputStream = null;
        PrintWriter outputStream = null;
        int count = 0;

        //try for reading from a file
        try {
            inputStream = new Scanner(new FileInputStream("binary.txt"));
        } catch (FileNotFoundException ex) {
            System.out.print("File not found");
            System.exit(0);
        }//end try and catch blocks

        while (inputStream.hasNextLine()) {
            int number = inputStream.nextInt();

            //use of % to get least significant bit
            int leastSignificant = number % 2;

            //writing to a file
            try {
                outputStream = new PrintWriter(new FileOutputStream("stego_MC.txt", true));
                outputStream.print(leastSignificant);
                count++;
                //if statement to track number of variables printed on one line
                if (count == 8) {
                    outputStream.print("\n");
                    count = 0;
                }//end if statement
                outputStream.close();
            } catch (FileNotFoundException e) {
                System.out.print("file not found");
            }//end try and catch blocks
        }//end while loop
    }//end main
}//end class

