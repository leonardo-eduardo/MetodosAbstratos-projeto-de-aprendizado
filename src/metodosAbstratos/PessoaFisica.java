package metodosAbstratos;

public class PessoaFisica extends Pessoa{

	private double gastosaude;
	
	public PessoaFisica() {
	}
	public PessoaFisica(String nome, double rendaanual, double gastosaude) {
		super(nome, rendaanual);
		this.gastosaude = gastosaude;
	}

	public double getGastosaude() {
		return gastosaude;
	}
	public void setGastosaude(double gastosaude) {
		this.gastosaude = gastosaude;
	}
	
	@Override
	public double impostopago() {
		if (getRendaanual() < 20000) {
			return getRendaanual()*0.15 - gastosaude*0.5;
		}
		else {
			return getRendaanual()*0.25 - gastosaude*0.5;
		}
	}	
	

}
