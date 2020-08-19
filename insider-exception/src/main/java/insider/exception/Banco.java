package insider.exception;

public class Banco {

	public void realizarOperacao(){
		ContaBancaria b = new ContaBancaria();
		try {
			b.sacar(-500);
			System.out.println("Sacou");
		}catch(ValorNegativoException e) {
			System.out.println("Valor e negativo");
		}catch(SaldoInsuficienteException e) {
			System.out.println("Não tem Saldo" + e.getMessage());

		}
		System.out.println("Fim do Saque");
		double saldo =  b.getSaldo();
		System.out.println(saldo);
	}

}
