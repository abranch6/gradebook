package gradebook.model;

/**
* The interface to implement a gradebook Database
* @author Andrew Branch
* @param <T> Type to store in the database
*/
public interface GradebookDB<T extends Storable> {
    void put(T object);
    boolean delete(T object);
    T get(String id);
    T[] toArray(T[] array);
    int size();
}
