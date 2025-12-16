package Splitwise.Expense.Split;

import java.util.List;

public class EqualSplitStrategy implements SplitStrategy {
    public void calculate(double totalAmount, List<Split> splits) {
        double each = totalAmount / splits.size();
        for (Split s : splits) {
            s.setAmount(each);
        }
    }
}
