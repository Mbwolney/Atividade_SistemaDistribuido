package exercicio2;

public class RaizQuadrada implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int cont = 1; cont <= 99; cont++) {
			if(cont%2 != 0) {
				System.out.println(Math.sqrt(cont));
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
			
			}	
		}
	}
}
}
