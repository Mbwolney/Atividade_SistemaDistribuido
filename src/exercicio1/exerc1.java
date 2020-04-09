package exercicio1;

public class exerc1 implements Runnable {
	
	
	private String nome;
	private long intervalo;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public long getIntervalo() {
		return intervalo;
	}

	public void setIntervalo(long intervalo) {
		this.intervalo = intervalo;
	}
	
	public exerc1 (String nome, long intervalo){
		this.nome = nome;
		this.intervalo = intervalo;
	}

	@Override
	public void run() {
		for(char c : nome.toCharArray()) {
			System.out.println(c);
			try {
				Thread.sleep(intervalo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
			}
		}
	}
}


