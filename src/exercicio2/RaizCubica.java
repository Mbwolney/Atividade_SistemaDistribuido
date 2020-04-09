package exercicio2;

public class RaizCubica implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int cont = 2; cont <= 1000; cont++) {
			if(cont%2 != 0) {
				System.out.println(Math.cbrt(cont));
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
			
			}	
		}
	}
}
}
