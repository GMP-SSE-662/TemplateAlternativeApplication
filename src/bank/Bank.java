package bank;

import client.Client;

public interface Bank {

    /**
     * Performs a withdrawal.
     * @param client person asking to withdraw money
     * @param requiredAmount amount client wants to withdraw
     * @return the total amount of money the client takes out
     *          of his/her bank account, including the withdrawn
     *          amount.
     */
    void performWithdrawal(Client client, int requiredAmount);
}
