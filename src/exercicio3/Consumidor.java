package exercicio3;

public class Consumidor extends Thread {
	private String cubbyhole;
    private int number;

    public Consumidor(String c, int number) {
        cubbyhole = c;
        this.number = number;
    }

    public void run() {
        int value = 0;
        for (int i = 0; i < 10; i++) {
            value = cubbyhole.get(number);
        }
    }
}

