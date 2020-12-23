
package javaapplication9;

public class SalariedEmployee extends Employee{
    private double weeklySalary;
    public SalariedEmployee()
    {
        super();
    }
    public SalariedEmployee(String firstName, String lastName, String CNIC, double weeklySalary)
    {
        super(firstName, lastName, CNIC);
        this.weeklySalary = weeklySalary;
    }
    public void setweeklySalary(double weeklySalary)
    {
        if (weeklySalary > 0)
        {
            this.weeklySalary = weeklySalary;
        }
        else
        {
            System.out.println("\n**Error! Weekly Salary can not be negative.**\n");
        }
    }
    public double getweeklySalary()
    {
        return weeklySalary;
    }
    @Override
    public String toString()
    {
        return ("\n----------Salaried Employee----------" + super.toString());
    }
    @Override
    public double earnings()
    {
        System.out.print("Earnings:\t");
        return weeklySalary;
    }
}