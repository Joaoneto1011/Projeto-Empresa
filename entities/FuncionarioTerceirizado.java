package entities;

public class FuncionarioTerceirizado extends Funcionario {
	
	private double despesaAdicional;
	
	
	public FuncionarioTerceirizado() {
		super();
		
	}

	public FuncionarioTerceirizado(String nome, Integer horasTrabalhadas, double valorPorHora,double despesaAdicional) {
		super(nome, horasTrabalhadas, valorPorHora);
		this.despesaAdicional = despesaAdicional;
	}

	public double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}
	
	
	@Override
	
	public double pagamento() {
		
		return super.pagamento() + despesaAdicional * 1.1;
	}
	
	
}
