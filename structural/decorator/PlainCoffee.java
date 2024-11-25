package structural.decorator;

//Concrete Component
class PlainCoffee implements Coffee {
 @Override
 public String getDescription() {
     return "Plain Coffee";
 }

 @Override
 public double getCost() {
     return 2.00; // Base cost of plain coffee
 }
}
