package Splitwise.Expense.Split;

public class SplitStrategyFactory {
    public static SplitStrategy getStrategy(SplitType type) {
        switch (type) {
            case EQUAL:
                return new EqualSplitStrategy();
            case UNEQUAL:
                return new UnequalSplitStrategy();
            case PERCENTAGE:
                return new PercentageSplitStrategy();
            default:
                throw new IllegalArgumentException("Invalid SplitType");
        }
    }
}
