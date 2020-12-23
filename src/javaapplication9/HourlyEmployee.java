
package javaapplication9;

public class HourlyEmployee extends Employee {
    private double wage, hours;
    public HourlyEmployee()
    {
        super();
    }
    public HourlyEmployee(String firstName, String lastName, String CNIC, double wage, double hours)
    {
        super(firstName, lastName, CNIC);
        this.hours = hours;
        this.wage = wage;
    }
    public void setwage(double wage)
    {
        if (wage > 0)
        {
            this.wage = wage;
        }
        else
        {
            System.out.println("\n**Error! Wage can not be negative.**\n");
        }
    }
    public double getwage()
    {
        return wage;
    }
    public void sethours(double hours)
    {
        if (hours > 0)
        {
            this.hours = hours;
        }
        else
        {
            System.out.println("\n***Error! Hours can not be negative.**\n");
        }
    }
    public double gethours()
    {
        return hours;
    }
    @Override
    public String toString()
    {
        return ("\n----------Hourly Employee---------" + super.toString());
    }
    @Override
    public double earnings()
    {
        System.out.print("Earnings:\t");
        if (hours <= 40)
        {
            return (wage * hours);
        }
        else
        {
            return (40 * wage + (hours - 40) * wage * 1.5);
        }
    }
}