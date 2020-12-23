package javaapplication9;

public class Employee {

    private String firstName, lastName, CNIC;

    public Employee() {

    }

    public Employee(String firstName, String lastName, String CNIC) {
        this.CNIC = CNIC;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getfirstName() {
        return firstName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }

    public String getlastName() {
        return lastName;
    }

    public void getCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    public String setCNIC() {
        return CNIC;
    }

    public String toString() {
        return ("\nEmployee Name:\t" + firstName + " " + lastName + "\nCNIC#:\t\t" + CNIC);
    }

    public double earnings() {
        return (0.00);
    }
}
