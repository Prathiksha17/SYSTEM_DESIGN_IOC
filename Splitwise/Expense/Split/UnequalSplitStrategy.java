package Splitwise.Expense.Split;

import java.util.List;

public class UnequalSplitStrategy implements SplitStrategy {
    public void calculate(double totalAmount, List<Split> splits) {
        double sum = 0;
        for (Split s : splits) {
            sum += s.getAmount();
        }
        if (sum != totalAmount) {
            throw new RuntimeException("Unequal split does not match total");
        }
    }
}
