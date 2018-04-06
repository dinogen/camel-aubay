package it.aubay.camel;

public class SomebodyBean {
	private String nome;
	private long dtnascita;
	private long eta;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public long getDtnascita() {
		return dtnascita;
	}
	public void setDtnascita(long dtnascita) {
		this.dtnascita = dtnascita;
	}
	@Override
	public String toString() {
		return "Nome:" + nome + ", nato il:" + dtnascita + ", eta':" + eta;
	}
	public long getEta() {
		return eta;
	}
	public void setEta(long l) {
		this.eta = l;
	}
	
}
