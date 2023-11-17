public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getAmount() {
        return balance;
    }

    public void deposit(double sum) {
        if (sum > 0) {
            balance += sum;
            System.out.println("Вы успешно пополнили баланс. Текущий баланс: " + balance);
        } else {
            System.out.println("Ошибка: Сумма для внесения должна быть положительной.");
        }
    }

    public void withdraw(double sum) throws LimitException {
        if (sum > 0 && sum <= balance) {
            balance -= sum;
            System.out.println("Вы успешно сняли деньги. Текущий баланс: " + balance);
        } else if (sum <= 0) {
            System.out.println("Ошибка-> Сумма для снятия должна быть положительной.");
        } else {
            throw new LimitException("Ошибка->Недостаточно средств на счете.", balance);
        }
    }
}


