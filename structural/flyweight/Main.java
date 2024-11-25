package structural.flyweight;

public class Main {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

//        // Get shared flyweight objects
//        Character a1 = factory.getCharacter(new Character('A'));
//        Character a2 = factory.getCharacter('A');
//        Character b = factory.getCharacter('B');
//
//        // Render characters with different font styles
//        a1.render("Bold");
//        a2.render("Italic");
//        b.render("Regular");
//
//        // Check if 'A' instances are shared
//        System.out.println("Are a1 and a2 the same instance? " + (a1 == a2));
    }
}
