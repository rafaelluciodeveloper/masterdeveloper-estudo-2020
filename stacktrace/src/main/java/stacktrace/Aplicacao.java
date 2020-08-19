package stacktrace;

public class Aplicacao {

	public static void main(String[] args) throws Exception {
		Automovel a =  new Automovel();
		try {
			a.acelerar(100);
			a.acelerar(90);
		} catch (AcimaDaVelocidadeMaximaException e) {
			e.printStackTrace();
		}
	}

}
