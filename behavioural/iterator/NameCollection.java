package behavioural.iterator;

//Concrete Aggregate
class NameCollection implements IterableCollection<String> {
 private String[] names;

 public NameCollection(String[] names) {
     this.names = names;
 }

 @Override
 public Iterator<String> createIterator() {
     return new NameIterator();
 }

 // Concrete Iterator
 private class NameIterator implements Iterator<String> {
     private int index = 0;

     @Override
     public boolean hasNext() {
         return index < names.length;
     }

     @Override
     public String next() {
         if (hasNext()) {
             return names[index++];
         }
         throw new RuntimeException("No more elements");
     }
 }
}
