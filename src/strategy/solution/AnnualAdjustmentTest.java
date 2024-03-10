package strategy.solution;

import strategy.ContractType;
import strategy.Employee;

import java.math.BigDecimal;

public class AnnualAdjustmentTest {
    // Solution
    // With the design pattern strategy we were able to call the calculateAdjustment, injecting the right class to calculate the adjustment,
    // now we can add another contract types and the code will not break.
    public static void main(String[] args) {
        Employee employee1 = new Employee("Andre", new BigDecimal(5000), ContractType.CLT);
        Employee employee2 = new Employee("Andre", new BigDecimal(10000), ContractType.PJ);

        AnnualAdjustment annualAdjustment = new AnnualAdjustment();
        annualAdjustment.calculateAdjustment(employee1, new CalculateAdjustmentCLT());
        annualAdjustment.calculateAdjustment(employee2, new CalculateAdjustmentPJ());

        System.out.println(employee1);
        System.out.println(employee2);
    }
}
