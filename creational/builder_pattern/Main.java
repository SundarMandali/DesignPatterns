package creational.builder_pattern;

public class Main {

	public static void main(String[] args) {
		Pizza pizza1=new Pizza.PizzaBuilder("Large", "Thin")
                .addCheese(true)
                .addPepperoni(true)
                .build();
		System.out.println(pizza1);

        // Create a pizza with veggies only
        Pizza pizza2 = new Pizza.PizzaBuilder("Medium", "Pan")
                                .addVeggies(true)
                                .build();

        System.out.println(pizza2);
	}

}
