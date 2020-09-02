package br.com.rafaellucio.lambdastream;

public class Car {
	
	private String brand;
	private double price;
	
	public Car(String brand,double price) {
		this.brand = brand;
		this.price  = price;
	}

	public void addTax() {
		price = price  += price * 0.5;
	}

	public String getBrand() {
		return brand;
	}

	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}
	
	
}
