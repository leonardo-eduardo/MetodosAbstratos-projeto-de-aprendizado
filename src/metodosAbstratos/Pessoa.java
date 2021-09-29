package metodosAbstratos;

public abstract class Pessoa {

	private String nome;
	private double rendaanual;
	
	public Pessoa() {
	}
	public Pessoa(String nome, double rendaanual) {
		this.nome = nome;
		this.rendaanual = rendaanual;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getRendaanual() {
		return rendaanual;
	}
	public void setRendaanual(double rendaanual) {
		this.rendaanual = rendaanual;
	}
	
	public abstract double impostopago(); 
	
}
