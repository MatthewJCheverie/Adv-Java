import java.util.Scanner;

public class DemoTelephoneNumber_MC {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        int userOutput;

        do {
            System.out.println("Please enter the number of employees you would like to enter from 1 - 99");
            userOutput = userInput.nextInt();
        }
        while (userOutput < 1 || userOutput > 99);//end do while

        Employee[] employee = new Employee[userOutput];

        for (int i = 0; i < employee.length; i++) {

            employee[i] = new Employee();

            String setName;
            do {
                System.out.println("Please enter your employee's name");
                employee[i].setEmployeeName(userInput.next());
                setName = employee[i].getEmployeeName();
            }
            while (employee[i].getEmployeeName().equals("Unknown"));//end do while

            int setSalary = 0;
            do {
                System.out.println("Please enter your employee's salary");
                employee[i].setEmployeesSalary(userInput.nextInt());
                setSalary = employee[i].getEmployeesSalary();
            }
            while (employee[i].getEmployeesSalary() == 0);//end do while

            String setPhoneNumber = "";
            boolean phoneNumberExceptionCaught = false;
            do {
                try {
                    System.out.println("Please enter your phone number");
                    employee[i].setEmployeePhoneNumber(userInput.next());
                    setPhoneNumber = employee[i].getEmployeePhoneNumber();
                    if(phoneNumberHas10Digits(setPhoneNumber))
                        throw new TelephoneNumberLengthException("Your Number has too few or too many digits");
                    if(phoneNumberHasCharacter(setPhoneNumber))
                        throw new TelephoneNumberCharacterException("Your have a invalid character in your phone number");
                    phoneNumberExceptionCaught = true;
                }//end try
                catch (TelephoneNumberLengthException | TelephoneNumberCharacterException e){
                    System.out.println(e.getMessage());
                }//end catch
            } while(!phoneNumberExceptionCaught);//end do while

            employee[i] = new Employee(setName, setSalary, setPhoneNumber);
            System.out.println(employee[i].toString());

        }//end for
    }//end main

    private static boolean phoneNumberHas10Digits(String passwordPassed) {
        int count = 0;
        boolean toManyOrToFewDigits = false;

        for (int i = 0; i < passwordPassed.length(); i++) {
            count++;
            if (count > 10) {
                toManyOrToFewDigits = true;
            }
        }
        return toManyOrToFewDigits;
    }//end phoneNumberHas10Digits

    private static boolean phoneNumberHasCharacter(String passwordPassed) {
        boolean hasCharacter = false;

        for(int i = 0; i < passwordPassed.length(); i++) {
            if (passwordPassed.charAt(i) < 48 || passwordPassed.charAt(i) > 71) {
                hasCharacter = true;
            } else {
                hasCharacter = false;
            }
        }
        return hasCharacter;
    }//end phoneNumberHasCharacter
}//end class
