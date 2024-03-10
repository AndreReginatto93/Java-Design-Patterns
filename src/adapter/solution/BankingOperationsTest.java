package adapter.solution;

import java.math.BigDecimal;

public class BankingOperationsTest {
    public static void main(String[] args) {
        // Solution
        // With the design pattern adapter we were able to call the withdrawBalance with more control, without calling the validation first,
        // because the validation is inside withdrawBalance.

        BankingOperations bankingOperations = new BankingOperations();
        BankingOperationsAdapter bankingOperationsAdapter = new BankingOperationsAdapter(bankingOperations);

        BigDecimal withdrawAmount = new BigDecimal(1000);

        bankingOperationsAdapter.withdrawBalance(withdrawAmount);

        bankingOperationsAdapter.cashDeposit(new BigDecimal(500));
    }
}
