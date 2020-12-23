package javaapplication9;
public class BasePlusCommissionEmployee extends CommissionEmployee{
    private double baseSalary;
    public BasePlusCommissionEmployee()
    {
        
    }
    public BasePlusCommissionEmployee(String firstName, String lastName, String CNIC, double wage, double hours, double baseSalary)
    {
        super(firstName, lastName, CNIC, wage, hours);
        this.baseSalary = baseSalary;
    }
    public void setbaseSalary(double baseSalary)
    {
        this.baseSalary = baseSalary;
    }
    public double getbaseSalary()
    {
        return baseSalary;
    }
    @Override
    public String toString()
    {
        return ("\n* Base Plus Commisson Employee" + super.toString());
    }
    @Override
    public double earnings()
    {
        return (baseSalary + super.earnings());
    }
}