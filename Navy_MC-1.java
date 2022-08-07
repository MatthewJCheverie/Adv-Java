import java.util.Scanner;

public class Navy_MC {

    Scanner inputShipName = new Scanner(System.in);

    public static void main(String[] args) {
        Ship[] ship = new Ship[3];

        for (int i = 0; i < ship.length + 1; i++) {
            if (i == 1) {
                shipMethod(ship);
            }
            if (i == 2) {
                cruiseShipMethod((CruiseShip[]) ship);
            }
            if (i == 3) {
                cargoShipMethod((CargoShip[]) ship);
            }
        }
    }

    private static void shipMethod(Ship[] arrayPassed) {
        Scanner userInput = new Scanner(System.in);
        arrayPassed[1] = new Ship();
        String setShipName;
        int setYearShipBuilt;

        System.out.println("please enter the name of your ship");
        arrayPassed[1].setName(userInput.next());
        setShipName = arrayPassed[1].getName();

        do {
            System.out.println("please enter the year of your ship");
            arrayPassed[1].setYearBuilt(userInput.nextInt());
            setYearShipBuilt = arrayPassed[1].getYearBuilt();
        } while (arrayPassed[1].getYearBuilt() == 0);

        arrayPassed[1] = new Ship(setShipName, setYearShipBuilt);
        System.out.println(arrayPassed[1].toString());
    }

    private static void cruiseShipMethod(CruiseShip[] arrayPassed) {
        Scanner userInput = new Scanner(System.in);
        arrayPassed[2] = new CruiseShip();
        String setShipName;
        int setYearShipBuilt;
        int setMaximumNumberOfPassengers;

        System.out.println("please enter the name of your cruise ship");
        arrayPassed[2].setName(userInput.next());
        setShipName = arrayPassed[2].getName();

        do {
            System.out.println("please enter the year of your cruise ship");
            arrayPassed[2].setYearBuilt(userInput.nextInt());
            setYearShipBuilt = arrayPassed[2].getYearBuilt();
        } while (arrayPassed[2].getYearBuilt() == 0);

        do {
            System.out.println("please enter the maximum number of passengers for your cruise ship");
            arrayPassed[2].setMaximumPassengers(userInput.nextInt());
            setMaximumNumberOfPassengers = arrayPassed[2].getMaximumPassengers();
        } while (arrayPassed[2].getMaximumPassengers() == 0);

        arrayPassed[2] = new CruiseShip(setShipName, setYearShipBuilt, setMaximumNumberOfPassengers);
        System.out.println(arrayPassed[2].toString());
    }

    private static void cargoShipMethod(CargoShip[] arrayPassed){
        Scanner userInput = new Scanner(System.in);
        arrayPassed[3] = new CargoShip();
        String setShipName;
        int setYearShipBuilt;
        int setCargoCapacity;

        System.out.println("please enter the name of your cargo ship");
        arrayPassed[3].setName(userInput.next());
        setShipName = arrayPassed[3].getName();

        do {
            System.out.println("please enter the year of your cargo ship");
            arrayPassed[3].setYearBuilt(userInput.nextInt());
            setYearShipBuilt = arrayPassed[3].getYearBuilt();
        } while (arrayPassed[3].getYearBuilt() == 0);

        do {
            System.out.println("please enter the maximum number of passengers for your cruise ship");
            arrayPassed[3].setCargoCapacity(userInput.nextInt());
            setCargoCapacity = arrayPassed[3].getCargoCapacity();
        } while (arrayPassed[3].getCargoCapacity() == 0);

        arrayPassed[3] = new CargoShip(setShipName, setYearShipBuilt, setCargoCapacity);
        System.out.println(arrayPassed[3].toString());
    }
}
