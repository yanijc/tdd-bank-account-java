package org.xpdojo.bank;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountTest {

    private Object Account;

    @Test
    public void startingBalanceIsZero() {
        Account account = new Account();
        assertThat(account.balance).isEqualTo(0);
    }
    @Test
    public void depositAnAmountToIncreaseTheBalance() {
        Account account = new Account();
        account.deposit(100);
        int startBalance = account.balance;
        account.deposit(100);
        assertThat(account.balance).isEqualTo(startBalance + 100);
    }

    @Test
    public void withdrawAnAmountToDecreaseTheBalance() {
        Account account = new Account();
        account.deposit(100);
        int startBalance = account.balance;
        account.withdraw(100);
        assertThat(account.balance).isEqualTo(startBalance - 100);
    }
}