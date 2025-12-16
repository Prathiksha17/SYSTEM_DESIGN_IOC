package Splitwise.Expense;

import Splitwise.Balance.BalanceSheetController;
import Splitwise.Expense.Split.Split;
import Splitwise.Expense.Split.SplitStrategy;
import Splitwise.User.User;

import java.util.List;

public class ExpenseController {

    private final BalanceSheetController balanceSheet;

    public ExpenseController(BalanceSheetController balanceSheet) {
        this.balanceSheet = balanceSheet;
    }

    public void addExpense(
            double amount,
            User paidBy,
            List<Split> splits,
            SplitStrategy strategy
    ) {
        strategy.calculate(amount, splits); // Aman: 30, Charu: 30, Bhavna: 30, PaidBy: Aman

        for (Split s : splits) {
            if (!s.getUser().getId().equals(paidBy.getId())) {
                balanceSheet.addTransaction(
                        s.getUser().getId(), // Charu
                        paidBy.getId(), // Aman
                        s.getAmount() //30
                );
            }
        }
    }
}
