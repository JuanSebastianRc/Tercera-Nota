public class App {

    public static class BankAccount {
        // Atributos
        String accountNumber;
        String owner;
        double balance;

        // Metodos
        void deposit(double amount) {
            balance += amount;
            System.out.println("Deposito:" + amount + "| nuevo balance: " + balance);
        }

        void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Retiro: " + amount + "ahora el balance es: " + balance);
            } else {
                System.out.println("No tiene fondos suficientes");
            }
        }

        void showBalance() {
            System.out.println(owner + " su balance es: " + balance);
        }

    }

    public static void main(String[] args) throws Exception {
        BankAccount account1 = new BankAccount();
        account1.accountNumber = "555-555-555";
        account1.balance = 2000000;
        account1.owner = "yisus";
        
        account1.showBalance();
        account1.deposit(200000);
        account1.withdraw(1000000);
    }
}