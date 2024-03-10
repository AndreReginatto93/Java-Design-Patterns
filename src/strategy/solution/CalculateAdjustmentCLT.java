package strategy.solution;

import strategy.Employee;

import java.math.BigDecimal;

public class CalculateAdjustmentCLT implements CalculateAdjustment{
    public void calculateAdjustment(Employee employee){
        BigDecimal wage = employee.getWage();
        employee.setWage(wage.add(wage.multiply(new BigDecimal("0.10"))));
    }
}
