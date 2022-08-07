import java.util.Scanner;

public class NodeLinkedList_MC {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        boolean again;
        String descriptionEntered;
        Node p = null;
        Node q = null;
        Node r = null;

        System.out.println("Would you like to create a list, true or false");
        again = keyboard.nextBoolean();
        keyboard.nextLine();

        if (!again) {
            System.out.println("Ok, thanks, goodbye, program will close");
            System.exit(0);
        } else {
            System.out.println("Please enter the description to save");
            descriptionEntered = keyboard.nextLine();
            p = new Node(descriptionEntered, null);
            q = p;
            r = null;
        }

        System.out.println("Would you like to add to the list, true or false");
        again = keyboard.nextBoolean();
        keyboard.nextLine();
        while (again) {
            System.out.println("Please enter the description to save");
            descriptionEntered = keyboard.nextLine();
            r = new Node(descriptionEntered, q.link);
            q.link = r;
            q = r;
            System.out.println("Would you like to add to the list, true or false");
            again = keyboard.nextBoolean();
            keyboard.nextLine();
        }

        Node currentNode = p;

        while (currentNode != null) {
            System.out.println(currentNode.description);
            currentNode = currentNode.link;
        }

        System.out.println("_______________________________");
    }
}
