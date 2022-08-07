public class Course {

    private String department;
    private int courseNumber;
    private int courseCredits;
    private double courseCost;

    //default constructor
    public Course() {
        this.department = "unknown";
        this.courseNumber = 0;
        this.courseCredits = 0;
        this.courseCost = 0;
    }//end default

    //non-default constructor
    public Course(String department, int courseNumber, int courseCredits, double courseCost) {
        this.department = department;
        this.courseNumber = courseNumber;
        this.courseCredits = courseCredits;
        this.courseCost = courseCost;
    }//end non-default constructor

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department.equals("MATH".toLowerCase()) || department.equals("ENGL".toLowerCase())
                || department.equals("HIST".toLowerCase()) || department.equals("LANG".toLowerCase())
                || department.equals("HUMN".toLowerCase()) || department.equals("PHYS".toLowerCase())
                || department.equals("COMP".toLowerCase()) || department.equals("SCIE".toLowerCase())) {
            this.department = department;
        } else {
            System.out.println("Invalid department");
        }
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        if (courseNumber >= 1 && courseNumber <= 399) {
            this.courseNumber = courseNumber;
        } else {
            System.out.println("Invalid course number");
        }
    }

    public int getCourseCredits() {
        return courseCredits;
    }

    public void setCourseCredits(int courseCredits) {
        if (courseCredits == 3 || courseCredits == 4 || courseCredits == 6) {
            this.courseCredits = courseCredits;
        } else {
            System.out.println("Invalid number of credits");
        }
    }

    public double getCourseCost() {
        if (getDepartment().equals("COMP".toLowerCase()) || getDepartment().equals("SCIE".toLowerCase())
                || getDepartment().equals("PHYS".toLowerCase())) {
            return courseCost + 100;
        }
            return courseCost;
    }
    public void setCourseCost() {
            this.courseCost = ((double)courseCredits / 2) * 500;
        }

    public String toString() {
        return "Department: " + department + "\n"
                + "Course Number: " + courseNumber + "\n"
                + "Course Credits: " + courseCredits + "\n"
                + "Course Cost: " + courseCost;
    }

    public int equals() {
        int total = 0;
        total += courseCost;
        return total;
    }
}
