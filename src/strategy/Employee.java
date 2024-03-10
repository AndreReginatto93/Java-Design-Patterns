package strategy;

import java.math.BigDecimal;

public class Employee {
    private String name;
    private BigDecimal wage;
    private ContractType contractType;

    public Employee(String name, BigDecimal wage, ContractType contractType) {
        this.name = name;
        this.wage = wage;
        this.contractType = contractType;
    }

    public String getName() {
        return name;
    }

    public ContractType getContractType() {
        return contractType;
    }

    public void setContractType(ContractType contractType) {
        this.contractType = contractType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getWage() {
        return wage;
    }

    public void setWage(BigDecimal wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", wage=" + wage +
                ", contractType=" + contractType +
                '}';
    }
}
