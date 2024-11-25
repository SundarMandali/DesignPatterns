package creational.builder_pattern;

public class Pizza {
	
	private String size;       // e.g., Small, Medium, Large
	private String crust;      // e.g., Thin, Pan
	private boolean cheese;    // Extra cheese or not
	private boolean pepperoni; // Add pepperoni or not
	private boolean veggies;   // Add veggies or not}
	
	Pizza(PizzaBuilder pizzaBuilder){
		this.size=pizzaBuilder.size;
		this.crust=pizzaBuilder.crust;
		this.cheese=pizzaBuilder.cheese;
		this.pepperoni=pizzaBuilder.pepperoni;
		this.veggies=pizzaBuilder.veggies;
	}
	
	@Override
	public String toString() {
		return "Pizza [size=" + size + ", crust=" + crust + ", cheese=" + cheese + ", pepperoni=" + pepperoni
				+ ", veggies=" + veggies + "]";
	}

	static class PizzaBuilder{
		private String size;      // Mandatory
		private String crust;     // Mandatory
		
		private boolean cheese;   // Optional
		private boolean pepperoni; // Optional
		private boolean veggies;  // Optional
		
		public PizzaBuilder(String size,String crust){
			this.size=size;
			this.crust=crust;
		}

		public PizzaBuilder addCheese(boolean cheese) {
			this.cheese = cheese;
			return this;
		}


		public PizzaBuilder addPepperoni(boolean pepperoni) {
			this.pepperoni = pepperoni;
			return this;
		}

		public PizzaBuilder addVeggies(boolean veggies) {
			this.veggies = veggies;
			return this;
			
		}
		
		public Pizza build(){
			return new Pizza(this);
		}

	

	}
}