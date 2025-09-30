package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

public class ProgramaPrincipal {
	
	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionario> list = new ArrayList<>();
		
		System.out.print("Insira o número de funcionários: ");
		
		int n = sc.nextInt();
		
		
		for (int i=1; i<=n; i++) {
			
			System.out.println();
			System.out.println("Dados do #" + i + " funcionário: ");
			System.out.println();
			System.out.print("Funcionário é terceirizado (S/N)?");
			char ch = sc.next().charAt(0);
			System.out.println();
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Horas Trabalhadas: ");
			int horasTrabalhadas = sc.nextInt();
			
			System.out.print("Valor por hora: ");
			double valorPorHora = sc.nextDouble();
			
			if (ch == 's') {
				
				System.out.print("Despesa adicional: ");
				double despesaAdicional = sc.nextDouble();
				
				list.add(new FuncionarioTerceirizado(nome, horasTrabalhadas, valorPorHora, despesaAdicional));
			}
			
			else {
				
				list.add(new Funcionario(nome, horasTrabalhadas, valorPorHora));
				
			}
			
			System.out.println("----------------------------------------------------");
			
		}
		
		System.out.println();
		System.out.println("PAGAMENTOS: ");
		
		for (Funcionario funcionario : list) {
			
			System.out.println(funcionario.getNome() + " - $ " + String.format("%.2f", funcionario.pagamento()));
		}
		
		System.out.println();

		
		
		sc.close();
		
		
	}

}
