import java.util.Scanner;

public class DemoWinstonAndCharlotte_MC {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int userOutput;
        do {
            System.out.println("enter the number of classes you wish to take?");
            userOutput = userInput.nextInt();
        } while (userOutput < 0 || userOutput > 6);

        Course[] course = new Course[userOutput];

        //for loop to iterate array with user input
        for(int i = 0; i < course.length; i++) {
            // calling default package course to avoid null exception
            course[i] = new Course();

            String setDepartment;
            do {
                System.out.println("please enter the department");
                course[i].setDepartment(userInput.next());
                setDepartment = course[i].getDepartment();
            } while (course[i].getDepartment().equals("unknown"));

            //do while loop to trap user input in the .setCourseNumber parameters
            int setCourseNumber;
            do {
                System.out.println("please enter course number");
                course[i].setCourseNumber(userInput.nextInt());
                setCourseNumber = course[i].getCourseNumber();
            } while (course[i].getCourseNumber() == 0);

            //do while loop to trap user int the .setCourseCredit parameters
            int setCourseCredit;
            do {
                System.out.println("please enter course credit");
                course[i].setCourseCredits(userInput.nextInt());
                setCourseCredit = course[i].getCourseCredits();
            } while (course[i].getCourseCredits() == 0);

            course[i].setCourseCost();
            double setCourseCost = course[i].getCourseCost();

            course[i] = new Course(setDepartment,setCourseNumber,setCourseCredit,setCourseCost);
            System.out.println(course[i].toString());

            double totalCost =+ setCourseCost;
            System.out.println("your total cost is " + totalCost);
        }//end for loop
    }
}
