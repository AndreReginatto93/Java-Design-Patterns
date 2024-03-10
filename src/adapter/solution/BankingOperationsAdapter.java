package adapter.solution;

import java.math.BigDecimal;

public class BankingOperationsAdapter {

    BankingOperations bankingOperations;

    public BankingOperationsAdapter(BankingOperations bankingOperations){
        this.bankingOperations = bankingOperations;
    }

    public void withdrawBalance(BigDecimal value){
        if (bankingOperations.validateBalance(value)){
            bankingOperations.withdrawBalance(value);
        }else{
            throw new IllegalArgumentException("withdrawal amount not allowed.");
        }
    }
    public void cashDeposit(BigDecimal value){
        bankingOperations.cashDeposit(value);
    }
}
