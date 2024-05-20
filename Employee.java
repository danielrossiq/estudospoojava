import java.util.Scanner;

public class Employee {
    String name;
    double grossSalary;
    double tax;
    double updatedSalary;


    double netSalary() {
        return this.grossSalary - this.tax;
    }

    void increaseSalary(double percentage) {
        updatedSalary = netSalary() + netSalary() * percentage/100;
    }
    @Override
    public String toString() {
        return "Employee:" + name + ", $ " + netSalary() ;
    }

}
