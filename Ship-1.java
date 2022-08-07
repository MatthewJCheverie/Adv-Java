public class Ship {

    private String name;
    private int yearBuilt;

    //default constructor
    public Ship() {
        this.name = "Unknown";
        this.yearBuilt = 0;
    }//end default constructor

    //non-default constructor
    public Ship(String name, int yearBuilt) {
        this.name = name;
        this.yearBuilt = yearBuilt;
    }//end non-default constructor

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        if (yearBuilt >= 1900 && yearBuilt <= 2019) {
            this.yearBuilt = yearBuilt;
        } else {
            System.out.println("invalid year built");
        }
    }

    public String toString() {
        return "Your ship " + name + " was built in " + yearBuilt;
    }
}
