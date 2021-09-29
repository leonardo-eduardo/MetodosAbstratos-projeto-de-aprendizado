package metodosAbstratos;

public class PessoaJuridica extends Pessoa{
	private int numdefuncionarios;
	public PessoaJuridica() {
	}
	public PessoaJuridica(String nome, double rendaanual, int numdefuncionarios) {
		super(nome, rendaanual);
		this.numdefuncionarios = numdefuncionarios;
	}

	public int getNumdefuncionarios() {
		return numdefuncionarios;
	}
	public void setNumdefuncionarios(int numdefuncionarios) {
		this.numdefuncionarios = numdefuncionarios;
	}
	
	@Override
	public double impostopago() {
		if (numdefuncionarios <= 10) {
			return getRendaanual()*0.16;
		}
		else {
			return getRendaanual()*0.14;
		}
		
	}
	
}
