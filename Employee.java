public class Employee  {

    private String employeeName;
    private int employeesSalary;
    private String employeePhoneNumber;

    public Employee() {
        this.employeeName = "Unknown";
        this.employeesSalary = 0;
        this.employeePhoneNumber = "00000000000";
    }//end default constructor

    public Employee(String employeeName, int employeesSalary, String employeePhoneNumber) {
        this.employeeName = employeeName;
        this.employeesSalary = employeesSalary;
        this.employeePhoneNumber = employeePhoneNumber;
    }//end non-default constructor

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public int getEmployeesSalary() {
        return employeesSalary;
    }

    public void setEmployeesSalary(int employeesSalary) {
        this.employeesSalary = employeesSalary;
    }

    public String getEmployeePhoneNumber() {
        return employeePhoneNumber;
    }

    public void setEmployeePhoneNumber(String employeePhoneNumber) {
        this.employeePhoneNumber = employeePhoneNumber;
    }
    public String toString() {
        return "Information on your employee: \n"
                + "Name: " + employeeName + "\n"
                + "Salary: " + employeesSalary + "\n"
                + "Phone Number: " + employeePhoneNumber;
    }
}
