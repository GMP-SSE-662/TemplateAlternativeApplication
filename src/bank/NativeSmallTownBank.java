package bank;

import client.Client;

public class NativeSmallTownBank implements Bank {
    private int amountFromAccount;

    @Override
    public void performWithdrawal(Client client, int requiredAmount) {
        amountFromAccount = 0;
        if (client.isRewardsMember())
            System.out.println("Sorry, we don't offer rewards member" +
                    "benefits at this location.");
        amountFromAccount += 5;
        notifyClient(requiredAmount);
    }

    private void notifyClient(int requiredAmount) {
        System.out.println(String.format("You asked for: %s", requiredAmount));
        System.out.println(String.format("Total withdrawn after fee: %s",
                amountFromAccount + requiredAmount));
    }
}
