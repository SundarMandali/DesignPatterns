package structural.decorator;

//Concrete Decorator: Milk
class MilkDecorator extends CoffeeDecorator {
 public MilkDecorator(Coffee coffee) {
     super(coffee);
 }

 @Override
 public String getDescription() {
     return coffee.getDescription() + ", Milk";
 }

 @Override
 public double getCost() {
     return coffee.getCost() + 0.50; // Add cost of milk
 }
}

//Concrete Decorator: Sugar
class SugarDecorator extends CoffeeDecorator {
 public SugarDecorator(Coffee coffee) {
     super(coffee);
 }

 @Override
 public String getDescription() {
     return coffee.getDescription() + ", Sugar";
 }

 @Override
 public double getCost() {
     return coffee.getCost() + 0.25; // Add cost of sugar
 }
}


