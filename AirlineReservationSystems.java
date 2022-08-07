import java.util.Random;
import java.util.Scanner;

public class AirlineReservationSystems {

    public static void main(String[] args) {
        menu();
    }

    // method to switch the different menu scenarios
    private static void menuSwitch() {
        String[][] plane = new String[5][4];
        Scanner menuSelection = new Scanner(System.in);
        int userInput = menuSelection.nextInt();
        switch (userInput) {
            case 0:
                System.out.println("GoodBye!");
                break;
            case 1:
                populatePlaneArray(plane);
                break;
            case 2:
                searchForSpecificSeat();
                break;
            case 3:
                break;
            case 4:
                purchaseSeat();
                break;
            case 5:
                break;
            default:
                System.out.println("Invalid selection try again");
                menu();
        }
    }

    // Method to populate the plane (Case #1)
    private static void populatePlaneArray(String[][] plane) {
        Seat seat = new Seat();

        //for loops to populate and print
        for (int r = 0; r < plane.length; r++) {
            for (int c = 0; c < plane[r].length; c++) {
                if (seat.getOccupied()) {
                    plane[r][c] = "X";
                } else {
                    plane[r][c] = "O";
                }
            }
        }

        for (int r2 = 0; r2 < plane.length; r2++) {
            for (int c2 = 0; c2 < plane[r2].length; c2++) {
                System.out.print(plane[r2][c2] + " ");
            }
            System.out.println();
        }
        menu();
    }//end populatePlaneArray method

    //method for searching for a specific seat (CASE #2)
    private static void searchForSpecificSeat() {
        Scanner userSelection = new Scanner(System.in);
        int columns;
        int row;

        do {
            System.out.println("Enter the row between 0 and 4 of the seat you would like to purchase");
            row = userSelection.nextInt();
        } while (row < 0 || row > 4);

        do {
            System.out.println("Enter the seat between 0 and 3 of the seat you would like to purchase");
            columns = userSelection.nextInt();
        } while (columns < 0 || columns > 3);

        Seat seat = new Seat(row, columns);
        System.out.println(seat.toString());
        menu();
    }

    //method for sorting using bubble sort algorithm(Case #3)
    public static void sortingPriceHighToLow(Seat[] plane) {
        int n = plane.length;
        Seat temp = null;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (plane[j - 1].getCost() > plane[j].getCost()) {
                    //swap elements
                    temp = plane[j - 1];
                    plane[j - 1] = plane[j];
                    plane[j] = temp;
                }

            }
        }
    }

    // method to purchase a specific seat (CASE #4)
    private static void purchaseSeat() {
        Scanner userSelection = new Scanner(System.in);
        int columns = 0;
        int row = 0;
        Seat seat = new Seat(row, columns);

        // do while loops to check for correct inputs of rows and seats
        do {
            System.out.println("Enter the row between 0 and 4 of the seat you would like to purchase");
            row = userSelection.nextInt();
        } while (row < 0 || row > 4);

        do {
            System.out.println("Enter the seat between 0 and 3 of the seat you would like to purchase");
            columns = userSelection.nextInt();
        } while (columns < 0 || columns > 3);

        seat.setOccupied(true);
        String output = seat.toString();
        System.out.println(output);
        menu();
    }

    //method to display menu with capabilities of the menuSwitch() (CASE #5)
    private static void menu() {
        System.out.println("Please select from the following menu: " +
                "\nEnter 1 to see a map of the seats: O available, X unavailable" +
                "\nEnter 2 to get the information on a specific seat" +
                "\nEnter 3 to print available seats sorted by price, low to high" +
                "\nEnter 4 to purchase a seat" +
                "\nEnter 5 to see this menu again" +
                "\nEnter 0 to Quit");
        menuSwitch();
    }


    // code giving to use for assignment
    public static class Seat {
        private int row;
        private int seat;
        private boolean aisle;
        private boolean window;
        private boolean occupied;
        private int cost;
        private static int revenue = 0;

        public Seat() {
            row = 0;
            seat = 0;
            aisle = false;
            window = false;
            occupied = false;
            cost = 0;
        }//end constructor

        public Seat(int rowPassed, int seatPassed) {
            Random randNumGen = new Random();
            row = rowPassed;
            seat = seatPassed;
            if (seatPassed == 1 || seatPassed == 2)
                aisle = true;
            else
                aisle = false;
            if (seatPassed == 0 || seatPassed == 3)
                window = true;
            else
                window = false;
            occupied = false;
            cost = randNumGen.nextInt(301) + 200;
            revenue = revenue + cost;
        }//end constructor

        //getters
        public int getRow() {
            return row;
        }//end method getRow

        public int getSeat() {
            return seat;
        }//end method getSeat

        public boolean getAisle() {
            return aisle;
        }//end method getAisle

        public boolean getWindow() {
            return window;
        }//end method getWindow

        public boolean getOccupied() {
            return occupied;
        }//end method getOccupied

        public int getCost() {
            return cost;
        }//end method getCost

        public static int getRevenue() {
            return revenue;
        }//end method getRevenue

        //////
//setters
        public void setRow(int rowPassed) {
            row = rowPassed;
        }//end method setRow

        public void setSeat(int seatPassed) {
            seat = seatPassed;
        }//end method setSeat

        public void setAisle(boolean aislePassed) {
            aisle = aislePassed;
        }//end method setAisle

        public void setWindow(boolean windowPassed) {
            window = windowPassed;
        }//end method setWindow

        public void setOccupied(boolean occupiedPassed)//Revised to take care of gaming the system
        {
            if (occupiedPassed == true && occupied == false)//unoccupied becomes occupied
            {
                occupied = occupiedPassed;
                revenue = revenue + cost;
            } else if (occupiedPassed == false && occupied == true) //occupied becomes unoccupied
            {
                occupied = occupiedPassed;
                revenue = revenue - cost;
            }
            //no need to deal with occupied become occupied or
            //unoccupied becomes unoccupied as no change in status
            //of seat and renevue
        }//end method setOccupied

        public void setCost(int costPassed) {
            cost = costPassed;
        }//end method setCost

        public String toString() {
            return
                    "Row: " + row + "\n" +
                            "Seat: " + seat + "\n" +
                            "Aisle: " + aisle + "\n" +
                            "Window: " + window + "\n" +
                            "Occupied: " + occupied + "\n" +
                            "Cost: $" + cost + "\n";
        }//end toString
    }//end class
}

