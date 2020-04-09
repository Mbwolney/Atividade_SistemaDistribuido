package exercicio3;

public class Produtor extends Thread{
	 private String cubbyhole;
	    private int number;

	    public Produtor(String c, int number) {
	        cubbyhole = c;
	        this.number = number;
	    }

	    public void run() {
	        for (int i = 0; i < 10; i++) {
	            cubbyhole.put(number, i);
	            try {
	                sleep((int)(Math.random() * 100));
	            } catch (InterruptedException e) { }
	        }
	    }
	}