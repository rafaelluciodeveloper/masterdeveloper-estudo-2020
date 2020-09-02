package br.com.rafaellucio.lambdastream;

@FunctionalInterface
public interface Operator {
	
	int execute(int x, int y);
	
	default void say() {
		System.out.println("Teste metodo default");
	}
}
