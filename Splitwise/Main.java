package Splitwise;

import Splitwise.Balance.BalanceSheetController;
import Splitwise.Expense.ExpenseController;
import Splitwise.Expense.Split.*;
import Splitwise.Group.Group;
import Splitwise.User.User;
import Splitwise.User.UserController;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        // ---------- USERS ----------
        UserController userController = new UserController();
        User aman = userController.addUser("A", "Aman");
        User bhavna = userController.addUser("B", "Bhavna");
        User charu = userController.addUser("C", "Charu");

        Map<String, String> names = Map.of(
                "A", "Aman",
                "B", "Bhavna",
                "C", "Charu"
        );

        // ---------- GLOBAL (OVERALL VIEW) ----------
        BalanceSheetController globalBalance = new BalanceSheetController(); // 
        ExpenseController globalExpense =
                new ExpenseController(globalBalance);

        // ---------- PERSONAL / GLOBAL EXPENSE ----------
        SplitStrategy equalStrategy =
                SplitStrategyFactory.getStrategy(SplitType.EQUAL);

        globalExpense.addExpense(
                300,
                aman,
                List.of(
                        new Split(aman),
                        new Split(bhavna),
                        new Split(charu)
                ),
                equalStrategy
        );

        // ==================================================
        // ================= GROUP LEVEL ====================
        // ==================================================
        Group goaTrip = new Group("G1");
        goaTrip.addMember(aman);
        goaTrip.addMember(bhavna);
        goaTrip.addMember(charu);

        BalanceSheetController groupBalance = new BalanceSheetController();
        ExpenseController groupExpense =
                new ExpenseController(groupBalance);

        // ---------- GROUP EXPENSE 1 (EQUAL) ----------
        List<Split> dinnerSplits = List.of(
                new Split(aman),
                new Split(bhavna)
        );

        groupExpense.addExpense(300, aman, dinnerSplits, equalStrategy);
        globalExpense.addExpense(300, aman, dinnerSplits, equalStrategy);

        // ---------- GROUP EXPENSE 2 (EQUAL) ----------
        List<Split> movieSplits = List.of(
                new Split(aman),
                new Split(bhavna),
                new Split(charu)
        );

        groupExpense.addExpense(150, bhavna, movieSplits, equalStrategy);
        globalExpense.addExpense(150, bhavna, movieSplits, equalStrategy);

        // ---------- GROUP EXPENSE 3 (PERCENTAGE) ----------
        SplitStrategy percentageStrategy =
                SplitStrategyFactory.getStrategy(SplitType.PERCENTAGE);

        List<Split> hotelSplits = List.of(
                new PercentageSplit(aman, 50),
                new PercentageSplit(bhavna, 30),
                new PercentageSplit(charu, 20)
        );

        groupExpense.addExpense(500, charu, hotelSplits, percentageStrategy);
        globalExpense.addExpense(500, charu, hotelSplits, percentageStrategy);

        // ==================================================
        // ================== OUTPUT ========================
        // ==================================================
        System.out.println("\n========= GLOBAL / OVERALL VIEW =========");
        globalBalance.showUserBalance("A", names);
        // globalBalance.showUserBalance("B", names);
        // globalBalance.showUserBalance("C", names);

        System.out.println("\n========= GROUP VIEW : GOA TRIP =========");
        groupBalance.showUserBalance("A", names);
        // groupBalance.showUserBalance("B", names);
        // groupBalance.showUserBalance("C", names);
    }
}
