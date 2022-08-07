public class LabCourse extends Course {

    //default constructor
    public LabCourse() {
        super("unknown", 0, 0, 0);
    }//end default constructor

    //non-default constructor
    public LabCourse(String department, int courseNumber, int courseCredits, double courseCost) {
        super(department, courseNumber, courseCredits, courseCost);
    }//end non-default constructor

    @Override
    public String toString() {
        return super.toString();
    }
}
