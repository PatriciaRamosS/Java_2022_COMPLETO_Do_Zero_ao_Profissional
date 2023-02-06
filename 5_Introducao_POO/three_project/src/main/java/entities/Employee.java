
package entities;


public class Employee {
    
    public String name;
    public double grossSalary;
    public double tax = 1000.00;
    
    public double netSalary() {
        return grossSalary + tax;
    }
    
    public double increaseSalary() {
        
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return name
            + ", $ "
            + String.format("%.2f",netSalary());   
    }
}
