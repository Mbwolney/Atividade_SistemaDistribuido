package exercicio1;

public class main {

	public static void main(String[] args) {
		
	exerc1 ex = new exerc1("Deu certo", 500);
	exerc1 ex1 = new exerc1("Carregando", 1500);
	exerc1 ex2 = new exerc1("Beleza", 2000);
	Thread t1 = new Thread(ex);
	Thread t2 = new Thread(ex1);
	Thread t3 = new Thread(ex2);
	
	t1.start();
	t2.start();
	t3.start();
	}
}
