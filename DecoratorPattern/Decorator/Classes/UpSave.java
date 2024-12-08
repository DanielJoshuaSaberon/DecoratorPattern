package DecoratorPattern.Decorator.Classes;

import DecoratorPattern.Accounts.BankAccount;
import DecoratorPattern.Accounts.SavingsAccount;
import DecoratorPattern.Decorator.BankAccountDecorator;

public class UpSave implements BankAccountDecorator {
    private BankAccount bankAccount;

    public UpSave(SavingsAccount account) {
        this.bankAccount = account;
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return 0.04;
    }

    @Override
    public double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public String showBenefits() {
        return "Standard Savings Account, With Insurance";
    }

    @Override
    public double computeBalanceWithInterest() {
        return bankAccount.getBalance() + (bankAccount.getBalance() * getInterestRate());
    }

    @Override
    public String showInfo() {
        return bankAccount.showInfo();
    }
}
