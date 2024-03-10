package strategy.problem;

import strategy.ContractType;
import strategy.Employee;

import java.math.BigDecimal;

public class AnnualAdjustmentTest {
    // Problem
    // Whenever more contract types are created, it will be necessary to change the AnnualAdjustment class, which may create errors.
    public static void main(String[] args) {
        Employee employee1 = new Employee("Andre", new BigDecimal(5000), ContractType.CLT);
        Employee employee2 = new Employee("Andre", new BigDecimal(10000), ContractType.PJ);

        AnnualAdjustment annualAdjustment = new AnnualAdjustment();
        annualAdjustment.calculateAdjustment(employee1);
        annualAdjustment.calculateAdjustment(employee2);

        System.out.println(employee1);
        System.out.println(employee2);
    }
}
