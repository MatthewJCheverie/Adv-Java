public class CargoShip extends Ship {

    private int cargoCapacity;

    //default constructor
    public CargoShip() {
        super("Unknown", 0);
        this.cargoCapacity = 0;
    }//end default constructor

    public CargoShip(String name, int yearBuilt, int cargoCapacity) {
        super(name, yearBuilt);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }
}
