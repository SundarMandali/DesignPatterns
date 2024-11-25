package structural.flyweight;
//Flyweight Factory
import java.util.HashMap;
import java.util.Map;

class CharacterFactory {
 private final Map<Character, ConcreteCharacter> characters = new HashMap<>();

 public Character getCharacter(Character c) {
     // Reuse existing character if available
     if (!characters.containsKey(c)) {
         characters.put(c, new ConcreteCharacter(c));
     }
     return characters.get(c);
 }
}
