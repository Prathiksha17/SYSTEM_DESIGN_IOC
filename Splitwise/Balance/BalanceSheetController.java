package Splitwise.Balance;

import java.util.HashMap;
import java.util.Map;

public class BalanceSheetController {
    private final Map<String, Map<String, Balance>> sheet = new HashMap<>();//[From , [to, amount]] --> [Charu, [Aman, 30]]

    public void addTransaction(String from, String to, double amount) {
        sheet.putIfAbsent(from, new HashMap<>());
        sheet.putIfAbsent(to, new HashMap<>());

        sheet.get(from).putIfAbsent(to, new Balance());
        sheet.get(to).putIfAbsent(from, new Balance());

        sheet.get(from).get(to).owe += amount;
        sheet.get(to).get(from).getBack += amount;
    }

    public void showUserBalance(String userId, Map<String, String> names) {
        System.out.println("\n" + names.get(userId) + " OWES:");
        boolean owes = false;
        for (var e : sheet.getOrDefault(userId, Map.of()).entrySet()) {
            double net = e.getValue().owe - e.getValue().getBack;
            if (net > 0) {
                System.out.println("- " + names.get(e.getKey()) + " : " + net);
                owes = true;
            }
        }
        if (!owes) System.out.println("- 0");

        System.out.println("\n" + names.get(userId) + " GETS BACK:");
        boolean gets = false;
        for (var e : sheet.getOrDefault(userId, Map.of()).entrySet()) {
            double net = e.getValue().getBack - e.getValue().owe;
            if (net > 0) {
                System.out.println("- " + names.get(e.getKey()) + " : " + net);
                gets = true;
            }
        }
        if (!gets) System.out.println("- 0");
    }
}
