package Erros;

public class Aplicacao {

	public static void main(String[] args) {
		ContatoPF cf = new ContatoPF();
		cf.setNome("Rafael Lucio");
		cf.setCpf("011.123.745-08");
		
		cf.getEndereco().setRua("R 14 julho");
		cf.getEndereco().setNumero("288");
		cf.getEndereco().setCidade("Maceio");
		cf.getEndereco().setEstado("AL");
		
		ContatoPJ cj = new ContatoPJ();
		cj.setNome("Rodrigo");
		cj.setCnpj("15.286.965/0001-70");
		
		cj.getEndereco().setRua("R 15 julho");
		cj.getEndereco().setNumero("288");
		cj.getEndereco().setCidade("Maceio");
		cj.getEndereco().setEstado("AL");
		
		Agenda a = new Agenda();
		a.setContato1(cf);
		a.setContato2(cj);
		
		imprimirNomes(a);
		imprimirCnpjs(a);
		
		System.out.println("Contato Definido");
	}
	
	private static void imprimirNomes(Agenda a) {
		if(a.getContato1() != null) {
			System.out.println(a.getContato1().getNome());
		}
		if(a.getContato2() != null) {
			System.out.println(a.getContato2().getNome());
		}
		if(a.getContato3() != null) {
			System.out.println(a.getContato3().getNome());
		}
	}
	
	private static void imprimirCnpjs(Agenda a) {
		if(a.getContato1() != null && a.getContato1() instanceof ContatoPJ) {
			ContatoPJ c =  (ContatoPJ) a.getContato1();
			System.out.println(c.getCnpj());
		}
		if(a.getContato2() != null && a.getContato2() instanceof ContatoPJ) {
			ContatoPJ c =  (ContatoPJ) a.getContato2();
			System.out.println(c.getCnpj());
		} 
		if(a.getContato3() != null && 	a.getContato3() instanceof ContatoPJ) {
			ContatoPJ c =  (ContatoPJ) a.getContato3();
			System.out.println(c.getCnpj());
		}
	}

}
