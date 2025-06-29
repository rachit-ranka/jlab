class PrimeThread extends Thread {
    int number;

    PrimeThread(int number) {
        this.number = number;
    }

    public void run() {
        if (isPrime(number)) {
            System.out.println(number + " is a Prime number (Thread Class)");
        } else {
            System.out.println(number + " is NOT a Prime number (Thread Class)");
        }
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

class PrimeRunnable implements Runnable {
    int number;

    PrimeRunnable(int number) {
        this.number = number;
    }

    public void run() {
        if (isPrime(number)) {
            System.out.println(number + " is a Prime number (Runnable Interface)");
        } else {
            System.out.println(number + " is NOT a Prime number (Runnable Interface)");
        }
    }

    private boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

public class PrimeCheck {
    public static void main(String[] args) {
        int number1 = 17;
        int number2 = 18;

        PrimeThread t1 = new PrimeThread(number1);
        t1.start();

        PrimeRunnable primeTask = new PrimeRunnable(number2);
        Thread t2 = new Thread(primeTask);
        t2.start();
    }
}
