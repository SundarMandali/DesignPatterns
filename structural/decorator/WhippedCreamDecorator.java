package structural.decorator;

class WhippedCreamDecorator extends CoffeeDecorator{
	 public WhippedCreamDecorator(Coffee coffee) {
	        super(coffee);
	    }

	    @Override
	    public String getDescription() {
	        return coffee.getDescription() + ", Whipped Cream";
	    }

	    @Override
	    public double getCost() {
	        return coffee.getCost() + 0.75; // Add cost of whipped cream
	    }
}