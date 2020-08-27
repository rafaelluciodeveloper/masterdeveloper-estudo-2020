package insider.polimorfismo;

public class Bicicleta extends Veiculo {
	@Override
	public void andar() {
		System.out.println("Bicicleta esta Andando");
	}
	
	public void empinar() {
		System.out.println("Bicleta  esta Empinando");
	}
}
