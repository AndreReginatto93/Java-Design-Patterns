package adapter.problem;

import java.math.BigDecimal;

public class BankingOperationsTest {
    public static void main(String[] args) {
        // Problem
        // To withdraw we have to do an if every time to check the balance, this could lead to an error in the future.

        BankingOperations bankingOperations = new BankingOperations();

        BigDecimal withdrawAmount = new BigDecimal(1000);

        if (bankingOperations.validateBalance(withdrawAmount)){
            bankingOperations.withdrawBalance(withdrawAmount);
        }

        bankingOperations.cashDeposit(new BigDecimal(500));
    }
}
