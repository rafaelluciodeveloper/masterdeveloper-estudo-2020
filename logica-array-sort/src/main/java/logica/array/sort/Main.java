package logica.array.sort;

public class Main {
	public static void main (String[] args) {
		int[] valores = { 3,6,5,2,1,4,0,7,9,8,10};
		
		for(int i = 0 ; i < valores.length - 1 ; i++ ) {
			for(int j = i + 1; j < valores.length ; j++) {
				if(valores[i] > valores[j]) {
					int aux = valores[i];
					valores[i] = valores[j];
					valores[j] = aux;
				}
			}
		}
		for(int valor : valores) {
			System.out.print(valor + " ");
		}
	}
	
}
