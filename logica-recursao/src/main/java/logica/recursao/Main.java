package logica.recursao;

public class Main {

	public static void main(String[] args) {

		int resposta =  fatorial(3);
		System.out.println("O Fatorial é " + resposta);
	}
	
	static int fatorial(int n) {
		if(n == 0) {
			return 1;
		}
		return n * fatorial(n - 1); 
	}

}
