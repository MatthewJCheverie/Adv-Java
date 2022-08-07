import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Quiz_MC {

    public static void main(String[] args) {

        Scanner inputStream = null;
        String line;
        int count = 0;
        int answersThatAreCorrect = 0;
        String output;
        boolean userAnswer;
        boolean actualAnswer;

        //try for reading from a file
        try {
            inputStream = new Scanner(new FileInputStream("qa.txt"));
        } catch (FileNotFoundException ex) {
            System.out.print("File not found");
            System.exit(0);
        }//end try and catch blocks

        if(inputStream.hasNextLine()) {
            inputStream.nextLine();
        } else {
            System.out.println("Empty file");
            inputStream.close();
            System.exit(0);
        }

        Scanner userInput = new Scanner(System.in);

        while (count < 10) {
            line = inputStream.nextLine();
            String[] questionsAndAnswers = line.split(" [|] ");

            //do while asking users true or false based off question trapping them into true false input
            do {
                actualAnswer = Boolean.parseBoolean(questionsAndAnswers[0]);
                System.out.println("true or false: " + questionsAndAnswers[1]);
                output = userInput.next();
                userAnswer = Boolean.parseBoolean(output);
            } while (!(output.equals("true") || output.equals("false")));

            if(userAnswer == actualAnswer) {
                answersThatAreCorrect++;
            }
            count++;
        }//end while loop
        
        double finalPercentage = answersThatAreCorrect * 10;
        System.out.println("Your final score is " + finalPercentage + "%");
    }//end main
}//end class