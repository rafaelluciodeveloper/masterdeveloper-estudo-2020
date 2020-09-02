package br.com.rafaellucio.lambdastream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

	private static final Map<String, Integer> PEOPLE = Map.of("pedro", 15, "joao", 21, "maria", 31);

	//Optional
	private static Optional<Integer> get(String name) {
		return Optional.ofNullable(PEOPLE.get(name));
	}
	
	//Reducce
	private static int multiply(int[] array) {
		return Arrays.stream(array).reduce((x,y)-> x * y).orElse(0);
	}
	
	//Reduce
	private static int max(int[] array) {
		return Arrays.stream(array).reduce((x,y)-> x > y ? x : y).orElse(0);
	}

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>(List.of(1, 4, 6, 7, 9, 3));
		List<String> nomes = List.of("Rafael", "Rodrigo", "Carlos", "Thiago", "Felipe", "Henrique", "Pedro", "Amanda");
		List<Car> cars = List.of(new Car("Bmw", 85000), new Car("Mercedes", 36000), new Car("Ford", 20000));
		// Expressao Lambda
		numbers.sort((o1, o2) -> o1.compareTo(o2));
		System.out.println(numbers);

		// Interface Funcional
		Operator op = (x, y) -> x * y;
		System.out.println(op.execute(10, 5));

		// Stream Api
		List<String> filteredNames = nomes.stream().filter(w -> w.startsWith("R"))
				// .map(w -> w.toLowerCase())
				.map(String::toLowerCase).collect(Collectors.toList());

//		filteredNames.forEach(w -> System.out.println(w));
		filteredNames.forEach(System.out::println);

		// Stream Api em Objetos
		cars.stream().sorted((c1, c2) -> Double.valueOf(c1.getPrice()).compareTo(c2.getPrice()))
				.map(c -> new Car(c.getBrand().toLowerCase(), c.getPrice())).peek(Car::addTax)
				.forEach(System.out::println);

		// Optional

		Optional<Integer> opt = get("gh");

		// int idade = opt.orElse(0);
		// int idade = opt.orElseThrow(IllegalArgumentException::new);
		// opt.ifPresent(i -> System.out.println("A idade " + i + " foi encontrada"));

		opt.ifPresentOrElse(i -> System.out.println(" A Idade " + i + " Foi encontrada"),
				() -> System.out.println("Não Encontrada"));

		// Clousure

		int mult = 3;
		AtomicInteger count = new AtomicInteger();

		IntStream.range(1, 21).map(i -> {
			count.incrementAndGet();
			return i * mult;
		}).forEach(System.out::println);

		System.out.println(count);
		
		
		int[] array = List.of(3,2,4,1,7).stream().mapToInt(Integer::intValue).toArray();

		//Reduce
		System.out.println(multiply(array));
		System.out.println(max(array));
		
		String str = "ACBA";
		
		String result =  str.chars()
				.map(i -> i - 64)
				.mapToObj(String::valueOf)
				.collect(Collectors.joining("-", "=>>", "<<="));
		
		System.out.println(result);
		
	}

}
