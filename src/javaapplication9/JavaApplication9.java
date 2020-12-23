
package javaapplication9;

public class JavaApplication9 {

    public static void main(String[] args) {
    Employee firstEmployee = new SalariedEmployee("Faiz" ,"Khan","423-01-5294", 800.00 ); 
    Employee secondEmployee = new CommissionEmployee("Sameer" ,"Feroz", "543-23-4562", 10000, 0.06 ); 
    Employee thirdEmployee = new BasePlusCommissionEmployee("Shayan", "Shahid", "342-67-6543", 5000 , 0.04 , 300 ); 
    Employee fourthEmployee = new HourlyEmployee( "Tauseef" , "Anis", "642-67-4362" , 16.75 , 40 ); 
    // polymorphism: calling toString() and earning() on Employee’s reference 
    System.out.println(firstEmployee); 
    System.out.println(firstEmployee.earnings()); 
    System.out.println(secondEmployee); 
    System.out.println(secondEmployee.earnings()); 
    System.out.println(thirdEmployee); 
    // performing downcasting to access & raise base salary 
    BasePlusCommissionEmployee currentEmployee = (BasePlusCommissionEmployee) thirdEmployee; 
    double oldBaseSalary = currentEmployee.getbaseSalary(); 
    System.out.println( "Old Base Salary:\t" + oldBaseSalary) ;
    currentEmployee.setbaseSalary(1.10 * oldBaseSalary); 
    System.out.println("New Base Salary with 10% Increase:  "+ currentEmployee.getbaseSalary()); 
    System.out.println(thirdEmployee.earnings() ); 
    System.out.println(fourthEmployee); 
    System.out.println(fourthEmployee.earnings() ); 
    }
    
}
