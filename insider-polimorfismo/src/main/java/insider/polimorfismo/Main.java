package insider.polimorfismo;

public class Main {

	public static void main(String[] args) {

		Veiculo v = new Veiculo();
		v.andar();
		
		Automovel a = new Automovel();
		a.andar();
		
		Veiculo v2 = new Automovel();
		v2.andar();
	}

}
