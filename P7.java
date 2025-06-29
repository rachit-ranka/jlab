class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public synchronized void deposit(int amount) {
        System.out.println(Thread.currentThread().getName() + " is depositing " + amount);
        balance += amount;
        System.out.println("Balance after deposit: " + balance);
    }

    public synchronized void withdraw(int amount) {
        System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Balance after withdrawal: " + balance);
        } else {
            System.out.println("Insufficient balance! Withdrawal failed.");
        }
    }

    public int getBalance() {
        return balance;
    }
}

class DepositTask implements Runnable {
    private BankAccount account;

    public DepositTask(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.deposit(1000);
    }
}

class WithdrawTask implements Runnable {
    private BankAccount account;

    public WithdrawTask(BankAccount account) {
        this.account = account;
    }

    public void run() {
        account.withdraw(500);
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        Thread t1 = new Thread(new DepositTask(account), "Thread-Deposit");
        Thread t2 = new Thread(new WithdrawTask(account), "Thread-Withdraw");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }

        System.out.println("Final Account Balance: " + account.getBalance());
    }
}
