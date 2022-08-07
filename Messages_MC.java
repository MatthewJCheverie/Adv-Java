import java.util.Scanner;

public class Messages_MC {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int outputTime = 0;

        do {
            System.out.println("Please enter your time");
            outputTime = userInput.nextInt();
        } while (outputTime < 0);

        System.out.println("the number of messages that can be sent in " +  outputTime + " nanoseconds " +
                "is therefore " + M(outputTime));

    }

    public static int M(int outputTimePassed) {
        switch (outputTimePassed) {
            case 0:
            case 1:
            case 2:
            case 3:
                return 1;
                //break;
            default:
                return M(outputTimePassed - 2) + M(outputTimePassed - 3);


        }
    }
}

