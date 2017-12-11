package bank;

import client.Client;

public class NativeCityBank implements Bank {
    private int amountFromAccount;

    @Override
    public void performWithdrawal(Client client, int requiredAmount) {
        amountFromAccount = 0;
        if (client.isRewardsMember())
            handleRewards();
        amountFromAccount += 5;
        notifyClient(requiredAmount);
    }

    private void handleRewards() {
        System.out.println("We do have a rewards program! You saved $2!");
        amountFromAccount -= 2;
    }

    private void notifyClient(int requiredAmount) {
        System.out.println(String.format("You asked for: %s", requiredAmount));
        System.out.println(String.format("Total withdrawn after fee: %s",
                amountFromAccount + requiredAmount));
    }
}
