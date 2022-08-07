public class CruiseShip extends Ship {

    private int maximumPassengers;

    //default constructor
    public CruiseShip() {
        super("Unknown", 0);
        this.maximumPassengers = 0;
    }//end default constructor

    //non-default constructor
    public CruiseShip(String name, int yearBuilt, int maximumPassengers) {
        super(name, yearBuilt);
        this.maximumPassengers = maximumPassengers;
    }//end non-default constructor

    public int getMaximumPassengers() {
        return maximumPassengers;
    }

    public void setMaximumPassengers(int maximumPassengers) {
        this.maximumPassengers = maximumPassengers;
    }
}
