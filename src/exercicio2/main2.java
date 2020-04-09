package exercicio2;

public class main2 {
	public static void main(String[] args) {
		Thread t1 = new Thread(new RaizQuadrada());
		Thread t2 = new Thread(new RaizCubica());
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
			System.out.println("FIM");
		} catch (InterruptedException e) {
		}
		
	}

}
