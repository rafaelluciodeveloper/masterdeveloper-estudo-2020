package collection.ordered;

public class Mes implements Comparable<Mes>  {
	
	private String nome;
	private int numero;
	
	public Mes(String nome, int numero) {
		this.nome = nome;
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public int getNumero() {
		return numero;
	}
	
	@Override
	public String toString() {
		return numero + "-" + nome;
	}
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mes other = (Mes) obj;
		if (numero != other.numero)
			return false;
		return true;
	}

	@Override
	public int compareTo(Mes o) {
		if(this.numero < o.getNumero()) {
			return -1;
		}else if(this.numero > o.getNumero()) {
			return 1;
		}
		return 0;
	}
	
	

}
