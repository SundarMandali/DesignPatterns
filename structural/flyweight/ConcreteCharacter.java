package structural.flyweight;

//Concrete Flyweight
class ConcreteCharacter implements Character {
 private final Character symbol; // Intrinsic state

 public ConcreteCharacter(Character c) {
     this.symbol = c;
 }

 @Override
 public void render(String fontStyle) {
     // Extrinsic state: fontStyle
     System.out.println("Rendering '" + symbol + "' with font style: " + fontStyle);
 }
}
