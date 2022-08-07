import java.util.Scanner;

public class LinkedListDuckDemo_MC {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        boolean again;
        String nameEntered;
        Duck p = null;
        Duck q = null;
        Duck r = null;
        Duck placeholder = null;

        System.out.println("would you like to create a list, true or false");
        again = keyboard.nextBoolean();
        keyboard.nextLine();

        if(!again) {
            System.out.println("OK, thanks, goodbye, program closing");
            System.exit(0);
        } else {
            System.out.println("Please enter the name to save");
            nameEntered = keyboard.nextLine();
            p = new Duck(nameEntered, null, null);
            q = p;
            r = null;
        }
        System.out.println("would you like to add to the list, true or false");
        again = keyboard.nextBoolean();
        keyboard.nextLine();
        while(again) {
            System.out.println("please enter the name to save");
            nameEntered = keyboard.nextLine();
            r = new Duck(nameEntered, q, null);
            q.next = r;
            q = r;
            System.out.println("would you like to add to the list, true or false");
            again = keyboard.nextBoolean();
            keyboard.nextLine();
        }

        Duck currentDuck = p;

        System.out.println("Front to back");
        do {
            System.out.println(currentDuck.name);
            placeholder = currentDuck;
            currentDuck = currentDuck.next;
        } while (currentDuck != null);

        currentDuck = placeholder;
        System.out.println("_________________");
        System.out.println("_________________");

        System.out.println("Back to front");

        do {
            System.out.println(currentDuck.name);
            currentDuck = currentDuck.previous;
        } while (currentDuck != null);
    }
}
