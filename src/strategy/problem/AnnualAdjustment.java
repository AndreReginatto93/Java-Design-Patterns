package strategy.problem;

import strategy.ContractType;
import strategy.Employee;

import java.math.BigDecimal;

public class AnnualAdjustment {

    public void calculateAdjustment(Employee employee){
        if (ContractType.CLT.name().compareTo(employee.getContractType().name()) == 0){
            BigDecimal wage = employee.getWage();
            employee.setWage(wage.add(wage.multiply(new BigDecimal("0.10"))));
        }else if (ContractType.PJ.name().compareTo(employee.getContractType().name()) == 0){
            BigDecimal wage = employee.getWage();
            employee.setWage(wage.add(wage.multiply(new BigDecimal("0.05"))));
        }
    }
}
