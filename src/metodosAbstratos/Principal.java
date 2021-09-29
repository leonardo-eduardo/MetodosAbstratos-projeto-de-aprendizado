package metodosAbstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Quantidade de pessoas: ");
		int n = sc.nextInt();
		
		List<Pessoa> lista = new ArrayList<>();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Dados da pessoa " +i +":");
			System.out.print("Digite F para pessoa física ou J para pessoa jurídica: ");
			char ch = sc.next().charAt(0);
				System.out.print("Nome: ");
				String nome = sc.next();
				System.out.print("Rendimento anual: ");
				double rendaanual = sc.nextDouble();
				if(ch == 'F') {
					System.out.print("Gastos com saúde :");
					double gastosaude = sc.nextDouble();
					lista.add(new PessoaFisica(nome, rendaanual, gastosaude));
				}
				else {
					System.out.print("Número de funcionários: ");
					int numdefuncionarios = sc.nextInt();
					lista.add(new PessoaJuridica(nome, rendaanual, numdefuncionarios));
				}
		}	
				
		System.out.println("Impostos pagos");
		sc.nextLine();
		double total = 0;
		for(Pessoa p : lista) {
			total += p.impostopago();
			System.out.println(p.getNome() +"    R$" +String.format("%.2f",p.impostopago()));
		}
		System.out.println("Total de imposto pago  R$" +String.format("%.2f", total));
		sc.close();

	}

}
