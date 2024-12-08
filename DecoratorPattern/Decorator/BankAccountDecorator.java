package DecoratorPattern.Decorator;

import DecoratorPattern.Accounts.BankAccount;

public interface BankAccountDecorator extends BankAccount {
    void setBankAccount(BankAccount bankAccount);
}
