package Splitwise.Expense.Split;

import java.util.List;

public interface SplitStrategy {
    void calculate(double totalAmount, List<Split> splits);
}
