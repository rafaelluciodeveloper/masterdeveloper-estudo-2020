package insider.polimorfismo;

public class Automovel extends Veiculo {

	@Override
	public void andar() {
		System.out.println("Automovel esta Andando");
	}
	
	public void acelerar() {
		System.out.println("Veiculo esta Acelerando");
	}
	
}
