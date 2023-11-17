public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(20000);

        System.out.println("Начальный баланс: " + bankAccount.getAmount());

        while (true) {
            try {
                bankAccount.withdraw(6000);
            } catch (LimitException e) {
                System.out.println("Исключение:\n" + e.getMessage());
                System.out.println("Снимаем доступную сумму: " + e.getRemainingAmount());
                break;
            }
        }

        System.out.println("Итоговый баланс: " + bankAccount.getAmount());
    }
}