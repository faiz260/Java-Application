package javaapplication9;
public class CommissionEmployee extends Employee {
    private double grossSales, commissionRates;
    public CommissionEmployee()
    {
        super();
    }
    public CommissionEmployee(String firstName, String lastName, String CNIC, double grossSales, double commissionRates)
    {
        super(firstName, lastName, CNIC);
        this.commissionRates = commissionRates;
        this.grossSales = grossSales;
    }
    public void setgrossSales(double grossSales)
    {
        this.grossSales = grossSales;
    }
    public double getgrossSales()
    {
        return grossSales;
    }
    public void setcommissionRates(double commissionRates)
    {
        this.commissionRates = commissionRates;
    }
    public double getcommissionRates()
    {
        return commissionRates;
    }
    @Override
    public String toString()
    {
        return ("\n---------Commissioned Employee----------" + super.toString());
    }
    @Override
    public double earnings()
    {
        System.out.print("Earnings:\t");
        return (grossSales * commissionRates);
    }
}