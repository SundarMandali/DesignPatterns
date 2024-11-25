package behavioural.iterator;

//Aggregate Interface
interface IterableCollection<T> {
 Iterator<T> createIterator(); // Creates an iterator for the collection
}
