package adapter.problem;

import java.math.BigDecimal;

public class BankingOperations {
    public boolean validateBalance(BigDecimal value){
        System.out.println("Validating...");
        return true;
    }
    public void withdrawBalance(BigDecimal value){
        System.out.println("Withdrawing...");
    }
    public void cashDeposit(BigDecimal value){
        System.out.println("Depositing...");
    }
}
