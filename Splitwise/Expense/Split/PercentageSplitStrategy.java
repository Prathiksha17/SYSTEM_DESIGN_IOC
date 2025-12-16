package Splitwise.Expense.Split;

import java.util.List;

public class PercentageSplitStrategy implements SplitStrategy {
    public void calculate(double totalAmount, List<Split> splits) {
        double percentSum = 0;
        for (Split s : splits) {
            PercentageSplit ps = (PercentageSplit) s; 
            percentSum += ps.getPercentage();
            s.setAmount(totalAmount * ps.getPercentage() / 100);
        }
        if (percentSum != 100) {
            throw new RuntimeException("Percentage split must be 100");
        }
    }
}
