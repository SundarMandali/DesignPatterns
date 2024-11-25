package behavioural.iterator;

//Client
public class Main {
 public static void main(String[] args) {
     String[] names = { "Alice", "Bob", "Charlie", "Diana" };

     // Create the collection
     NameCollection nameCollection = new NameCollection(names);

     // Get the iterator
     Iterator<String> iterator = nameCollection.createIterator();

     // Use the iterator to traverse the collection
     while (iterator.hasNext()) {
         System.out.println(iterator.next());
     }
 }
}
