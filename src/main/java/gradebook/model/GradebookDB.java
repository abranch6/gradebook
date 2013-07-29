package gradebook.model;

public interface GradebookDB<T extends Storable>
{
    public void put(T object);
    public boolean delete(T object);
    public T get(String id);
    public T[] toArray(T[] array);
    public int size();
}
